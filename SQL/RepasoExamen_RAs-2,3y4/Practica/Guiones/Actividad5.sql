--1. Actualizar el saldo de la cuenta 2.
UPDATE CUENTAS
SET SALDO = SALDO-200000
WHERE ID_CUENTA = 2;

--2. Insertar un registro.
INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(3, 3, 500, 'INGRESO', 'Ingreso en efectivo cuenta 3');

--3. Cerrar la sesión sin hacer COMMIT.
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA = 2;

SELECT *
FROM REGISTRO
WHERE DESCRIPCION = 'Ingreso en efectivo cuenta 3';

EXIT;

--4. Volver a abrir la sesión.

--5. Comprobar el estado de los datos.
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA = 2;

SELECT *
FROM REGISTRO
WHERE DESCRIPCION = 'Ingreso en efectivo cuenta 3';