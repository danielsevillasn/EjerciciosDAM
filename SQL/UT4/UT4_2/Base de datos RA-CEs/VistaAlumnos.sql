--Crea una vista que permita ver el nombre y apellidos de cada alumno con el nombre de la prueba, criterios de evlauaicón y nota obtenidas.
--Una vista tipo acta de notas de cada alumno.
CREATE VIEW ACTA_ALUMNOS
AS
SELECT A.NOMBRE AS NOMBRE_ALUMNO, A.APELLIDOS AS APELLIDOS_ALUMNO, P.NOMBRE AS NOMBRE_PRUEBA, C.DESCRIPCION AS CRITERIOS_EVALUACION, CA.NOTA
FROM ALUMNOS A JOIN CALIFICACIONES CA ON A.ID_ALUMNO = CA.ID_ALUMNO
JOIN CRITERIOS_EVALUACION C ON C.ID_CE = CA.ID_CE
JOIN PRUEBAS_EVALUACION P ON CA.ID_PRUEBA = P.ID_PRUEBA;

--Preguntas
--¿Es una vista de lectura o escritura?
--¿Qué ventaja tiene frente a repetir el JOIN siempre?
--Es una vista de lectura ya que emplea joins y usar update/insert seria imposible
--Simplicidad y reutilización