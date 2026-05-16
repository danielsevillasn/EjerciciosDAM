CREATE OR REPLACE PROCEDURE pr_top5_salarios AS
BEGIN
    -- Empleamos una subconsulta con ROWNUM para limitar a 5 resultados
    FOR reg IN (
        SELECT apellido, salario 
        FROM (SELECT apellido, salario FROM empleados ORDER BY salario DESC)
        WHERE ROWNUM <= 5
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(reg.apellido || ' - Salario: ' || reg.salario);
    END LOOP;
END;
/