DECLARE
    n NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('Valor: ' || n);
        n := n + 1;
        EXIT WHEN n > 100;
    END LOOP;
END;