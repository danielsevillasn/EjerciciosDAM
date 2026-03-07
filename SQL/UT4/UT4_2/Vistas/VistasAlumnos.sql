--Crear una vista que permita una consulta de la tabla clientes, columnas id, nombre, telefono y email.
--Objetivo: Entender que una vista es una “tabla virtual”.
CREATE VIEW TABLA_CLIENTES
AS
SELECT ID_CLIENTE,NOMBRE,TELEFONO, EMAIL
FROM CLIENTES;

--Preguntas
--¿Se puede hacer SELECT?
--¿Se puede hacer INSERT?
--¿Se puede hacer UPDATE telefono?
--Si se puede hacer select, pero solo de las columnas representadas en la vista
--No se puede hacer Insert ya que no esta incluida la columna DNI que es un valor not null
--Sí ya que las columnas no emplean expresiones

--Crear una vista para consultar los clientes y sus mascotas con su espcie.
CREATE VIEW CLIENTE_MASCOTA
AS
SELECT C.NOMBRE AS NOMBRE_CLIENTE,M.NOMBRE AS NOMBRE_MASCOTA,M.ESPECIE
FROM CLIENTES C JOIN MASCOTAS M ON C.ID_CLIENTE = M.ID_CLIENTE;
--Preguntas
--¿Permite INSERT?
--¿Permite UPDATE?
--¿Por qué?
--No ya que hay columnas con not null en ambas tablas que rechazan esa opcion, además de que al emplear un join no se deja claro en que tabla actuar
--Sí por que emplea un JOIN

--Crear una vista que permita ver información de los pagos como, id_cliente, id_mascota, importe e importe con iva.
CREATE VIEW V_PAGOS
AS
SELECT ID_CLIENTE,ID_MASCOTA,IMPORTE,IMPORTE * 1.21 AS IMPORTE_IVA
FROM PAGOS;
--Preguntas
--¿Se puede actualizar importe_con_iva?
--¿Por qué?
--No ya que no se pueden actualizar columnas con expresiones matematicas como la representada

--Crear una vista que permita consultar qué personal veterinario atendió a qué mascota, en qué fecha y si hay observaciones sobre ello.
CREATE VIEW PERSONAL_MASCOTA
AS
SELECT P.NOMBRE AS NOMBRE_PERSONAL, M.NOMBRE AS NOMBRE_MASCOTA, A.FECHA_CITA, A.OBSERVACIONES
FROM PERSONAL P JOIN ATENCIONES A ON P.ID_PERSONAL = A.ID_PERSONAL
JOIN MASCOTAS M ON M.ID_MASCOTA = A.ID_MASCOTA;
--Preguntas
--¿Para qué sirve esta vista?
--Para que el que tenga que volver a atender a esa mascota pueda ver puntos importantes de su historial 

--¿Qué tipo de usuarios la usarían?
--Veterinarios y auxiliares 

--¿Por qué es buena idea ocultar las tablas reales?
--Por que hay datos que pueden ser confidenciales y no expones la estructura interna de la base de datos
