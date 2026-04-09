CREATE OR REPLACE 
PROCEDURE ver_depart (numdepart NUMBER) 
AS 
v_dnombre VARCHAR2(14); 
v_localidad VARCHAR2(14); 
BEGIN 
SELECT dnombre, loc INTO v_dnombre, v_localidad 
FROM depart 
WHERE dept_no = numdepart; 
DBMS_OUTPUT.PUT_LINE('Num depart:'||numdepart|| ' * 
Nombre dep:'|| v_dnombre || 
  ' * Localidad:'||v_localidad); 
EXCEPTION 
WHEN NO_DATA_FOUND THEN 
DBMS_OUTPUT.PUT_LINE('No encontrado 
departamento '); 
END ver_depart;