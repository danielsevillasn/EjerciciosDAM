SET SERVEROUTPUT ON;


--1--
CREATE TABLE alumnos( 
  identificacion CHAR(5) NOT NULL, 
  nombre VARCHAR2(30), 
  nota NUMBER(4,2) 
);

--2--
INSERT INTO alumnos VALUES('3456','Perez Luis',8.5); 
INSERT INTO alumnos VALUES('3456','Perez Luis',9.9); 
INSERT INTO alumnos VALUES('3456','Perez Luis',7.8); 
INSERT INTO alumnos VALUES('3556','Garcia Ana',7.0); 
INSERT INTO alumnos VALUES('3556','Garcia Ana',6.0); 
INSERT INTO alumnos VALUES('3656','Ludueña Juan',9.6); 
INSERT INTO alumnos VALUES('3656','Ludueña Juan',10); 
INSERT INTO alumnos VALUES('2756','Moreno Gabriela',4.2); 
INSERT INTO alumnos VALUES('2756','Moreno Gabriela',2.6); 
INSERT INTO alumnos VALUES('2756','Moreno Gabriela',2); 
INSERT INTO alumnos VALUES('4856','Morales Hugo',3.2); 
INSERT INTO alumnos VALUES('4856','Morales Hugo',4.7); 
INSERT INTO alumnos VALUES('7856','Gomez Susana',6.4); 
INSERT INTO alumnos VALUES('7856','Gomez Susana',8.6);

--3--
CREATE OR REPLACE FUNCTION f_resultado(nota NUMBER)
  RETURN VARCHAR2
IS
    notaObtenida VARCHAR2(20);
BEGIN
  CASE TRUNC(nota,0)
    WHEN 0 THEN notaObtenida := 'suspenso'; -- Añadido para notas de 0 a 0.99
    WHEN 1 THEN notaObtenida := 'suspenso';
    WHEN 2 THEN notaObtenida := 'suspenso';
    WHEN 3 THEN notaObtenida := 'suspenso';
    WHEN 4 THEN notaObtenida := 'suspenso';
    WHEN 5 THEN notaObtenida := 'bien';
    WHEN 6 THEN notaObtenida := 'bien';
    WHEN 7 THEN notaObtenida := 'notable';
    WHEN 8 THEN notaObtenida := 'notable';
    WHEN 9 THEN notaObtenida := 'sobresaliente';
    WHEN 10 THEN notaObtenida := 'sobresaliente';
    ELSE notaObtenida := 'SIN NOTA';
  END CASE;
  RETURN notaObtenida;
END;

SELECT identificacion, nombre, f_resultado(AVG(nota)) AS condicion
FROM alumnos
GROUP BY identificacion, nombre;

--4--
DROP TABLE alumnosCondicion; 

CREATE TABLE alumnosCondicion( 
  identificacion CHAR(5), 
  notafinal NUMBER(4,2), 
  condicion VARCHAR2(15) 
);

--5--
CREATE OR REPLACE PROCEDURE pa_cargarCondicion
AS
BEGIN
    DELETE FROM alumnosCondicion;

    INSERT INTO alumnosCondicion(identificacion, notafinal, condicion)
    SELECT identificacion, AVG(nota), f_resultado(AVG(nota))
    FROM alumnos
    GROUP BY identificacion;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Datos introducidos en la tabla alumnosCondicion');
END;

--6--
BEGIN
  pa_cargarCondicion;
END;

EXEC pa_cargarCondicion;

SELECT * 
FROM alumnosCondicion;