/*Crea una función DEVOLVER_RESULTADO que, dados dos equipos (Local, Visitante),
devuelva el resultado de la siguiente forma: “El equipo X ganó al equipo Y por Z goles
o El equipo X y el equipo Y empataron a Z goles”. Maneja las excepciones:
- “Alguno de los equipos no existe.”
- “Ese partido no se ha jugado.”*/

--Funcion 1--
CREATE OR REPLACE FUNCTION DEVOLVER_RESULTADO(E_LOCAL VARCHAR2, E_VISITANTE VARCHAR2)
RETURN VARCHAR2
AS

    V_E_LOCAL RESULTADOS.EQUIPO_LOCAL%TYPE;
    V_E_VISITANTE RESULTADOS.EQUIPO_VISITANTE%TYPE;
    V_E_G_LOCAL RESULTADOS.GOLES_LOCAL%TYPE;
    V_E_G_VISITANTE RESULTADOS.GOLES_VISITANTE%TYPE;

    EXISTE_LV EQUIPOS.EQUIPO%TYPE;
    SALIDA NUMBER := 0;

    RESPUESTA VARCHAR2(200);

    NO_EXISTE EXCEPTION;
    PRAGMA EXCEPTION_INIT(NO_EXISTE, -2291); -- Asociación de la excepción NO_EXISTE con el código de error -2291

BEGIN

    SELECT EQUIPO INTO EXISTE_LV FROM EQUIPOS WHERE EQUIPO = E_LOCAL;
    SELECT EQUIPO INTO EXISTE_LV FROM EQUIPOS WHERE EQUIPO = E_VISITANTE;

    SALIDA := 1; --LOS EQUIPOS SÍ EXISTEN

    SELECT * INTO V_E_LOCAL, V_E_G_LOCAL, V_E_VISITANTE, V_E_G_VISITANTE FROM RESULTADOS
    WHERE EQUIPO_LOCAL = E_LOCAL AND EQUIPO_VISITANTE = E_VISITANTE;

    IF V_E_G_LOCAL > V_E_G_VISITANTE THEN
        RESPUESTA := 'EL '||V_E_LOCAL||' GANÓ AL '||V_E_VISITANTE||' POR '||(V_E_G_LOCAL-V_E_G_VISITANTE)||' GOLES'; 
        RETURN RESPUESTA;
    END IF;
    IF V_E_G_LOCAL < V_E_G_VISITANTE THEN
        RESPUESTA := 'EL '||V_E_VISITANTE||' GANÓ AL '||V_E_LOCAL||' POR '||(V_E_G_VISITANTE-V_E_G_LOCAL)||' GOLES';
        RETURN RESPUESTA;
    END IF;
    IF V_E_G_LOCAL = V_E_G_VISITANTE THEN
        RESPUESTA := 'EL '||V_E_VISITANTE||' Y EL '||V_E_LOCAL||' EMPATARON A '||V_E_G_VISITANTE||' GOLES';
        RETURN RESPUESTA;
    END IF;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            IF SALIDA = 0 THEN
                RESPUESTA := 'Alguno de los equipos no existe.';
                RETURN RESPUESTA;
            END IF;
            IF SALIDA = 1 THEN
                RESPUESTA := 'ESE PARTIDO NO SE HA JUGADO';
                RETURN RESPUESTA;
            END IF;
END;
/

--Funcion 2--
CREATE OR REPLACE FUNCTION DEVOLVER_RESULTADO (p_EQUIPO_LOCAL VARCHAR2, p_EQUIPO_VISITANTE VARCHAR2)
RETURN VARCHAR2
AS
    v_validacion_equipo_local NUMBER := 0;
    v_validacion_equipo_visitante NUMBER := 0;
    v_goles_local NUMBER;
    v_goles_visitante NUMBER;
    v_diferencia_goles NUMBER;

    e_no_existe_equipo EXCEPTION;
BEGIN
    SELECT COUNT(*) INTO v_conteo_equipos
    FROM CLASIFICACION
    WHERE EQUIPO IN (p_EQUIPO_LOCAL, p_EQUIPO_VISITANTE);

    IF v_conteo_equipos < 2 THEN
        RAISE e_no_existe_equipo;
    END IF;

    IF v_validacion_equipo_local = 0 THEN
        RAISE e_no_existe_equipo;
    ELSIF v_validacion_equipo_visitante = 0 THEN
        RAISE e_no_existe_equipo;
    ELSE 
        SELECT GOLES_LOCAL, GOLES_VISITANTE INTO v_goles_local, v_goles_visitante
        FROM RESULTADOS
        WHERE EQUIPO_LOCAL = p_EQUIPO_LOCAL AND EQUIPO_VISITANTE = p_EQUIPO_VISITANTE;

        IF v_goles_local > v_goles_visitante THEN
            v_diferencia_goles := v_goles_local - v_goles_visitante;
            RETURN 'El equipo '||p_EQUIPO_LOCAL||' ganó al equipo '||p_EQUIPO_VISITANTE||' por '||v_diferencia_goles ||' goles';
        ELSIF v_goles_visitante > v_goles_local THEN
            v_diferencia_goles := v_goles_visitante - v_goles_local;
            RETURN 'El equipo '||p_EQUIPO_VISITANTE||' ganó al equipo '||p_EQUIPO_LOCAL||' por '||v_diferencia_goles ||' goles';
        ELSE
            RETURN 'El equipo '||p_EQUIPO_LOCAL||' y el equipo '|| p_EQUIPO_VISITANTE ||' empataron a '|| v_goles_local || ' goles';
        END IF;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 'Ese partido no se ha jugado.”';
    WHEN e_no_existe_equipo THEN
        RETURN 'Alguno de los equipos no existe.';
    WHEN OTHERS THEN 
        RETURN 'Codigo de error ' || SQLCODE || ', mensaje de error: '||SQLERRM;
END;
/

--EJECUTAR LA FUNCIÓN

BEGIN
    DBMS_OUTPUT.PUT_LINE(DEVOLVER_RESULTADO('EQUIPO E', 'EQUIPO I'));--EL PRIMER EQUIPO ES EL GANADOR
    DBMS_OUTPUT.PUT_LINE(DEVOLVER_RESULTADO('EQUIPO B', 'EQUIPO C'));--EL SEGUNDO EQUIPO ES EL GANADOR
    DBMS_OUTPUT.PUT_LINE(DEVOLVER_RESULTADO('EQUIPO D', 'EQUIPO J'));--LOS EQUIPOS HAN EMPATADO
    DBMS_OUTPUT.PUT_LINE(DEVOLVER_RESULTADO('EQUIPO X', 'EQUIPO A'));--NO EXISTE EL PRIMER EQUIPO
    DBMS_OUTPUT.PUT_LINE(DEVOLVER_RESULTADO('EQUIPO A', 'EQUIPO Y'));--NO EXISTE EL SEGUNDO EQUIPO
    DBMS_OUTPUT.PUT_LINE(DEVOLVER_RESULTADO('EQUIPO B', 'EQUIPO A'));--NO EXISTE ESE PARTIDO
END;
