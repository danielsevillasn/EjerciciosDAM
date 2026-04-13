DECLARE
    nMultiplos NUMBER := 0;
BEGIN
    FOR i IN 1..100 LOOP
        IF MOD(i, 3) = 0 THEN
            DBMS_OUTPUT.PUT_LINE('Múltiplo: ' || i);
            nMultiplos := nMultiplos + 1;
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Numero múltiplos: ' || nMultiplos);
END;