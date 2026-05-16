CREATE OR REPLACE PROCEDURE listar_emple
AS
    CURSOR c1 IS
    SELECT apellido, salario, dept_no FROM emple
    ORDER BY dept_no, apellido;
    vr_emp c1%ROWTYPE;
    dep_ant EMPLE.DEPT_NO%TYPE DEFAULT 0;
    cont_emple NUMBER(4) DEFAULT 0;
    sum_sal NUMBER(9,2) DEFAULT 0;
    tot_emple NUMBER(4) DEFAULT 0;
    tot_sal NUMBER(10,2) DEFAULT 0;
BEGIN
    OPEN c1;
    LOOP
        FETCH c1 INTO vr_emp;
        /* Si es el primer Fetch inicializamos dep_ant */
        IF c1%ROWCOUNT = 1 THEN
            dep_ant := vr_emp.dept_no;
        END IF;
        /* Comprobación nuevo departamento (o finalización) y resumen
        del anterior e inicialización de contadores y acumuladores parciales
        */
        IF dep_ant <> vr_emp.dept_no OR c1%NOTFOUND THEN
            DBMS_OUTPUT.PUT_LINE('*** DEPTO: ' || dep_ant ||
            ' NUM. EMPLEADOS: ' || cont_emple ||
            ' SUM. SALARIOS: ' || sum_sal);
            dep_ant := vr_emp.dept_no;
            tot_emple := tot_emple + cont_emple;
            tot_sal := tot_sal + sum_sal;
            cont_emple := 0;
            sum_sal := 0;
        END IF;
        EXIT WHEN c1%NOTFOUND;
        /* Condición de salida del bucle */
        /* Escribir Líneas de detalle incrementar y acumular */
        DBMS_OUTPUT.PUT_LINE(RPAD(vr_emp.apellido,10) || ' * '
        ||LPAD(TO_CHAR(vr_emp.salario,'999,999'),12));
        cont_emple := cont_emple + 1;
        sum_sal := sum_sal + vr_emp.salario;
    END LOOP;
    CLOSE c1;
    /* Escribir totales informe */
    DBMS_OUTPUT.PUT_LINE(' ****** NUMERO TOTAL EMPLEADOS: '
    || tot_emple || ' TOTAL SALARIOS: ' || tot_sal);
END listar_emple;

--Practica propuesta--
CREATE OR REPLACE PROCEDURE listar_emple_completo
AS
    -- El ORDER BY es crucial para que las rupturas de control agrupen bien
    CURSOR c1 IS
        SELECT apellido, salario, dept_no, oficio 
        FROM emple
        ORDER BY dept_no, oficio, apellido;
        
    -- Variables para almacenar los estados del registro anterior
    v_dep_ant    emple.dept_no%TYPE;
    v_oficio_ant emple.oficio%TYPE;
    
    -- Contadores parciales y totales
    v_cont_oficio  NUMBER(4) := 0;
    v_cont_dept    NUMBER(4) := 0;
    v_sum_sal_dept NUMBER(9,2) := 0;
    
    v_tot_emple    NUMBER(4) := 0;
    v_tot_sal      NUMBER(10,2) := 0;
    
    v_es_primero   BOOLEAN := TRUE;
BEGIN
    FOR vr_emp IN c1 LOOP
        -- Inicialización del primer registro del informe
        IF v_es_primero THEN
            v_dep_ant    := vr_emp.dept_no;
            v_oficio_ant := vr_emp.oficio;
            v_es_primero  := FALSE;
        END IF;
        
        -- 1ª RUPTURA: ¿Cambió el departamento?
        IF vr_emp.dept_no <> v_dep_ant THEN
            -- Imprimimos el último oficio del departamento que cerramos
            DBMS_OUTPUT.PUT_LINE('   -> OFICIO: ' || RPAD(v_oficio_ant, 15) || ' | EMPLEADOS: ' || v_cont_oficio);
            
            -- Imprimimos el resumen del departamento completo
            DBMS_OUTPUT.PUT_LINE('** DEPTO: ' || v_dep_ant || ' | TOTAL EMPLEADOS: ' || v_cont_dept || ' | SUMA SALARIOS: ' || v_sum_sal_dept);
            DBMS_OUTPUT.PUT_LINE('======================================================================');
            
            -- Acumulamos en totales generales
            v_tot_emple := v_tot_emple + v_cont_dept;
            v_tot_sal   := v_tot_sal + v_sum_sal_dept;
            
            -- Reiniciamos estructuras de conteo parcial
            v_cont_dept    := 0;
            v_sum_sal_dept := 0;
            v_cont_oficio  := 0;
            
            -- Seteamos los nuevos valores de control actuales
            v_dep_ant    := vr_emp.dept_no;
            v_oficio_ant := vr_emp.oficio;
            
        -- 2ª RUPTURA: Cambió el oficio pero seguimos en el mismo departamento
        ELSIF vr_emp.oficio <> v_oficio_ant THEN
            DBMS_OUTPUT.PUT_LINE('   -> OFICIO: ' || RPAD(v_oficio_ant, 15) || ' | EMPLEADOS: ' || v_cont_oficio);
            v_cont_oficio := 0;
            v_oficio_ant  := vr_emp.oficio;
        END IF;
        
        -- Línea de detalle del empleado actual
        DBMS_OUTPUT.PUT_LINE(RPAD(vr_emp.apellido, 12) || ' - ' || RPAD(vr_emp.oficio, 12) || ' - Salario: ' || LPAD(TO_CHAR(vr_emp.salario, '999,999.00'), 12));
        
        -- Incrementos en cada iteración
        v_cont_oficio  := v_cont_oficio + 1;
        v_cont_dept    := v_cont_dept + 1;
        v_sum_sal_dept := v_sum_sal_dept + vr_emp.salario;
    END LOOP;
    
    -- CIERRE DE RUPTURAS FINAL: Pintamos los remanentes del último grupo al vaciarse el cursor
    IF NOT v_es_primero THEN
        DBMS_OUTPUT.PUT_LINE('   -> OFICIO: ' || RPAD(v_oficio_ant, 15) || ' | EMPLEADOS: ' || v_cont_oficio);
        DBMS_OUTPUT.PUT_LINE('** DEPTO: ' || v_dep_ant || ' | TOTAL EMPLEADOS: ' || v_cont_dept || ' | SUMA SALARIOS: ' || v_sum_sal_dept);
        DBMS_OUTPUT.PUT_LINE('======================================================================');
        
        v_tot_emple := v_tot_emple + v_cont_dept;
        v_tot_sal   := v_tot_sal + v_sum_sal_dept;
    END IF;
    
    -- Totales del informe global
    DBMS_OUTPUT.PUT_LINE('****** NUMERO TOTAL EMPLEADOS GLOBAL: ' || v_tot_emple || ' | TOTAL SALARIOS INFORME: ' || v_tot_sal);
END;
/