CREATE OR REPLACE PROCEDURE pr_suma_hasta_cinco (
    p_n1 IN NUMBER DEFAULT 0,
    p_n2 IN NUMBER DEFAULT 0,
    p_n3 IN NUMBER DEFAULT 0,
    p_n4 IN NUMBER DEFAULT 0,
    p_n5 IN NUMBER DEFAULT 0
)
AS
    v_resultado NUMBER;
BEGIN
    v_resultado := p_n1 + p_n2 + p_n3 + p_n4 + p_n5;
    DBMS_OUTPUT.PUT_LINE('La suma total de los números pasados es: ' || v_resultado);
END;
/

-- Bloque de prueba variando la cantidad de argumentos
BEGIN
    pr_suma_hasta_cinco(10, 20); -- Usa 2 números
    pr_suma_hasta_cinco(5, 5, 5, 5, 5); -- Usa los 5 números
END;
/