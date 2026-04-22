DECLARE 
    v_ape VARCHAR2(10);  
    v_oficio VARCHAR2(10); 
BEGIN 
    SELECT apellido, oficio INTO v_ape, v_oficio 
    FROM EMPLE WHERE EMP_NO = 7900; 
    
    DBMS_OUTPUT.PUT_LINE(v_ape||'*'||v_oficio); 
EXCEPTION 
    -- Se dispara si el EMP_NO no existe
    WHEN NO_DATA_FOUND THEN 
        RAISE_APPLICATION_ERROR(-20000,'ERROR no hay datos'); 
    -- Se dispara si la consulta devuelve más de un empleado
    WHEN TOO_MANY_ROWS THEN 
        RAISE_APPLICATION_ERROR(-20000,'ERROR demasiados datos'); 
    -- Captura cualquier otro error no especificado
    WHEN OTHERS THEN 
        RAISE_APPLICATION_ERROR(-20000,'Error en la aplicación'); 
END;