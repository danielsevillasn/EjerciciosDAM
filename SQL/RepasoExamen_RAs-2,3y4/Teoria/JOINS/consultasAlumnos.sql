--Ventas con nombre de producto y vendedor. Utiliza alias para una visualización más clara de los resultados.
SELECT P.NOMBRE PRODUCTO,V.NOMBRE VENDEDOR, FECHA_VENTA, CANTIDAD
FROM VENTAS A JOIN PRODUCTOS P ON A.ID_PRODUCTO = P.ID_PRODUCTO
JOIN VENDEDORES V ON A.ID_VENDEDOR = V.ID_VENDEDOR;

--Todos los productos, aunque no se hayan vendido. Muestra el nombre del producto, el id_venta, y la cantidad vendida.
SELECT P.NOMBRE, A.ID_VENTA, A.CANTIDAD
FROM PRODUCTOS P LEFT JOIN VENTAS A USING(ID_PRODUCTO);

--Todos los vendedores, aunque no hayan vendido. Muestra el nombre del vendedor y el id de la venta.
SELECT V.NOMBRE, A.ID_VENTA
FROM VENDEDORES V LEFT JOIN VENTAS A USING(ID_VENDEDOR);

--Productos y ventas, existan o no en ambas tablas
SELECT P.NOMBRE VENDEDOR, A.ID_VENTA
FROM PRODUCTOS P FULL OUTER JOIN VENTAS A ON P.ID_PRODUCTO = A.ID_VENTA; --Se puede quitar el outer ya que viene por defecto

--Productos nunca vendidos
SELECT P.NOMBRE, P.ID_PRODUCTO
FROM PRODUCTOS P LEFT JOIN VENTAS A USING(ID_PRODUCTO)
WHERE ID_VENTA IS NULL;

--Vendedores sin ventas
SELECT V.NOMBRE, V.ID_VENDEDOR
FROM VENDEDORES V LEFT JOIN VENTAS A USING(ID_VENDEDOR)
WHERE ID_VENTA IS NULL;