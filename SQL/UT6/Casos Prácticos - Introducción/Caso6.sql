CREATE OR REPLACE 
  PROCEDURE ver_depart (numdepart NUMBER) -- Definimos el parámetro de entrada
AS 
  v_dnombre VARCHAR2(14); 
  v_localidad VARCHAR2(14); 
BEGIN 
  SELECT dnombre, loc INTO v_dnombre, v_localidad 
  FROM depart 
  WHERE dept_no = numdepart; -- Filtramos por el parámetro recibido
  
  DBMS_OUTPUT.PUT_LINE('Num depart:'||numdepart|| ' * Nombre dep:'|| v_dnombre || ' * Localidad:'||v_localidad); 
  
EXCEPTION 
  WHEN NO_DATA_FOUND THEN 
    DBMS_OUTPUT.PUT_LINE('No encontrado departamento '); 
END ver_depart;

SET SERVEROUTPUT ON
EXECUTE ver_depart(20)
--Num depart:20 * Nombre dep: INVESTIGACION * Localidad:
--MADRID
BEGIN 
  ver_depart(30); 
END;
--Num depart:30 * Nombre dep:VENTAS * Localidad: BARCELONA