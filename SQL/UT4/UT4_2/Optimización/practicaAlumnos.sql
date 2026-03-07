--OPTIMIZACIÓN DE CONSULTAS
--1
--Consulta A
SELECT fecha_nacimiento
FROM alumnos
WHERE EXTRACT(YEAR FROM fecha_nacimiento) = 2004;
--Consulta B
SELECT *
FROM alumnos
WHERE fecha_nacimiento >= DATE '2004-01-01'
  AND fecha_nacimiento <  DATE '2005-01-01';

--Pregunta
--¿Cuál es más eficiente y por qué?
--La Consulta B ya que no emplea una funcion en el where, habilitando asi el mejor uso de los índices

--2. 
--Consulta A
SELECT nombre
FROM alumnos
WHERE id_alumno IN (
    SELECT id_alumno
    FROM calificaciones
    WHERE nota >= 5
);
--Consulta B
SELECT DISTINCT a.nombre
FROM alumnos a
JOIN calificaciones c ON a.id_alumno = c.id_alumno
WHERE c.nota >= 5;

--Preguntas
--¿Cuál es más clara?
--¿Cuál suele ser más eficiente?
--¿Cuál permite al optimizador trabajar mejor?

--La consulta más clara es la a ya que no hace falta comprender tanto como en la consulta b
--La consulta b ya que emplea el join en vez de la subconsulta
--La consulta b ya que emplea Join

--3.
--Consulta A
SELECT a.nombre, c.nota
FROM alumnos a
JOIN calificaciones c ON a.id_alumno = c.id_alumno
WHERE c.nota >= 9;
--Consulta B
SELECT a.nombre, c.nota
FROM alumnos a JOIN (
    SELECT id_alumno, nota
    FROM calificaciones
    WHERE nota >= 9
) c ON a.id_alumno = c.id_alumno;

--Preguntas
--¿Devuelven el mismo resultado?
--¿Cuál expresa mejor la idea de “reducir filas antes de unir”?
--¿Cuál es más clara para el optimizador?
--¿Crees que Oracle las ejecutará igual? ¿Por qué?

--Sí
--La consulta B ya que antes de hacer la union simplifica lo que ha de tomar
--La consulta A ya que tiene más libertad a la hora de escoger los datos
--Sí ya que acaba transformandolas en algo muy parecido para poder ejecutarlas

--4.
--Consulta A
SELECT *
FROM pagos;

--Consulta B
SELECT id_cliente, importe
FROM pagos;

--Pregunta
--¿Cuál es mejor y por qué?
--La consulta B ya que no emplea un select all haciendo que vaya al grano

--5
--Consulta A
SELECT nombre
FROM alumnos a
WHERE EXISTS (
    SELECT 1
    FROM calificaciones c
    WHERE c.id_alumno = a.id_alumno
      AND c.nota >= 5
);

-- Consulta B
SELECT nombre
FROM alumnos
WHERE id_alumno IN (
    SELECT id_alumno
    FROM calificaciones
    WHERE nota >= 5
);

--Preguntas
--¿Son equivalentes?
--¿Cuál escala mejor y por qué?
--¿Cuál permite cortar antes?
--No, ya que gracias a utilizar el exists los valores nulos no afectan tanto que con el IN
--La A ya que detiene la búsqueda en cuanto encuentra la primera coincidencia
--La A ya que si encuentra una coincidencia deja de ejecutarse y devuelve lo encontrado

--6
-- Consulta A
SELECT *
FROM alumnos a
JOIN calificaciones c ON a.id_alumno = c.id_alumno;
-- Consulta B
SELECT a.nombre, c.nota
FROM alumnos a
JOIN calificaciones c ON a.id_alumno = c.id_alumno;

--Pregunta, si son equivalentes, ¿cuál elegirías y por qué?
--Eligiria la B ya que no emplea un select all
