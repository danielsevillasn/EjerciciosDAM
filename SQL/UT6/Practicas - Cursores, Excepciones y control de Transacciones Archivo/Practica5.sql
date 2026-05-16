CREATE OR REPLACE PROCEDURE pr_insertar_dept (
    p_nombre VARCHAR2, 
    p_loc VARCHAR2
) AS
    v_nuevo_num NUMBER;
BEGIN
    -- Buscamos el mayor existente y calculamos la decena siguiente
    SELECT NVL(MAX(dept_no), 0) INTO v_nuevo_num FROM departamentos;
    v_nuevo_num := TRUNC(v_nuevo_num, -1) + 10;
    
    INSERT INTO departamentos (dept_no, dnombre, loc) 
    VALUES (v_nuevo_num, p_nombre, p_loc);
    
    DBMS_OUTPUT.PUT_LINE('Insertado correctamente con ID: ' || v_nuevo_num);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error al insertar el departamento: ' || SQLERRM);
END;
/