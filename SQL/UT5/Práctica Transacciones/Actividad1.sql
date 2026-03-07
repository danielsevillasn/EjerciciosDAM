--Guion de operaciones:

---1. Consultar el saldo de las cuentas 1 y 2.
SELECT SALDO
FROM CUENTAS
WHERE ID_CUENTA<=1;

SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN (1,2);

---2. Restar 200 € a la cuenta 1.
UPDATE CUENTAS
SET SALDO = SALDO-200
WHERE ID_CUENTA = 1;

---3. Sumar 200 € a la cuenta 2.
UPDATE CUENTAS
SET SALDO = SALDO+200
WHERE ID_CUENTA = 2;

---4. Insertar el movimiento en la tabla registro.
INSERT INTO REGISTRO(CUENTA_ORIGEN, CUENTA_DESTINO, IMPORTE,TIPO_OPERACION, DESCRIPCION)
VALUES(1, 2,200,'TRANSFERENCIA','Transferencia básica');

---5. Confirmar la transacción.
COMMIT;

---6. Volver a consultar los saldos.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN (1,2);