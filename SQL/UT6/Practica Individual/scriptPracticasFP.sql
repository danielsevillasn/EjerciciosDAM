
DROP TABLE practicas CASCADE CONSTRAINTS;
DROP TABLE alumnos CASCADE CONSTRAINTS;
DROP TABLE empresas CASCADE CONSTRAINTS;
DROP TABLE ciclos CASCADE CONSTRAINTS;

-- Tabla de ciclos formativos
CREATE TABLE ciclos (
    ciclo_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    grado VARCHAR2(20) CHECK (grado IN ('Básico', 'Medio', 'Superior')),
    horas_practicas NUMBER(4) NOT NULL
);

-- Tabla de empresas
CREATE TABLE empresas (
    empresa_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    cif VARCHAR2(9) UNIQUE NOT NULL,
    direccion VARCHAR2(200),
    telefono VARCHAR2(15),
    email VARCHAR2(100),
    responsable VARCHAR2(100)
);

-- Tabla de alumnos
CREATE TABLE alumnos (
    alumno_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    dni VARCHAR2(9) UNIQUE NOT NULL,
    nombre VARCHAR2(100) NOT NULL,
    apellidos VARCHAR2(100) NOT NULL,
    telefono VARCHAR2(15),
    email VARCHAR2(100),
    ciclo_id NUMBER NOT NULL,
    año_academico VARCHAR2(9) NOT NULL,
    CONSTRAINT fk_alumno_ciclo FOREIGN KEY (ciclo_id) REFERENCES ciclos(ciclo_id)
);

-- Tabla de prácticas
CREATE TABLE practicas (
    practica_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    alumno_id NUMBER NOT NULL,
    empresa_id NUMBER NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    horas_realizadas NUMBER(4),
    evaluacion NUMBER(4,2) CHECK (evaluacion BETWEEN 0 AND 10),
    tutor_empresa VARCHAR2(100),
    tutor_instituto VARCHAR2(100),
    estado VARCHAR2(20) DEFAULT 'Pendiente' CHECK (estado IN ('Pendiente', 'En curso', 'Finalizada', 'Cancelada')),
    observaciones VARCHAR2(500),
    CONSTRAINT fk_practica_alumno FOREIGN KEY (alumno_id) REFERENCES alumnos(alumno_id),
    CONSTRAINT fk_practica_empresa FOREIGN KEY (empresa_id) REFERENCES empresas(empresa_id),
    CONSTRAINT chk_fechas_practica CHECK (fecha_fin > fecha_inicio)
);

-- Inserción de datos
-- Insertar ciclos formativos
INSERT INTO ciclos (nombre, grado, horas_practicas) VALUES 
('Desarrollo Aplicaciones Multiplataforma', 'Superior', 400);
INSERT INTO ciclos (nombre, grado, horas_practicas) VALUES 
('Administración Sistemas Informáticos', 'Superior', 400);
INSERT INTO ciclos (nombre, grado, horas_practicas) VALUES 
('Sistemas Microinformáticos y Redes', 'Medio', 350);

-- Insertar empresas
INSERT INTO empresas (nombre, cif, direccion, telefono, email, responsable) VALUES 
('TechSolutions', 'A12345678', 'Calle Tecnología 45, Madrid', '912345678', 'info@techsolutions.com', 'Juan García');
INSERT INTO empresas (nombre, cif, direccion, telefono, email, responsable) VALUES 
('Redes y Sistemas', 'B87654321', 'Av. Servidores 12, Barcelona', '932345678', 'contacto@redesysistemas.com', 'Carlos Martínez');

INSERT INTO empresas (nombre, cif, direccion, telefono, email, responsable) VALUES ('Innovatech', 'C11223344', 'C/ Innovación 7, Sevilla', '954112233', 'info@innovatech.com', 'Laura Gómez');
INSERT INTO empresas (nombre, cif, direccion, telefono, email, responsable) VALUES ('Code4Future', 'D55667788', 'C/ Futuro 9, Valencia', '961223344', 'contacto@code4future.es', 'Miguel Torres');


-- Insertar alumnos
INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES 
('12345678A', 'Alejandro', 'Martín Gutiérrez', '678912345', 'a.martin@alumno.edu', 1, '2023/2024');
INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES 
('23456789B', 'Beatriz', 'Rodríguez Sánchez', '689123456', 'b.rodriguez@alumno.edu', 1, '2023/2024');
INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES 
('34567890C', 'Carlos', 'Díaz Pérez', '691234567', 'c.diaz@alumno.edu', 2, '2023/2024');

INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES ('45678901D', 'Diana', 'López Ramírez', '692345678', 'd.lopez@alumno.edu', 3, '2023/2024');
INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES ('56789012E', 'Eduardo', 'Santos Molina', '693456789', 'e.santos@alumno.edu', 2, '2022/2023');
INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES ('67890123F', 'Francisca', 'Navarro Ruiz', '694567890', 'f.navarro@alumno.edu', 1, '2023/2024');
INSERT INTO alumnos (dni, nombre, apellidos, telefono, email, ciclo_id, año_academico) VALUES ('78901234G', 'Gonzalo', 'Hernández León', '695678901', 'g.hernandez@alumno.edu', 3, '2023/2024');


-- Insertar prácticas
-- =========================
-- PRÁCTICAS
-- =========================

-- Pendiente -> debe pasar a EN CURSO (empieza en 3 días)
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    1, 1,
    TRUNC(SYSDATE)+3,
    TRUNC(SYSDATE)+93,
    NULL,
    NULL,
    'Juan García',
    'Ana Fernández',
    'Pendiente',
    'Comienza en pocos días'
);

-- Pendiente -> NO debe cambiar (faltan 20 días)
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    2, 2,
    TRUNC(SYSDATE)+20,
    TRUNC(SYSDATE)+110,
    NULL,
    NULL,
    'Carlos Martínez',
    'Pedro Sánchez',
    'Pendiente',
    'Aún queda bastante para empezar'
);

-- En curso -> debe pasar a FINALIZADA
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    3, 1,
    TRUNC(SYSDATE)-100,
    TRUNC(SYSDATE)-1,
    400,
    8.7,
    'Juan García',
    'Ana Fernández',
    'En curso',
    'Debe finalizar automáticamente'
);

-- En curso -> NO debe cambiar
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    4, 2,
    TRUNC(SYSDATE)-10,
    TRUNC(SYSDATE)+40,
    120,
    NULL,
    'Carlos Martínez',
    'María Ruiz',
    'En curso',
    'Prácticas actualmente activas'
);

-- Finalizada con nota alta
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    5, 3,
    TRUNC(SYSDATE)-150,
    TRUNC(SYSDATE)-60,
    400,
    9.4,
    'Laura Gómez',
    'Luis Pérez',
    'Finalizada',
    'Excelente rendimiento'
);

-- Finalizada con nota media
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    6, 4,
    TRUNC(SYSDATE)-140,
    TRUNC(SYSDATE)-50,
    350,
    6.8,
    'Miguel Torres',
    'Carmen Gil',
    'Finalizada',
    'Buen desempeño general'
);

-- Cancelada
INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
)
VALUES (
    7, 2,
    TRUNC(SYSDATE)-30,
    TRUNC(SYSDATE)+30,
    40,
    NULL,
    'Carlos Martínez',
    'Ana Fernández',
    'Cancelada',
    'Cancelada por motivos personales'
);

COMMIT;
