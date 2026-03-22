--Inserts simples
--Ejercicio: Agregar nuevos productos a la tabla principal.

--introduce el producto Tablet Apple en la categoría Electrónica, con un precio de 900€ y un stock de 5 unidades.
INSERT INTO PRODUCTOS (nombre, categoria, precio, stock) VALUES ('Tablet Apple', 'Electrónica',900,5);

--introduce el producto Pantalón Levi's en la categoría Ropa, con un precio de 60€ y un stock de 40 unidades.
INSERT INTO PRODUCTOS (nombre, categoria, precio, stock) VALUES ('Pantalón Levis', 'Ropa',60,40);

--introduce el producto Tostadora Philips en la categoría Hogar, con un precio de 45€ y un stock de 12 unidades.
INSERT INTO PRODUCTOS (nombre, categoria, precio, stock) VALUES ('Tostadora Philips', 'Hogar',45,12);

--Inserts usando SELECT
--Ejercicio: Copiar todos los productos de la categoría “Electrónica” a la tabla de backup.
INSERT INTO PRODUCTOSBACKUP (id_producto ,nombre, categoria, precio, stock)
SELECT id_producto ,nombre, categoria, precio, stock
FROM PRODUCTOS 
WHERE categoria = 'Electrónica';

--Ejercicio: crear una versión de oferta con 10% de descuento usando SELECT.
--Es decir, los productos que ya están en la tabla backup, se añaden a la misma tabla con un id que los identifique
--por ejemplo a partir del 100, el nombre que tenga añadiendo -Oferta, precio un 10% sobre el original y el mismo stock.
INSERT INTO PRODUCTOSBACKUP (id_producto ,nombre, categoria, precio, stock)
SELECT id_producto + 100 ,nombre || '- Oferta', categoria, precio *0.90, stock
FROM PRODUCTOSBACKUP

--Updates simples
--Ejercicio: Modificar datos concretos.
-- Cambiar precio de la Camiseta Adidas a 35
UPDATE PRODUCTOS
SET PRECIO = 35
WHERE NOMBRE = 'Camiseta Adidas';

-- Reducir stock de Zapatos Nike en 5 unidades tras venta
UPDATE PRODUCTOS
SET STOCK = STOCK - 5
WHERE NOMBRE = 'Zapatos Nike';

--Updates usando SELECT
--Ejercicio: Aumentar 50 a todos los productos que están en ProductosBackup.
--Esto permite actualizar en función de otra tabla.
UPDATE PRODUCTOS
SET STOCK += 50
WHERE ID_PRODUCTO IN (SELECT ID_PRODUCTO
                        FROM PRODUCTOSBACKUP);

--Deletes simples
--Ejercicio: Eliminar productos sin stock.
DELETE FROM PRODUCTOS
WHERE STOCK = 0;

-- Eliminar el producto Cafetera DeLonghi
DELETE FROM PRODUCTOS
WHERE NOMBRE = 'Cafetera DeLonghi';

--Deletes usando SELECT
--Ejercicio: Eliminar de Productos todos los productos que existan en ProductosBackup.
DELETE FROM PRODUCTOS
WHERE ID_PRODUCTO IN (SELECT ID_PRODUCTO
                        FROM PRODUCTOSBACKUP);

DELETE FROM PRODUCTOS P
WHERE EXISTS (SELECT 1
                FROM PRODUCTOSBACKUP PB
                WHERE P.ID_PRODUCTO = PB.ID_PRODUCTO)

--Consultas de verificación
--Realiza algunas consultas que te permitan comprobar las manipulaciones que has hecho a la información, como:
-- Ver todos los productos
SELECT * FROM PRODUCTOS;

-- Ver productos de la tabla de backup
SELECT * FROM PRODUCTOSBACKUP;