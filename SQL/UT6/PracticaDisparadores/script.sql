-- TABLAS PRINCIPALES
CREATE TABLE departamentos (
    id_departamento NUMBER PRIMARY KEY,
    nombre VARCHAR2(50)
);

CREATE TABLE empleados (
    id_empleado NUMBER PRIMARY KEY,
    nombre VARCHAR2(50),
    salario NUMBER,
    id_departamento NUMBER,
    fecha_alta DATE,
    CONSTRAINT fk_dep FOREIGN KEY (id_departamento)
        REFERENCES departamentos(id_departamento)
);

-- TABLA DE AUDITORÍA
CREATE TABLE auditoria (
    id NUMBER GENERATED ALWAYS AS IDENTITY,
    accion VARCHAR2(50),
    descripcion VARCHAR2(200),
    fecha DATE
);

-- DATOS INICIALES
INSERT INTO departamentos VALUES (1, 'Informática');
INSERT INTO departamentos VALUES (2, 'RRHH');

INSERT INTO empleados VALUES (1, 'Ana', 2000, 1, SYSDATE);
INSERT INTO empleados VALUES (2, 'Luis', 1800, 1, SYSDATE);
INSERT INTO empleados VALUES (3, 'Marta', 2200, 2, SYSDATE);

COMMIT;