CREATE OR REPLACE PROCEDURE ver_emple_por_dept (dep VARCHAR2)
AS v_dept NUMBER(2);
    CURSOR c1 IS
    SELECT apellido FROM emple WHERE dept_no = v_dept;
    v_apellido VARCHAR2(10);
BEGIN
    v_dept := dep;
    OPEN c1;
    FETCH c1 INTO v_apellido;
    WHILE c1%FOUND LOOP
        DBMS_OUTPUT.PUT_LINE(v_apellido);
        FETCH c1 INTO v_apellido;
    END LOOP;
    CLOSE c1;
END;
EXECUTE ver_emple_por_dept(30);
--ARROYO
--SALA
--MARTIN
--NEGRO
--TOVAR
--JIMENO

--Practica propuesta--
CREATE OR REPLACE PROCEDURE ver_emple_por_cadena (
    p_cadena IN VARCHAR2
)
AS
    -- Usamos el parámetro formal directamente en el filtro (LIKE)
    CURSOR c_emple IS
        SELECT emp_no, apellido 
        FROM emple 
        WHERE apellido LIKE '%' || UPPER(p_cadena) || '%';
        
    v_emp_no   emple.emp_no%TYPE;
    v_apellido emple.apellido%TYPE;
    v_total    NUMBER;
BEGIN
    OPEN c_emple;
    FETCH c_emple INTO v_emp_no, v_apellido;
    
    WHILE c_emple%FOUND LOOP
        DBMS_OUTPUT.PUT_LINE('Id: ' || v_emp_no || ' | Apellido: ' || v_apellido);
        FETCH c_emple INTO v_emp_no, v_apellido;
    END LOOP;
    
    -- IMPORTANTE: Guardamos %ROWCOUNT antes de CERRAR el cursor, si no se perdería
    v_total := c_emple%ROWCOUNT;
    CLOSE c_emple;
    
    DBMS_OUTPUT.PUT_LINE('------------------------------------------');
    DBMS_OUTPUT.PUT_LINE('Número total de empleados mostrados: ' || v_total);
END;
/

-- Ejemplo de ejecución:
-EXECUTE ver_emple_por_cadena('AR');