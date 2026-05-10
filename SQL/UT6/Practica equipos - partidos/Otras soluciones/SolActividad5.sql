/*Mostrar por pantalla el nombre del equipo y la cantidad de goles para aquellos
equipos que en algún partido hayan marcado más de 4 goles.
“El equipo X metió Z goles al equipo Y en algún momento de la temporada.”*/

CREATE OR REPLACE PROCEDURE PARTIDOS_4GOLES AS

CURSOR C1 IS SELECT * FROM RESULTADOS WHERE GOLES_LOCAL>=4 OR GOLES_VISITANTE>=4;
V_C1 C1%ROWTYPE;


BEGIN

    OPEN C1;
    FETCH C1 INTO V_C1;

    WHILE C1%FOUND LOOP
        IF V_C1.GOLES_LOCAL>=4 THEN
            DBMS_OUTPUT.PUT_LINE(V_C1.EQUIPO_LOCAL||'-'||V_C1.GOLES_LOCAL||'GOLES');
        END IF;
        IF V_C1.GOLES_VISITANTE>=4 THEN
            DBMS_OUTPUT.PUT_LINE(V_C1.EQUIPO_VISITANTE||'-'||V_C1.GOLES_VISITANTE||' GOLES');
        END IF;
        FETCH C1 INTO V_C1;
    END LOOP;

    CLOSE C1;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('NINGÚN PARTIDO CUMPLE LAS CARACTERÍSTICAS BUSCADAS');
END;

