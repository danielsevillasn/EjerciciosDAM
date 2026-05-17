CREATE OR REPLACE PROCEDURE pr_subir_salario_dept (
    p_dept_no    NUMBER, 
    p_importe    NUMBER, 
    p_porcentaje NUMBER
) AS
    -- El FOR UPDATE nos permite bloquear y modificar los registros del cursor
    CURSOR c_empleados IS
        SELECT salario
        FROM empleados
        WHERE dept_no = p_dept_no
        FOR UPDATE;
        
    v_subida_fija      NUMBER;
    v_subida_porcentaje NUMBER;
    v_contador         NUMBER := 0;
BEGIN
    -- Recorremos los empleados del departamento uno a uno
    FOR reg IN c_empleados LOOP
        -- 1. Calculamos cuánto ganaría con cada opción
        v_subida_fija       := reg.salario + p_importe;
        v_subida_porcentaje := reg.salario * (1 + (p_porcentaje / 100));
        
        -- 2. Comparamos con un IF clásico cuál es mayor y actualizamos
        IF v_subida_fija > v_subida_porcentaje THEN
            UPDATE empleados 
            SET salario = v_subida_fija
            WHERE CURRENT OF c_empleados; -- Modifica exactamente la fila actual del cursor
        ELSE
            UPDATE empleados 
            SET salario = v_subida_porcentaje
            WHERE CURRENT OF c_empleados;
        END IF;
        
        v_contador := v_contador + 1;
    END LOOP;

    -- 3. Mensaje final con el resultado
    IF v_contador = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Aviso: No se encontraron empleados en el dpto ' || p_dept_no);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Salarios actualizados para ' || v_contador || ' empleados.');
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK; -- Deshace todo si hay un error para no dejar datos a medias
        DBMS_OUTPUT.PUT_LINE('Error en la actualización: ' || SQLERRM);
END;
/