-- EXPLORADORES
INSERT INTO exploradores VALUES (1, 'Ayla', 24, 'Veterano');
INSERT INTO exploradores VALUES (2, 'Bran', 19, 'Aprendiz');
INSERT INTO exploradores VALUES (3, 'Ciro', 30, 'Maestro');
INSERT INTO exploradores VALUES (4, 'Dara', 22, 'Intermedio');

-- ZONAS
INSERT INTO zonas VALUES (1, 'Bosque Sombrío', 'Norte', 'Alto');
INSERT INTO zonas VALUES (2, 'Desierto Rojo', 'Sur', 'Medio');
INSERT INTO zonas VALUES (3, 'Islas Brumosas', 'Este', 'Bajo');

-- MISIONES
INSERT INTO misiones VALUES (1, 'Mapa Perdido', 'Media', 5, 1);
INSERT INTO misiones VALUES (2, 'Ruinas Antiguas', 'Alta', 8, 1);
INSERT INTO misiones VALUES (3, 'Caravana Perdida', 'Baja', 4, 2);
INSERT INTO misiones VALUES (4, 'Exploración Costera', 'Media', 6, 3);

-- PARTICIPACIONES
INSERT INTO participaciones VALUES (1, 1, 1, 'SI');
INSERT INTO participaciones VALUES (2, 1, 2, 'NO');
INSERT INTO participaciones VALUES (3, 2, 1, 'SI');
INSERT INTO participaciones VALUES (4, 3, 2, 'SI');
INSERT INTO participaciones VALUES (5, 3, 4, 'SI');
INSERT INTO participaciones VALUES (6, 4, 3, 'NO');
