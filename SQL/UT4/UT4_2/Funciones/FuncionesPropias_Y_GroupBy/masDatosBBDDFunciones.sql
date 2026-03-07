--trabajamos con la base de datos con la que introdujimos las funciones
--sobre ella, hacemos estas inserciones extra
-- Más pedidos para Ana (usuario 1)
INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado)
VALUES (1, DATE '2024-05-10', 300, 'C');

-- Pedido barato para Juan (usuario 2)
INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado)
VALUES (2, DATE '2024-01-12', 15.50, 'E');

-- Pedido caro para Lucía (usuario 3)
INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado)
VALUES (3, DATE '2024-02-20', 500, 'P');

-- Usuario 5 con varios pedidos
INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado)
VALUES (5, DATE '2024-03-10', 80, 'E');

INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado)
VALUES (5, DATE '2024-04-01', 150, 'C');

INSERT INTO usuarios (nombre, email, fecha_nac, ciudad)
VALUES ('Luis Torres', 'luis.torres@mail.com', DATE '1999-04-10', 'Bilbao');

INSERT INTO usuarios (nombre, email, fecha_nac, ciudad)
VALUES ('Elena Navarro', 'elena.navarro@mail.com', DATE '2001-06-22', 'Zaragoza');

INSERT INTO usuarios (nombre, email, fecha_nac, ciudad)
VALUES ('Pablo Martín', 'pablo.martin@mail.com', DATE '1997-01-05', 'Granada');

