/*
CREATE USER PrRA4 IDENTIFIED BY PrRA4;
GRANT CREATE SESSION TO PrRA4;
GRANT CREATE TABLE TO PrRA4;
ALTER USER PrRA4 QUOTA UNLIMITED ON USERS;
*/


DROP TABLE USUARIOS CASCADE CONSTRAINT;
DROP TABLE ESTACIONES CASCADE CONSTRAINT;
DROP TABLE PATINETES CASCADE CONSTRAINT;
DROP TABLE ALQUILERES CASCADE CONSTRAINT;
DROP TABLE HISTORIAL_ALQUILERES CASCADE CONSTRAINT;

CREATE TABLE Usuarios (
    id_usuario NUMBER PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL,
    email VARCHAR2(80) UNIQUE,
    saldo NUMBER(6,2) DEFAULT 0
);

CREATE TABLE Estaciones (
    id_estacion NUMBER PRIMARY KEY,
    nombre VARCHAR2(60),
    ubicacion VARCHAR2(100),
    capacidad NUMBER
);

CREATE TABLE Patinetes (
    id_patinete NUMBER PRIMARY KEY,
    modelo VARCHAR2(40),
    estado VARCHAR2(20),
    id_estacion NUMBER,
    CONSTRAINT patinentes_estacion_fk FOREIGN KEY (id_estacion) REFERENCES Estaciones(id_estacion),
    CONSTRAINT patinetes_estado_ch CHECK (estado IN ('DISPONIBLE', 'MANTENIMIENTO', 'ALQUILADO'))
);

CREATE TABLE Alquileres (
    id_alquiler NUMBER PRIMARY KEY,
    id_usuario NUMBER,
    id_patinete NUMBER,
    fecha_inicio DATE DEFAULT SYSDATE NOT NULL,
    fecha_fin DATE,
    coste NUMBER(6,2),

    CONSTRAINT alquileres_usuario_fk FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario),
    CONSTRAINT alquileres_patinete_fk FOREIGN KEY (id_patinete) REFERENCES Patinetes(id_patinete),
    CONSTRAINT alquileres_fechas_ch CHECK (fecha_fin > fecha_inicio)
);

CREATE TABLE Historial_Alquileres (
    id_usuario NUMBER PRIMARY KEY,
    total_alquileres NUMBER,
    gasto_total NUMBER,
    CONSTRAINT historial_usuario_fk FOREIGN KEY (id_usuario) REFERENCES Usuarios
);