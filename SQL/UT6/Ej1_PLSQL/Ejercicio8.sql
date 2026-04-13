DECLARE
    nAleatorio NUMBER;
    contador NUMBER := 0;
    nMaximo NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 11));
    suma NUMBER := 0;
BEGIN
    LOOP
        nAleatorio := TRUNC(DBMS_RANDOM.VALUE(10, 101));
        contador := contador +1;
        suma := suma+nAleatorio;
        DBMS_OUTPUT.PUT_LINE('Valor'||nAleatorio);
        EXIT WHEN contador >= nMaximo;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Suma total: '||suma);
    DBMS_OUTPUT.PUT_LINE('Cantidad de iteraciones: ' || nMaximo);
END;
