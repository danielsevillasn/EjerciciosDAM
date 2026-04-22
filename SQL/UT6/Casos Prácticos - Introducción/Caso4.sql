CREATE OR REPLACE TRIGGER audit_borrado_emple 
    BEFORE DELETE -- Se ejecuta JUSTO ANTES de que el borrado se complete
    ON emple 
    FOR EACH ROW -- Se ejecuta una vez por cada empleado borrado
BEGIN 
    -- :old permite acceder a los valores que tenía la fila ANTES de ser borrada [cite: 64, 65]
    DBMS_OUTPUT.PUT_LINE('BORRADO EMPLEADO' 
    || '*' ||:old.emp_no 
    ||'*'||:old.apellido); 
END;