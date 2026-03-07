INSERT INTO resultados_aprendizaje VALUES (1, 'RA1', 'Reconoce los elementos de las bases de datos analizando sus funciones y valorando la utilidad de los sistemas gestores.');
INSERT INTO resultados_aprendizaje VALUES (2, 'RA2', 'Crea bases de datos definiendo su estructura y las características de sus elementos según el modelo relacional.');
INSERT INTO resultados_aprendizaje VALUES (3, 'RA3', 'Consulta la información almacenada en una base de datos empleando asistentes, herramientas gráficas y el lenguaje de manipulación de datos.');
INSERT INTO resultados_aprendizaje VALUES (4, 'RA4', 'Modifica la información almacenada en la base de datos utilizando asistentes, herramientas gráficas y el lenguaje de manipulación de datos.');
INSERT INTO resultados_aprendizaje VALUES (5, 'RA5', 'Desarrolla procedimientos almacenados evaluando y utilizando las sentencias del lenguaje incorporado en el sistema gestor de bases de datos.');
INSERT INTO resultados_aprendizaje VALUES (6, 'RA6', 'Diseña modelos relacionales normalizados interpretando diagramas entidad/relación.');
INSERT INTO resultados_aprendizaje VALUES (7, 'RA7', 'Gestiona la información almacenada en bases de datos no relacionales,evaluando y utilizando las posibilidades que proporciona el sistema gestor.');

INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1a');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1b');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1c');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1d');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1e');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1f');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1g');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1h');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1i');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (1,'1j');

INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2a');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2b');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2c');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2d');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2e');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2f');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2g');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (2,'2h');

INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6a');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6b');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6c');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6d');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6e');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6f');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6g');
INSERT INTO criterios_evaluacion (id_ra, codigo) VALUES (6,'6h');

INSERT INTO alumnos (dni, nombre, apellidos, fecha_nacimiento, repetidor)
VALUES ('11111111A','Lucía','Martín López', DATE '2004-05-12','N');

INSERT INTO alumnos VALUES (DEFAULT,'22222222B','Carlos','Sánchez Pérez', DATE '2003-09-22','S');
INSERT INTO alumnos VALUES (DEFAULT,'33333333C','Marta','Gómez Ruiz', DATE '2004-01-18','N');
INSERT INTO alumnos VALUES (DEFAULT,'44444444D','David','Fernández Gil', DATE '2002-11-03','S');
INSERT INTO alumnos VALUES (DEFAULT,'55555555E','Ana','Torres Molina', DATE '2004-07-30','N');
INSERT INTO alumnos VALUES (DEFAULT,'66666666F','Javier','Hernández Cruz', DATE '2003-03-14','N');

INSERT INTO pruebas_evaluacion (nombre, tipo, fecha)
VALUES ('Examen Introducción BD','Examen', DATE '2025-10-10');

INSERT INTO pruebas_evaluacion (nombre, tipo, fecha)
VALUES ('Práctica Modelo ER','Práctica', DATE '2025-11-05');

INSERT INTO pruebas_evaluacion (nombre, tipo, fecha)
VALUES ('Examen Consultas SQL','Examen', DATE '2026-02-15');

-- Examen RA1
INSERT INTO pruebas_criterios
SELECT 1, id_ce FROM criterios_evaluacion WHERE id_ra = 1;

-- Práctica RA2 (excepto 2f)
INSERT INTO pruebas_criterios
SELECT 2, id_ce FROM criterios_evaluacion
WHERE id_ra = 2 AND codigo <> '2f';

-- Examen RA6
INSERT INTO pruebas_criterios
SELECT 3, id_ce FROM criterios_evaluacion WHERE id_ra = 6;

-- Alumno 1 - RA1
INSERT INTO calificaciones (id_alumno,id_prueba,id_ce,nota)
SELECT 1,1,id_ce, ROUND(DBMS_RANDOM.VALUE(5,9),2)
FROM criterios_evaluacion WHERE id_ra = 1;
--Alumno 2
INSERT INTO calificaciones (id_alumno,id_prueba,id_ce,nota)
SELECT 2,1,id_ce, ROUND(DBMS_RANDOM.VALUE(0,9),2)
FROM criterios_evaluacion WHERE id_ra = 1;
--Alumno 3
INSERT INTO calificaciones (id_alumno,id_prueba,id_ce,nota)
SELECT 3,1,id_ce, ROUND(DBMS_RANDOM.VALUE(2,10),2)
FROM criterios_evaluacion WHERE id_ra = 1;
--Alumno 4
INSERT INTO calificaciones (id_alumno,id_prueba,id_ce,nota)
SELECT 4,1,id_ce, ROUND(DBMS_RANDOM.VALUE(1,7),2)
FROM criterios_evaluacion WHERE id_ra = 1;
--Alumno 5
INSERT INTO calificaciones (id_alumno,id_prueba,id_ce,nota)
SELECT 5,1,id_ce, ROUND(DBMS_RANDOM.VALUE(0,9),2)
FROM criterios_evaluacion WHERE id_ra = 1;
--Alumno 6
INSERT INTO calificaciones (id_alumno,id_prueba,id_ce,nota)
SELECT 6,1,id_ce, ROUND(DBMS_RANDOM.VALUE(1,9),2)
FROM criterios_evaluacion WHERE id_ra = 1;

-- Alumno 1 - RA2 (sin 2f)
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 1, 2, id_ce, ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion
WHERE id_ra = 2
  AND codigo <> '2f';
--Alumno 2
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 2, 2, id_ce, ROUND(DBMS_RANDOM.VALUE(0,6),2)
FROM criterios_evaluacion
WHERE id_ra = 2
  AND codigo <> '2f';
--Alumno 3
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 3, 2, id_ce, ROUND(DBMS_RANDOM.VALUE(2,7),2)
FROM criterios_evaluacion
WHERE id_ra = 2
  AND codigo <> '2f';
--Alumno 4
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 4, 2, id_ce, ROUND(DBMS_RANDOM.VALUE(1,6),2)
FROM criterios_evaluacion
WHERE id_ra = 2
  AND codigo <> '2f';
--Alumno 5
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 5, 2, id_ce, ROUND(DBMS_RANDOM.VALUE(1,7),2)
FROM criterios_evaluacion
WHERE id_ra = 2
  AND codigo <> '2f';
--Alumno 6
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 6, 2, id_ce, ROUND(DBMS_RANDOM.VALUE(0,8),2)
FROM criterios_evaluacion
WHERE id_ra = 2
  AND codigo <> '2f';


-- Alumno 1 - RA6
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 1,3,id_ce,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion
WHERE id_ra = 6;
--Alumno 2
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 2,3,id_ce,ROUND(DBMS_RANDOM.VALUE(1,8),2)
FROM criterios_evaluacion
WHERE id_ra = 6;
--Alumno 3
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 3,3,id_ce,ROUND(DBMS_RANDOM.VALUE(1,9),2)
FROM criterios_evaluacion
WHERE id_ra = 6;
--Alumno 4
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 4,3,id_ce,ROUND(DBMS_RANDOM.VALUE(0,10),2)
FROM criterios_evaluacion
WHERE id_ra = 6;
--Alumno 5
INSERT INTO calificaciones (id_alumno, id_prueba, id_ce, nota)
SELECT 5,3,id_ce,ROUND(DBMS_RANDOM.VALUE(1,10),2)
FROM criterios_evaluacion
WHERE id_ra = 6;
--Alumno6 no hace prueba 3

