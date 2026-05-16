DECLARE
    v_apellido Agentes.Apellido%TYPE := 'Sánchez';
    nombre Agentes.nombre%TYPE;
    identificador Agentes.identificador%TYPE;

BEGIN
    SELECT nombre INTO nombre
    FROM Agentes
    WHERE v_apellido = apellido;

    SELECT identificador INTO identificador
    FROM Agentes
    WHERE v_apellido = apellido;

    DBMS_OUTPUT.PUT_LINE('El agente'||identificador||' se llama '||nombre||' '||v_apellido);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No se encontraron registros');
    WHEN TOO_MANY_ROWS THEN
        DBMS_OUTPUT.PUT_LINE('Tu consulta devuelve más de un registro');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Codigo error: '|| SQLCODE || ' , mensaje error: ' || SQLERRM);
END;
/

DECLARE
    -- Definimos las variables para almacenar los datos recuperados
    v_apellido AGENTES.apellido%TYPE;
    v_nombre   AGENTES.nombre%TYPE;
    v_id       AGENTES.identificador%TYPE;
    
    -- Variable para el apellido a buscar (cambiar para probar)
    v_busqueda AGENTES.apellido%TYPE := 'Ramirez'; 
    v_codigo_error NUMBER;
    v_mensaje_error VARCHAR2(500);
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
        v_codigo_error := 1;
        v_mensaje_error := 'Error: Demasiados registros encontrados para el apellido ' || v_busqueda;
        INSERT INTO TEMP (numero, mensaje) 
        VALUES (v_codigo_error,v_mensaje_error);
        COMMIT;

    -- Caso General: Cualquier otro error inesperado
    WHEN OTHERS THEN
        v_codigo_error := SQLCODE;
        v_mensaje_error := SQLERRM;
        INSERT INTO TEMP (numero, mensaje) 
        VALUES (v_codigo_error, v_mensaje_error);
        COMMIT;
END;