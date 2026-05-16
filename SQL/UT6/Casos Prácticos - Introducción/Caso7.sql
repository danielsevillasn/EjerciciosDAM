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
 
EXECUTE VER_PRECIO('FR-15');
--Precio = 25


--2--
CREATE OR REPLACE 
PROCEDURE modificar_precio_producto (numproducto VARCHAR2, nuevoprecio NUMBER) 
AS 
    v_precioant NUMBER(15,2); 
BEGIN 
    -- Buscamos el precio actual
    SELECT precioventa INTO v_precioant 
    FROM productos 
    WHERE codigoproducto = numproducto; 
    
    -- Regla: (Nuevo - Antiguo) no puede ser mayor al 20% del Antiguo 
    IF (v_precioant * 0.20) > (nuevoprecio - v_precioant) THEN 
        UPDATE productos SET precioventa = nuevoprecio 
        WHERE codigoproducto = numproducto; 
    ELSE 
        DBMS_OUTPUT.PUT_LINE('Error, modificación supera 20%'); 
    END IF; 
    
    EXCEPTION 
    WHEN NO_DATA_FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('No encontrado producto '|| numproducto); 
END modificar_precio_producto;

EXECUTE MODIFICAR_PRECIO_PRODUCTO('FR-15',300)
--Error, modificación supera 20%

--3--
CREATE OR REPLACE FUNCTION con_iva (cantidad NUMBER, tipo NUMBER DEFAULT 16) 
-- DEFAULT 16 significa que si no pasas el IVA, usará 16 por defecto 
RETURN NUMBER 
AS 
    v_resultado NUMBER (10,2) DEFAULT 0; 
BEGIN 
    v_resultado := cantidad * (1 + (tipo / 100)); -- Fórmula matemática del IVA 
    RETURN(v_resultado); -- Las funciones SIEMPRE deben devolver un valor
END con_iva;

--Ejemplo1--
BEGIN 
    DBMS_OUTPUT.PUT_LINE(con_iva(200)); 
END;
--232

--Ejemplo2--
SELECT codigoproducto, precioventa, con_iva(precioventa) 
FROM productos;