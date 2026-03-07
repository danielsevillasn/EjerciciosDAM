--Guion de operaciones:

--1. Consultar el saldo de la cuenta 1.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN 1;

--2. Intentar realizar una transferencia de 10.000 € desde la cuenta 1 a la cuenta 2.
UPDATE CUENTAS
SET SALDO = SALDO-10000
WHERE ID_CUENTA = 1;

UPDATE CUENTAS
SET SALDO = SALDO+10000
WHERE ID_CUENTA = 2;

--3. Insertar el movimiento en registro.
INSERT INTO REGISTRO(CUENTA_ORIGEN, CUENTA_DESTINO, IMPORTE, TIPO_OPERACION, DESCRIPCION)
VALUES(1,2,10000,'TRANSFERENCIA','Transferencia básica');

--4. Detectar que el saldo de la cuenta 1 quedaría negativo.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN 1;

--5. Cancelar toda la operación.
ROLLBACK;

--6. Verificar que ni los saldos ni el registro han cambiado.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN (1,2);

SELECT *
FROM REGISTRO
WHERE IMPORTE = 10000;