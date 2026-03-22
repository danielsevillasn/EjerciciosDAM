--Crear una vista que permita una consulta de la tabla clientes, columnas id, nombre, telefono y email.
--Objetivo: Entender que una vista es una “tabla virtual”.
CREATE VIEW CONSULTA_CLIENTE AS
SELECT ID_CLIENTE, NOMBRE, TELEFONO, EMAIL
FROM CLIENTES; 

--Crear una vista para consultar los clientes y sus mascotas con su espcie.
CREATE VIEW CLIENTE_MASCOTA AS
SELECT C.NOMBRE AS NOMBRE_CLIENTE, M.NOMBRE AS NOMBRE_MASCOTA, M.ESPECIE
FROM CLIENTES C JOIN MASCOTAS M ON C.ID_CLIENTE = M.ID_CLIENTE;

--Crear una vista que permita ver información de los pagos como, id_cliente, id_mascota, importe e importe con iva.
CREATE VIEW INFORMACION_PAGOS AS 
SELECT ID_CLIENTE, ID_MASCOTA, IMPORTE, IMPORTE * 1.21 AS IMPORTE_IVA
FROM PAGOS;

--Crear una vista que permita consultar qué personal veterinario atendió a qué mascota, en qué fecha y si hay observaciones sobre ello.
CREATE VIEW PERSONAL_MASCOTA AS
SELECT P.NOMBRE AS NOMBRE_PERSONAL, M.NOMBRE AS NOMBRE_MASCOTA, A.FECHA_CITA, A.OBSERVACIONES
FROM ATENCIONES A JOIN PERSONAL P ON A.ID_PERSONAL = P.ID_PERSONAL
JOIN MASCOTAS M ON A.ID_MASCOTA = M.ID_MASCOTA AND A.ID_CLIENTE = M.ID_CLIENTE;

--Crea una vista que muestre el nombre de cada mascota, su especie y su fecha de nacimiento, 
--ordenada por fecha de nacimiento de más joven a más mayor.
CREATE VIEW VW_MASCOTAS
AS
SELECT NOMBRE, ESPECIE, FECHA_NAC
FROM MASCOTAS;

--Crea una vista que muestre todos los pagos con su importe, ordenados de mayor a menor.
CREATE VIEW PAGOS AS
SELECT FECHA_PAGO, IMPORTE
FROM PAGOS;

--Crea una vista que muestre los clientes que tienen más de una mascota (nombre del cliente y número de mascotas).
CREATE VIEW CLIENTES_CON_MAS_DE_UNA_MASCOTA AS
SELECT C.NOMBRE, COUNT(M.ID_MASCOTA) AS NUMERO_MASCOTAS
FROM CLIENTES C JOIN MASCOTAS M ON C.ID_CLIENTE = M.ID_CLIENTE
GROUP BY C.NOMBRE HAVING COUNT(M.ID_MASCOTA) > 1;

--Crea una vista que muestre el importe total pagado por cada cliente (nombre del cliente e importe total).
CREATE VIEW IMPORTE_TOTAL AS 
SELECT C.NOMBRE, SUM(P.IMPORTE) AS IMPORTE_TOTAL
FROM CLIENTES C JOIN PAGOS P ON C.ID_CLIENTE = P.ID_CLIENTE
GROUP BY C.NOMBRE;

--Crea la vista CONSULTA_CLIENTE con id, nombre y teléfono. 
CREATE VIEW CONSULTA_CLIENTE AS
SELECT ID_CLIENTE, NOMBRE, TELEFONO
FROM CLIENTES;

--Luego modifícala con OR REPLACE para añadirle también el email, sin borrarla y volverla a crear.
CREATE OR REPLACE VIEW CONSULTA_CLIENTE AS
SELECT ID_CLIENTE, NOMBRE, TELEFONO, EMAIL
FROM CLIENTES;

--Crea una vista de solo lectura que muestre el nombre del cliente y el nombre de su mascota. Llama a la restricción RO_CLIENTE_MASCOTA.
CREATE VIEW VW_CLIENTE_MASCOTA_READONLY AS
SELECT C.NOMBRE AS NOMBRE_CLIENTE, M.NOMBRE AS NOMBRE_MASCOTA
FROM CLIENTES C JOIN MASCOTAS M ON C.ID_CLIENTE = M.ID_CLIENTE
WITH READ ONLY CONSTRAINT RO_CLIENTE_MASCOTA;

--Crea una vista con CHECK OPTION sobre la tabla PAGOS que solo muestre los pagos con importe superior a 50€. 
--Llama a la restricción CHK_IMPORTE.
CREATE VIEW VW_PAGOS_MAYORES50 AS
SELECT ID_CLIENTE, ID_MASCOTA, FECHA_CITA, IMPORTE, FECHA_PAGO
FROM PAGOS
WHERE IMPORTE > 50
WITH CHECK OPTION CONSTRAINT CHK_IMPORTE;