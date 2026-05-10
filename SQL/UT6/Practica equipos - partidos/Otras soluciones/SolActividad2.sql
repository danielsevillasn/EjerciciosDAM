/*2 Crear un procedimiento NUEVO_RESULTADO que permita insertar un nuevo
-- resultado en la tabla de RESULTADOS (tener en cuenta que un duelo entre dos
-- equipos se puede repetir SIEMPRE QUE ALTERNEN LOCAL y VISITANTE). Si el
-- resultado se inserta, debe actualizarse automáticamente la clasificación. Si no se
-- inserta, se deben manejar 2 excepciones:
-- - "Alguno de los equipos no existe."
-- - "Esos equipos ya han jugado ese partido. El resultado fue: ___"
-- - Si salta alguna otra excepción, insértala en una tabla de errores.*/

CREATE TABLE ERRORES (
    ERROR VARCHAR2(2000),
    FECHA DATE
);

CREATE OR REPLACE PROCEDURE NUEVO_RESULTADO(E_LOCAL VARCHAR2, GOLES_L NUMBER, E_VISITANTE VARCHAR2, GOLES_V NUMBER) AS

CURSOR C1 IS SELECT * FROM RESULTADOS;
V_C1 C1%ROWTYPE;

EQ_LOCAL RESULTADOS.EQUIPO_LOCAL%TYPE;
EQ_VISITANTE RESULTADOS.EQUIPO_VISITANTE%TYPE;
EQ_G_LOCAL RESULTADOS.GOLES_LOCAL%TYPE;
EQ_G_VISITANTE RESULTADOS.GOLES_VISITANTE%TYPE;

NO_EXISTE EXCEPTION;
YA_JUGADO EXCEPTION;

CODIGO_ERROR VARCHAR2(200);
MENSAJE_ERROR VARCHAR2(200);

PRAGMA EXCEPTION_INIT(NO_EXISTE, -2291); -- Asociación de la excepción NO_EXISTE con el código de error -2291

BEGIN
    
    OPEN C1;
    FETCH C1 INTO V_C1;
    WHILE C1%FOUND LOOP
        IF (V_C1.EQUIPO_LOCAL = E_LOCAL AND V_C1.EQUIPO_VISITANTE = E_VISITANTE) THEN
            EQ_LOCAL := V_C1.EQUIPO_LOCAL;
            EQ_VISITANTE := V_C1.EQUIPO_VISITANTE;
            EQ_G_LOCAL := V_C1.GOLES_LOCAL;
            EQ_G_VISITANTE := V_C1.GOLES_VISITANTE;
            RAISE YA_JUGADO;
        END IF;
        FETCH C1 INTO V_C1;
    END LOOP;
    CLOSE C1;

    --esta operación es la que puede lanzar el código de excepción -2291 si no existen E_LOCAL y/o E_VISITANTE
    --que están referenciados a la clave primaria de EQUIPOS
    INSERT INTO RESULTADOS VALUES (E_LOCAL, GOLES_L, E_VISITANTE, GOLES_V);
    
    --llamo al procedimiento de la actividad anterior
    RELLENAR_CLASIFICACION;

    DBMS_OUTPUT.PUT_LINE('**INSERTADOS RESULTADOS NUEVOS**');
    DBMS_OUTPUT.PUT_LINE('EQUIPO LOCAL: '||E_LOCAL||'GOLES LOCALES: '||GOLES_L);
    DBMS_OUTPUT.PUT_LINE('EQUIPO VISITANTE: '||E_VISITANTE||'GOLES VISITANTE: '||GOLES_V);

    EXCEPTION
        WHEN YA_JUGADO THEN
            DBMS_OUTPUT.PUT_LINE(EQ_LOCAL||' CONTRA '||EQ_VISITANTE||',YA SE JUGÓ. EL RESULTADO FUE: '||EQ_G_LOCAL||'-'||EQ_G_VISITANTE);
        WHEN NO_EXISTE THEN
            DBMS_OUTPUT.PUT_LINE('Alguno de los equipos no existe.');
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Error:'||SQLCODE||SQLERRM);
            CODIGO_ERROR := SQLCODE;
            MENSAJE_ERROR := SQLERRM;
            INSERT INTO ERRORES VALUES('ERROR: '||CODIGO_ERROR||':'||MENSAJE_ERROR,SYSDATE);
END;

--EJECUTAR EL PROCEDIMIENTO
BEGIN
    NUEVO_RESULTADO('EQUIPO D',2,'EQUIPO J',2);--PARTIDO YA JUGADO
    NUEVO_RESULTADO('EQUIPO X',2,'EQUIPO Y',0);--EQUIPO(S) QUE NO EXISTEN
    NUEVO_RESULTADO ('EQUIPO A',3,'EQUIPO DSFDSFDS',5); -- Insertamos un equipo con +10 caracteres, salta un error diferente que se introduce en la tabla de errores:
    NUEVO_RESULTADO ('EQUIPO B',5,'EQUIPO C',7);--NUEVO RESULTADO EN LA TABLA
END;