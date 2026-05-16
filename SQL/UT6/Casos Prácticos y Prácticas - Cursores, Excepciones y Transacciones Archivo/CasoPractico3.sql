--Mediante una estructura cursor FOR…LOOP.
DECLARE
    CURSOR c_emple IS
    SELECT apellido, fecha_alt FROM emple
    ORDER BY fecha_alt;
BEGIN
    FOR v_reg_emp IN c_emple LOOP
        DBMS_OUTPUT.PUT_LINE(v_reg_emp.apellido||'*'||v_reg_emp.fecha_alt);
    END LOOP;
END;

--Utilizando un bucle WHILE.
DECLARE
    CURSOR c_emple IS
    SELECT apellido, fecha_alt FROM emple
    ORDER BY fecha_alt;
    v_reg_emp c_emple%ROWTYPE;
BEGIN
    OPEN c_emple;
    FETCH c_emple INTO v_reg_emp;
    WHILE c_emple%FOUND LOOP
        DBMS_OUTPUT.PUT_LINE(v_reg_emp.apellido||'*'||v_reg_emp.fecha_alt);
        FETCH c_emple INTO v_reg_emp;
    END LOOP;
    CLOSE c_emple;
END;

--Practica propuesta--
CREATE OR REPLACE PROCEDURE ver_emple_por_cadena_for (
    p_cadena IN VARCHAR2
)
AS
    CURSOR c_emple IS
        SELECT emp_no, apellido 
        FROM emple 
        WHERE apellido LIKE '%' || UPPER(p_cadena) || '%';
        
    v_contador NUMBER := 0; -- Contador manual necesario
BEGIN
    -- El FOR se encarga de todo el ciclo de vida del cursor de manera limpia
    FOR reg_emp IN c_emple LOOP
        DBMS_OUTPUT.PUT_LINE('Id: ' || reg_emp.emp_no || ' | Apellido: ' || reg_emp.apellido);
        v_contador := v_contador + 1;
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('------------------------------------------');
    DBMS_OUTPUT.PUT_LINE('Número total de empleados mostrados: ' || v_contador);
END;
/