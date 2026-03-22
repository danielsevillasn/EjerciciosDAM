--SELECT > FROM > WHERE > ORDER BY

--  Select con DISTINCT (Te da todo menos lo repetido) O * (Todo)
SELECT DISTINCT *
FROM EMPLE;

-- Para ver dos columnas

-- Selecciona toda la tabla pero devuelve solo en las que el oficio es vendedor con el where
SELECT *
FROM EMPLE
WHERE OFICIO LIKE '%VENDEDOR%'

-- Selecciona toda la tabla pero devuelve solo en las que el salario es mayor a 2000 con el where
SELECT *
FROM EMPLE
WHERE SALARIO > 2000;

-- El where utiliza un operador logico AND que ayuda a poner más de una condicion
SELECT * 
FROM EMPLE 
WHERE OFICIO LIKE '%VENDEDOR%' AND SALARIO > 2000;

-- Esta ordenado con el criterio salario que por defecto esta en ascendente o ASC
SELECT *
FROM EMPLE 
ORDER BY SALARIO;

-- Esta ordenado con el criterio salario en descendente
SELECT *
FROM EMPLE 
ORDER BY SALARIO DESC;

--Ordenado como antes pero con la condicion del salario
SELECT *
FROM EMPLE
WHERE SALARIO > 2000
ORDER BY SALARIO DESC;

--Comparacion con el LIKE y te da los apellidos que empiezen por s
SELECT APELLIDO
FROM EMPLE
WHERE APELLIDO LIKE 'S%'

--Comparacion con el LIKE y te da los apellidos que terminen en ez
SELECT APELLIDO
FROM EMPLE
WHERE APELLIDO LIKE '%EZ'

--Comparacion con el LIKE y te da los apellidos que empiezen por y tengan 3 carateres cuales quiera restantes
SELECT APELLIDO
FROM EMPLE
WHERE APELLIDO LIKE 'S___'

--Concatenacion de los 2 apellidos con un espacio en medio para separarlos
SELECT NOMBRE, APELLIDO1 || ' ' || "APELLIDOS"
FROM EMPLE;

--NULL, te da los valores que todavia no se han introducido en la tabla
SELECT *
FROM EMPLE
WHERE COMISION IS NULL;

--IN, se utiliza como el check in y sirve para mostrar opciones especificas que quieres ver
SELECT *
FROM EMPLE
WHERE DEPT_NO IN (10,20);

--BETWEEN, se utiliza para seleccionar solo los valores que estan entre esos parametros
SELECT *
FROM EMPLE
WHERE SALARIO BETWEEN 1000 AND 2000;

--SUBCADENAS
SELECT *
FROM EMLE 
WHERE OFICIO IN (SELECT OFICIO
                FROM EMPLE
                WHERE EMP_NO = 20);