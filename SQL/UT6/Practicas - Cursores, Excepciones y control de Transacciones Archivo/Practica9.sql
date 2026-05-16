-- Creación de la tabla
CREATE TABLE T_liquidacion (
    apellido VARCHAR2(50),
    departamento NUMBER(2),
    oficio VARCHAR2(50),
    salario NUMBER(9,2),
    trienios NUMBER(9,2),
    comp_responsabilidad NUMBER(9,2),
    comision NUMBER(9,2),
    total NUMBER(10,2)
);

-- Procedimiento modificado
CREATE OR REPLACE PROCEDURE pr_generar_liquidacion AS
    v_trienios NUMBER;
    v_comp_resp NUMBER;
    v_comision NUMBER;
    v_total NUMBER;
BEGIN
    FOR reg IN (SELECT emp_no, apellido, dept_no, oficio, salario, fecha_alta, comision FROM empleados) LOOP
        v_trienios := TRUNC(MONTHS_BETWEEN(SYSDATE, reg.fecha_alta) / 36) * 50;
        SELECT COUNT(*) * 100 INTO v_comp_resp FROM empleados WHERE dir = reg.emp_no;
        v_comision := NVL(reg.comision, 0);
        v_total := reg.salario + v_trienios + v_comp_resp + v_comision;

        INSERT INTO T_liquidacion VALUES (
            reg.apellido, reg.dept_no, reg.oficio, reg.salario, 
            v_trienios, v_comp_resp, v_comision, v_total
        );
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Liquidaciones insertadas en la tabla con éxito.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error general. Proceso cancelado: ' || SQLERRM);
END;
/