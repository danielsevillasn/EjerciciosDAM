CREATE OR REPLACE FUNCTION devolverResultado (e_LOCAL VARCHAR2, e_VISITANTE VARCHAR2)
RETURN VARCHAR2(500)
AS 
    v_contador NUMBER := 0;
    g_LOCAL NUMBER := 0;
    g_VISITANTE NUMBER := 0;
    diferenciaGoles NUMBER := 0;

    equipoNoExiste EXCEPTION;
    noexistePartido EXCEPTION;
BEGIN
    SELECT COUNT(*) INTO v_contador 
    FROM EQUIPOS 
    WHERE EQUIPO IN (e_LOCAL, e_VISITANTE);

    IF v_contador < 2 THEN
        RAISE equipoNoExiste;
    END IF;

    v_contador := 0;

    SELECT COUNT(*) INTO v_contador
    FROM RESULTADOS
    WHERE EQUIPO_LOCAL = e_LOCAL AND EQUIPO_VISITANTE = e_VISITANTE;

    IF v_contador > 0 THEN
        SELECT GOLES_LOCAL, GOLES_VISITANTE
        INTO g_LOCAL, g_VISITANTE
        FROM RESULTADOS
        WHERE EQUIPO_LOCAL = e_LOCAL AND EQUIPO_VISITANTE = e_VISITANTE;


        IF g_LOCAL > g_VISITANTE THEN
            diferenciaGoles := g_LOCAL-g_VISITANTE;
            RETURN ('El equipo ' || e_LOCAL || ' ganó al equipo ' || e_VISITANTE || ' por ' || diferenciaGoles || ' goles');
        ELSIF g_VISITANTE > g_LOCAL THEN
            diferenciaGoles := g_VISITANTE-g_LOCAL;
            RETURN ('El equipo ' || e_VISITANTE || ' ganó al equipo ' || e_LOCAL || ' por ' || diferenciaGoles || ' goles');
        ELSE
            RETURN ('El equipo ' || e_LOCAL || ' y el equipo ' || e_VISITANTE || ' empataron a ' || g_LOCAL || ' goles');
        END IF;
    ELSE
        RAISE noexistePartido;
    END IF;
EXCEPTION
    WHEN equipoNoExiste THEN
        RETURN ('Alguno de los equipos no existe.');
    WHEN noexistePartido THEN 
        RETURN ('Ese partido no se ha jugado.');
    WHEN OTHERS THEN
        RETURN ('El error ' || SQLCODE || ', de mensaje: ' || SQLERRM);
END;



