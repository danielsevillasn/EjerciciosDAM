CREATE OR REPLACE FUNCTION fn_solo_alfabeticos (
    p_cadena IN VARCHAR2
) 
RETURN VARCHAR2
AS
BEGIN
    -- Expresión regular: '[^[:alpha:]]' busca todo aquello que NO sea una letra 
    -- (incluye vocales con tildes y la 'ñ' del idioma local configurado)
    RETURN REGEXP_REPLACE(p_cadena, '[^[:alpha:]]', ' ');
END;
/

-- Bloque de prueba
BEGIN
    DBMS_OUTPUT.PUT_LINE('Resultado: ' || fn_solo_alfabeticos('ID: 457-Abc_ñí!'));
END;
/