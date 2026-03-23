--1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT NOMBRE
FROM JUGADORES
ORDER BY NOMBRE;

--2. Mostrar el nombre de los jugadores que sean pivots con mas de 200 libras
SELECT NOMBRE
FROM JUGADORES
WHERE LOWER(POSICION) LIKE '%pivots%' AND PESO > 200
ORDER BY NOMBRE;

--3. Mostrar el nombre de todos los equipos ordenados alfabeticamente.
SELECT NOMBRE
FROM EQUIPOS
ORDER BY NOMBRE;

--4. Mostrar el nombre de los equipos del este.
SELECT NOMBRE
FROM EQUIPOS
WHERE LOWER(CONFERENCIA) LIKE '%east%'
ORDER BY NOMBRE;

--5. Mostrar los equipos donde su ciudad empieza por c.
SELECT NOMBRE
FROM EQUIPOS
WHERE LOWER(CIUDAD) LIKE 'c%'
ORDER BY NOMBRE;

--6. Mostrar todos los jugadores y su equipo ordenado por nombre del equipo.
SELECT NOMBRE, NOMBRE_EQUIPO
FROM JUGADORES
ORDER BY NOMBRE, NOMBRE_EQUIPO;

select j.nombre as jugador, e.nombre as equipo 
from jugadores j, equipos e 
where j.nombre_equipo = e.nombre 
order by e.nombre, j.nombre;

SELECT J.NOMBRE AS NOMBRE_JUGADOR, E.NOMBRE AS NOMBRE_EQUIPO
FROM JUGADORES J JOIN EQUIPOS E ON J.NOMBRE_EQUIPO = E.NOMBRE;

--7. Mostrar todos los jugadores del equipo «Raptors».
SELECT J.NOMBRE AS NOMBRE_JUGADOR, E.NOMBRE AS NOMBRE_EQUIPO
FROM JUGADORES J JOIN EQUIPOS E ON J.NOMBRE_EQUIPO = E.NOMBRE
WHERE E.NOMBRE = 'Raptors';

--8. Mostrar los puntos por partido de ‘Pau Gasol’.
SELECT J.NOMBRE AS NOMBRE_JUGADOR, E.PUNTOS_POR_PARTIDO
FROM JUGADORES J JOIN ESTADISTICAS E ON J.CODIGO = E.JUGADOR
WHERE LOWER(J.NOMBRE) LIKE '%pau gasol%';

--9. Mostrar los puntos por partido de ‘Pau Gasol’ en la temporada ’04/05′.
SELECT J.NOMBRE AS NOMBRE_JUGADOR, E.PUNTOS_POR_PARTIDO
FROM JUGADORES J JOIN ESTADISTICAS E ON J.CODIGO = E.JUGADOR
WHERE LOWER(J.NOMBRE) LIKE '%pau gasol%' AND E.TEMPORADA = '04/05';

--10. Mostrar el numero de puntos de cada jugador en toda su carrera.
SELECT J.NOMBRE AS NOMBRE_JUGADOR, SUM(E.PUNTOS_POR_PARTIDO) AS PUNTOS_TOTALES
FROM JUGADORES J JOIN ESTADISTICAS E ON J.CODIGO = E.JUGADOR;

--11. Mostrar el número de jugadores de cada equipo.
SELECT E.NOMBRE AS NOMBRE_EQUIPO, COUNT(*) AS NUMERO_JUGADORES
FROM JUGADORES J JOIN EQUIPOS E ON J.NOMBRE_EQUIPO = E.NOMBRE
GROUP BY E.NOMBRE;

--12. Mostrar el jugador que mas puntos ha realizado en toda su carrera.
SELECT J.NOMBRE AS NOMBRE_JUGADOR, SUM(E.PUNTOS_POR_PARTIDO) AS PUNTOS_TOTALES
FROM JUGADORES J JOIN ESTADISTICAS E ON J.CODIGO = E.JUGADOR
WHERE MAX(SUM(E.PUNTOS_POR_PARTIDO));

--13. Mostrar el nombre del equipo, conferencia y division del jugador mas alto de la NBA.
SELECT J.NOMBRE AS NOMBRE_JUGADOR, E.NOMBRE AS NOMBRE_EQUIPO, J.ALTURA
FROM JUGADORES J JOIN EQUIPOS E ON J.NOMBRE_EQUIPO = E.NOMBRE
WHERE J.ALTURA = (SELECT MAX(ALTURA) 
                FROM jugadores);

