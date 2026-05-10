/*
Cada vez que:
-se inserte un partido,
-se modifique un resultado,
-o se elimine un partido,
la clasificación se recalcula automáticamente.

En vez de:
-sumar/restar manualmente estadísticas,
-controlar muchísimos casos,
se hace algo mucho más robusto:

-Se ponen todos los valores de CLASIFICACION a 0.
-Se recorren todos los partidos.
-Se reconstruye completamente la clasificación.
Es más sencillo y evita errores.
*/
CREATE OR REPLACE TRIGGER ACTUALIZAR_CLASIFICACION
AFTER INSERT OR UPDATE OR DELETE
ON RESULTADOS
DECLARE

    CURSOR C_RESULTADOS IS
        SELECT *
        FROM RESULTADOS;

BEGIN

    -- Reiniciar clasificación
    UPDATE CLASIFICACION
    SET GANADOS = 0,
        EMPATADOS = 0,
        PERDIDOS = 0,
        GOLES_FAVOR = 0,
        GOLES_CONTRA = 0,
        PUNTOS = 0;

    -- Recorrer todos los resultados
    FOR PARTIDO IN C_RESULTADOS LOOP

        -------------------------------------------------
        -- GOLES A FAVOR Y EN CONTRA
        -------------------------------------------------

        UPDATE CLASIFICACION
        SET GOLES_FAVOR = GOLES_FAVOR + PARTIDO.GOLES_LOCAL,
            GOLES_CONTRA = GOLES_CONTRA + PARTIDO.GOLES_VISITANTE
        WHERE EQUIPO = PARTIDO.EQUIPO_LOCAL;

        UPDATE CLASIFICACION
        SET GOLES_FAVOR = GOLES_FAVOR + PARTIDO.GOLES_VISITANTE,
            GOLES_CONTRA = GOLES_CONTRA + PARTIDO.GOLES_LOCAL
        WHERE EQUIPO = PARTIDO.EQUIPO_VISITANTE;

        -------------------------------------------------
        -- VICTORIA LOCAL
        -------------------------------------------------

        IF PARTIDO.GOLES_LOCAL > PARTIDO.GOLES_VISITANTE THEN

            UPDATE CLASIFICACION
            SET GANADOS = GANADOS + 1,
                PUNTOS = PUNTOS + 3
            WHERE EQUIPO = PARTIDO.EQUIPO_LOCAL;

            UPDATE CLASIFICACION
            SET PERDIDOS = PERDIDOS + 1
            WHERE EQUIPO = PARTIDO.EQUIPO_VISITANTE;

        -------------------------------------------------
        -- VICTORIA VISITANTE
        -------------------------------------------------

        ELSIF PARTIDO.GOLES_LOCAL < PARTIDO.GOLES_VISITANTE THEN

            UPDATE CLASIFICACION
            SET GANADOS = GANADOS + 1,
                PUNTOS = PUNTOS + 3
            WHERE EQUIPO = PARTIDO.EQUIPO_VISITANTE;

            UPDATE CLASIFICACION
            SET PERDIDOS = PERDIDOS + 1
            WHERE EQUIPO = PARTIDO.EQUIPO_LOCAL;

        -------------------------------------------------
        -- EMPATE
        -------------------------------------------------

        ELSE

            UPDATE CLASIFICACION
            SET EMPATADOS = EMPATADOS + 1,
                PUNTOS = PUNTOS + 1
            WHERE EQUIPO = PARTIDO.EQUIPO_LOCAL;

            UPDATE CLASIFICACION
            SET EMPATADOS = EMPATADOS + 1,
                PUNTOS = PUNTOS + 1
            WHERE EQUIPO = PARTIDO.EQUIPO_VISITANTE;

        END IF;

    END LOOP;

END;

/*PRUEBAS*/
--INSERTAR un partido
INSERT INTO RESULTADOS
VALUES ('EQUIPO A',5,'EQUIPO J',0);
--modificar el resultado
UPDATE RESULTADOS
SET GOLES_LOCAL = 2,
    GOLES_VISITANTE = 2
WHERE EQUIPO_LOCAL = 'EQUIPO A'
AND EQUIPO_VISITANTE = 'EQUIPO J';
--eliminar el resultado
DELETE FROM RESULTADOS
WHERE EQUIPO_LOCAL = 'EQUIPO A'
AND EQUIPO_VISITANTE = 'EQUIPO J';
--consulta de clasificación
SELECT *
FROM CLASIFICACION
ORDER BY PUNTOS DESC, 
         GOLES_FAVOR - GOLES_CONTRA DESC;