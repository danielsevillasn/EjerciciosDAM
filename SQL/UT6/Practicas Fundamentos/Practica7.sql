CREATE OR REPLACE FUNCTION fn_trienios_entre_fechas (
    p_fecha1 IN DATE, 
    p_fecha2 IN DATE
) 
RETURN NUMBER
AS
    v_anios_totales NUMBER;
BEGIN
    -- Reutilizamos la función de la Práctica 6
    v_anios_totales := fn_anios_completos(p_fecha1, p_fecha2);
    
    -- Un trienio equivale a 3 años completos
    RETURN TRUNC(v_anios_totales / 3);
END;
/

-- Bloque de prueba
BEGIN
    DBMS_OUTPUT.PUT_LINE('Trienios devueltos: ' || 
        fn_trienios_entre_fechas(TO_DATE('01/01/2015', 'DD/MM/YYYY'), TO_DATE('01/01/2025', 'DD/MM/YYYY')));
END;
/