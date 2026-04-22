CREATE OR REPLACE FUNCTION calcular_edad (p_fecha_nac DATE) 
RETURN NUMBER
AS
edad NUMBER;
BEGIN
    edad := TRUNC(MONTHS_BETWEEN(SYSDATE, p_fecha_nac) / 12);

    RETURN edad;
END;

--PRUEBAS--

--1--
SELECT NOMBRE, calcular_edad(FECHA_NAC)
FROM MASCOTAS;

--2--
DECLARE
    fecha DATE;
    nombre MASCOTAS.NOMBRE%TYPE;
BEGIN
    SELECT FECHA_NAC, NOMBRE INTO fecha, nombre
    FROM MASCOTAS
    WHERE ID_CLIENTE = 2 AND ID_MASCOTA = 1;

    DBMS_OUTPUT.PUT_LINE('La edad de '||nombre||' es de '||calcular_edad(fecha)||' años.');

END;