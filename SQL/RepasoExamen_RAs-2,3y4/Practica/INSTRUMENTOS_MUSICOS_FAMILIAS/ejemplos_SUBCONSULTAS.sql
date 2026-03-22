--1--
--Queremos  obtener  el  nombre  de  los  instrumentos  cuyo  precio  sea 
--menor que cualquiera de los instrumentos de la familia ‘0001’
SELECT NOMBRE
FROM INSTRUMENTOS
WHERE PRECIO < ANY(SELECT PRECIO
                    FROM INSTRUMENTOS
                    WHERE FAMILIA = '0001');

--2--
--Lo mismo que en el caso anterior pero ahora precio menor o igual, 
--por eso aparece también el violín.
SELECT NOMBRE
FROM INSTRUMENTOS
WHERE PRECIO <= ANY(SELECT PRECIO
                    FROM INSTRUMENTOS
                    WHERE FAMILIA = '0001');

--3--
--Ahora queremos obtener el nombre de los instrumentos cuyo precio 
--sea menor o igual que el precio de todos los instrumentos de la familia 
--‘0001’
SELECT NOMBRE
FROM INSTRUMENTOS
WHERE PRECIO <= ALL(SELECT PRECIO
                    FROM INSTRUMENTOS
                    WHERE FAMILIA = '0001');

--4--
--Lo  mismo  que  antes  pero  precio  menor  que  el  precio  de  todos  los 
--instrumentos de esa familia, es decir solo saldrán aquellos 
--instrumentos cuyo precio sea menor al precio menor de esa familia.
SELECT NOMBRE
FROM INSTRUMENTOS
WHERE PRECIO < ALL(SELECT PRECIO
                    FROM INSTRUMENTOS
                    WHERE FAMILIA = '0001');