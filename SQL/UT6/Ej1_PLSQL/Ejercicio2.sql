DECLARE
    n NUMBER(2):= 9;
BEGIN
    IF n > 10 THEN
    DBMS_OUTPUT.PUT_LINE('n es mayor que 10');
    ELSE
    DBMS_OUTPUT.PUT_LINE('n no es mayor que 10');
    END IF;
END;

