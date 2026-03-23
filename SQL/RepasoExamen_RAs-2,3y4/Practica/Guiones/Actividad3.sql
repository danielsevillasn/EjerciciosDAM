--1. Consultar saldos de las cuentas 1 y 2.
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA IN (1,2);

--2. Restar 300 € a la cuenta 1. 
UPDATE CUENTAS
SET SALDO = SALDO-300
WHERE ID_CUENTA = 1;

--3. Crear un SAVEPOINT llamado sp_retiro. 
SAVEPOINT sp_retiro;

--4. Sumar 300 € a la cuenta 2. 
UPDATE CUENTAS
SET SALDO = SALDO+300
WHERE ID_CUENTA = 2;

--5. Insertar el movimiento en registro. 
INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(1, 2, 300, 'TRANSFERENCIA', 'TRANSFERENCIA 300 EUROS DE CUENTA 1 A 2');

--6. Detectar un error en la descripción del movimiento.
SELECT ID_CUENTA, SALDO
FROM CUENTAS
WHERE ID_CUENTA IN (1,2);

--7. Volver al SAVEPOINT.
ROLLBACK TO sp_retiro;

--8. Corregir la inserción del registro.
UPDATE CUENTAS
SET SALDO = SALDO+300
WHERE ID_CUENTA = 2;

INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(1, 2, 300, 'TRANSFERENCIA', 'TRANSFERENCIA 300 EUROS DE CUENTA 1 A 2');

--9. Confirmar la transacción.
COMMIT;