-- =====================================================
--              1. TEXTO (UNA SOLA FILA)
-- =====================================================

--UPPER(cadena) (Cambia todo a mayúculas)
SELECT UPPER('hola') FROM DUAL;
-- HOLA

--LOWER(cadena) (Cambia todo a minúsculas)
SELECT LOWER('HOLA') FROM DUAL;
-- hola

--LENGTH(cadena) (Longitud de texto)
SELECT LENGTH('Hola') FROM DUAL;
-- 4

--SUBSTR(cadena, inicio, longitud) (Extrae parte)
SELECT SUBSTR('1234567',3,2) FROM DUAL;
-- 34 (pos 3-4)

--INSTR(cadena, buscada , inicio) (Posición de subcadena)
SELECT INSTR('usuarios','u') FROM DUAL;
-- 1
SELECT INSTR('usuarios','u',2) FROM DUAL;
-- 3 (2da 'u')

--TRIM(cadena) (Quita espacios al principio y al final)
SELECT TRIM(' Hola ') FROM DUAL;
-- Hola

-- REPLACE(cadena, vieja, nueva) (Sustituye cadenas por otras)
SELECT REPLACE('correo@gmail.es','es','com') FROM DUAL;
-- correo@gmail.com

-- =====================================================
--            2. NUMÉRICAS (UNA SOLA FILA)
-- =====================================================

--ROUND(número, decimales) (Redondea decimales)
SELECT ROUND(12.5874,2) FROM DUAL;
-- 12.59

--TRUNC(número, nDecimales) (Quita decimales)
SELECT TRUNC(127.4567,2) FROM DUAL;
-- 127.45
SELECT TRUNC(4572.5678,-2) FROM DUAL;
-- 4500

--MOD(n1, n2) (Resto de división)
SELECT MOD(15,2) FROM DUAL;
-- 1

--ABS(número) (Valor absoluto)
SELECT ABS(-17) FROM DUAL;
-- 17

-- =====================================================
--               3. FECHAS (UNA SOLA FILA)
-- =====================================================
--SYSDATE (Fecha/hora actual)
SELECT SYSDATE FROM DUAL;

--ADD_MONTHS(fecha, meses) (Suma meses)
SELECT ADD_MONTHS('27/07/11',5) FROM DUAL;
--'27/12/2011'

--MONTHS_BETWEEN(f1, f2) (Diferencia en meses)
SELECT MONTHS_BETWEEN('12/07/11','12/03/11') FROM DUAL;
--4

--NEXT_DAY(fecha, 'DIA') Próximo día (ej: LUNES).
SELECT NEXT_DAY('31/12/11','LUNES') FROM DUAL;
-- '02/01/2012'

--TRUNC(fecha) (Quita hora)
SELECT TRUNC(SYSDATE) FROM DUAL;
--Fecha actual sin horas (00:00)

--EXTRACT(parte(DAY, MONTH, YEAR) FROM fecha) (Año/Mes/Día)
SELECT EXTRACT(MONTH FROM SYSDATE) FROM DUAL;
--Mes actual

-- =====================================================
--                   4. CONVERSIÓN 
-- =====================================================
--TO_CHAR(valor, 'formato') (Número/Fecha → Texto)
SELECT TO_CHAR(SYSDATE,'DD/MM/YYYY') FROM DUAL;

--TO_NUMBER(texto, 'formato') (Texto → Número)
SELECT TO_NUMBER('1234') FROM DUAL;

--TO_DATE(texto, 'formato') (Texto → Fecha)
SELECT TO_DATE('01/02/2024','DD/MM/YYYY') FROM DUAL;

-- Fecha estándar:    'DD/MM/YYYY'
--  YYYY / MM / DD | Año 4 dígitos / Mes / Día
-- Fecha con hora:    'DD/MM/YYYY HH24:MI:SS'
--  HH24:MI:SS  | Hora 24h : Minutos : Segundos
-- Fecha con nombre:  'DAY DD "de" MONTH "de" YYYY'
--  DAY Nombre día
-- Número europeo:    '9G999D99'   → 1.234,56
--  D / G | Posición símbolo decimal (,) / separador de miles (.)
--  9 / 0   | Posición (blanco / cero si falta), el texto con el numero de digitos indicado
-- Moneda europea:    'L9G999D99'  → €1.234,56
--  L / $   | Moneda local / símbolo dólar

-- =====================================================
--                5. CONTROL DE NULLS
-- =====================================================
--NVL(columna, valor_sustituto) (NULL → valor)
SELECT NVL(direccion,'Sin dirección') FROM empleados
--Si hay un null en direccion imprime por pantalla sin direccion

