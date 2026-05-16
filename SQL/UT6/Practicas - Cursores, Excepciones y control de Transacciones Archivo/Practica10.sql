CREATE OR REPLACE PROCEDURE pr_insertar_pedido (
    p_pedido_no NUMBER,
    p_producto_no NUMBER,
    p_cliente_no NUMBER,
    p_unidades NUMBER,
    p_fecha_pedido DATE DEFAULT SYSDATE
) AS
    v_stock NUMBER;
    v_precio NUMBER;
    v_limite_credito NUMBER;
    v_debe_cliente NUMBER;
    v_emp_rep NUMBER;
    v_coste_total NUMBER;
BEGIN
    SAVEPOINT control_pedido;

    -- 1. Bloquear y verificar producto
    SELECT stock, precio_actual INTO v_stock, v_precio
    FROM productos 
    WHERE producto_no = p_producto_no FOR UPDATE;

    IF v_stock < p_unidades THEN
        RAISE_APPLICATION_ERROR(-20001, 'Error: No hay suficientes unidades en stock.');
    END IF;

    -- 2. Bloquear y verificar cliente
    SELECT limite_credito, debe, rep_cliente INTO v_limite_credito, v_debe_cliente, v_emp_rep
    FROM clientes 
    WHERE cliente_no = p_cliente_no FOR UPDATE;

    v_coste_total := p_unidades * v_precio;

    IF (v_debe_cliente + v_coste_total) > v_limite_credito THEN
        RAISE_APPLICATION_ERROR(-20002, 'Error: El cliente superará su límite de crédito.');
    END IF;

    -- 3. Inserciones y actualizaciones si todo es correcto
    INSERT INTO pedidos (pedido_no, producto_no, cliente_no, unidades, fecha_pedido)
    VALUES (p_pedido_no, p_producto_no, p_cliente_no, p_unidades, p_fecha_pedido);

    UPDATE clientes 
    SET debe = debe + v_coste_total 
    WHERE cliente_no = p_cliente_no;

    UPDATE productos 
    SET stock = stock - p_unidades 
    WHERE producto_no = p_producto_no;

    UPDATE empleados 
    SET comision = NVL(comision, 0) + (v_coste_total * 0.05)
    WHERE emp_no = v_emp_rep;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transacción completada: Pedido registrado.');

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK TO control_pedido;
        DBMS_OUTPUT.PUT_LINE('Error: El cliente o el producto indicado no existe.');
    WHEN OTHERS THEN
        ROLLBACK TO control_pedido;
        DBMS_OUTPUT.PUT_LINE('Error en la transacción: ' || SQLERRM);
END;
/