INSERT INTO usuarios (nombre, email, fecha_nac, fecha_alta, ciudad ) VALUES
('Ana López', 'ana@gmail.com', DATE '2000-03-15', DATE '2021-09-10', 'Madrid');

INSERT INTO usuarios (nombre, email, fecha_nac, fecha_alta, ciudad ) VALUES
('Juan Pérez', 'juan@yahoo.es', DATE '1998-11-02', DATE '2022-01-20', 'Sevilla');

INSERT INTO usuarios (nombre, email, fecha_nac, fecha_alta, ciudad ) VALUES
('Lucía Martín', 'lucia@empresa.com', DATE '2004-07-25', DATE '2023-02-01', 'Madrid');

INSERT INTO usuarios (nombre, email, fecha_nac, fecha_alta, ciudad ) VALUES
('Carlos Ruiz', 'carlos@gmail.com', DATE '1995-05-10', DATE '2020-06-15', 'Valencia');

INSERT INTO usuarios (nombre, email, fecha_nac, fecha_alta, ciudad ) VALUES
('Marta Gómez', 'marta@hotmail.es', DATE '2002-12-30', DATE '2024-02-05', 'Sevilla');


INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado) VALUES
(1, DATE '2023-10-10', 120.5, 'P');

INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado) VALUES
(1, DATE '2024-02-15', 75.99, 'E');

INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado) VALUES
(2, DATE '2023-11-20', 200, 'C');

INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado) VALUES
(4, DATE '2022-07-01', 49.9, 'E');

INSERT INTO pedidos (id_usuario, fecha_pedido, importe, estado) VALUES
(4, DATE '2024-03-03', NULL, 'P');
