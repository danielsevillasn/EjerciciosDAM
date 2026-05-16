DECLARE
    cod_err number(6);
    vnif varchar2(10);
    vnom varchar2(15);
    err_blancos EXCEPTION;
    no_hay_espacio EXCEPTION;
    PRAGMA EXCEPTION_INIT(no_hay_espacio, -1547);
BEGIN
    SELECT col1, col2 
    INTO vnif, vnom 
    FROM TEMP2;

    IF SUBSTR(vnom,1,1) <= ' ' THEN
        RAISE err_blancos;
    END IF;

    UPDATE clientes
    SET nombre = vnom 
    WHERE nif = vnif;
EXCEPTION
    WHEN err_blancos THEN
        INSERT INTO temp2(col1) VALUES ('ERR blancos');
    WHEN no_hay_espacio THEN
        INSERT INTO temp2(col1) VALUES ('ERR tablespace');
    WHEN NO_DATA_FOUND THEN
        INSERT INTO temp2(col1) VALUES ('ERR no habia datos');
    WHEN TOO_MANY_ROWS THEN
        INSERT INTO temp2(col1) VALUES ('ERdemasiados datos');
    WHEN OTHERS THEN
        cod_err := SQLCODE;
        INSERT INTO temp2(col1) VALUES (cod_err);
END;