--1. Ingresar 500 € en la cuenta 3.
UPDATE CUENTAS
SET SALDO = SALDO+500
WHERE ID_CUENTA = 3;

--2. Crear SAVEPOINT sp_ingreso. 
SAVEPOINT sp_ingreso;

--3. Retirar 200 € de la cuenta 3.
UPDATE CUENTAS
SET SALDO = SALDO-200
WHERE ID_CUENTA = 3;

--4. Crear SAVEPOINT sp_retiro.
SAVEPOINT sp_retiro;

--5. Insertar los registros correspondientes.
INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(3, 3, 500, 'TRANSFERENCIA', 'TRANSFERENCIA 300 EUROS DE CUENTA 1 A 2');

INSERT INTO REGISTRO (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(3, 0, 300, 'TRANSFERENCIA', 'TRANSFERENCIA 300 EUROS DE CUENTA 1 A 2');

--6. Simular un error en la retirada. Y 7. Volver a sp_ingreso.
ROLLBACK TO sp_ingreso;

--8. Confirmar la transacción.
INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(3, 3, 500, 'INGRESO', 'Ingreso en efectivo cuenta 3');

COMMIT;
