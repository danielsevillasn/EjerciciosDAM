CREATE OR REPLACE FUNCTION fn_anios_completos (
    p_fecha1 IN DATE, 
    p_fecha2 IN DATE
) 
RETURN NUMBER
AS
BEGIN
    -- MONTHS_BETWEEN obtiene los meses; dividimos entre 12 y truncamos para obtener años enteros
    -- Usamos ABS para que no importe el orden en el que se introduzcan las fechas
    RETURN TRUNC(ABS(MONTHS_BETWEEN(p_fecha2, p_fecha1)) / 12);
END;
/

-- Bloque de prueba
BEGIN
    DBMS_OUTPUT.PUT_LINE('Años completos: ' || 
        fn_anios_completos(TO_DATE('15/05/2010', 'DD/MM/YYYY'), TO_DATE('16/05/2026', 'DD/MM/YYYY')));
END;
/