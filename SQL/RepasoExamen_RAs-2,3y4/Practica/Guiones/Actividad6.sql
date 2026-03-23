--1. Transferir 100 € de la cuenta 1 a la 2.
UPDATE CUENTAS
SET SALDO = SALDO-100
FROM ID_CUENTA = 1;

UPDATE CUENTAS
SET SALDO = SALDO+100
FROM ID_CUENTA = 2;

INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(1, 2, 100, 'TRANSFERENCIA', 'TRANSFERENCIA 100 EUROS DE CUENTA 1 A 2');

--2. Crear SAVEPOINT sp_t1. 
SAVEPOINT sp_t1;

--3. Transferir 50 € de la cuenta 2 a la 3.
UPDATE CUENTAS
SET SALDO = SALDO-50
FROM ID_CUENTA = 2;

UPDATE CUENTAS
SET SALDO = SALDO+50
FROM ID_CUENTA = 3;

INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES (2, 3, 50, 'TRANSFERENCIA', 'Transferencia cuenta 2 a cuenta 3');

--4. Crear SAVEPOINT sp_t2.
SAVEPOINT sp_t2;

--5. Transferir 200 € de la cuenta 3 a la 1.
UPDATE CUENTAS
SET SALDO = SALDO-200
FROM ID_CUENTA = 3;

UPDATE CUENTAS
SET SALDO = SALDO+200
FROM ID_CUENTA = 1;

INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES (3, 1, 200, 'TRANSFERENCIA', 'Transferencia cuenta 3 a cuenta 1');

--6. Detectar que la cuenta 3 queda con saldo insuficiente.
SELECT ID_CUENTA, SALDO
FROM CUENTAS;

--7. Volver a sp_t1.
ROLLBACK TO sp_t1;

--8. Confirmar la transacción. 
COMMIT;

SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN (1, 2, 3);

SELECT *
FROM registro
WHERE tipo_operacion = 'TRANSFERENCIA'
ORDER BY id_registro DESC;