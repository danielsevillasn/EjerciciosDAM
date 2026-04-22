DECLARE 
    v_ape VARCHAR2(10); 
    v_oficio VARCHAR2(10); 
BEGIN 
    -- Los valores obtenidos se guardan directamente en las variables locales
    SELECT apellido, oficio INTO v_ape, v_oficio 
    FROM EMPLE WHERE EMP_NO = 7900; 
    
    -- Concatenamos con '*' para visualizar el resultado
    DBMS_OUTPUT.PUT_LINE(v_ape||'*'||v_oficio); 
END;