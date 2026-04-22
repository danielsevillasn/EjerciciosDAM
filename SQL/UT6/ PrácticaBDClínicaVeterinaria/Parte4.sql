--Propuesta de datos a insertar en la Base de Datos para poder probar bien este procedimiento:

-- Cliente 1 (Ana López) → añadir pago pendiente 
INSERT INTO PAGOS VALUES (1, 2, DATE '2024-02-10', 50.00, NULL); 
 
-- Cliente 3 (María Sánchez) → añadir pago pendiente 
INSERT INTO PAGOS VALUES (3, 2, DATE '2024-02-18', 40.00, NULL); 
 
COMMIT;

--Procedimiento
CREATE OR REPLACE PROCEDURE E calcular_total_pendiente_cliente(p_id_cliente NUMBER)
AS
    CURSOR c_pagos(p_cliente NUMBER) IS
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

--Prueba