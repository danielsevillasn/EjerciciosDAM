DECLARE
    nDiaSemana  NUMBER := TO_NUMBER(TO_CHAR(SYSDATE, 'D'));
    diaSemana  VARCHAR2(20);
BEGIN
    CASE nDiaSemana
        WHEN 1 THEN diaSemana := 'Lunes';
        WHEN 2 THEN diaSemana := 'Martes';
        WHEN 3 THEN diaSemana := 'Miércoles';
        WHEN 4 THEN diaSemana := 'Jueves';
        WHEN 5 THEN diaSemana := 'Viernes';
        WHEN 6 THEN diaSemana := 'Sábado';
        WHEN 7 THEN diaSemana := 'Domingo';
    END CASE;
    DBMS_OUTPUT.PUT_LINE('Día de la semana: ' || diaSemana);
    DBMS_OUTPUT.PUT_LINE('Número de día dentro de la semana : ' || nDiaSemana);
END;

BEGIN
    DBMS_OUTPUT.PUT_LINE('Día: ' || TO_CHAR(SYSDATE, 'DAY') || ' - Número: ' || TO_CHAR(SYSDATE, 'D'));
END;