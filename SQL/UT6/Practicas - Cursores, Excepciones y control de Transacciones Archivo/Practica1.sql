CREATE OR REPLACE PROCEDURE pr_empleados_alta AS
BEGIN
    -- Recorremos el cursor implícito ya ordenado por apellido
    FOR reg IN (SELECT apellido, fecha_alta FROM empleados ORDER BY apellido) LOOP
        DBMS_OUTPUT.PUT_LINE('Apellido: ' || reg.apellido || ' | Fecha de Alta: ' || reg.fecha_alta);
    END LOOP;
END;
/