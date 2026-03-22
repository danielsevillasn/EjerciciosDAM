-- 1. Consultar saldos iniciales de las tres cuentas.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN (1, 2, 3);

-- 2. Transferir 100 € de la cuenta 1 a la cuenta 2.
UPDATE cuentas
SET saldo = saldo - 100
WHERE id_cuenta = 1;

UPDATE cuentas
SET saldo = saldo + 100
WHERE id_cuenta = 2;

INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES (1, 2, 100, 'TRANSFERENCIA', 'Transferencia cuenta 1 a cuenta 2');

-- 3. Crear SAVEPOINT sp_t1 (la primera transferencia queda protegida).
SAVEPOINT sp_t1;

-- 4. Transferir 50 € de la cuenta 2 a la cuenta 3.
UPDATE cuentas
SET saldo = saldo - 50
WHERE id_cuenta = 2;

UPDATE cuentas
SET saldo = saldo + 50
WHERE id_cuenta = 3;

INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES (2, 3, 50, 'TRANSFERENCIA', 'Transferencia cuenta 2 a cuenta 3');

-- 5. Crear SAVEPOINT sp_t2.
SAVEPOINT sp_t2;

-- 6. Intentar transferir 200 € de la cuenta 3 a la cuenta 1.
UPDATE cuentas
SET saldo = saldo - 200
WHERE id_cuenta = 3;

UPDATE cuentas
SET saldo = saldo + 200
WHERE id_cuenta = 1;

INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES (3, 1, 200, 'TRANSFERENCIA', 'Transferencia cuenta 3 a cuenta 1');

-- 7. Detectar que la cuenta 3 queda con saldo insuficiente (negativo).
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta = 3;

-- 8. Volver a sp_t1: se deshacen la segunda y la tercera transferencia,
--    pero se mantiene la primera (cuenta 1 → cuenta 2 de 100 €).
ROLLBACK TO sp_t1;

-- 9. Confirmar la transacción: solo queda confirmada la primera transferencia.
COMMIT;

-- Verificación final
-- Resultado esperado:
--   - Cuenta 1: saldo inicial - 100
--   - Cuenta 2: saldo inicial + 100
--   - Cuenta 3: saldo sin cambios
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta IN (1, 2, 3);

SELECT *
FROM registro
WHERE tipo_operacion = 'TRANSFERENCIA'
ORDER BY id_registro DESC;