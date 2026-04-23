CREATE OR REPLACE PROCEDURE cerrar_atencion(
    p_id_cliente NUMBER,
    p_id_mascota NUMBER,
    p_fecha_cita DATE,
    p_importe    NUMBER
)
AS
    existeCita NUMBER;
    diagnostico VARCHAR2(300);
    existeRecomendacion NUMBER;
BEGIN
    SELECT COUNT(*) 
    INTO existeCita
    FROM CITAS 
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

    IF existeCita = 0 THEN
        DBMS_OUTPUT.PUT_LINE('La cita no existe');
    ELSE
        SELECT DESCRIPCION 
        INTO diagnostico
        FROM DIAGNOSTICOS
        WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

        SELECT COUNT(*) 
        INTO existeRecomendacion
        FROM RECOMENDACIONES
        WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

        IF existeRecomendacion = 0 THEN
            INSERT INTO RECOMENDACIONES (ID_CLIENTE, ID_MASCOTA, FECHA_CITA, TEXTO)
            VALUES (p_id_cliente, p_id_mascota, p_fecha_cita, 'Seguimiento rutinario según evolución.');
            DBMS_OUTPUT.PUT_LINE('Recomendación por defecto insertada');
        END IF;

        INSERT INTO PAGOS (ID_CLIENTE, ID_MASCOTA, FECHA_CITA, IMPORTE, FECHA_PAGO)
        VALUES (p_id_cliente, p_id_mascota, p_fecha_cita, p_importe, NULL);
        
        DBMS_OUTPUT.PUT_LINE('Atención cerrada correctamente. Pago registrado como pendiente.');
        
        COMMIT;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error crítico: No se puede cerrar la atención porque no existe un diagnóstico previo.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error inesperado: ' || SQLERRM);
END;

--Prueba--
EXEC cerrar_atencion(2, 1, DATE '2024-01-20', 75.0);

BEGIN
    cerrar_atencion(2, 1, DATE '2024-01-20', 75.0);
END;