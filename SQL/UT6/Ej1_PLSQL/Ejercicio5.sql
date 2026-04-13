BEGIN
    FOR i IN 1..100 LOOP
        DBMS_OUTPUT.PUT_LINE('Vuelta número: ' || i);
    END LOOP;
END;