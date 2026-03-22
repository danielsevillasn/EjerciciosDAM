-- 1. Actualizar el saldo de la cuenta 2 (sin confirmar).
UPDATE cuentas
SET saldo = saldo + 300
WHERE id_cuenta = 2;

-- 2. Insertar un registro (sin confirmar).
INSERT INTO registro (cuenta_origen, cuenta_destino, importe, tipo_operacion, descripcion)
VALUES (2, 2, 300, 'INGRESO', 'Ingreso sin confirmar');

-- 3. Consultar los datos en esta sesión: los cambios son visibles localmente.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta = 2;

SELECT *
FROM registro
WHERE descripcion = 'Ingreso sin confirmar';

-- 4. Cerrar la sesión SIN hacer COMMIT.
-- Oracle realiza un ROLLBACK implícito al cerrar la conexión sin confirmar.
EXIT;

-- ---------------------------------------------------------------
-- NUEVA SESIÓN (volver a conectarse y comprobar)
-- ---------------------------------------------------------------

-- 5. Comprobar que los cambios NO se han guardado.
-- El saldo vuelve al valor anterior y el registro no existe.
SELECT id_cuenta, saldo
FROM cuentas
WHERE id_cuenta = 2;

SELECT *
FROM registro
WHERE descripcion = 'Ingreso sin confirmar';