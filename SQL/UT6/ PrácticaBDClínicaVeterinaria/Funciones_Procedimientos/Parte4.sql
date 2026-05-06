--Propuesta de datos a insertar en la Base de Datos para poder probar bien este procedimiento:

-- Cliente 1 (Ana López) → añadir pago pendiente 
INSERT INTO PAGOS VALUES (1, 2, DATE '2024-02-10', 50.00, NULL); 

-- Cliente 3 (María Sánchez) → añadir pago pendiente 
INSERT INTO PAGOS VALUES (3, 2, DATE '2024-02-18', 40.00, NULL); 

COMMIT;

--Procedimiento 1--
CREATE OR REPLACE PROCEDURE calcular_total_pendiente_cliente(p_id_cliente NUMBER)
AS
    CURSOR c_pagos_pendientes IS
        SELECT NVL(SUM(IMPORTE), 0) AS TOTAL_PENDIENTE
        FROM PAGOS
        WHERE ID_CLIENTE = p_id_cliente AND FECHA_PAGO IS NULL;
    total NUMBER;
    nombre_cliente CLIENTES.NOMBRE%TYPE;
BEGIN
    OPEN c_pagos_pendientes;
    FETCH c_pagos_pendientes INTO total;
    CLOSE c_pagos_pendientes;
    
    SELECT NOMBRE
    INTO nombre_cliente
    FROM CLIENTES
    WHERE ID_CLIENTE = p_id_cliente;

    DBMS_OUTPUT.PUT_LINE('Cliente: ' || nombre_cliente);
    
    IF total > 0 THEN
        DBMS_OUTPUT.PUT_LINE('El importe total pendiente es: ' || total || '€');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Este cliente no tiene pagos pendientes.');
    END IF;
END;

--Procedimiento 2--
CREATE OR REPLACE PROCEDURE calcular_total_pendiente_cliente(p_id_cliente NUMBER)
AS
    CURSOR c_pagos_pendientes(p_id_cliente NUMBER) IS
        SELECT IMPORTE, FECHA_PAGO
        FROM PAGOS
        WHERE ID_CLIENTE = p_id_cliente;
    
    v_total NUMBER := 0;
    v_registro c_pagos_pendientes%ROWTYPE;

BEGIN
    OPEN c_pagos_pendientes(p_id_cliente);
    
    LOOP
        FETCH c_pagos_pendientes INTO v_registro;
        EXIT WHEN c_pagos_pendientes%NOTFOUND;

        IF v_registro.FECHA_PAGO IS NULL THEN
            v_total := v_total + v_registro.IMPORTE;
        END IF;

    END LOOP;

    CLOSE c_pagos_pendientes;

    DBMS_OUTPUT.PUT_LINE('El importe total pendiente es: ' || v_total || '€');
EXCEPTION
WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLCODE || '-' || SQLERRM); --Lanza el codigo de la excepcion y su respectiva descripcion
        RAISE; --Se lanza otra vez la excepcion para que codigos de mayor nivel lo controlen (opcional)
END;


--PRUEBA--

BEGIN
    calcular_total_pendiente_cliente(1);
    calcular_total_pendiente_cliente(3);
END;