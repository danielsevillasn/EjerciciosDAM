/*Crea un procedimiento similar al 2, llamado CAMBIO_RESULTADO que permita cambiar el
resultado de un partido ya jugado. Si el partido no existía, entonces devuelve la excepción
“Ese partido no se ha jugado”. Si el resultado existía, entonces modifica el resultado en la
tabla de resultado y altera la tabla de clasificación acorde al nuevo resultado. Además,
crea una nueva tabla con el nombre TABLA_CAMBIOS donde se almacenen los cambios de
resultado, con el siguiente formato:
EQUIPO_LOCAL | EQUIPO_VISITANTE | MARCADOR_ANTERIOR | MARCADOR_NUEVO
‘EQUIPOX’    | ‘EQUIPOY’        | ‘5–2‘             | ‘0–3‘*/

CREATE TABLE TABLA_CAMBIOS (
    EQUIPO_LOCAL VARCHAR2(100),
    EQUIPO_VISITANTE VARCHAR2(100),
    MARCADOR_ANTERIOR VARCHAR2(100),
    MARCADOR_NUEVO VARCHAR2(100)
);


CREATE OR REPLACE PROCEDURE CAMBIO_RESULTADO (E_LOCAL VARCHAR2, E_G_LOCAL NUMBER, E_VISITANTE VARCHAR2, E_G_VISITANTE NUMBER) AS

    PARTIDO RESULTADOS%ROWTYPE;

    MARCADOR_ANTERIOR VARCHAR2(100);
    MARCADOR_NUEVO VARCHAR2(100);


BEGIN
    SELECT * INTO PARTIDO FROM RESULTADOS WHERE EQUIPO_LOCAL = E_LOCAL AND EQUIPO_VISITANTE = E_VISITANTE;

    UPDATE RESULTADOS SET GOLES_LOCAL = E_G_LOCAL, GOLES_VISITANTE = E_G_VISITANTE 
    WHERE EQUIPO_LOCAL = E_LOCAL AND EQUIPO_VISITANTE = E_VISITANTE;

    --lamada a procedimiento de la actividad1
    RELLENAR_CLASIFICACION;

    MARCADOR_ANTERIOR := PARTIDO.GOLES_LOCAL||'-'||PARTIDO.GOLES_VISITANTE;
    MARCADOR_NUEVO := E_G_LOCAL||'-'||E_G_VISITANTE;
    
    INSERT INTO TABLA_CAMBIOS VALUES (E_LOCAL, E_VISITANTE, MARCADOR_ANTERIOR, MARCADOR_NUEVO);

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Ese partido no se ha jugado');
END;

-- Clasificación actual:

SELECT * FROM CLASIFICACION ORDER BY PUNTOS DESC;

-- Resultados del EQUIPO J:

SELECT * FROM RESULTADOS WHERE EQUIPO_LOCAL = 'EQUIPO J' OR EQUIPO_VISITANTE = 'EQUIPO J';

BEGIN
    CAMBIO_RESULTADO('EQUIPO J',3,'EQUIPO A',3);-- Cambiamos el resultado entre dos equipos de victoria local a empate
    CAMBIO_RESULTADO('EQUIPO J',5,'EQUIPO B',5);-- Cambiamos el resultado entre dos equipos de victoria visitante a empate
    CAMBIO_RESULTADO('EQUIPO J',0,'EQUIPO F',3);-- Cambiamos el resultado entre dos equipos de victoria local a victoria visitante
    CAMBIO_RESULTADO('EQUIPO J',3,'EQUIPO E',0);-- Cambiamos el resultado entre dos equipos de victoria visitante a victoria local
    CAMBIO_RESULTADO('EQUIPO D',3,'EQUIPO J',0);-- Cambiamos el resultado entre dos equipos de empate a victoria local
    CAMBIO_RESULTADO('EQUIPO G',0,'EQUIPO J',3);-- Cambiamos el resultado entre dos equipos de empate a victoria visitante
    CAMBIO_RESULTADO('EQUIPO J',0,'EQUIPO G',3);-- Intentamos cambiar el resultado de un partido que no se ha jugado
    CAMBIO_RESULTADO('EQUIPO X',0,'EQUIPO Y',3);--Intentamos cambiar el resultado de un partido entre equipos que no existen
END;
  
-- Nueva clasificacion:

SELECT * FROM CLASIFICACION ORDER BY PUNTOS DESC;

SELECT * FROM TABLA_CAMBIOS;
