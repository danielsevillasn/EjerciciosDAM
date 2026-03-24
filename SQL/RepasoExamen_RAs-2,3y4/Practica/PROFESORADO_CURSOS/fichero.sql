--1.  Inserta un registro nuevo en la tabla PROFESORADO.
INSERT INTO PROFESORADO (Codigo, Nombre, Apellidos, DNI, Especialidad, Fecha_Nac, Antiguedad)
VALUES(1, 'NURIA', 'ANERO GONZALEZ', '58328033X', 'MATEMATICAS', DATE '1972-02-22', 9);

--2.  Inserta  varios  registros  más  en  la  tabla  PROFESORADO.
INSERT INTO PROFESORADO (Codigo, Nombre, Apellidos, DNI, Especialidad, Fecha_Nac, Antiguedad)
VALUES(2, 'MARIA LUISA', 'FABRE BERDUN', '51083099F', 'TECNOLOGIA', DATE '1975-03-31', 4);

INSERT INTO PROFESORADO (Codigo, Nombre, Apellidos, Especialidad, Fecha_Nac, Antiguedad)
VALUES(3, 'JAVIER', 'JIMENEZ HERNANDO', 'LENGUA', DATE '1969-05-04', 10);

INSERT INTO PROFESORADO (Codigo, Nombre, Apellidos, DNI, Especialidad, Fecha_Nac, Antiguedad)
VALUES(4, 'ESTEFANIA', 'FERNANDEZ MARTINEZ', '19964324W', 'INGLES', DATE '1973-06-22', 5);

INSERT INTO PROFESORADO (Codigo, Nombre, Apellidos)
VALUES(5, 'JOSE M.', 'ANERO PAYAN');

--3. Modifica  los  registros  de  la  tabla  CURSOS  para  asignar  a  cada  curso  un  profesor  o profesora
UPDATE CURSOS
SET Cod_Profe = 4
WHERE Codigo = 1;

UPDATE CURSOS
SET Cod_Profe = 2
WHERE Codigo = 2;

UPDATE CURSOS
SET Cod_Profe = 2
WHERE Codigo = 3;

UPDATE CURSOS
SET Cod_Profe = 1
WHERE Codigo = 4;

UPDATE CURSOS
SET Cod_Profe = 1
WHERE Codigo = 5;

UPDATE CURSOS
SET Cod_Profe = 3
WHERE Codigo = 6;

--4.  Modifica el registro de la profesora "ESTEFANIA", y cambia su fecha de nacimiento a "22/06/1974" y la antigüedad a 4.
UPDATE PROFESORADO
SET Fecha_Nac = DATE '1974-06-22', Antiguedad = 4
WHERE Nombre = 'ESTEFANIA';

--5.  Modifica las antigüedades de todos los profesores incrementándolas en 1 en todos los registros.
UPDATE PROFESORADO
SET Antiguedad = Antiguedad+1;

--6.  Elimina, de la tabla CURSOS, el registro del curso que tiene el código 6.
DELETE FROM CURSOS
WHERE CODIGO = 6;

--7.  Elimina, de la tabla ALUMNADO, aquellos registros asociados al curso con código 3.
DELETE FROM ALUMNADO
WHERE COD_CURSO = 3;

--8.  Inserta los registros de la tabla ALUMNADO_NUEVO en la tabla ALUMNADO.
INSERT INTO ALUMNADO
SELECT *
FROM ALUMNADO_NUEVO;

--9.  En la tabla CURSOS, actualiza el campo Max_Alumn del registro del curso con código 2, 
------asignándole el valor correspondiente al número total de alumnos y alumnas que hay en la 
------tabla ALUMNADO y que tienen asignado ese mismo curso.
UPDATE CURSOS
SET Max_Alumn = (SELECT COUNT(*)
                FROM ALUMNADO
                WHERE COD_CURSO = 2)
WHERE CODIGO = 2;

--10. Elimina de la tabla ALUMNADO todos los registros asociados a los cursos que imparte la profesora cuyo nombre es "NURIA".
DELETE FROM ALUMNADO
WHERE COD_CURSO IN (SELECT CODIGO
                    FROM CURSOS
                    WHERE COD_PROFE IN (SELECT CODIGO
                                        FROM PROFESORADO
                                        WHERE NOMBRE = 'NURIA'));