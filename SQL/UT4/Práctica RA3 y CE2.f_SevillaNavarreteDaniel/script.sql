/*
CREATE USER PrEvaluableRA3 IDENTIFIED BY PrEvaluableRA3;
GRANT CREATE SESSION TO PrEvaluableRA3;
GRANT CREATE TABLE TO PrEvaluableRA3;
GRANT CREATE VIEW TO PrEvaluableRA3;
ALTER USER PrEvaluableRA3 QUOTA UNLIMITED ON USERS;
*/
DROP TABLE ALUMNOS CASCADE CONSTRAINT;
DROP TABLE RESULTADOS_APRENDIZAJE CASCADE CONSTRAINT;
DROP TABLE CRITERIOS_EVALUACION CASCADE CONSTRAINT;
DROP TABLE PRUEBAS_EVALUACION CASCADE CONSTRAINT;
DROP TABLE PRUEBAS_CRITERIOS CASCADE CONSTRAINT;
DROP TABLE CALIFICACIONES CASCADE CONSTRAINT;

-- =========================
-- TABLA DE ALUMNOS
-- =========================
CREATE TABLE alumnos (
    id_alumno NUMBER(3),
    dni VARCHAR2(9) UNIQUE NOT NULL,
    nombre VARCHAR2(50) NOT NULL,
    apellidos VARCHAR2(80) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    repetidor CHAR(1) CHECK (repetidor IN ('S','N')),
    CONSTRAINT alumno_id_pk PRIMARY KEY(id_alumno)
);

-- =========================
-- RESULTADOS DE APRENDIZAJE
-- =========================
CREATE TABLE resultados_aprendizaje (
    id_ra NUMBER(3),
    codigo VARCHAR2(4) UNIQUE NOT NULL,
    descripcion VARCHAR2(200),
    CONSTRAINT resulAprediz_id_pk PRIMARY KEY (id_ra)
);

-- =========================
-- CRITERIOS DE EVALUACIÓN
-- =========================
CREATE TABLE criterios_evaluacion (
    id_ce CHAR(1),
    id_ra NUMBER NOT NULL,
    codigo VARCHAR2(5) NOT NULL,
    descripcion VARCHAR2(200),
    CONSTRAINT criterEva_id_pk PRIMARY KEY (id_ce,id_ra),
    CONSTRAINT criterEva_cErA_fk FOREIGN KEY (id_ra) REFERENCES resultados_aprendizaje(id_ra),
    CONSTRAINT criterEva_rAcE_uq UNIQUE (id_ra, codigo),
    CONSTRAINT criterEva_idCe_CH CHECK (id_ce IN ('a','b','c','d','e','f','g','h','i','j','k','l','m'))
);

-- =========================
-- PRUEBAS DE EVALUACIÓN
-- =========================
CREATE TABLE pruebas_evaluacion (
    id_prueba NUMBER(3),
    nombre VARCHAR2(100) NOT NULL,
    tipo VARCHAR2(30), -- Examen, Práctica, Proyecto, Cuestionario...
    fecha DATE NOT NULL,
    descripcion VARCHAR2(200),
    CONSTRAINT pruebasEva_id_pk PRIMARY KEY(id_prueba)
);

-- Relación N:M entre pruebas y criterios
CREATE TABLE pruebas_criterios (
    id_prueba NUMBER,
    id_ce CHAR,
    id_ra NUMBER,
    CONSTRAINT pruebasCrite_ids_pk PRIMARY KEY (id_prueba, id_ce, id_ra),
    CONSTRAINT pruebasCrite_idPrueba_fk FOREIGN KEY (id_prueba) REFERENCES pruebas_evaluacion(id_prueba),
    CONSTRAINT pruebasCrite_idCe_fk FOREIGN KEY (id_ce, id_ra) REFERENCES criterios_evaluacion(id_ce, id_ra)
);

-- =========================
-- CALIFICACIONES
-- =========================
CREATE TABLE calificaciones (
    id_calificacion NUMBER(3),
    id_alumno NUMBER NOT NULL,
    id_prueba NUMBER NOT NULL,
    id_ce CHAR NOT NULL,
    id_ra NUMBER NOT NULL,
    nota NUMBER(4,2) CHECK (nota BETWEEN 0 AND 10),
    CONSTRAINT calificaciones_id_pk PRIMARY KEY(id_calificacion),
    CONSTRAINT calificaciones_idAlumno_fk FOREIGN KEY (id_alumno) REFERENCES alumnos(id_alumno),
    CONSTRAINT calificaciones_idPrueba_fk FOREIGN KEY (id_prueba) REFERENCES pruebas_evaluacion(id_prueba),
    CONSTRAINT calificaciones_idCe_fk FOREIGN KEY (id_ce, id_ra) REFERENCES criterios_evaluacion(id_ce, id_ra),
    CONSTRAINT calificaciones_idAlIdPrueIdCe_uq UNIQUE (id_alumno, id_prueba, id_ce, id_ra)
);
