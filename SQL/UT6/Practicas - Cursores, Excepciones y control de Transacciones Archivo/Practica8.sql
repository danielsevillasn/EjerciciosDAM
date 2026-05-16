CREATE OR REPLACE PROCEDURE pr_liquidacion_pantalla AS
    v_trienios NUMBER;
    v_comp_resp NUMBER;
    v_comision NUMBER;
    v_total NUMBER;
BEGIN
    FOR reg IN (SELECT emp_no, apellido, dept_no, oficio, salario, fecha_alta, comision FROM empleados ORDER BY apellido) LOOP
        -- Cálculo de los Trienios (meses / 36 meses = años completos en grupos de 3)
        v_trienios := TRUNC(MONTHS_BETWEEN(SYSDATE, reg.fecha_alta) / 36) * 50;
        
        -- Cálculo del complemento por responsabilidad
        SELECT COUNT(*) * 100 INTO v_comp_resp FROM empleados WHERE dir = reg.emp_no;
        
        -- Tratamiento de comisión nula
        v_comision := NVL(reg.comision, 0);
        
        -- Total final
        v_total := reg.salario + v_trienios + v_comp_resp + v_comision;

        -- Impresión con el formato exacto requerido
        DBMS_OUTPUT.PUT_LINE('**********************************');
        DBMS_OUTPUT.PUT_LINE('Liquidacion del empleado: ' || reg.apellido);
        DBMS_OUTPUT.PUT_LINE('Dpto: ' || reg.dept_no);
        DBMS_OUTPUT.PUT_LINE('Oficio: ' || reg.oficio);
        DBMS_OUTPUT.PUT_LINE('Salario: ' || reg.salario);
        DBMS_OUTPUT.PUT_LINE('Trienios: ' || v_trienios);
        DBMS_OUTPUT.PUT_LINE('Comp. responsabilidad: ' || v_comp_resp);
        DBMS_OUTPUT.PUT_LINE('Comision: ' || v_comision);
        DBMS_OUTPUT.PUT_LINE('**********************************');
        DBMS_OUTPUT.PUT_LINE('Total: ' || v_total);
        DBMS_OUTPUT.PUT_LINE('**********************************');
    END LOOP;
END;
/