BEGIN
    FOR i IN REVERSE 100..1 LOOP
        DBMS_OUTPUT.PUT_LINE('Vuelta número: ' || i);
    END LOOP;
END;