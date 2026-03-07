INSERT INTO alumnos VALUES ('111A','Ana','López','García','Madrid');
INSERT INTO alumnos VALUES ('222B','Luis','Pérez','Martín','Madrid');
INSERT INTO alumnos VALUES ('333C','Marta','Ruiz',NULL,'Toledo');
INSERT INTO alumnos VALUES ('444D','Carlos','Sánchez','Lozano','Madrid');

INSERT INTO profesores VALUES ('999P','Laura','Moreno');
INSERT INTO profesores VALUES ('888Q','Javier','Gil');

INSERT INTO cursos VALUES (1,'Bases de Datos',
    DATE '2024-10-01', DATE '2025-03-30','999P');
INSERT INTO cursos VALUES (2,'Programación',
    DATE '2024-10-01', DATE '2025-03-30','888Q');
INSERT INTO cursos VALUES (3,'Sistemas', 
    DATE '2024-10-01', DATE '2025-03-30',NULL);

INSERT INTO matriculas VALUES ('111A',1);
INSERT INTO matriculas VALUES ('111A',2);
INSERT INTO matriculas VALUES ('222B',1);
INSERT INTO matriculas VALUES ('333C',2);

COMMIT;
