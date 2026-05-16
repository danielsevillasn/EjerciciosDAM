CREATE OR REPLACE PROCEDURE subir_salario( num_empleado INTEGER, incremento REAL)
IS
    salario_actual REAL;
    salario_nulo EXCEPTION;
BEGIN
    SELECT salario 
    INTO salario_actual 
    FROM emple
    WHERE emp_no = num_empleado;

    IF salario_actual IS NULL THEN
        RAISE salario_nulo; -- levanta salario_nulo
    END IF;

    UPDATE emple 
    SET salario := salario + incremento
    WHERE emp_no = num_empleado;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE(num_empleado||'*Err.No encontrado');
    WHEN salario_nulo THEN
        DBMS_OUTPUT.PUT_LINE(num_empleado||'*Err. Salario nulo');
END subir_salario;