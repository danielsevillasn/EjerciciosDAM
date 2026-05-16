DECLARE
    v_anio_actual NUMBER;
    v_anio_fijo   NUMBER;
BEGIN
    -- Prueba con la fecha del sistema (SYSDATE)
    v_anio_actual := fn_obtener_anio(SYSDATE);
    DBMS_OUTPUT.PUT_LINE('El año actual es: ' || v_anio_actual);
    
    -- Prueba con una fecha específica
    v_anio_fijo := fn_obtener_anio(TO_DATE('12/10/1492', 'DD/MM/YYYY'));
    DBMS_OUTPUT.PUT_LINE('El año del descubrimiento es: ' || v_anio_fijo);
END;
/