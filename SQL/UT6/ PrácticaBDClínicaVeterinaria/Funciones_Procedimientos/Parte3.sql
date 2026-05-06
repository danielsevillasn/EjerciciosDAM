--1 OPCION--
CREATE OR REPLACE PROCEDURE listar_historial_mascota(p_id_cliente NUMBER, p_id_mascota NUMBER)
AS
    CURSOR c_historial IS
        SELECT CI.FECHA_CITA, CI.MOTIVO, R.TEXTO AS RECOMENDACION, D.DESCRIPCION AS DIAGNOSTICO
        FROM CITAS CI
        LEFT JOIN RECOMENDACIONES R
            ON CI.ID_CLIENTE = R.ID_CLIENTE AND CI.ID_MASCOTA = R.ID_MASCOTA AND CI.FECHA_CITA = R.FECHA_CITA
        LEFT JOIN DIAGNOSTICOS D
            ON CI.ID_CLIENTE = D.ID_CLIENTE AND CI.ID_MASCOTA = D.ID_MASCOTA AND CI.FECHA_CITA = D.FECHA_CITA
        WHERE CI.ID_CLIENTE = p_id_cliente AND CI.ID_MASCOTA = p_id_mascota;
BEGIN
    FOR reg IN c_historial LOOP
        DBMS_OUTPUT.PUT_LINE('Cita: ');
        DBMS_OUTPUT.PUT_LINE('Fecha cita: ' || reg.FECHA_CITA);
        DBMS_OUTPUT.PUT_LINE('Motivo: ' || reg.MOTIVO);
        DBMS_OUTPUT.PUT_LINE('Recomendacion: ' || NVL(reg.RECOMENDACION, 'Sin recomendaciones'));
        DBMS_OUTPUT.PUT_LINE('Diagnostico: ' || NVL(reg.DIAGNOSTICO, 'Sin diagnostico'));
    END LOOP;
END;

--2 OPCION--
CREATE OR REPLACE PROCEDURE listar_historial_mascota(p_id_cliente NUMBER, p_id_mascota NUMBER)
AS
    CURSOR c_historial IS
        SELECT CI.FECHA_CITA, NVL(D.DESCRIPCION, 'No se ha registrado diagnóstico') AS DIAGNOSTICO , NVL(R.TEXTO,'No se ha registrado recomendación') AS RECOMENDACION
        FROM CITAS CI
        LEFT JOIN RECOMENDACIONES R
            ON CI.ID_CLIENTE = R.ID_CLIENTE AND CI.ID_MASCOTA = R.ID_MASCOTA AND CI.FECHA_CITA = R.FECHA_CITA
        LEFT JOIN DIAGNOSTICOS D
            ON CI.ID_CLIENTE = D.ID_CLIENTE AND CI.ID_MASCOTA = D.ID_MASCOTA AND CI.FECHA_CITA = D.FECHA_CITA
        WHERE CI.ID_CLIENTE = p_id_cliente AND CI.ID_MASCOTA = p_id_mascota;
    
    v_registro c_historial%ROWTYPE;

    v_nombre_mascota MASCOTAS.NOMBRE%TYPE;
    v_nombre_cliente CLIENTES.NOMBRE%TYPE;

BEGIN
    SELECT NOMBRE INTO v_nombre_mascota
    FROM MASCOTAS
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota;

    SELECT NOMBRE INTO v_nombre_cliente
    FROM CLIENTES
    WHERE ID_CLIENTE = p_id_cliente;

    DBMS_OUTPUT.PUT_LINE('---HISTORIAL---');
    DBMS_OUTPUT.PUT_LINE('Mascota: '|| v_nombre_mascota || ' | Cliente: ' || v_nombre_cliente);

    OPEN c_historial;

    LOOP
        FETCH c_historial INTO v_registro; --Introduce los valores del cursor en una variable
        EXIT WHEN c_historial%NOTFOUND; --Sale del bucle cuando no se encuentre un valor a la hora de extraer de la variable

        DBMS_OUTPUT.PUT_LINE('FECHA: ' || v_registro.FECHA_CITA || ' | DIAGNOSTICO: ' || v_registro.DIAGNOSTICO || ' | RECOMENDACION: ' || v_registro.RECOMENDACION);
    END LOOP;

    CLOSE c_historial;
EXCEPTION
    WHEN NO_DATA_FOUND THEN --Cuando no encuentre un id de mascota o de cliente
        DBMS_OUTPUT.PUT_LINE('Cliente o mascota no encontrado');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLCODE || '-' || SQLERRM); --Lanza el codigo de la excepcion y su respectiva descripcion
        RAISE; --Se lanza otra vez la excepcion para que codigos de mayor nivel lo controlen (opcional)
END;

--PRUEBAS--

--1--
EXEC listar_historial_mascota(3, 1);

--2--
DECLARE
    mascota NUMBER := 1;
    cliente NUMBER := 1;
BEGIN
    listar_historial_mascota(cliente,mascota);
END;

--3--
BEGIN
    listar_historial_mascota(5,1);
    listar_historial_mascota(3,3);
    listar_historial_mascota(3,2);
END;