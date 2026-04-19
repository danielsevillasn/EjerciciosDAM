--1--
BEGIN
    FOR i IN 1..20 LOOP
        IF MOD(i,2) = 0 THEN 
            DBMS_OUTPUT.PUT_LINE('Numero par: '||i);
        END IF;
    END LOOP;
END;

--2--
DECLARE
    SUMA NUMBER := 0;
BEGIN
    FOR i IN 1..5 LOOP
        SUMA := SUMA+i;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('El sumatorio del numero 5 es: ' || SUMA);
END;

--3--
CREATE OR REPLACE FUNCTION calculoFactorial (n NUMBER) RETURN NUMBER
AS
    FACTORIAL NUMBER := 1;
BEGIN
    FOR i IN 1..n LOOP
        FACTORIAL := FACTORIAL*i;
    END LOOP;
    RETURN FACTORIAL;
END;

--4--
BEGIN
    DBMS_OUTPUT.PUT_LINE('Factorial de 5: ' || calculoFactorial(5)); -- Resultado: 120
    DBMS_OUTPUT.PUT_LINE('Factorial de 4: ' || calculoFactorial(4)); -- Resultado: 24
END;

--5--
CREATE OR REPLACE PROCEDURE tabla_multiplicar (n NUMBER, limite NUMBER)
AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Tabla de multiplicar del ' || n || ' hasta el ' || limite);
    FOR i IN 1..limite LOOP
        DBMS_OUTPUT.PUT_LINE(n ||'x'||i || ' = '|| (n*i));
    END LOOP;
END;

--6 y 7--
BEGIN
    tabla_multiplicar(6, 20);
    tabla_multiplicar(9, 10);
END;