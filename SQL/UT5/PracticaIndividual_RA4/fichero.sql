--1--
INSERT INTO Usuarios (id_usuario, nombre, email, saldo)
VALUES (1,'Ana López', 'ana@gmail.com', 15);

INSERT INTO Usuarios (id_usuario,nombre, email, saldo)
VALUES (2,'Carlos Ruiz', 'carlos@gmail.com', 8);

INSERT INTO Estaciones (id_estacion,nombre, ubicacion)
VALUES (1,'Biblioteca', 'Campus Norte');

INSERT INTO Estaciones (id_estacion,nombre, ubicacion)
VALUES (2,'Residencia', 'Campus Sur');

INSERT INTO Patinetes (id_patinete,modelo, estado, id_estacion)
VALUES (101,'Xiaomi Pro 1', 'DISPONIBLE', 1);

INSERT INTO Patinetes (id_patinete,modelo, estado, id_estacion)
VALUES (103,'Segway Ninebot 1', 'DISPONIBLE', 2);

INSERT INTO Patinetes (id_patinete,modelo, estado, id_estacion)
VALUES (104,'Segway Ninebot 2', 'DISPONIBLE', 2);

INSERT INTO Alquileres (id_alquiler, id_usuario, id_patinete, fecha_inicio, fecha_fin, coste)
VALUES (1,1,1, DATE '2025-10-10', DATE'2025-10-11', 3);

INSERT INTO Alquileres (id_alquiler,id_usuario, id_patinete, fecha_inicio, fecha_fin, coste)
VALUES (2,2,2, DATE '2025-10-11', DATE '2025-10-12', 2.5);

INSERT INTO Alquileres (id_alquiler,id_usuario, id_patinete, fecha_inicio, fecha_fin, coste)
VALUES (3,2,3, DATE '2025-10-12', DATE '2025-10-13', 4);


INSERT INTO Usuarios (id_usuario,nombre, email, saldo)
VALUES (3,'Lucía Pérez', 'lucia@gmail.com', 12);

INSERT INTO Usuarios (id_usuario,nombre, email, saldo)
VALUES (4,'Mario Díaz', 'mario@gmail.com', 5);

INSERT INTO Estaciones (id_estacion,nombre, ubicacion, capacidad)
VALUES (3,'Centro Comercial', 'Zona centro',12);

INSERT INTO Patinetes (id_patinete,modelo, estado, id_estacion)
VALUES (102,'Xiaomi Pro 2', 'DISPONIBLE', 1);

INSERT INTO Patinetes (id_patinete,modelo, estado, id_estacion)
VALUES (105,'Xiaomi Lite', 'DISPONIBLE', 3);

COMMIT;

--2--
INSERT INTO Historial_Alquileres (id_usuario, total_alquileres, gasto_total)
VALUES((SELECT id_usuario
    FROM Usuarios
    WHERE nombre = 'Ana López'),
    (SELECT COUNT(*)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Ana López')),
    (SELECT SUM(coste)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Ana López')));

INSERT INTO Historial_Alquileres (id_usuario, total_alquileres, gasto_total)
VALUES((SELECT id_usuario
    FROM Usuarios
    WHERE nombre = 'Carlos Ruiz'),
    (SELECT COUNT(*)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Carlos Ruiz')),
    (SELECT SUM(coste)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Carlos Ruiz')));

INSERT INTO Historial_Alquileres (id_usuario, total_alquileres, gasto_total)
VALUES((SELECT id_usuario
    FROM Usuarios
    WHERE nombre = 'Lucía Pérez'),
    (SELECT COUNT(*)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Lucía Pérez')),
    (SELECT SUM(coste)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Lucía Pérez')));

INSERT INTO Historial_Alquileres (id_usuario, total_alquileres, gasto_total)
VALUES((SELECT id_usuario
    FROM Usuarios
    WHERE nombre = 'Mario Díaz'),
    (SELECT COUNT(*)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Mario Díaz')),
    (SELECT SUM(coste)
    FROM Alquileres
    WHERE id_usuario IN (SELECT id_usuario
                            FROM Usuarios
                            WHERE nombre = 'Mario Díaz')));

COMMIT;
--3--

--Guion 1

INSERT INTO Alquileres (id_alquiler,id_usuario, id_patinete, coste)
VALUES((SELECT MAX(id_alquiler)
        FROM Alquileres)+1,
        (SELECT id_usuario
        FROM Usuarios
        WHERE nombre = 'Mario Díaz'),
        (SELECT id_patinete
        FROM Patinetes
        WHERE modelo = 'Xiaomi Pro 2') AND id_estacion = (SELECT id_estacion
                                                        FROM Estaciones
                                                        WHERE nombre = 'Biblioteca'), 3);

UPDATE Usuarios
SET saldo = saldo - 3
WHERE nombre = 'Mario Díaz';

UPDATE Patinetes
SET estado = 'ALQUILADO'
WHERE modelo = 'Xiaomi Pro 2';

COMMIT;

--Guion 2
INSERT INTO Alquileres (id_alquiler,id_usuario, id_patinete, coste)
VALUES((SELECT MAX(id_alquiler)
        FROM Alquileres)+1,
        (SELECT id_usuario
        FROM Usuarios
        WHERE nombre = 'Lucía Pérez'),
        (SELECT id_patinete
        FROM Patinetes
        WHERE modelo = 'Xiaomi Lite'), 4);

SAVEPOINT sp_t1;

UPDATE Usuarios
SET saldo = saldo - 4
WHERE nombre = 'Lucía Pérez';

UPDATE Patinetes
SET estado = 'ALQUILADO'
WHERE modelo = 'Xiaomi Lite';

ROLLBACK TO sp_t1;

COMMIT;

--Guion 3
INSERT INTO Alquileres (id_alquiler,id_usuario, id_patinete)
VALUES((SELECT MAX(id_alquiler)
        FROM Alquileres)+1,
        (SELECT id_usuario
        FROM Usuarios
        WHERE nombre = 'Carlos Ruiz'),
        (SELECT id_patinete
        FROM Patinetes
        WHERE modelo = 'Xiaomi Pro 1'));

UPDATE Usuarios
SET saldo = saldo + 100
WHERE nombre = 'Carlos Ruiz';

UPDATE Patinetes
SET estado = 'Alquilado'
WHERE modelo = 'Xiaomi Pro 1';

ROLLBACK;

--Guion 4
INSERT INTO Alquileres (id_alquiler,id_usuario, id_patinete, coste)
VALUES((SELECT MAX(id_alquiler)
        FROM Alquileres)+1,
        (SELECT id_usuario
        FROM Usuarios
        WHERE nombre = 'Ana López'),
        (SELECT id_patinete
        FROM Patinetes
        WHERE modelo = 'Segway Ninebot 1'), 100);

UPDATE Patinetes
SET estado = 'Alquilado'
WHERE modelo = 'Xiaomi Pro 1';

SAVEPOINT sp_t2;

UPDATE Usuarios
SET saldo = saldo - 100
WHERE nombre = 'Ana López';

ROLLBACK TO sp_t2;

COMMIT;
