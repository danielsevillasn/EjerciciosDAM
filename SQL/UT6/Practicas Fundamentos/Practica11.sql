CREATE OR REPLACE PROCEDURE pr_modificar_localidad_dept (
    p_id_dept        IN NUMBER, 
    p_nueva_localidad IN VARCHAR2
)
AS
BEGIN
    UPDATE departamentos 
    SET localidad = p_nueva_localidad 
    WHERE id_departamento = p_id_dept;
    
    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Aviso: El departamento ' || p_id_dept || ' no existe.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Localidad actualizada a "' || p_nueva_localidad || '" para el departamento ' || p_id_dept);
    END IF;
END;
/