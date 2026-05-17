CREATE OR REPLACE PROCEDURE pr_top5_salarios AS
    CURSOR c_empleados_MayorSalario IS 
    SELECT apellido, salario 
    FROM (SELECT apellido, salario FROM empleados ORDER BY salario DESC)
    WHERE ROWNUM <= 5
BEGIN
    -- Empleamos una subconsulta con ROWNUM para limitar a 5 resultados
    FOR reg IN c_empleados_MayorSalario LOOP
        DBMS_OUTPUT.PUT_LINE(reg.apellido || ' - Salario: ' || reg.salario);
    END LOOP;
END;
/