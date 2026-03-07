--mostrar todos los datos de los alumnos
SELECT *
FROM alumnos;
--mostrar nombre y ciudad de los alumnos
SELECT nombre, ciudad
FROM alumnos;
--alumnos mayores de 21 años
SELECT *
FROM alumnos
WHERE edad>21;

--profesores del departamento de informática ordenados por salario
SELECT *
FROM profesores
WHERE departamento = 'INFORMÁTICA'
ORDER BY salario;

SELECT *
FROM profesores
WHERE departamento LIKE 'INFORMÁTICA'
ORDER BY salario;

--cursos impartidos por el profesor que cobra más salario
SELECT *
FROM cursos
WHERE id_profesor = (SELECT id_profesor
                    FROM profesores
                    WHERE salario = (SELECT MAX (salario)
                                    FROM profesores));

--alumnos que viven en ciudades donde hay algún alumno mayor de 21 años
SELECT *
FROM alumnos
WHERE ciudad IN (SELECT ciudad
                FROM alumnos
                WHERE edad>21);

--cursos con más horas que alguno de los cursos de nivel básico
SELECT *
FROM cursos
WHERE HORAS > ANY (SELECT HORAS
                    FROM cursos
                    WHERE nivel = "básico");

--cursos con más horas que todos los cursos de nivel básico
SELECT *
FROM cursos
WHERE HORAS > ALL (SELECT HORAS
                    FROM cursos
                    WHERE nivel = "básico");

--matrículas cuya nota es superior a la media de notas del mismo curso ordenado por curso
SELECT *
FROM matriculas "Matriculas"
WHERE nota > (SELECT AVG(nota)
                    FROM matrículas
                    WHERE id_curso = Matriculas.id_curso)
ORDER BY id_curo;

--matrículas con nota mayor que alguna otra matrícula del mismo alumno
SELECT *
FROM matriculas "Matriculas"
WHERE nota > ANY (SELECT nota
                    FROM matrículas
                    WHERE id_alumno = Matriculas.id_alumno AND id_matricula != Matriculas.id_matricula);

--matrículas con la nota más alta de cada alumno
SELECT *
FROM matriculas "Matriculas"
WHERE nota = (SELECT MAX(nota)
                FROM matriculas
                WHERE id_alumno = Matriculas.id_alumno);