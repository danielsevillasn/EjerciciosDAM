SET SERVEROUTPUT ON;

DECLARE
    -- Cursor para obtener todos los resultados
    CURSOR c_partidos IS
        SELECT equipo_local, goles_local, equipo_visitante, goles_visitante
        FROM RESULTADOS;
        
    -- Variables para puntos y resultados de cada equipo en el partido
    v_puntos_loc INTEGER;
    v_puntos_vis INTEGER;
    v_gan_loc INTEGER; v_emp_loc INTEGER; v_per_loc INTEGER;
    v_gan_vis INTEGER; v_emp_vis INTEGER; v_per_vis INTEGER;

BEGIN
    -- Limpiamos la tabla de clasificación antes de empezar por si acaso tiene datos previos
    UPDATE CLASIFICACION 
    SET ganados = 0, empatados = 0, perdidos = 0, goles_favor = 0, goles_contra = 0, puntos = 0;

    FOR r_partido IN c_partidos LOOP
        -- Inicializamos valores para el partido actual
        v_gan_loc := 0; v_emp_loc := 0; v_per_loc := 0;
        v_gan_vis := 0; v_emp_vis := 0; v_per_vis := 0;
        
        -- Lógica de puntos (3 victoria, 1 empate, 0 derrota)
        IF r_partido.goles_local > r_partido.goles_visitante THEN
            v_puntos_loc := 3; v_puntos_vis := 0;
            v_gan_loc := 1;    v_per_vis := 1;
        ELSIF r_partido.goles_local < r_partido.goles_visitante THEN
            v_puntos_loc := 0; v_puntos_vis := 3;
            v_per_loc := 1;    v_gan_vis := 1;
        ELSE
            v_puntos_loc := 1; v_puntos_vis := 1;
            v_emp_loc := 1;    v_emp_vis := 1;
        END IF;

        -- Actualizar Equipo Local
        UPDATE CLASIFICACION
        SET ganados = ganados + v_gan_loc,
            empatados = empatados + v_emp_loc,
            perdidos = perdidos + v_per_loc,
            goles_favor = goles_favor + r_partido.goles_local,
            goles_contra = goles_contra + r_partido.goles_visitante,
            puntos = puntos + v_puntos_loc
        WHERE equipo = r_partido.equipo_local;

        -- Actualizar Equipo Visitante
        UPDATE CLASIFICACION
        SET ganados = ganados + v_gan_vis,
            empatados = empatados + v_emp_vis,
            perdidos = perdidos + v_per_vis,
            goles_favor = goles_favor + r_partido.goles_visitante,
            goles_contra = goles_contra + r_partido.goles_local,
            puntos = puntos + v_puntos_vis
        WHERE equipo = r_partido.equipo_visitante;
        
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Proceso finalizado: Tabla de clasificación actualizada.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error en el proceso: ' || SQLERRM);
END;