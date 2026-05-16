CREATE OR REPLACE PROCEDURE pr_dept_empleados AS
BEGIN
    FOR reg IN (
        SELECT d.dnombre, COUNT(e.emp_no) as num_empleados
        FROM departamentos d 
        LEFT JOIN empleados e ON d.dept_no = e.dept_no
        GROUP BY d.dnombre
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Departamento: ' || reg.dnombre || ' - Empleados: ' || reg.num_empleados);
    END LOOP;
END;
/