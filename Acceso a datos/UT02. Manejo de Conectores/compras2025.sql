CREATE database IF NOT EXISTS compras2025;

USE compras2025;

CREATE TABLE IF NOT EXISTS articulos (
  idArticulo int(10) NOT NULL AUTO_INCREMENT,
  nombreArticulo varchar(30) NOT NULL,
  precio double NOT NULL DEFAULT 0,
  descripcion varchar(100),
  PRIMARY KEY (idArticulo),
  UNIQUE KEY nombre_unico (nombreArticulo)
);

CREATE TABLE IF NOT EXISTS inventario (
  idArticulo int(10) NOT NULL,
  stock int(5) NOT NULL,
  PRIMARY KEY (idArticulo),
  FOREIGN KEY FK_producto (idArticulo) REFERENCES articulos(idArticulo)
);

CREATE TABLE IF NOT EXISTS pedidos (
  idPedido int(10) NOT NULL,
  idArticulo int(10) NOT NULL, 
  cantidad int(4) NOT NULL, 
  fechaPedido date NOT NULL, 
  PRIMARY KEY (idPedido, idArticulo),
  FOREIGN KEY FK_inventario (idArticulo) REFERENCES inventario(idArticulo)
);

CREATE TABLE IF NOT EXISTS envios (
  idPedido int(10) NOT NULL,  
  fechaEnvio date NOT NULL,  
  precioTotal double NOT NULL,  
  observaciones varchar(100), 
  FOREIGN KEY FK_pedidos (idPedido) REFERENCES pedidos(idPedido),
  PRIMARY KEY (idPedido)
);

INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('ordenador portátil',456.00,'ordenador portátil');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('PC sobremesa',395.00,'PC sobremesa');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('silla gaming',125.00,'silla gaming');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('ratón',12.50,'ratón');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('monitor',157.00,'monitor');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('teclado',14.85,'teclado');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('auriculares',7.90,'auriculares');
INSERT INTO articulos (nombreArticulo, precio, descripcion) values ('teléfono móvil',226.00,'teléfono móvil');

INSERT INTO inventario values (1,10);
INSERT INTO inventario values (2,20);
INSERT INTO inventario values (3,30);
INSERT INTO inventario values (4,50);
INSERT INTO inventario values (5,40);
INSERT INTO inventario values (6,50);
INSERT INTO inventario values (7,30);
INSERT INTO inventario values (8,10);
