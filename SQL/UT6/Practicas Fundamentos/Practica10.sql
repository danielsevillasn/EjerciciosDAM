CREATE OR REPLACE PROCEDURE pr_borrar_empleado (
    p_id_empleado IN NUMBER
)
AS
BEGIN
    DELETE FROM empleados 
    WHERE id_empleado = p_id_empleado;
    
    -- SQL%ROWCOUNT comprueba si la última sentencia SQL modificó registros
    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Aviso: No existe ningún empleado con el código ' || p_id_empleado);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Empleado ' || p_id_empleado || ' eliminado con éxito.');
    END IF;
END;
/