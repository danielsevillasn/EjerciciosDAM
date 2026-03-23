--1. Consultar el saldo de la cuenta 1.
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA = 1;

--2. Intentar realizar una transferencia de 10.000 € desde la cuenta 1 a la cuenta 2.
UPDATE CUENTAS
SET SALDO = SALDO-10000
FROM ID_CUENTA = 1;

UPDATE CUENTAS
SET SALDO = SALDO+10000
FROM ID_CUENTA = 2;

--3. Insertar el movimiento en registro. 
INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(1, 2, 10000, 'TRANSFERENCIA', 'TRANSFERENCIA 10000 EUROS DE CUENTA 1 A 2');

--4. Detectar que el saldo de la cuenta 1 quedaría negativo.
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA = 1;

--5. Cancelar toda la operación.
ROLLBACK;

--6. Verificar que ni los saldos ni el registro han cambiado. 
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA IN (1,2);

SELECT *
FROM REGISTRO
WHERE IMPORTE = 10000;