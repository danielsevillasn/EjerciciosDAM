--SELECT > FROM > WHERE > ORDER BY

--  Select con DISTINCT (Te da todo menos lo repetido) O * (Todo)
SELECT DIR DISTINCT
FROM EMPLE;

-- Para ver dos columnas
SELECT EMP NO, APELLIDO
FROM EMPLE;

-- Selecciona toda la tabla pero devuelve solo en las que el oficio es vendedor con el where
SELECT *
FROM EMPLE
WHERE OFICIO = 'VENDEDOR';

-- Selecciona toda la tabla pero devuelve solo en las que el salario es mayor a 2000 con el where
SELECT *
FROM EMPLE
WHERE salario > 2000;

-- El where utiliza un operador logico AND que ayuda a poner más de una condicion
SELECT *
FROM EMPLE
WHERE salario > 2000 AND DEPT_NO = 10;

-- Esta ordenado con el criterio salario que por defecto esta en ascendente o ASC
SELECT APELLIDO,SALARIO
FROM EMPLE
ORDER BY salario;

-- Esta ordenado con el criterio salario en descendente
SELECT APELLIDO,SALARIO
FROM EMPLE
ORDER BY salario DESC;

--Ordenado como antes pero con la condicion del salario
SELECT APELLIDO,SALARIO
FROM EMPLE
WHERE SALARIO > 2000
ORDER BY salario DESC;

--Lo ordena con 2 criterios de ordenacion con una prioridad marcada de izquierda a derecha
SELECT APELLIDO,OFICIO,DEPT_NO
FROM EMPLE
ORDER BY DEPT_NO DESC,APELLIDO;

--Para poner un encabezado diferente o tambien denominado como "Alias"
SELECT EMP_NO, APELLIDO, DIR "DIRECTOR"
FROM EMPLE;

SELECT EMP_NO, APELLIDO, DIR
FROM EMPLE;

--Expresa la operacion
SELECT APELLIDO, SALARIO, SALARIO * 12 "SALARIO ANUAL"
FROM EMPLE;

--Comparacion con el LIKE y te da los apellidos que empiezen por s
SELECT *
FROM EMPLE
WHERE APELLIDO LIKE 'S%';

--Comparacion con el LIKE y te da los apellidos que terminen en ez
SELECT *
FROM EMPLE
WHERE APELLIDO LIKE '%EZ'

--Comparacion con el LIKE y te da los apellidos que empiezen por y tengan 3 carateres cuales quiera restantes
SELECT *
FROM EMPLE
WHERE APELLIDO LIKE 'S___'

--Concatenacion de los 2 apellidos con un espacio en medio para separarlos
SELECT NOMBRE, APELLIDO1 || ' ' || "APELLIDOS"

--NULL, te da los valores que todavia no se han introducido en la tabla
SELECT APELLIDO
FROM EMPLE
WHERE COMISION IS NULL;

--IN, se utiliza como el check in y sirve para mostrar opciones especificas que quieres ver
SELECT APELLIDO, DEPT_NO
FROM EMPLE
WHERE DEPT_NO IN (10,30);

--BETWEEN, se utiliza para seleccionar solo los valores que estan entre esos parametros
SELECT APELLIDO, DEPT_NO
FROM EMPLE
WHERE DEPT_NO BETWEEN 10 AND 30

--SUBCADENAS
SELECT *
FROM EMPLE
WHERE OFICIO = (SELECT OFICIO
                FROM EMPLE
                WHERE EMP_NO = 123);

