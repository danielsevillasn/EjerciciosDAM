--mostrar todos los exploradores
SELECT *
FROM exploradores;

--mostrar nombre y rango de los exploradores
SELECT nombre, rango
FROM exploradores;

--mostrar exploradores que no tengan 21 años
SELECT *
FROM exploradores
WHERE edad != 21;

--zonas con nivel de peligro alto ordenadas por región
SELECT *
FROM zonas
WHERE peligro LIKE 'alto'
ORDER BY region;

--misiones en la zona del explorador con rango 'Maestro'
SELECT *
FROM misiones
WHERE id_mision IN (SELECT id_mision
                    FROM participaciones
                    WHERE id_explorador IN (SELECT id_explorador
                                            FROM exploradores
                                            WHERE rango = 'Maestro'));

--exploradores que han participado en misiones de dificultad alta
SELECT *
FROM exploradores
WHERE id_explorador IN (SELECT id_explorador
                    FROM participaciones
                    WHERE id_mision IN (SELECT id_mision
                                        FROM misiones
                                        WHERE dificultad = 'alta'));

--exploradores que han participado en misiones en zonas de peligro Alto
SELECT *
FROM exploradores
WHERE id_explorador IN (SELECT id_explorador
                    FROM participaciones
                    WHERE id_mision IN (SELECT id_mision
                                        FROM misiones
                                        WHERE id_zona = (SELECT id_zona
                                                        FROM zonas
                                                        WHERE peligro = 'Alto')));

--misiones con duración mayor que alguna misión del Bosque Sombrío
SELECT *
FROM misiones
WHERE duracion > ANY (SELECT duracion
                        FROM misiones
                        WHERE id_zona = (SELECT id_zona
                                        FROM zonas
                                        WHERE nombre = 'Bosque Sombrío'))
AND id_zona != (SELECT id_zona
                FROM zonas
                WHERE nombre = 'Bosque Sombrío');

--misiones con duración mayor que todas las misiones del Desierto Rojo
SELECT *
FROM misiones
WHERE duracion > All (SELECT duracion
                        FROM misiones
                        WHERE id_zona = 'Desierto Rojo');

--participaciones con éxito en misiones más largas que otras de la misma zona
SELECT *
FROM participaciones
WHERE exito ='SI' AND id_mision IN (SELECT id_mision
                                    FROM misiones "m"
                                    WHERE duracion > ANY (SELECT duracion
                                                            FROM misiones
                                                            WHERE id_zona = m.id_zona));

--participaciones cuya misión dura más que alguna otra misión en la misma zona
SELECT *
FROM participaciones P
WHERE (SELECT duracion
        FROM misiones
        WHERE id_mision = P.id_mision) > ANY (SELECT duracion
                                            FROM misiones
                                            WHERE id_zona = (SELECT id_zona
                                                            FROM misiones
                                                            WHERE id_mision = P.id_mision)
                                            AND id_mision != P.id_mision);

--misiones más largas de cada zona
SELECT *
FROM misiones
WHERE duracion = (SELECT MAX (duracion)
                    FROM misiones);