DECLARE
    v_n NUMBER := 1;
BEGIN
    WHILE v_n <= 100 LOOP
        DBMS_OUTPUT.PUT_LINE('Valor: ' || v_n);
        v_n := v_n + 1;
    END LOOP;
END;