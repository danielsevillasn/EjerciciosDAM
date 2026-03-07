DROP TABLE PROFESORES CASCADE CONSTRAINT;
DROP TABLE CURSOS CASCADE CONSTRAINT;
DROP TABLE ALUMNOS CASCADE CONSTRAINT;
DROP TABLE MATRICULAS CASCADE CONSTRAINT;

-- =========================
-- TABLA PROFESORES
-- =========================
CREATE TABLE profesores (
    id_profesor NUMBER PRIMARY KEY,
    nombre      VARCHAR2(50) NOT NULL,
    departamento VARCHAR2(50),
    salario     NUMBER
);

-- =========================
-- TABLA CURSOS
-- =========================
CREATE TABLE cursos (
    id_curso     NUMBER PRIMARY KEY,
    nombre       VARCHAR2(50) NOT NULL,
    nivel        VARCHAR2(20),
    horas        NUMBER,
    id_profesor  NUMBER,
    CONSTRAINT fk_cursos_profesor
        FOREIGN KEY (id_profesor)
        REFERENCES profesores(id_profesor)
);

-- =========================
-- TABLA ALUMNOS
-- =========================
CREATE TABLE alumnos (
    id_alumno NUMBER PRIMARY KEY,
    nombre    VARCHAR2(50) NOT NULL,
    edad      NUMBER,
    ciudad    VARCHAR2(50)
);

-- =========================
-- TABLA MATRICULAS
-- =========================
CREATE TABLE matriculas (
    id_matricula NUMBER PRIMARY KEY,
    id_alumno    NUMBER,
    id_curso     NUMBER,
    nota         NUMBER,
    CONSTRAINT fk_matricula_alumno
        FOREIGN KEY (id_alumno)
        REFERENCES alumnos(id_alumno),
    CONSTRAINT fk_matricula_curso
        FOREIGN KEY (id_curso)
        REFERENCES cursos(id_curso)
);
