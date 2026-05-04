--Procedimiento 2--
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

--PRUEBAS--

--1--
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

--2--
DECLARE
    CURSOR clientes IS
    SELECT ID_CLIENTE, NOMBRE
    FROM CLIENTES;

    v_registro_clientes clientes%ROWTYPE;
BEGIN
    OPEN clientes;

    LOOP
        FETCH clientes INTO v_registro_clientes;
        EXIT WHEN clientes%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('El cliente' ||v_registro_clientes.ID_CLIENTE ||' de nombre ' || v_registro_clientes.NOMBRE
                            || ' tiene: '|| numero_mascotas_cliente(v_registro_clientes.ID_CLIENTE) || ' mascotas');

    END LOOP;

    CLOSE clientes;

END;