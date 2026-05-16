DECLARE
    nombreProducto Productos.Nombre%TYPE := 'tv3D';
    stock Productos.CantidadEnStock%TYPE;
    precio NUMBER;
BEGIN
    SELECT CantidadEnStock INTO STOCK
    FROM Productos
    WHERE Nombre = nombreProducto;

    DBMS_OUTPUT.PUT_LINE('La cantidad de stock es de: ' || stock);

    SELECT Precio INTO precio
    FROM Productos
    WHERE Nombre = nombreProducto;

    IF precio < 500 THEN
        UPDATE Productos
        SET PRECIO = PRECIO + 100
        WHERE Nombre = nombreProducto;
        DBMS_OUTPUT.PUT_LINE('Precio del producto' || nombreProducto || ' actualizado correctamente');
    END IF;
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
    precio productos.precio%TYPE;
    registro productos%ROWTYPE;
    barato EXCEPTION;
BEGIN
    SELECT * 
    INTO registro 
    FROM productos WHERE NOMBRE = 'tvled';
    precio := registro.precio;
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