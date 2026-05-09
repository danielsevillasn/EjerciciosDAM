DECLARE
    -- Definimos las variables para almacenar los datos recuperados
    v_apellido AGENTES.apellido%TYPE;
    v_nombre   AGENTES.nombre%TYPE;
    v_id       AGENTES.identificador%TYPE;
    
    -- Variable para el apellido a buscar (cambiar para probar)
    v_busqueda AGENTES.apellido%TYPE := 'Ramirez'; 
BEGIN
    -- Intentamos recuperar los datos del agente
    SELECT apellido, nombre, identificador
    INTO v_apellido, v_nombre, v_id
    FROM AGENTES
    WHERE apellido = v_busqueda;

    -- Si se encuentra un registro único, imprimimos los datos
    DBMS_OUTPUT.PUT_LINE('Agente encontrado:');
    DBMS_OUTPUT.PUT_LINE('ID: ' || v_id || ' | Nombre: ' || v_nombre || ' | Apellido: ' || v_apellido);

EXCEPTION
    -- Caso 1: No se encuentra ningún registro
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No se encontraron registros');

    -- Caso 2: Se encuentra más de un registro con el mismo apellido
    WHEN TOO_MANY_ROWS THEN
        -- Según la instrucción, "cualquier otra excepción" se inserta en TEMP
        -- TOO_MANY_ROWS entra en esta categoría técnica según tus puntos
        INSERT INTO TEMP (col_error) 
        VALUES ('Error: Demasiados registros encontrados para el apellido ' || v_busqueda);
        COMMIT;

    -- Caso General: Cualquier otro error inesperado
    WHEN OTHERS THEN
        INSERT INTO TEMP (col_error) 
        VALUES ('Código Error: ' || SQLCODE || ' - Mensaje: ' || SQLERRM);
        COMMIT;
END;