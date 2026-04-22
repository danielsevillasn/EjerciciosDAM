CREATE OR REPLACE PROCEDURE listar_historial_mascota(p_id_cliente NUMBER, p_id_mascota NUMBER)
AS
    CURSOR c_historial IS
        SELECT CI.FECHA_CITA, CI.MOTIVO, R.TEXTO AS RECOMENDACION, D.DESCRIPCION AS DIAGNÓSTICO
        FROM CITAS CI 
        LEFT JOIN RECOMENDACIONES R 
            ON CI.ID_CLIENTE = R.ID_CLIENTE AND CI.ID_MASCOTA = R.ID_MASCOTA AND CI.FECHA_CITA = R.FECHA_CITA
        LEFT JOIN DIAGNOSTICOS D 
            ON CI.ID_CLIENTE = D.ID_CLIENTE AND CI.ID_MASCOTA = D.ID_MASCOTA AND CI.FECHA_CITA = D.FECHA_CITA
        WHERE CI.ID_CLIENTE = p_id_cliente AND CI.ID_MASCOTA = p_id_mascota;
BEGIN
    FOR reg IN c_historial LOOP
        DBMS_OUTPUT.PUT_LINE('Cita: ');
        DBMS_OUTPUT.PUT_LINE('Fecha cita: ' || reg.FECHA_CITA);
        DBMS_OUTPUT.PUT_LINE('Motivo: ' || reg.MOTIVO);
        DBMS_OUTPUT.PUT_LINE('Recomendacion: ' || NVL(reg.RECOMENDACION, 'Sin recomendaciones'));
        DBMS_OUTPUT.PUT_LINE('Diagnostico: ' || NVL(reg.DIAGNÓSTICO, 'Sin diagnostico'));
    END LOOP;   
END;

--PRUEBA--

--1--
EXEC listar_historial_mascota(3, 1);

--2--
DECLARE
    mascota NUMBER := 1;
    cliente NUMBER := 1;
BEGIN
    DBMS_OUTPUT.PUT_LINE('')
    listar_historial_mascota(mascota,cliente);
END;