-- =====================================================
--              6. CONDICIONALES - COMO IF
-- =====================================================
-- CASE WHEN condición THEN resultado ... END AS 'alias'
SELECT nombre,
    CASE WHEN salario < 1200 THEN 'BAJO'
    WHEN salario BETWEEN 1200 AND 2000 THEN 'MEDIO'
    ELSE 'ALTO' END AS nivel
FROM empleados;

--DECODE(expr, valor1, resultado1, valor2, resultado2, ..., default)
SELECT DECODE(sexo,'M','Hombre','F','Mujer','Otro') FROM personas;

-- =====================================================
--  7. DE GRUPO - ALTERAN Nº FILAS (REQUIERE GROUP BY)
-- =====================================================
--WHERE filtra antes, HAVING después.

--COUNT(*) o COUNT(columna/DISTINCT)**: Cuenta.
SELECT COUNT(DISTINCT ciudad) FROM clientes;

--SUM(columna) (Suma columnas)
SELECT SUM(ciudad) FROM clientes;

--AVG(columna) (Media columnas)
SELECT AVG(ciudad) FROM clientes;

--MIN(columna) (Valor minimo)
SELECT MIN(ciudad) FROM clientes;

--MAX(columna) (Valor maximo)
SELECT MAX(ciudad) FROM clientes;

-- =====================================================
--                FUNCIONES SECUNDARIAS
-- =====================================================
-- =====================================================
-- 1. FUNCIONES NUMÉRICAS (ARITMÉTICAS)
-- =====================================================

-- ABS(n): Devuelve el valor absoluto de un número
SELECT ABS(-17) FROM DUAL; -- Resultado: 17

-- EXP(n): Calcula e elevado a n
SELECT EXP(2) FROM DUAL; -- Resultado: 7.38

-- CEIL(n): Devuelve el entero inmediatamente superior
SELECT CEIL(17.4) FROM DUAL; -- Resultado: 18

-- FLOOR(n): Devuelve el entero inmediatamente inferior
SELECT FLOOR(17.4) FROM DUAL; -- Resultado: 17

-- MOD(m,n): Devuelve el resto de dividir m entre n
SELECT MOD(15,2) FROM DUAL; -- Resultado: 1

-- POWER(base, exponente): Eleva un número a una potencia
SELECT POWER(4,5) FROM DUAL; -- Resultado: 1024

-- ROUND(n, decimales): Redondea un número
SELECT ROUND(12.5874,2) FROM DUAL; -- Resultado: 12.59

-- SQRT(n): Calcula la raíz cuadrada
SELECT SQRT(25) FROM DUAL; -- Resultado: 5

-- TRUNC(n, decimales): Trunca un número
SELECT TRUNC(127.4567,2) FROM DUAL; -- 127.45
SELECT TRUNC(4572.5678,-2) FROM DUAL; -- 4500

-- SIGN(n): Devuelve 1 si es positivo, -1 si es negativo, 0 si es cero
SELECT SIGN(-23) FROM DUAL; -- Resultado: -1

-- =====================================================
-- 2. FUNCIONES DE GRUPO
-- =====================================================

-- SUM(columna): Suma los valores de una columna
SELECT SUM(salario) FROM empleados;

-- AVG(columna): Calcula la media de una columna
SELECT AVG(edad) FROM alumnos;

-- COUNT(): Cuenta todas las filas
-- COUNT(columna): Cuenta filas no nulas
SELECT COUNT(*) FROM empleados;
SELECT COUNT(DISTINCT ciudad) FROM clientes;

-- MAX(columna): Devuelve el valor máximo
-- MIN(columna): Devuelve el valor mínimo
SELECT MAX(nota), MIN(nota) FROM examenes;

-- =====================================================
-- 3. FUNCIONES DE CADENAS DE CARACTERES
-- =====================================================

-- LOWER(cadena): Convierte a minúsculas
SELECT LOWER('HOLA') FROM DUAL; -- hola

-- UPPER(cadena): Convierte a mayúsculas
SELECT UPPER('hola') FROM DUAL; -- HOLA

-- INITCAP(cadena): Primera letra de cada palabra en mayúscula
SELECT INITCAP('hola mundo') FROM DUAL; -- Hola Mundo

-- CONCAT(cad1, cad2): Une dos cadenas
SELECT CONCAT('Hola','Mundo') FROM DUAL; -- HolaMundo

