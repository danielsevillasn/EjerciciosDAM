--VISTAS--
CREATE VIEW NOMBRE_ALUMNOS
AS
SELECT NOMBRE
FROM ALUMNOS
WHERE CURSO = 'DAM'
WITH CHECK OPTION READ ONLY;

SELECT *
FROM NOMBRE_ALUMNOS;

OR REPLACE VIEW NOMBRE_ALUMNOS
AS
SELECT NOMBRE, APELLIDOS
FROM ALUMNOS;

--OPTIMIZACIÓN--
--Consumir menor nº de recursos del SGBD

--Menos filas leídas (WHERE)
--Menos cálculos innecesarios
--Mejor uso de índices (Evitar funciones en el where)
--Menos consultas internas (JOIN > subconsultas, cuando sean iguales)