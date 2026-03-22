--Crear una vista que permita una consulta de la tabla clientes, columnas id, nombre, telefono y email.
--Objetivo: Entender que una vista es una “tabla virtual”.
CREATE VIEW V_CLIENTES AS
SELECT ID_CLIENTE, NOMBRE, TELEFONO, EMAIL
FROM CLIENTES;

--Preguntas
--¿Se puede hacer SELECT?
--¿Se puede hacer INSERT?
--¿Se puede hacer UPDATE telefono?

--Crear una vista para consultar los clientes y sus mascotas con su espcie.
CREATE VIEW V_CLIENTES_MASCOTAS AS
SELECT C.ID_CLIENTE, C.NOMBRE AS NOMBRE_CLIENTE,
       M.ID_MASCOTA, M.NOMBRE AS NOMBRE_MASCOTA,
       M.ESPECIE
FROM CLIENTES C
JOIN MASCOTAS M ON C.ID_CLIENTE = M.ID_CLIENTE;

--Preguntas
--¿Permite INSERT?
--¿Permite UPDATE?
--¿Por qué?


--Crear una vista que permita ver información de los pagos como, id_cliente, id_mascota, importe e importe con iva.
CREATE VIEW V_PAGOS_IVA AS
SELECT ID_CLIENTE, ID_MASCOTA, FECHA_CITA,
       IMPORTE,
       ROUND(IMPORTE * 1.21, 2) AS IMPORTE_CON_IVA
FROM PAGOS;

--Preguntas
--¿Se puede actualizar importe_con_iva?
--¿Por qué?


--Crear una vista que permita consultar qué personal veterinario atendió a qué mascota, en qué fecha y si hay observaciones sobre ello.
CREATE VIEW V_ATENCIONES_VETERINARIO AS
SELECT P.NOMBRE AS VETERINARIO,
       M.NOMBRE AS MASCOTA,
       A.FECHA_CITA,
       A.OBSERVACIONES
FROM ATENCIONES A
JOIN PERSONAL P ON A.ID_PERSONAL = P.ID_PERSONAL
JOIN MASCOTAS M ON A.ID_CLIENTE  = M.ID_CLIENTE
               AND A.ID_MASCOTA  = M.ID_MASCOTA
WHERE P.ROL = 'Veterinario';

--Preguntas
--¿Para qué sirve esta vista?

--¿Qué tipo de usuarios la usarían?


--¿Por qué es buena idea ocultar las tablas reales?

