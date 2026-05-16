--Procedimiento 1--
CREATE OR REPLACE PROCEDURE cerrar_atencion(
    p_id_cliente NUMBER,
    p_id_mascota NUMBER,
    p_fecha_cita DATE,
    p_importe    NUMBER
)
AS
    v_comprobador          VARCHAR2(300);
    v_existe_recomendacion NUMBER;
    v_fase                 NUMBER := 1; -- 1 = Cita, 2 = Diagnóstico
BEGIN
    -- 1. Verificar que existe la cita (Lanza NO_DATA_FOUND si no existe)
    v_fase := 1;
    SELECT MOTIVO INTO v_comprobador
    FROM CITAS
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

    -- 2. Verificar que hay diagnóstico (Lanza NO_DATA_FOUND si no existe)
    v_fase := 2;
    SELECT DESCRIPCION INTO v_comprobador
    FROM DIAGNOSTICOS
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

    -- 3. Insertar recomendación si no existe (Estructura IF/ELSE)
    SELECT COUNT(*) INTO v_existe_recomendacion
    FROM RECOMENDACIONES
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

    IF v_existe_recomendacion = 0 THEN
        INSERT INTO RECOMENDACIONES (ID_CLIENTE, ID_MASCOTA, FECHA_CITA, TEXTO)
        VALUES (p_id_cliente, p_id_mascota, p_fecha_cita, 'Seguimiento rutinario según evolución.');
        DBMS_OUTPUT.PUT_LINE('Recomendación por defecto insertada.');
    END IF;

    -- 4. Registro del Pago (sin fecha de pago -> pendiente)
    INSERT INTO PAGOS (ID_CLIENTE, ID_MASCOTA, FECHA_CITA, IMPORTE, FECHA_PAGO)
    VALUES (p_id_cliente, p_id_mascota, p_fecha_cita, p_importe, NULL);
    
    DBMS_OUTPUT.PUT_LINE('Atención cerrada correctamente. Pago registrado como pendiente.');
    
    COMMIT;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        IF v_fase = 1 THEN
            DBMS_OUTPUT.PUT_LINE('Error: La cita especificada no existe.');
        ELIF v_fase = 2 THEN
            DBMS_OUTPUT.PUT_LINE('Error crítico: No se puede cerrar la atención porque no existe un diagnóstico previo.');
        END IF;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error inesperado: ' || SQLERRM);
END;
--Procedimiento 2--
CREATE OR REPLACE PROCEDURE cerrar_atencion(
    p_id_cliente NUMBER,
    p_id_mascota NUMBER,
    p_fecha_cita DATE,
    p_importe    NUMBER
)
AS
    v_comprobador          VARCHAR2(300);
    v_existe_recomendacion NUMBER;
BEGIN
    -- 1. Verificar que existe la cita
    BEGIN
        SELECT MOTIVO INTO v_comprobador
        FROM CITAS
        WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Error: La cita especificada no existe.');
            RETURN; -- Sale del procedimiento de forma segura
    END;

    -- 2. Verificar que hay diagnóstico
    BEGIN
        SELECT DESCRIPCION INTO v_comprobador
        FROM DIAGNOSTICOS
        WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Error crítico: No se puede cerrar la atención porque no existe un diagnóstico previo.');
            RETURN;
    END;

    -- 3. Insertar recomendación si no existe
    SELECT COUNT(*) INTO v_existe_recomendacion
    FROM RECOMENDACIONES
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

    IF v_existe_recomendacion = 0 THEN
        INSERT INTO RECOMENDACIONES (ID_CLIENTE, ID_MASCOTA, FECHA_CITA, TEXTO)
        VALUES (p_id_cliente, p_id_mascota, p_fecha_cita, 'Seguimiento rutinario según evolución.');
        DBMS_OUTPUT.PUT_LINE('Recomendación por defecto insertada.');
    END IF;

    -- 4. Registro del Pago
    INSERT INTO PAGOS (ID_CLIENTE, ID_MASCOTA, FECHA_CITA, IMPORTE, FECHA_PAGO)
    VALUES (p_id_cliente, p_id_mascota, p_fecha_cita, p_importe, NULL);
    
    DBMS_OUTPUT.PUT_LINE('Atención cerrada correctamente. Pago registrado como pendiente.');
    
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error inesperado de base de datos: ' || SQLERRM);
END;

--Prueba--
EXEC cerrar_atencion(2, 1, DATE '2024-01-20', 75.0);

BEGIN
    cerrar_atencion(2, 1, DATE '2024-01-20', 75.0);
END;