/*
CREATE USER cuentasBanco IDENTIFIED BY cuentasBanco;
GRANT CREATE SESSION TO cuentasBanco;
GRANT CREATE TABLE TO cuentasBanco;
GRANT CREATE SEQUENCE TO cuentasBanco;
GRANT CREATE TRIGGER TO cuentasBanco;
ALTER USER cuentasBanco QUOTA UNLIMITED ON USERS;
*/

DROP TABLE CUENTAS CASCADE CONSTRAINT;
DROP TABLE REGISTRO CASCADE CONSTRAINT;
DROP SEQUENCE seq_cuentas;
DROP SEQUENCE seq_registro;

-- =========================
-- TABLA: CUENTAS
-- =========================
CREATE TABLE cuentas (
    id_cuenta        NUMBER PRIMARY KEY,
    titular          VARCHAR2(100) NOT NULL,
    saldo            NUMBER(12,2) DEFAULT 0 NOT NULL,
    fecha_creacion   DATE DEFAULT SYSDATE,
    estado           VARCHAR2(20) DEFAULT 'ACTIVA',
    CONSTRAINT cuentas_estado_ch CHECK (estado IN ('ACTIVA', 'BLOQUEADA', 'CERRADA'))
);

-- =========================
-- TABLA: REGISTRO (MOVIMIENTOS)
-- =========================
CREATE TABLE registro (
    id_registro      NUMBER PRIMARY KEY,
    cuenta_origen    NUMBER NOT NULL,
    cuenta_destino   NUMBER NOT NULL,
    importe          NUMBER(12,2) NOT NULL CHECK (importe > 0),
    tipo_operacion   VARCHAR2(20) NOT NULL CHECK (tipo_operacion IN ('TRANSFERENCIA', 'INGRESO', 'RETIRADA')),
    fecha_operacion  DATE DEFAULT SYSDATE,
    descripcion      VARCHAR2(200),
    CONSTRAINT registro_origen_FK FOREIGN KEY (cuenta_origen) REFERENCES cuentas(id_cuenta),
    CONSTRAINT registro_destino_FK FOREIGN KEY (cuenta_destino) REFERENCES cuentas(id_cuenta)
);

-- =========================
-- SECUENCIAS
-- =========================
CREATE SEQUENCE seq_cuentas
    START WITH 1
    INCREMENT BY 1;

CREATE SEQUENCE seq_registro
    START WITH 1
    INCREMENT BY 1;

-- =========================
-- TRIGGERS
-- =========================
CREATE OR REPLACE TRIGGER trg_cuentas_pk
BEFORE INSERT ON cuentas
FOR EACH ROW
BEGIN
    IF :NEW.id_cuenta IS NULL THEN
        :NEW.id_cuenta := seq_cuentas.NEXTVAL;
    END IF;
END;
/

CREATE OR REPLACE TRIGGER trg_registro_pk
BEFORE INSERT ON registro
FOR EACH ROW
BEGIN
    IF :NEW.id_registro IS NULL THEN
        :NEW.id_registro := seq_registro.NEXTVAL;
    END IF;
END;
/