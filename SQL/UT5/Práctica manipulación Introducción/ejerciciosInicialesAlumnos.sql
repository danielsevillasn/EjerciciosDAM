--Inserts simples
--Ejercicio: Agregar nuevos productos a la tabla principal.

--introduce el producto Tablet Apple en la categoría Electrónica, con un precio de 900€ y un stock de 5 unidades.
INSERT INTO PRODUCTOS (nombre, categoria, precio, stock) VALUES('Tablet Apple','Electrónica',900.00,5);

--introduce el producto Pantalón Levi's en la categoría Ropa, con un precio de 60€ y un stock de 40 unidades.
INSERT INTO PRODUCTOS (nombre, categoria, precio, stock) VALUES('Pantalón Levis','Ropa',60.00,40);

--introduce el producto Tostadora Philips en la categoría Hogar, con un precio de 45€ y un stock de 12 unidades.
INSERT INTO PRODUCTOS (nombre, categoria, precio, stock) VALUES('Tostadora Philips', 'Hogar',45.00,12);

--Inserts usando SELECT
--Ejercicio: Copiar todos los productos de la categoría “Electrónica” a la tabla de backup.
INSERT INTO PRODUCTOSBACKUP (id_producto, nombre, categoria, precio, stock)
SELECT id_producto ,nombre, categoria, precio, stock
FROM PRODUCTOS 
WHERE categoria = 'Electrónica';

--Ejercicio: crear una versión de oferta con 10% de descuento usando SELECT.
--Es decir, los productos que ya están en la tabla backup, se añaden a la misma tabla con un id que los identifique
--por ejemplo a partir del 100, el nombre que tenga añadiendo -Oferta, precio un 10% sobre el original y el mismo stock.
INSERT INTO PRODUCTOSBACKUP (id_producto, nombre, categoria, precio, stock)
SELECT id_producto + 100, nombre || ' - Oferta', categoria, precio * 0.90, stock
FROM PRODUCTOSBACKUP;

--Updates simples
--Ejercicio: Modificar datos concretos.
-- Cambiar precio de la Camiseta Adidas a 35
UPDATE PRODUCTOS
SET precio=35
WHERE nombre = 'Camiseta Adidas';

-- Reducir stock de Zapatos Nike en 5 unidades tras venta
UPDATE PRODUCTOS
SET stock = stock-5
WHERE nombre = 'Zapatos Nike';

--Updates usando SELECT
--Ejercicio: Aumentar 50 a todos los productos que están en ProductosBackup.
--Esto permite actualizar en función de otra tabla.
UPDATE PRODUCTOS P
SET precio = (SELECT pb.precio +50
            FROM PRODUCTOSBACKUP pb
            WHERE pb.id_producto = p.id_producto)
WHERE id_producto IN (SELECT id_producto FROM PRODUCTOSBACKUP);

UPDATE PRODUCTOS P
SET precio = PRECIO +50
WHERE id_producto IN (SELECT id_producto FROM PRODUCTOSBACKUP);

--Deletes simples
--Ejercicio: Eliminar productos sin stock.
DELETE FROM PRODUCTOS
WHERE stock = 0;

-- Eliminar el producto Cafetera DeLonghi
DELETE FROM PRODUCTOS
WHERE nombre = 'Cafetera DeLonghi';

--Deletes usando SELECT
--Ejercicio: Eliminar de Productos todos los productos que existan en ProductosBackup.
DELETE FROM PRODUCTOS
WHERE id_producto IN (SELECT id_producto FROM PRODUCTOSBACKUP);

DELETE FROM PRODUCTOS
WHERE EXISTS (SELECT id_producto FROM PRODUCTOSBACKUP);

--Consultas de verificación
--Realiza algunas consultas que te permitan comprobar las manipulaciones que has hecho a la información, como:
-- Ver todos los productos

-- Ver productos de la tabla de backup

