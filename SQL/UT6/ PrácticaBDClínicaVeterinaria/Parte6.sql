CREATE OR REPLACE FUNCTION numero_mascotas_cliente(p_id_cliente NUMBER) 
RETURN NUMBER
AS
    contadorMascotas NUMBER := 0;
BEGIN
    SELECT COUNT(*)
    INTO contadorMascotas
    FROM MASCOTAS
    WHERE ID_CLIENTE = p_id_cliente;
    RETURN contadorMascotas;
END;

DECLARE
    CURSOR clientes IS
    SELECT ID_CLIENTE, NOMBRE
    FROM CLIENTES;
BEGIN
    FOR cliente IN clientes LOOP
        DBMS_OUTPUT.PUT_LINE('El cliente' ||cliente.ID_CLIENTE ||' de nombre ' || cliente.NOMBRE 
                            || ' tiene: '|| numero_mascotas_cliente(cliente.ID_CLIENTE) || ' mascotas');
    END LOOP;   
END;