--14. Mostrar la suma de los puntos por partido de todos los jugadores españoles donde el equipo donde juegan este en ‘Los Angeles’.
SELECT SUM(st.PUNTOS_POR_PARTIDO) AS TOTAL_PUNTOS
FROM ESTADISTICAS st
JOIN JUGADORES j   ON st.JUGADOR       = j.CODIGO
JOIN EQUIPOS e     ON j.NOMBRE_EQUIPO  = e.NOMBRE
WHERE UPPER(j.PROCEDENCIA) = 'ESPAÑA'
  AND UPPER(e.CIUDAD)      = 'LOS ANGELES';

select sum(puntos_por_partido) as puntos
from estadisticas
where jugador = (select codigo
                  from jugadores
                  where lower(procedencia) = 'spain'
                  and nombre_equipo in (select nombre
                                            from equipos
                                            where lower(ciudad) = 'los angeles'))

--15. Mostrar la media de puntos en partidos de los equipos de la division Pacific.
SELECT AVG(st.PUNTOS_POR_PARTIDO) AS TOTAL_PUNTOS
FROM ESTADISTICAS st
JOIN JUGADORES j   ON st.JUGADOR       = j.CODIGO
JOIN EQUIPOS e     ON j.NOMBRE_EQUIPO  = e.NOMBRE
WHERE UPPER(e.DIVISION)      = 'PACIFIC';

SELECT AVG(puntos_partido) AS MEDIA_PUNTOS
FROM (
    SELECT PUNTOS_LOCAL AS puntos_partido
    FROM PARTIDOS p
    JOIN EQUIPOS e ON p.EQUIPO_LOCAL = e.NOMBRE
    WHERE UPPER(e.DIVISION) = 'PACIFIC'

    UNION ALL

    SELECT PUNTOS_VISITANTE
    FROM PARTIDOS p
    JOIN EQUIPOS e ON p.EQUIPO_VISITANTE = e.NOMBRE
    WHERE UPPER(e.DIVISION) = 'PACIFIC'
);
--16. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT EQUIPO_LOCAL, 
       EQUIPO_VISITANTE, 
       ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE) AS DIFERENCIA
FROM PARTIDOS
WHERE ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE) = (
    SELECT MAX(ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE))
    FROM PARTIDOS
);

--17. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT e.NOMBRE AS EQUIPO,
       AVG(PUNTOS_LOCAL) AS MEDIA_PUNTOS
FROM PARTIDOS p
JOIN EQUIPOS e ON p.EQUIPO_LOCAL = e.NOMBRE
WHERE UPPER(e.DIVISION) = 'PACIFIC'
GROUP BY e.NOMBRE

UNION ALL

SELECT e.NOMBRE AS EQUIPO,
       AVG(PUNTOS_VISITANTE)
FROM PARTIDOS p
JOIN EQUIPOS e ON p.EQUIPO_VISITANTE = e.NOMBRE
WHERE UPPER(e.DIVISION) = 'PACIFIC'
GROUP BY e.NOMBRE
ORDER BY MEDIA_PUNTOS DESC;

--18. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. Usa una vista
CREATE OR REPLACE VIEW PUNTOS_EQUIPO AS 
SELECT E.NOMBRE, SUM(P1.PUNTOS_LOCAL), SUM(P2.PUNTOS_VISITANTE)
FROM EQUIPOS E JOIN PARTIDOS P1 ON E.NOMBRE = P1.EQUIPO_LOCAL
JOIN PARTIDOS P2 ON E.NOMBRE = P2.EQUIPO_VISITANTE
GROUP BY E.NOMBRE;

--19. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT CODIGO, EQUIPO_LOCAL, EQUIPO_VISITANTE,
CASE
    WHEN PUNTOS_LOCAL>PUNTOS_VISITANTE THEN EQUIPO_LOCAL
    WHEN PUNTOS_VISITANTE>PUNTOS_LOCAL THEN EQUIPO_VISITANTE
    ELSE NULL
    END AS EQUIPO_GANADOR
FROM PARTIDOS;