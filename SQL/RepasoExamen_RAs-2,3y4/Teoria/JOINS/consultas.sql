/**
Los join sirven basicamente para complementar ese FROM de tal manera que
podamos acceder a varias tablas diferentes y no solo una
*/

--SQL1999--
/**
CROSS JOIN:
sirve para combinar los datos de dos tablas (Producto cartesiano)
*/
SELECT A.NOMBRE, A.APELLIDO1, C.NOMBRE
FROM ALUMNOS A CROSS JOIN CURSOS C;
/**
NATURAL JOIN:
Establece una relación de igualdad entre las tablas a través de los campos que tengan el
mismo nombre en ambas tablas
*/
SELECT NOMBRE, APELLIDO1, ID_CURSO
FROM ALUMNOS NATURAL JOIN MATRICULAS;
/**
JOIN USING:
Igual al natural pero con criterio de cruce
*/
SELECT NOMBRE, APELLIDO1, ID_CURSO
FROM ALUMNOS JOIN MATRICULAS USINC(DNI);
/**
JOIN ON:
igualar atributos que no tienen el mismo nombre para que guarden relation
*/
SELECT A.NOMBRE, A.NOMBRE, C.NOMBRE
FROM ALUMNOS A JOIN MATRICULAS M ON A.DNI = M.DNI
JOIN CURSOS C ON M.ID_CURSO = C.ID_CURSO;

SELECT P.NOMBRE, APELLIDO1, C.NOMBRE, C.FECHA_INICIO
FROM PROFESORES P JOIN CURSOS C ON P.DNI = C.DNI_PROFESOR;
--SQL1992--
SELECT NOMBRE, APELLIDO1, ID_CURSO
FROM ALUMNOS A, MATRICULAS M
WHERE A.DNI = M.DNI;
/**
ASOCIACIONES EXTERNAS:

*/
--El left sirve basicamente para poner el outer y que te incluya tambien los valores nulos
SELECT A.NOMBRE, C.NOMBRE
FROM ALUMNOS A LEFT JOIN MATRICULAS M USING(DNI)
LEFT JOIN CURSOS C USINC(ID_CURSO);
--Solo para ver los que tiene valor nulos
SELECT A.NOMBRE, C.NOMBRE
FROM ALUMNOS A LEFT JOIN MATRICULAS M USING(DNI)
LEFT JOIN CURSOS C USINC(ID_CURSO)
WHERE C.NOMBRE IS NOT NULL;

SELECT *
FROM ALUMNOS A JOIN MATRICULAS M ON A.DNI = M.DNI
JOIN CURSOS C ON C.ID_CURSO = M.ID_CURSO
JOIN PROFESORES P ON C.DNI_PROFESOR = P.DNI;
