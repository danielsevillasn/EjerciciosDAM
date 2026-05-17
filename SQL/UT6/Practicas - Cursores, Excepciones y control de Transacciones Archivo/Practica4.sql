CREATE OR REPLACE PROCEDURE pr_peor_pagados_oficio IS
    -- Cursor 1: Obtiene los oficios disponibles
    CURSOR c_oficios IS 
        SELECT DISTINCT oficio FROM empleados WHERE oficio IS NOT NULL;
        
    -- Cursor 2: Obtiene empleados de UN oficio concreto, del peor pagado al mejor
    CURSOR c_empleados_oficio (p_oficio VARCHAR2) IS
        SELECT apellido, salario 
        FROM empleados 
        WHERE oficio = p_oficio
        ORDER BY salario ASC;
        
    v_contador NUMBER;
BEGIN
    -- Recorremos cada oficio
    FOR r_oficio IN c_oficios LOOP
        v_contador := 0; -- Reiniciamos el contador para el nuevo oficio
        
        -- Recorremos los empleados de ese oficio en específico
        FOR r_emp IN c_empleados_oficio(r_oficio.oficio) LOOP
            v_contador := v_contador + 1;
            
            -- Controlamos el límite de 2 por programación
            IF v_contador <= 2 THEN
                DBMS_OUTPUT.PUT_LINE('Oficio: ' || r_oficio.oficio || ' | ' || r_emp.apellido || ' | Salario: ' || r_emp.salario);
            ELSE
                EXIT; -- Si ya mostramos 2, saltamos al siguiente oficio
            END IF;
        END LOOP;
    END LOOP;
END;
/