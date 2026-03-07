/*
Los datos seleccionados en la sentencia SELECT que lleva el GROUP BY deben ser: 
    una constante, 
    una función de grupo (
        SUM suma
        COUNT(columna) cuenta valores NO NULOS
        COUNT(*) cuenta filas (sí cuenta NULL)
        AVG media 
        MIN mínimo
        MAX máximo
    una columna expresada en el GROUP BY
*/

/*
“GROUP BY sirve para responder preguntas del tipo
‘por cada…’ o ‘agrupado por…’”

“por cada usuario”
“por cada estado”
“por cada ciudad”
*/

/*
TODAS las columnas del SELECT no agregadas → deben ir en el GROUP BY
*/



--Número de pedidos por usuario
SELECT U.NOMBRE, COUNT(*) AS NUMERO_PEDIDOS
FROM USUARIOS U JOIN PEDIDOS P ON U.ID_USUARIO = P.ID_USUARIO
GROUP BY P.ID_USUARIO, U.NOMBRE;

--Importe medio de los pedidos por usuario. FIJARSE QUE EL PEDIDO CON IMPORTE NULL NO AFECTA
SELECT U.NOMBRE, AVG(IMPORTE) AS IMPORTE_MEDIO
FROM USUARIOS U JOIN PEDIDOS P ON U.ID_USUARIO = P.ID_USUARIO
GROUP BY P.ID_USUARIO, U.NOMBRE;

--Importe máximo y mínimo por usuario
SELECT U.NOMBRE, MAX(IMPORTE) AS IMPORTE_MAXIMO, MIN(IMPORTE) AS IMPORTE_MINIMO
FROM USUARIOS U JOIN PEDIDOS P ON U.ID_USUARIO = P.ID_USUARIO
GROUP BY P.ID_USUARIO, U.NOMBRE;

--Número de pedidos por estado viendo información clara de cada estado (cancelado, procesado,...)
SELECT DECODE(ESTADO,'C','Cancelado','P','Procesado','E','Entregado'), COUNT(*) AS NUMERO_PEDIDOS
FROM PEDIDOS
GROUP BY ESTADO;

/*
HAVING: la gran diferencia con WHERE
WHERE → filtra filas
HAVING → filtra grupos
*/

--Usuarios con más de 1 pedido
SELECT U.NOMBRE, COUNT(*) AS NUMERO_PEDIDOS
FROM USUARIOS U JOIN PEDIDOS P ON U.ID_USUARIO = P.ID_USUARIO
GROUP BY P.ID_USUARIO, U.NOMBRE HAVING COUNT(*)>1 ;

--Usuarios cuyo importe medio supera 100 €
SELECT U.NOMBRE, AVG(IMPORTE) AS IMPORTE_MEDIO
FROM USUARIOS U JOIN PEDIDOS P ON U.ID_USUARIO = P.ID_USUARIO
GROUP BY P.ID_USUARIO, U.NOMBRE HAVING AVG(IMPORTE)>100;

--Estados con importe total superior a 200 €
SELECT DECODE(ESTADO,'C','Cancelado','P','Procesado','E','Entregado'), SUM(IMPORTE) AS IMPORTE_TOTAL
FROM PEDIDOS
GROUP BY ESTADO HAVING SUM(IMPORTE)>200;

--Total gastado por cada usuario (con nombre)
SELECT U.NOMBRE, SUM(P.IMPORTE) AS TOTAL_GASTADO
FROM USUARIOS U JOIN PEDIDOS P ON U.ID_USUARIO = P.ID_USUARIO
GROUP BY U.ID_USUARIO, U.NOMBRE;

--Operadores de conjuntos (MINUS, UNION, INTERSECT)
/*
Los operadores de conjuntos trabajan sobre el resultado del SELECT,
no “saben” nada de tablas, claves ni relaciones.
Por eso:
    normalmente trabajan con pocas columnas
    y no es buena idea meter muchas columnas “bonitas” directamente
*/
--Usuarios SIN pedidos (MINUS)
SELECT ID_USUARIO FROM USUARIOS
MINUS
SELECT ID_USUARIO FROM PEDIDOS;

SELECT ID_USUARIO, NOMBRE
FROM USUARIOS
WHERE ID_USUARIO IN (
    SELECT ID_USUARIO FROM USUARIOS
    MINUS
    SELECT ID_USUARIO FROM PEDIDOS
);

--Usuarios con pedidos ENVIADOS o CANCELADOS (UNION)
SELECT ID_USUARIO
FROM PEDIDOS
WHERE ESTADO = 'E'
UNION
SELECT ID_USUARIO
FROM PEDIDOS
WHERE ESTADO = 'C';

SELECT ID_USUARIO, 'Enviado' AS Motivo
FROM PEDIDOS WHERE ESTADO = 'E'
UNION ALL
SELECT ID_USUARIO, 'Cancelado' AS Motivo FROM PEDIDOS WHERE ESTADO = 'C';

-- Usuarios que tienen al menos un pedido Enviado
SELECT ID_USUARIO
FROM USUARIOS
INTERSECT
SELECT ID_USUARIO
FROM PEDIDOS
WHERE ESTADO = 'E';

--Usuarios que tienen pedidos PENDIENTES y ENTREGADOS (INTERSECT)
SELECT ID_USUARIO
FROM PEDIDOS
WHERE ESTADO = 'P'
INTERSECT
SELECT ID_USUARIO
FROM PEDIDOS
WHERE ESTADO = 'E';
