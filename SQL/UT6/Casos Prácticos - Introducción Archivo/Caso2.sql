DECLARE 
v_ape VARCHAR2(10); 
v_oficio VARCHAR2(10); 
BEGIN 
SELECT apellido, oficio INTO v_ape, v_oficio 
FROM EMPLE WHERE EMP_NO = 7900; 
DBMS_OUTPUT.PUT_LINE(v_ape||'*'||v_oficio); 
END;