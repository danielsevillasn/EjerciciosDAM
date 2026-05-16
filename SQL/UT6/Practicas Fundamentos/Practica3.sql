-- Función 1: Suma
CREATE OR REPLACE FUNCTION fn_suma_dos_numeros (
    p_num1 IN NUMBER, 
    p_num2 IN NUMBER
) 
RETURN NUMBER
AS
BEGIN
    RETURN p_num1 + p_num2;
END;
/

-- Función 2: Cadena al revés
CREATE OR REPLACE FUNCTION fn_cadena_al_reves (
    p_cadena IN VARCHAR2
) 
RETURN VARCHAR2
AS
    v_cadena_invertida VARCHAR2(32767) := '';
BEGIN
    FOR i IN REVERSE 1 .. LENGTH(p_cadena) LOOP
        v_cadena_invertida := v_cadena_invertida || SUBSTR(p_cadena, i, 1);
    END LOOP;
    RETURN v_cadena_invertida;
END;
/

-- Bloque de prueba usando ambas funciones
BEGIN
    DBMS_OUTPUT.PUT_LINE('Resultado Suma: ' || fn_suma_dos_numeros(50, 75));
    DBMS_OUTPUT.PUT_LINE('Resultado Inversión: ' || fn_cadena_al_reves('Oracle PLSQL'));
END;
/