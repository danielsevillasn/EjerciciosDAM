--CREATE USER PrJoins IDENTIFIED BY PrJoins;
--GRANT CREATE SESSION TO PrJoins;
--GRANT CREATE TABLE TO PrJoins;
--ALTER USER PrJoins QUOTA UNLIMITED ON USERS;

DROP TABLE PRODCUTOS CASCADE CONSTRAINT;
DROP TABLE VENDEDORES CASCADE CONSTRAINT;
DROP TABLE VENTAS CASCADE CONSTRAINT;


-- =========================
-- TABLA: PRODUCTOS
-- =========================
CREATE TABLE productos (
    id_producto NUMBER(5),
    nombre VARCHAR2(50) NOT NULL,
    precio NUMBER(8,2) NOT NULL,
    stock NUMBER(5) NOT NULL,
    CONSTRAINT PRODUCTOS_ID_PK PRIMARY KEY (ID_PRODUCTO),
    CONSTRAINT PRODUCTOS_STOCK_CH CHECK (STOCK > 0)
);

-- =========================
-- TABLA: VENDEDORES
-- =========================
CREATE TABLE vendedores (
    id_vendedor NUMBER(5),
    nombre VARCHAR2(50)   NOT NULL,
    email VARCHAR2(100),
    fecha_contratacion DATE NOT NULL,
    CONSTRAINT VENDEDORES_ID_PK PRIMARY KEY (ID_VENDEDOR)
);

-- =========================
-- TABLA: VENTAS
-- =========================
CREATE TABLE ventas (
    id_venta NUMBER(5),
    fecha_venta DATE NOT NULL,
    id_producto NUMBER(5),
    id_vendedor NUMBER(5),
    cantidad NUMBER(5) NOT NULL,
    CONSTRAINT VENTAS_ID_PK PRIMARY KEY (ID_VENTA),
    CONSTRAINT VENTAS_producto_FK FOREIGN KEY (id_producto) REFERENCES productos(id_producto),
    CONSTRAINT VENTAS_vendedor_FK FOREIGN KEY (id_vendedor) REFERENCES vendedores(id_vendedor)
);