-- SUBSTR(cadena, inicio, longitud): Extrae parte de una cadena
SELECT SUBSTR('1234567',3,2) FROM DUAL; -- 34

-- LENGTH(cadena): Devuelve la longitud de la cadena
SELECT LENGTH('Hola') FROM DUAL; -- 4

-- REPLACE(cad, vieja, nueva): Sustituye texto
SELECT REPLACE('correo@gmail.es','es','com') FROM DUAL;

-- LPAD(cad, n, relleno): Rellena por la izquierda
SELECT LPAD('M',5,'*') FROM DUAL; -- ****M

-- RPAD(cad, n, relleno): Rellena por la derecha
SELECT RPAD('M',5,'*') FROM DUAL; -- M****

-- TRIM(cad): Elimina espacios a izquierda y derecha
SELECT TRIM(' Hola ') FROM DUAL; -- Hola

-- LTRIM(cad): Elimina espacios a la izquierda
SELECT LTRIM(' Hola') FROM DUAL; -- Hola

-- RTRIM(cad): Elimina espacios a la derecha
SELECT RTRIM('Hola ') FROM DUAL; -- Hola

-- INSTR(cadena, buscada [, inicio [, aparición]]): Devuelve la posición
SELECT INSTR('usuarios','u') FROM DUAL; -- 1
SELECT INSTR('usuarios','u',2) FROM DUAL; -- 3

-- ASCII(cad): Devuelve el código ASCII
-- CHR(n): Devuelve el carácter ASCII
SELECT ASCII('O') FROM DUAL; -- 79
SELECT CHR(81) FROM DUAL; -- Q

-- =====================================================
-- 4. FUNCIONES DE FECHAS
-- =====================================================

-- SYSDATE: Fecha y hora actual
SELECT SYSDATE FROM DUAL;

-- SYSTIMESTAMP: Fecha y hora con precisión TIMESTAMP
SELECT SYSTIMESTAMP FROM DUAL;

-- ADD_MONTHS(fecha, n): Suma meses a una fecha
SELECT ADD_MONTHS('27/07/11',5) FROM DUAL;

-- MONTHS_BETWEEN(f1,f2): Meses entre dos fechas
SELECT MONTHS_BETWEEN('12/07/11','12/03/11') FROM DUAL;

-- LAST_DAY(fecha): Último día del mes
SELECT LAST_DAY('27/07/11') FROM DUAL;

-- NEXT_DAY(fecha, día): Siguiente día indicado
SELECT NEXT_DAY('31/12/11','LUNES') FROM DUAL;

-- EXTRACT(valor FROM fecha): Extrae parte de una fecha
SELECT EXTRACT(MONTH FROM SYSDATE) FROM DUAL;

-- =====================================================
-- 5. FUNCIONES DE CONVERSIÓN
-- =====================================================

-- TO_CHAR(dato, formato): Convierte número o fecha a texto
SELECT TO_CHAR(SYSDATE,'DD/MM/YYYY') FROM DUAL;

-- TO_DATE(cadena, formato): Convierte texto a fecha
SELECT TO_DATE('01/02/2024','DD/MM/YYYY') FROM DUAL;

-- TO_NUMBER(cadena, formato): Convierte texto a número
SELECT TO_NUMBER('1234') FROM DUAL;

-- =====================================================
-- 6. OTRAS FUNCIONES
-- =====================================================

-- NVL(valor, sustituto): Sustituye NULL por otro valor
SELECT NVL(direccion,'No tiene dirección') FROM empleados;

-- DECODE(expr, cond1, val1, ..., default): Función condicional (IF)
SELECT DECODE(sexo,'M','Hombre','F','Mujer','Otro') FROM personas;

-- VSIZE(expr): Devuelve los bytes ocupados
SELECT VSIZE('Hola') FROM DUAL;

-- DUMP(cadena, formato): Muestra información interna del dato
SELECT DUMP('ABC',16) FROM DUAL;

-- USER: Devuelve el usuario actual
-- UID: Devuelve el identificador del usuario
SELECT USER, UID FROM DUAL;

-- =====================================================
-- **ERRORES TÍPICOS Y BUENAS PRÁCTICAS**
-- =====================================================
-- Errores: Fechas sin TO_DATE, NULLs sin NVL, grupo sin GROUP BY, funciones en índices (lento).
-- Prácticas: CASE > DECODE, alias claros, prueba con DUAL, WHERE primero.
-- IMPORTANTE: Funciones TRANSFORMAN, no modifican tablas (salvo UPDATE).