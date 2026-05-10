/*Desarrolla un bloque que utilice un cursor para completar la tabla de CLASIFICACION a
partir de los resultados de la tabla de RESULTADOS. (Cada partido ganado suma 3 puntos,
cada partido empatado suma 1 punto, cada partido perdido suma 0 puntos).*/

CREATE OR REPLACE PROCEDURE RELLENAR_CLASIFICACION IS

CURSOR C1 IS SELECT * FROM RESULTADOS;
V_C1 C1%ROWTYPE;

BEGIN

    --este UPDATE es un reset de la tabla CLASIFICACION para actualizarla por completo según la información 
    --que haya en el momento de su ejecución en la tabla RESULTADOS
    UPDATE CLASIFICACION SET GANADOS = 0, EMPATADOS = 0, PERDIDOS = 0, GOLES_FAVOR = 0, GOLES_CONTRA = 0, PUNTOS = 0;

    OPEN C1;
    FETCH C1 INTO V_C1;

    WHILE (C1%FOUND) LOOP
        --comienzo actualizando los puntos, los partidos ganados y los perdidos según las 
        --3 opciones de resultados que puede haber

        --caso1: la fila que estoy consultando muestra al equipo local como ganador
        IF V_C1.GOLES_LOCAL > V_C1.GOLES_VISITANTE THEN
            UPDATE CLASIFICACION SET PUNTOS = PUNTOS + 3 WHERE EQUIPO = V_C1.EQUIPO_LOCAL;
            UPDATE CLASIFICACION SET GANADOS = GANADOS + 1 WHERE EQUIPO = V_C1.EQUIPO_LOCAL;
            UPDATE CLASIFICACION SET PERDIDOS = PERDIDOS + 1 WHERE EQUIPO = V_C1.EQUIPO_VISITANTE;
        END IF;

        --caso2: la fila que estoy consultando muestra un empate entre los equipos
        IF V_C1.GOLES_LOCAL = V_C1.GOLES_VISITANTE THEN
            UPDATE CLASIFICACION SET PUNTOS = PUNTOS + 1 WHERE EQUIPO IN (V_C1.EQUIPO_LOCAL, V_C1.EQUIPO_VISITANTE);
            UPDATE CLASIFICACION SET EMPATADOS = EMPATADOS + 1 WHERE EQUIPO IN (V_C1.EQUIPO_LOCAL, V_C1.EQUIPO_VISITANTE);
        END IF;
        
        --caso3: la fila que estoy consultando muestra al equipo visitante como ganador
        IF V_C1.GOLES_LOCAL < V_C1.GOLES_VISITANTE THEN
            UPDATE CLASIFICACION SET PUNTOS = PUNTOS + 3 WHERE EQUIPO = V_C1.EQUIPO_VISITANTE;
            UPDATE CLASIFICACION SET GANADOS = GANADOS + 1 WHERE EQUIPO = V_C1.EQUIPO_VISITANTE;
            UPDATE CLASIFICACION SET PERDIDOS = PERDIDOS + 1 WHERE EQUIPO = V_C1.EQUIPO_LOCAL;
        END IF;

        --actualizo goles a favor del equipo local y del visitante
        UPDATE CLASIFICACION SET GOLES_FAVOR = GOLES_FAVOR + V_C1.GOLES_LOCAL WHERE EQUIPO = V_C1.EQUIPO_LOCAL;
        UPDATE CLASIFICACION SET GOLES_FAVOR = GOLES_FAVOR + V_C1.GOLES_VISITANTE WHERE EQUIPO = V_C1.EQUIPO_VISITANTE;

        --actualizo goles en contra del equipo local y del visitante
        UPDATE CLASIFICACION SET GOLES_CONTRA = GOLES_CONTRA + V_C1.GOLES_VISITANTE WHERE EQUIPO = V_C1.EQUIPO_LOCAL;
        UPDATE CLASIFICACION SET GOLES_CONTRA = GOLES_CONTRA + V_C1.GOLES_LOCAL WHERE EQUIPO = V_C1.EQUIPO_VISITANTE;

        FETCH C1 INTO V_C1;

    END LOOP;
    CLOSE C1;
END;

--EJECUTAR EL PROCEDIMIENTO
BEGIN   
    RELLENAR_CLASIFICACION;
END;

SELECT * FROM CLASIFICACION ORDER BY PUNTOS DESC;



            

    



