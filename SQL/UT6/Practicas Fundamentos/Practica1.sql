SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE pr_suma_dos_numeros (
    p_num1 IN NUMBER, 
    p_num2 IN NUMBER
)
AS
    v_suma NUMBER;
BEGIN
    v_suma := p_num1 + p_num2;
    DBMS_OUTPUT.PUT_LINE('La suma de ' || p_num1 || ' y ' || p_num2 || ' es: ' || v_suma);
END;
/

-- Bloque de prueba
BEGIN
    pr_suma_dos_numeros(14.5, 22);
END;
/