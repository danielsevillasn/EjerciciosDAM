SELECT id_cuenta, saldo
FROM CUENTAS
WHERE id_cuenta IN (1,2);

UPDATE CUENTAS
SET saldo = saldo - 300
WHERE id_cuenta = 1;

SAVEPOINT sp_retiro;

UPDATE CUENTAS
SET saldo = saldo + 300
WHERE id_cuenta = 2;

INSERT INTO registro(cuenta_origen,cuenta_destino,importe,tipo_operacion,descripcion)
VALUES(1,2,300,'TRANSFERENCIA','Descripcion incorrecta');

ROLLBACK TO sp_retiro;

UPDATE CUENTAS
SET saldo = saldo + 300
WHERE id_cuenta = 2;

INSERT INTO registro(cuenta_origen,cuenta_destino,importe,tipo_operacion,descripcion)
VALUES(1,2,300,'TRANSFERENCIA','Transferencia correcta');

COMMIT;