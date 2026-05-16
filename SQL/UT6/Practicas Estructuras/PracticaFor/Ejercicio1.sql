SET SERVEROUTPUT ON;

--1-- Mostrar números pares del 1 al 20
BEGIN
    FOR i IN 1..20 LOOP
        IF MOD(i,2) = 0 THEN 
            DBMS_OUTPUT.PUT_LINE('Numero par: '||i);
        END IF;
    END LOOP;
END;

--2-- Sumatoria del número 5 (del 1 al 5)
DECLARE
    SUMA NUMBER := 0;
BEGIN
    FOR i IN 1..5 LOOP
        SUMA := SUMA+i;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('El sumatorio del numero 5 es: ' || SUMA);
END;

--3-- Función para calcular el Factorial
CREATE OR REPLACE FUNCTION calculoFactorial (n NUMBER) RETURN NUMBER
AS
    FACTORIAL NUMBER := 1;
BEGIN
    FOR i IN 1..n LOOP
        FACTORIAL := FACTORIAL*i;
    END LOOP;
    RETURN FACTORIAL;
END;

--4-- Bloque para llamar a la función (Factorial de 5 y 4)
BEGIN
    DBMS_OUTPUT.PUT_LINE('Factorial de 5: ' || calculoFactorial(5)); -- Resultado: 120
    DBMS_OUTPUT.PUT_LINE('Factorial de 4: ' || calculoFactorial(4)); -- Resultado: 24
END;

--5-- Procedimiento para generar tablas de multiplicar
CREATE OR REPLACE PROCEDURE tabla_multiplicar (n NUMBER, limite NUMBER)
AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Tabla de multiplicar del ' || n || ' hasta el ' || limite);
    FOR i IN 1..limite LOOP
        DBMS_OUTPUT.PUT_LINE(n ||'x'||i || ' = '|| (n*i));
    END LOOP;
END;

--6 y 7-- Ejecución de las tablas solicitadas (Tabla del 6 y Tabla del 9)
BEGIN
    tabla_multiplicar(6, 20);
    DBMS_OUTPUT.PUT_LINE('-----------------------------------');
    tabla_multiplicar(9, 10);
END;