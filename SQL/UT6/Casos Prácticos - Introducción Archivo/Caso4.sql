CREATE OR REPLACE TRIGGER audit_borrado_emple 
BEFORE DELETE 
ON emple 
FOR EACH ROW 
BEGIN 
DBMS_OUTPUT.PUT_LINE('BORRADO EMPLEADO' 
|| '*' ||:old.emp_no 
||'*'||:old.apellido); 
END;