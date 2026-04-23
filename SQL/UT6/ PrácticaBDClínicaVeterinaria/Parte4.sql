--Propuesta de datos a insertar en la Base de Datos para poder probar bien este procedimiento:

-- Cliente 1 (Ana López) → añadir pago pendiente 
INSERT INTO PAGOS VALUES (1, 2, DATE '2024-02-10', 50.00, NULL); 

-- Cliente 3 (María Sánchez) → añadir pago pendiente 
INSERT INTO PAGOS VALUES (3, 2, DATE '2024-02-18', 40.00, NULL); 

COMMIT;

--Procedimiento--
CREATE OR REPLACE PROCEDURE calcular_total_pendiente_cliente(p_id_cliente NUMBER)
AS
    CURSOR c_pagos_pendientes IS
        SELECT SUM(IMPORTE) AS TOTAL_PENDIENTE
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

--Prueba--
BEGIN
    calcular_total_pendiente_cliente(1);
    calcular_total_pendiente_cliente(3);
END;