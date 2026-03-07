-- =========================
-- CUENTAS INICIALES
-- =========================
INSERT INTO cuentas (titular, saldo, estado)
VALUES ('Ana López', 2500.00, 'ACTIVA');

INSERT INTO cuentas (titular, saldo, estado)
VALUES ('Carlos Martín', 1200.00, 'ACTIVA');

INSERT INTO cuentas (titular, saldo, estado)
VALUES ('Beatriz Gómez', 5400.00, 'ACTIVA');

INSERT INTO cuentas (titular, saldo, estado)
VALUES ('Empresa ACME S.L.', 25000.00, 'ACTIVA');

INSERT INTO cuentas (titular, saldo, estado)
VALUES ('Cuenta Bloqueada Pruebas', 800.00, 'BLOQUEADA');

COMMIT;

-- =========================
-- MOVIMIENTOS INICIALES
-- =========================

-- Transferencia: Ana → Carlos
INSERT INTO registro (
    cuenta_origen,
    cuenta_destino,
    importe,
    tipo_operacion,
    descripcion
) VALUES (
    1, 2, 300.00, 'TRANSFERENCIA',
    'Pago alquiler compartido'
);

-- Transferencia: Empresa → Beatriz
INSERT INTO registro (
    cuenta_origen,
    cuenta_destino,
    importe,
    tipo_operacion,
    descripcion
) VALUES (
    4, 3, 1500.00, 'TRANSFERENCIA',
    'Pago nómina marzo'
);

-- Ingreso en cuenta de Ana
INSERT INTO registro (
    cuenta_origen,
    cuenta_destino,
    importe,
    tipo_operacion,
    descripcion
) VALUES (
    1, 1, 500.00, 'INGRESO',
    'Ingreso en efectivo'
);

-- Retirada de Carlos
INSERT INTO registro (
    cuenta_origen,
    cuenta_destino,
    importe,
    tipo_operacion,
    descripcion
) VALUES (
    2, 2, 200.00, 'RETIRADA',
    'Retirada cajero automático'
);

COMMIT;