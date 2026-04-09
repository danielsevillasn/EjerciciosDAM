--1--
CREATE OR REPLACE 
PROCEDURE ver_precio(v_num_producto VARCHAR2) 
AS 
v_precio NUMBER; 
BEGIN 
SELECT precioventa INTO v_precio 
FROM productos 
WHERE codigoproducto = v_num_producto; 
DBMS_OUTPUT.PUT_LINE('Precio = '||v_precio); 
END; 
/ 
 
Procedimiento creado. 
 
EXECUTE VER_PRECIO(‘FR-15’);

--1--
CREATE OR REPLACE 
PROCEDURE modificar_precio_producto (numproducto VARCHAR2, 
nuevoprecio NUMBER) 
AS 
v_precioant NUMBER(15,2); 
BEGIN 
SELECT precioventa INTO v_precioant 
FROM productos 
WHERE codigoproducto = numproducto; 
IF (v_precioant * 0.20) > (nuevoprecio - v_precioant) THEN 
UPDATE productos SET precioventa = nuevoprecio 
WHERE codigoproducto = numproducto; 
ELSE 
DBMS_OUTPUT.PUT_LINE('Error, modificación supera 
20%'); 
END IF; 
 
EXCEPTION 
WHEN NO_DATA_FOUND THEN 
DBMS_OUTPUT.PUT_LINE('No encontrado producto '|| 
numproducto); 
END modificar_precio_producto;

--3--
CREATE OR REPLACE FUNCTION con_iva (cantidad NUMBER, tipo NUMBER 
DEFAULT 16) 
 
RETURN NUMBER 
AS 
v_resultado NUMBER (10,2) DEFAULT 0; 
BEGIN 
v_resultado := cantidad * (1 + (tipo / 100)); 
RETURN(v_resultado); 
END con_iva;

--Ejemplo1--
BEGIN DBMS_OUTPUT.PUT_LINE(con_iva(200)); END;

--Ejemplo2--
SELECT codigoproducto, precioventa, con_iva(precioventa) FROM 
productos;