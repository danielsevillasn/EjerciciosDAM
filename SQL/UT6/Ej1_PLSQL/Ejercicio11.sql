DECLARE
    precio productis.precio%TYPE;
    registro productos%ROWTYPE;
    barato EXCEPTION;
BEGIN
    SELECT * INTO registro FROM productos WHERE NOMBRE = 'tvled';
    precio : = registro.precio;
    IF precio < 500 THEN
        RAISE barato;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RAISE_APPLICATION_ERROR (-20001, 'No se encontraron registros');
    WHEN TOO_MANY_ROWS THEN
        RAISE_APPLICATION_ERROR (-20002, 'Tu consulta devuelve más de un registro');
    WHEN barato THEN
        DBMS_OUTPUT.PUT_LINE('El artículo es muy barato');
        UPDATE productos
        SET precio = precio +100
        WHERE codigo = registro.codigo;
END;