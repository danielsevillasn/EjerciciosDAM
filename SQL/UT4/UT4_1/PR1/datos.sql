-- PROFESORES
INSERT INTO profesores VALUES (1, 'Ana López', 'Informática', 2400);
INSERT INTO profesores VALUES (2, 'Luis Pérez', 'Matemáticas', 2200);
INSERT INTO profesores VALUES (3, 'Marta Ruiz', 'Informática', 2600);

-- CURSOS
INSERT INTO cursos VALUES (1, 'Bases de Datos', 'Intermedio', 120, 1);
INSERT INTO cursos VALUES (2, 'Programación Java', 'Avanzado', 180, 3);
INSERT INTO cursos VALUES (3, 'Matemáticas Discretas', 'Básico', 90, 2);
INSERT INTO cursos VALUES (4, 'SQL Avanzado', 'Avanzado', 150, 1);

-- ALUMNOS
INSERT INTO alumnos VALUES (1, 'Carlos Gómez', 20, 'Madrid');
INSERT INTO alumnos VALUES (2, 'Laura Martín', 22, 'Madrid');
INSERT INTO alumnos VALUES (3, 'Javier Torres', 19, 'Toledo');
INSERT INTO alumnos VALUES (4, 'Elena Sánchez', 25, 'Segovia');

-- MATRICULAS
INSERT INTO matriculas VALUES (1, 1, 1, 7);
INSERT INTO matriculas VALUES (2, 1, 2, 8);
INSERT INTO matriculas VALUES (3, 2, 1, 9);
INSERT INTO matriculas VALUES (4, 2, 4, 6);
INSERT INTO matriculas VALUES (5, 3, 3, 5);
INSERT INTO matriculas VALUES (6, 4, 2, 9);
