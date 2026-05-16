CREATE OR REPLACE FUNCTION fn_obtener_anio (
    p_fecha IN DATE
) 
RETURN NUMBER
AS
BEGIN
    -- EXTRACT extrae componentes específicos de un tipo DATE o TIMESTAMP
    RETURN EXTRACT(YEAR FROM p_fecha);
END;
/