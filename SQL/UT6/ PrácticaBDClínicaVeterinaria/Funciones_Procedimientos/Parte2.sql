--1--
CREATE OR REPLACE PROCEDURE registrar_diagnostico (p_id_cliente NUMBER, p_id_mascota NUMBER, p_fecha_cita DATE, p_descripcion VARCHAR2)
AS
    comprobador NUMBER;
BEGIN
    SELECT COUNT(*)
    INTO comprobador
    FROM CITAS
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita AND DESCRIPCION = p_descripcion;

    IF comprobador = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No existe esa cita');
    ELSE
        SELECT COUNT(*)
        FROM DIAGNOSTICOS
        WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita AND DESCRIPCION = p_descripcion
        INTO comprobador;
        IF comprobador = 0 THEN
            INSERT INTO DIAGNOSTICOS
            VALUES(p_id_cliente,p_id_mascota,p_fecha_cita,p_descripcion );
            DBDMS_OUTPUT.PUT_LINE('Datos registrados en en diagnosticos');
        ELSE
            DBDMS_OUTPUT.PUT_LINE('Registro duplicado');
        END IF;
    END IF;
END;

--2--
CREATE OR REPLACE PROCEDURE registrar_diagnostico (p_id_cliente NUMBER, p_id_mascota NUMBER, p_fecha_cita DATE, p_descripcion VARCHAR2)
AS
    existe_cita NUMBER := -1;
    existe_diagnostico NUMBER :=-1;

    excepcion_cita EXCEPTION;
    excepcion_diagnostico EXCEPTION;

BEGIN
    SELECT COUNT(*) INTO existe_cita
    FROM CITAS
    WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

    IF existe_cita > 0 THEN
        SELECT COUNT(*) INTO existe_diagnostico
        FROM DIAGNOSTICOS
        WHERE ID_CLIENTE = p_id_cliente AND ID_MASCOTA = p_id_mascota AND FECHA_CITA = p_fecha_cita;

        IF existe_diagnostico = 0 THEN
            INSERT INTO DIAGNOSTICOS (ID_CLIENTE,ID_MASCOTA,FECHA_CITA,DESCRIPCION)
            VALUES(p_id_cliente,p_id_mascota,p_fecha_cita,p_descripcion );
        ELSE
            RAISE excepcion_diagnostico;
        END IF;
    ELSE
        RAISE excepcion_cita;
    END IF;
EXCEPTION
    WHEN excepcion_cita THEN
        DBMS_OUTPUT.PUT_LINE('No existe esa cita');
    WHEN excepcion_diagnostico THEN
        DBMS_OUTPUT.PUT_LINE('Registro duplicado');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Ha ocurrido otro error: '||SQLCODE ||'y' || SQLERR );
        RAISE;
END;

--PRUEBA--
DECLARE
    --VARIABLES PARA CITA QUE EXISTE Y NO TIENE DIAGNÓSTICO
    v_id_cliente1 CITAS.ID_CLIENTE%TYPE := 1;
    v_id_mascota1 CITAS.ID_MASCOTA%TYPE := 1;
    v_fecha_cita1 CITAS.FECHA_CITA%TYPE := TO_DATE('15/01/2024', 'DD/MM/YYYY');

    --VARIABLES PARA CITA QUE EXISTE Y SÍ TIENE DIAGNÓSTICO
    v_id_cliente2 CITAS.ID_CLIENTE%TYPE := 2;
    v_id_mascota2 CITAS.ID_MASCOTA%TYPE := 1;
    v_fecha_cita2 CITAS.FECHA_CITA%TYPE := TO_DATE('20/01/2024', 'DD/MM/YYYY');

    --VARIABLES PARA CITA QUE NO EXISTE
    v_id_cliente3 CITAS.ID_CLIENTE%TYPE := 1;
    v_id_mascota3 CITAS.ID_MASCOTA%TYPE := 2;
    v_fecha_cita3 CITAS.FECHA_CITA%TYPE := TO_DATE('20/04/2026', 'DD/MM/YYYY');

    registro_valido DIAGNOSTICOS%ROWTYPE;
    registro_invalido DIAGNOSTICOS%ROWTYPE;

BEGIN
    -- CASO 1: VARIABLES PARA CITA QUE EXISTE Y NO TIENE DIAGNÓSTICO
    BEGIN
        registrar_diagnostico(v_id_cliente1, v_id_mascota1, v_fecha_cita1, 'Todo ha ido bien.');
        DBMS_OUTPUT.PUT_LINE('Caso 1: OK');
    EXCEPTION
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Caso 1 ERROR: ' || SQLERRM);
    END;

    -- CASO 2: VARIABLES PARA CITA QUE EXISTE Y SÍ TIENE DIAGNÓSTICO
    BEGIN
        registrar_diagnostico(v_id_cliente2, v_id_mascota2, v_fecha_cita2, 'Todo ha ido bien.');
        DBMS_OUTPUT.PUT_LINE('Caso 2: OK');
    EXCEPTION
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Caso 2 ERROR: ' || SQLERRM);
    END;

    -- CASO 3: VARIABLES PARA CITA QUE NO EXISTE
    BEGIN
        registrar_diagnostico(v_id_cliente3, v_id_mascota3, v_fecha_cita3, 'Todo ha ido bien.');
        DBMS_OUTPUT.PUT_LINE('Caso 3: OK');
    EXCEPTION
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Caso 3 ERROR: ' || SQLERRM);
    END;
END;
