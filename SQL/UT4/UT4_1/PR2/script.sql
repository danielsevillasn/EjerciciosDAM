CREATE TABLE exploradores (
    id_explorador NUMBER PRIMARY KEY,
    nombre        VARCHAR2(50) NOT NULL,
    edad          NUMBER,
    rango         VARCHAR2(30)
);
CREATE TABLE zonas (
    id_zona   NUMBER PRIMARY KEY,
    nombre    VARCHAR2(50) NOT NULL,
    region    VARCHAR2(50),
    peligro   VARCHAR2(20)
);
CREATE TABLE misiones (
    id_mision   NUMBER PRIMARY KEY,
    nombre      VARCHAR2(50) NOT NULL,
    dificultad  VARCHAR2(20),
    duracion    NUMBER,
    id_zona     NUMBER,
    CONSTRAINT fk_mision_zona
        FOREIGN KEY (id_zona)
        REFERENCES zonas(id_zona)
);
CREATE TABLE participaciones (
    id_participacion NUMBER PRIMARY KEY,
    id_explorador    NUMBER,
    id_mision        NUMBER,
    exito            VARCHAR2(2),
    CONSTRAINT fk_part_explorador
        FOREIGN KEY (id_explorador)
        REFERENCES exploradores(id_explorador),
    CONSTRAINT fk_part_mision
        FOREIGN KEY (id_mision)
        REFERENCES misiones(id_mision)
);
