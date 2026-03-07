-- =========================
-- PRODUCTOS
-- =========================
INSERT INTO productos VALUES (1, 'Teclado', 25.99, 50);
INSERT INTO productos VALUES (2, 'Ratón', 15.50, 100);
INSERT INTO productos VALUES (3, 'Monitor', 189.99, 20);
INSERT INTO productos VALUES (4, 'Impresora', 120.00, 5);

-- =========================
-- VENDEDORES
-- =========================
INSERT INTO vendedores VALUES (1, 'Ana López', 'ana@tienda.com', DATE '2023-01-10');
INSERT INTO vendedores VALUES (2, 'Carlos Pérez', 'carlos@tienda.com', DATE '2022-06-15');
INSERT INTO vendedores VALUES (3, 'Lucía Gómez', 'lucia@tienda.com', DATE '2024-03-01');

-- =========================
-- VENTAS
-- =========================
INSERT INTO ventas VALUES (1, SYSDATE - 10, 1, 1, 2);
INSERT INTO ventas VALUES (2, SYSDATE - 8, 2, 1, 5);
INSERT INTO ventas VALUES (3, SYSDATE - 5, 3, 2, 1);
INSERT INTO ventas VALUES (4, SYSDATE - 2, 1, 2, 3);

COMMIT;
