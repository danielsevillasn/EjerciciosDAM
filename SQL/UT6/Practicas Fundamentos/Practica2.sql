CREATE OR REPLACE PROCEDURE pr_cadena_al_reves (
    p_cadena IN VARCHAR2
)
AS
    v_cadena_invertida VARCHAR2(32767) := '';
BEGIN
    -- Recorremos la cadena desde el último carácter hasta el primero
    FOR i IN REVERSE 1 .. LENGTH(p_cadena) LOOP
        v_cadena_invertida := v_cadena_invertida || SUBSTR(p_cadena, i, 1);
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('Original: ' || p_cadena);
    DBMS_OUTPUT.PUT_LINE('Al revés: ' || v_cadena_invertida);
END;
/

-- Bloque de prueba
BEGIN
    pr_cadena_al_reves('Desarrollo de Aplicaciones Multiplataforma');
END;
/