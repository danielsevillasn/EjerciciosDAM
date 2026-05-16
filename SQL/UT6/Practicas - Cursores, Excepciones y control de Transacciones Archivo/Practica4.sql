CREATE OR REPLACE PROCEDURE pr_peor_pagados_oficio AS
BEGIN
    -- Utilizamos la función analítica ROW_NUMBER para numerar por oficio
    FOR reg IN (
        SELECT oficio, apellido, salario
        FROM (
            SELECT oficio, apellido, salario,
                   ROW_NUMBER() OVER (PARTITION BY oficio ORDER BY salario ASC) as rn
            FROM empleados
        )
        WHERE rn <= 2
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Oficio: ' || reg.oficio || ' | ' || reg.apellido || ' | Salario: ' || reg.salario);
    END LOOP;
END;
/