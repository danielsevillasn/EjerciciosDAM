-- 1. Ingresar 500 € en la cuenta 3.
UPDATE cuentas
SET saldo = saldo + 500
WHERE id_cuenta = 3;

-- 2. Crear SAVEPOINT sp_ingreso.
SAVEPOINT sp_ingreso;

-- 3. Retirar 200 € de la cuenta 3.
UPDATE cuentas
SET saldo = saldo - 200
WHERE id_cuenta = 3;

-- 4. Crear SAVEPOINT sp_retiro.
SAVEPOINT sp_retiro;

-- 5. Insertar los registros correspondientes.
INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(3, 3, 500, 'INGRESO', 'Ingreso en efectivo cuenta 3');

INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion,descripcion)
VALUES(3,3,200,'RETIRADA','Retirada con error simulado');

-- 6. Simular un error en la retirada: volvemos a sp_ingreso.
-- Esto deshace la retirada, su registro Y el registro del ingreso,
-- pero el UPDATE del ingreso (paso 1) se mantiene porque es anterior a sp_ingreso.
ROLLBACK TO sp_ingreso;

-- 7. Reinsertar solo el registro del ingreso (el correcto).
INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES(3, 3, 500, 'INGRESO', 'Ingreso en efectivo cuenta 3');

-- 8. Confirmar la transacción.
-- Resultado: el ingreso de 500 € queda confirmado, la retirada de 200 € desaparece.
COMMIT;

-- Verificación final
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta = 3;

SELECT *
FROM registro
WHERE cuenta_origen = 3 AND cuenta_destino = 3;