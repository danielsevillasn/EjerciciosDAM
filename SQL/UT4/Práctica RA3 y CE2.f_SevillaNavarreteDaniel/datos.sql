INSERT INTO resultados_aprendizaje VALUES (1, 'RA1', 'Reconoce los elementos de las bases de datos analizando sus funciones y valorando la utilidad de los sistemas gestores.');
INSERT INTO resultados_aprendizaje VALUES (2, 'RA2', 'Crea bases de datos definiendo su estructura y las características de sus elementos según el modelo relacional.');
INSERT INTO resultados_aprendizaje VALUES (3, 'RA3', 'Consulta la información almacenada en una base de datos empleando asistentes, herramientas gráficas y el lenguaje de manipulación de datos.');
INSERT INTO resultados_aprendizaje VALUES (4, 'RA4', 'Modifica la información almacenada en la base de datos utilizando asistentes, herramientas gráficas y el lenguaje de manipulación de datos.');
INSERT INTO resultados_aprendizaje VALUES (5, 'RA5', 'Desarrolla procedimientos almacenados evaluando y utilizando las sentencias del lenguaje incorporado en el sistema gestor de bases de datos.');
INSERT INTO resultados_aprendizaje VALUES (6, 'RA6', 'Diseña modelos relacionales normalizados interpretando diagramas entidad/relación.');
INSERT INTO resultados_aprendizaje VALUES (7, 'RA7', 'Gestiona la información almacenada en bases de datos no relacionales,evaluando y utilizando las posibilidades que proporciona el sistema gestor.');

INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('a',1,'1a', 'Se han analizado los sistemas lógicos de almacenamiento y sus características.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('b',1,'1b','Se han identificado los distintos tipos de bases de datos según el modelo de datos utilizado.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('c',1,'1c','Se han identificado los distintos tipos de bases de datos según el modelo de datos utilizado.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('d',1,'1d','Se ha evaluado la utilidad de un sistema gestor de bases de datos.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('e',1,'1e','Se ha reconocido la función de cada uno de los elementos de un sistema gestor de bases de datos.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('f',1,'1f','Se han clasificado los sistemas gestores de bases de datos.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('g',1,'1g','Se ha reconocido la utilidad de las bases de datos distribuidas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('h',1,'1h','Se han analizado las políticas de fragmentación de la información.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('i',1,'1i','Se ha identificado la legislación vigente sobre protección de datos.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('j',1,'1j','Se han reconocido los conceptos de Big Data y de la inteligencia de negocios.');

INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('a',2,'2a','Se ha analizado el formato de almacenamiento de la información.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('b',2,'2b','Se han creado las tablas y las relaciones entre ellas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('c',2,'2c','Se han seleccionado los tipos de datos adecuados');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('d',2,'2d','Se han definido los campos clave en las tablas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('e',2,'2e','Se han implantado las restricciones reflejadas en el diseño lógico.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('f',2,'2f','Se han creado vistas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('g',2,'2g','Se han creado los usuarios y se les han asignado privilegios.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('h',2,'2h','Se han utilizando asistentes, herramientas gráficas y los lenguajes de definición y control de datos.');

INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('a',3,'3a','Se han identificado las herramientas y sentencias para realizar consultas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('b',3,'3b','Se han realizado consultas simples sobre una tabla.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('c',3,'3c','Se han realizado consultas sobre el contenido de varias tablas mediante composiciones internas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('d',3,'3d','Se han realizado consultas sobre el contenido de varias tablas mediante composiciones externas.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('e',3,'3e','Se han realizado consultas resumen.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('f',3,'3f','Se han realizado consultas con subconsultas');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('g',3,'3g','Se han realizado consultas que implican múltiples selecciones.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('h',3,'3h','Se han aplicado criterios de optimización de consultas.');

INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('a',6,'6a','Se han utilizado herramientas gráficas para representar el diseño lógico.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('b',6,'6b','Se han identificado las tablas del diseño lógico.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('c',6,'6c','Se han identificado los campos que forman parte de las tablas del diseño lógico.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('d',6,'6d','Se han analizado las relaciones entre las tablas del diseño lógico.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('e',6,'6e','Se han identificado los campos clave.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('f',6,'6f','Se han aplicado reglas de integridad.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('g',6,'6g','Se han aplicado reglas de normalización.');
INSERT INTO criterios_evaluacion (id_ce, id_ra, codigo, descripcion) VALUES ('h',6,'6h','Se han analizado y documentado las restricciones que no pueden plasmarse en el diseño lógico.');

INSERT INTO alumnos (id_alumno, dni, nombre, apellidos, fecha_nacimiento, repetidor)
VALUES (1, '11111111A','Lucía','Martín López', DATE '2004-05-12','N');

INSERT INTO alumnos VALUES (2,'22222222B','Carlos','Sánchez Pérez', DATE '2003-09-22','S');
INSERT INTO alumnos VALUES (3,'33333333C','Marta','Gómez Ruiz', DATE '2004-01-18','N');
INSERT INTO alumnos VALUES (4,'44444444D','David','Fernández Gil', DATE '2002-11-03','S');
INSERT INTO alumnos VALUES (5,'55555555E','Ana','Torres Molina', DATE '2004-07-30','N');
INSERT INTO alumnos VALUES (6,'66666666F','Javier','Hernández Cruz', DATE '2003-03-14','N');

INSERT INTO pruebas_evaluacion (id_prueba, nombre, tipo, fecha) VALUES (1,'Examen Introducción BD','Examen', DATE '2025-10-10');
INSERT INTO pruebas_evaluacion (id_prueba, nombre, tipo, fecha) VALUES (2,'Práctica Modelo ER','Práctica', DATE '2025-11-05');
INSERT INTO pruebas_evaluacion (id_prueba, nombre, tipo, fecha) VALUES (3,'Práctica Creación física BD','Práctica', DATE '2025-12-09');
INSERT INTO pruebas_evaluacion (id_prueba, nombre, tipo, fecha) VALUES (4,'Examen Creación física BD','Examen', DATE '2025-12-14');
INSERT INTO pruebas_evaluacion (id_prueba, nombre, tipo, fecha) VALUES (5,'Práctica Consultas SQL','Práctica', DATE '2026-03-06');

-- Examen RA1 (introducción)
INSERT INTO pruebas_criterios
SELECT 1, id_ce, id_ra FROM criterios_evaluacion WHERE id_ra = 1;
-- Práctica RA6 (modelo entidad/relación)
INSERT INTO pruebas_criterios
SELECT 2, id_ce, id_ra FROM criterios_evaluacion
WHERE id_ra = 6;
-- Práctica RA2 (creación física de la base de datos)
INSERT INTO pruebas_criterios
SELECT 3, id_ce, id_ra FROM criterios_evaluacion
WHERE id_ra = 2 AND codigo <> '2f';
-- Examen RA2 (creación física de la base de datos)
INSERT INTO pruebas_criterios
SELECT 4, id_ce, id_ra FROM criterios_evaluacion
WHERE id_ra = 2 AND codigo <> '2f';
-- Examen RA3 (consultas)
INSERT INTO pruebas_criterios
SELECT 5, id_ce, id_ra FROM criterios_evaluacion WHERE id_ra = 3 OR codigo = '2f';

--PRUEBA1 RA1 TODOS
-- Alumno 1
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 1,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1a';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 2,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1b';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 3,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1c';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 4,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1d';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 5,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1e';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 6,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1f';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 7,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1g';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 8,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1h';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 9,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1i';
INSERT INTO calificaciones (id_calificacion, id_alumno,id_prueba,id_ce,id_ra,nota)
SELECT 10,1,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(6,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo = '1j';
-- Alumno 2
INSERT INTO calificaciones
SELECT 11,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1a';
INSERT INTO calificaciones
SELECT 12,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1b';
INSERT INTO calificaciones
SELECT 13,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1c';
INSERT INTO calificaciones
SELECT 14,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1d';
INSERT INTO calificaciones
SELECT 15,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1e';
INSERT INTO calificaciones
SELECT 16,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1f';
INSERT INTO calificaciones
SELECT 17,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1g';
INSERT INTO calificaciones
SELECT 18,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1h';
INSERT INTO calificaciones
SELECT 19,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1i';
INSERT INTO calificaciones
SELECT 20,2,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,7),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1j';
-- Alumno 3
INSERT INTO calificaciones
SELECT 21,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1a';
INSERT INTO calificaciones
SELECT 22,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1b';
INSERT INTO calificaciones
SELECT 23,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1c';
INSERT INTO calificaciones
SELECT 24,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1d';
INSERT INTO calificaciones
SELECT 25,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1e';
INSERT INTO calificaciones
SELECT 26,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1f';
INSERT INTO calificaciones
SELECT 27,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1g';
INSERT INTO calificaciones
SELECT 28,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1h';
INSERT INTO calificaciones
SELECT 29,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1i';
INSERT INTO calificaciones
SELECT 30,3,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(5,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1j';
-- Alumno 4
INSERT INTO calificaciones
SELECT 31,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1a';
INSERT INTO calificaciones
SELECT 32,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1b';
INSERT INTO calificaciones
SELECT 33,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1c';
INSERT INTO calificaciones
SELECT 34,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1d';
INSERT INTO calificaciones
SELECT 35,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1e';
INSERT INTO calificaciones
SELECT 36,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1f';
INSERT INTO calificaciones
SELECT 37,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1g';
INSERT INTO calificaciones
SELECT 38,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1h';
INSERT INTO calificaciones
SELECT 39,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1i';
INSERT INTO calificaciones
SELECT 40,4,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(2,6),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1j';
-- Alumno 5
INSERT INTO calificaciones
SELECT 41,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1a';
INSERT INTO calificaciones
SELECT 42,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1b';
INSERT INTO calificaciones
SELECT 43,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1c';
INSERT INTO calificaciones
SELECT 44,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1d';
INSERT INTO calificaciones
SELECT 45,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1e';
INSERT INTO calificaciones
SELECT 46,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1f';
INSERT INTO calificaciones
SELECT 47,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1g';
INSERT INTO calificaciones
SELECT 48,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1h';
INSERT INTO calificaciones
SELECT 49,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1i';
INSERT INTO calificaciones
SELECT 50,5,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(7,9),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1j';
-- Alumno 6
INSERT INTO calificaciones
SELECT 51,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1a';
INSERT INTO calificaciones
SELECT 52,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1b';
INSERT INTO calificaciones
SELECT 53,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1c';
INSERT INTO calificaciones
SELECT 54,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1d';
INSERT INTO calificaciones
SELECT 55,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1e';
INSERT INTO calificaciones
SELECT 56,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1f';
INSERT INTO calificaciones
SELECT 57,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1g';
INSERT INTO calificaciones
SELECT 58,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1h';
INSERT INTO calificaciones
SELECT 59,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1i';
INSERT INTO calificaciones
SELECT 60,6,1,id_ce,id_ra,ROUND(DBMS_RANDOM.VALUE(4,8),2)
FROM criterios_evaluacion WHERE id_ra = 1 and codigo='1j';

-- PRUEBA 2 - RA6----------------------
INSERT INTO calificaciones (id_calificacion, id_alumno, id_prueba, id_ce, id_ra, nota) SELECT 61, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6a';
INSERT INTO calificaciones SELECT 62, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6b';
INSERT INTO calificaciones SELECT 63, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6c';
INSERT INTO calificaciones SELECT 64, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6d';
INSERT INTO calificaciones SELECT 65, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6e';
INSERT INTO calificaciones SELECT 66, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6f';
INSERT INTO calificaciones SELECT 67, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6g';
INSERT INTO calificaciones SELECT 68, 1, 2, id_ce, id_ra, ROUND(DBMS_RANDOM.VALUE(4,8),2) FROM criterios_evaluacion WHERE id_ra = 6 AND codigo='6h';
--Alumno2
INSERT INTO calificaciones VALUES (69,2,2,'a',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (70,2,2,'b',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (71,2,2,'c',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (72,2,2,'d',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (73,2,2,'e',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (74,2,2,'f',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (75,2,2,'g',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
INSERT INTO calificaciones VALUES (76,2,2,'h',6,ROUND(DBMS_RANDOM.VALUE(1,8),2));
--Alumno3
INSERT INTO calificaciones VALUES (77,3,2,'a',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (78,3,2,'b',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (79,3,2,'c',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (80,3,2,'d',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (81,3,2,'e',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (82,3,2,'f',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (83,3,2,'g',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
INSERT INTO calificaciones VALUES (84,3,2,'h',6,ROUND(DBMS_RANDOM.VALUE(1,9),2));
--Alumno4
INSERT INTO calificaciones VALUES (85,4,2,'a',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (86,4,2,'b',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (87,4,2,'c',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (88,4,2,'d',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (89,4,2,'e',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (90,4,2,'f',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (91,4,2,'g',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
INSERT INTO calificaciones VALUES (92,4,2,'h',6,ROUND(DBMS_RANDOM.VALUE(0,10),2));
--Alumno5
INSERT INTO calificaciones VALUES (93,5,2,'a',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (94,5,2,'b',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (95,5,2,'c',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (96,5,2,'d',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (97,5,2,'e',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (98,5,2,'f',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (99,5,2,'g',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
INSERT INTO calificaciones VALUES (100,5,2,'h',6,ROUND(DBMS_RANDOM.VALUE(1,10),2));
--PRUEBA 3 - RA2
--Alumno1
INSERT INTO calificaciones VALUES (101,1,3,'a',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
INSERT INTO calificaciones VALUES (102,1,3,'b',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
INSERT INTO calificaciones VALUES (103,1,3,'c',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
INSERT INTO calificaciones VALUES (104,1,3,'d',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
INSERT INTO calificaciones VALUES (105,1,3,'e',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
INSERT INTO calificaciones VALUES (106,1,3,'g',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
INSERT INTO calificaciones VALUES (107,1,3,'h',2,ROUND(DBMS_RANDOM.VALUE(6,9),2));
--Alumno2
INSERT INTO calificaciones VALUES (108,2,3,'a',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
INSERT INTO calificaciones VALUES (109,2,3,'b',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
INSERT INTO calificaciones VALUES (110,2,3,'c',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
INSERT INTO calificaciones VALUES (111,2,3,'d',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
INSERT INTO calificaciones VALUES (112,2,3,'e',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
INSERT INTO calificaciones VALUES (113,2,3,'g',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
INSERT INTO calificaciones VALUES (114,2,3,'h',2,ROUND(DBMS_RANDOM.VALUE(0,6),2));
--Alumno3
INSERT INTO calificaciones VALUES (115,3,3,'a',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
INSERT INTO calificaciones VALUES (116,3,3,'b',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
INSERT INTO calificaciones VALUES (117,3,3,'c',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
INSERT INTO calificaciones VALUES (118,3,3,'d',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
INSERT INTO calificaciones VALUES (119,3,3,'e',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
INSERT INTO calificaciones VALUES (120,3,3,'g',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
INSERT INTO calificaciones VALUES (121,3,3,'h',2,ROUND(DBMS_RANDOM.VALUE(2,7),2));
--Alumno4
INSERT INTO calificaciones VALUES (122,4,3,'a',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
INSERT INTO calificaciones VALUES (123,4,3,'b',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
INSERT INTO calificaciones VALUES (124,4,3,'c',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
INSERT INTO calificaciones VALUES (125,4,3,'d',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
INSERT INTO calificaciones VALUES (126,4,3,'e',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
INSERT INTO calificaciones VALUES (127,4,3,'g',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
INSERT INTO calificaciones VALUES (128,4,3,'h',2,ROUND(DBMS_RANDOM.VALUE(1,6),2));
--Alumno5
INSERT INTO calificaciones VALUES (129,5,3,'a',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
INSERT INTO calificaciones VALUES (130,5,3,'b',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
INSERT INTO calificaciones VALUES (131,5,3,'c',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
INSERT INTO calificaciones VALUES (132,5,3,'d',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
INSERT INTO calificaciones VALUES (133,5,3,'e',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
INSERT INTO calificaciones VALUES (134,5,3,'g',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
INSERT INTO calificaciones VALUES (135,5,3,'h',2,ROUND(DBMS_RANDOM.VALUE(1,7),2));
--Alumno6
INSERT INTO calificaciones VALUES (136,6,3,'a',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
INSERT INTO calificaciones VALUES (137,6,3,'b',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
INSERT INTO calificaciones VALUES (138,6,3,'c',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
INSERT INTO calificaciones VALUES (139,6,3,'d',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
INSERT INTO calificaciones VALUES (140,6,3,'e',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
INSERT INTO calificaciones VALUES (141,6,3,'g',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
INSERT INTO calificaciones VALUES (142,6,3,'h',2,ROUND(DBMS_RANDOM.VALUE(0,8),2));
--PRUEBA 4 - RA2
INSERT INTO calificaciones VALUES (143,1,4,'a',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (144,1,4,'b',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (145,1,4,'c',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (146,1,4,'d',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (147,1,4,'e',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (148,1,4,'f',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (149,1,4,'g',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
INSERT INTO calificaciones VALUES (150,1,4,'h',2,ROUND(DBMS_RANDOM.VALUE(6,8),2));
--Alumno2
INSERT INTO calificaciones VALUES (151,2,4,'a',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (152,2,4,'b',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (153,2,4,'c',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (154,2,4,'d',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (155,2,4,'e',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (156,2,4,'f',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (157,2,4,'g',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
INSERT INTO calificaciones VALUES (158,2,4,'h',2,ROUND(DBMS_RANDOM.VALUE(2,6),2));
--Alumno3
INSERT INTO calificaciones VALUES (159,3,4,'a',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (160,3,4,'b',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (161,3,4,'c',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (162,3,4,'d',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (163,3,4,'e',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (164,3,4,'f',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (165,3,4,'g',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (166,3,4,'h',2,ROUND(DBMS_RANDOM.VALUE(4,7),2));
--Alumno4
INSERT INTO calificaciones VALUES (167,4,4,'a',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (168,4,4,'b',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (169,4,4,'c',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (170,4,4,'d',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (171,4,4,'e',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (172,4,4,'f',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (173,4,4,'g',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
INSERT INTO calificaciones VALUES (174,4,4,'h',2,ROUND(DBMS_RANDOM.VALUE(1,5),2));
--Alumno5
INSERT INTO calificaciones VALUES (175,5,4,'a',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (176,5,4,'b',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (177,5,4,'c',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (178,5,4,'d',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (179,5,4,'e',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (180,5,4,'f',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (181,5,4,'g',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (182,5,4,'h',2,ROUND(DBMS_RANDOM.VALUE(7,9),2));
--Alumno6
INSERT INTO calificaciones VALUES (183,6,4,'a',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (184,6,4,'b',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (185,6,4,'c',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (186,6,4,'d',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (187,6,4,'e',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (188,6,4,'f',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (189,6,4,'g',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
INSERT INTO calificaciones VALUES (190,6,4,'h',2,ROUND(DBMS_RANDOM.VALUE(3,7),2));
--PRUEBA 5 - RA3
--Alumno1
INSERT INTO calificaciones VALUES (191,1,5,'a',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (192,1,5,'b',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (193,1,5,'c',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (194,1,5,'d',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (195,1,5,'e',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (196,1,5,'f',2,ROUND(DBMS_RANDOM.VALUE(7,9),2)); -- 2f
INSERT INTO calificaciones VALUES (197,1,5,'g',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
INSERT INTO calificaciones VALUES (198,1,5,'h',3,ROUND(DBMS_RANDOM.VALUE(7,9),2));
--Alumno2
INSERT INTO calificaciones VALUES (199,2,5,'a',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (200,2,5,'b',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (201,2,5,'c',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (202,2,5,'d',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (203,2,5,'e',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (204,2,5,'f',2,ROUND(DBMS_RANDOM.VALUE(4,7),2)); -- 2f
INSERT INTO calificaciones VALUES (205,2,5,'g',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (206,2,5,'h',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
--Alumno3
INSERT INTO calificaciones VALUES (207,3,5,'a',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
INSERT INTO calificaciones VALUES (208,3,5,'b',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
INSERT INTO calificaciones VALUES (209,3,5,'c',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
INSERT INTO calificaciones VALUES (210,3,5,'d',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
INSERT INTO calificaciones VALUES (211,3,5,'e',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
INSERT INTO calificaciones VALUES (212,3,5,'f',2,ROUND(DBMS_RANDOM.VALUE(5,8),2)); -- 2f
INSERT INTO calificaciones VALUES (213,3,5,'g',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
INSERT INTO calificaciones VALUES (214,3,5,'h',3,ROUND(DBMS_RANDOM.VALUE(5,8),2));
--Alumno4 no hace
--Alumno5
INSERT INTO calificaciones VALUES (215,5,5,'a',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
INSERT INTO calificaciones VALUES (216,5,5,'b',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
INSERT INTO calificaciones VALUES (217,5,5,'c',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
INSERT INTO calificaciones VALUES (218,5,5,'d',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
INSERT INTO calificaciones VALUES (219,5,5,'e',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
INSERT INTO calificaciones VALUES (220,5,5,'f',2,ROUND(DBMS_RANDOM.VALUE(8,9),2)); -- 2f
INSERT INTO calificaciones VALUES (221,5,5,'g',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
INSERT INTO calificaciones VALUES (222,5,5,'h',3,ROUND(DBMS_RANDOM.VALUE(8,9),2));
--Alumno6
INSERT INTO calificaciones VALUES (223,6,5,'a',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (224,6,5,'b',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (225,6,5,'c',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (226,6,5,'d',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (227,6,5,'e',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (228,6,5,'f',2,ROUND(DBMS_RANDOM.VALUE(4,7),2)); -- 2f
INSERT INTO calificaciones VALUES (229,6,5,'g',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
INSERT INTO calificaciones VALUES (230,6,5,'h',3,ROUND(DBMS_RANDOM.VALUE(4,7),2));
