CREATE OR REPLACE PROCEDURE pr_empleados_alta AS
    CURSOR c_empleados IS
    SELECT apellido, fecha_alta 
    FROM empleados 
    ORDER BY apellido;
BEGIN
    -- Recorremos el cursor implícito ya ordenado por apellido
    FOR reg IN c_empleados LOOP
        DBMS_OUTPUT.PUT_LINE('Apellido: ' || reg.apellido || ' | Fecha de Alta: ' || reg.fecha_alta);
    END LOOP;
END;
/