CREATE OR REPLACE PROCEDURE pr_subir_salario_dept (
    p_dept_no NUMBER, 
    p_importe NUMBER, 
    p_porcentaje NUMBER
) AS
BEGIN
    -- La función GREATEST nos permite elegir automáticamente la subida más alta
    UPDATE empleados
    SET salario = GREATEST(salario + p_importe, salario * (1 + (p_porcentaje / 100)))
    WHERE dept_no = p_dept_no;
    
    DBMS_OUTPUT.PUT_LINE('Salarios actualizados para el dpto: ' || p_dept_no);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error en la actualización: ' || SQLERRM);
END;
/