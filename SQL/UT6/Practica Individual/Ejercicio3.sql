--Opcion 1--
CREATE OR REPLACE TRIGGER TRG_VALIDAR_PRACTICA_FINALIZADA
BEFORE INSERT OR UPDATE
ON practicas
FOR EACH ROW
BEGIN

    -- Comprobamos si la práctica se quiere finalizar
    IF :NEW.estado = 'Finalizada' THEN

        -- Validar horas realizadas
        IF :NEW.horas_realizadas IS NULL THEN
            RAISE_APPLICATION_ERROR(
                -20001,
                'ERROR: No se puede finalizar una práctica sin horas realizadas.'
            );
        END IF;

        -- Validar evaluación
        IF :NEW.evaluacion IS NULL THEN
            RAISE_APPLICATION_ERROR(
                -20002,
                'ERROR: No se puede finalizar una práctica sin evaluación.'
            );
        END IF;

    END IF;

END;

--Opcion 2--
CREATE OR REPLACE TRIGGER TRG_VALIDAR_PRACTICA_FINALIZADA
BEFORE INSERT OR UPDATE ON PRACTICAS
FOR EACH ROW
WHEN (NEW.estado = 'Finalizada')
BEGIN
    IF :NEW.horas_realizadas IS NULL THEN
        RAISE_APPLICATION_ERROR(-20001, 'Intento incorrecto sin horas');
    END IF;

    IF :NEW.evaluacion IS NULL THEN
        RAISE_APPLICATION_ERROR(-20002, 'intento incorrecto sin evaluacion');
    END IF;
END;

BEGIN
    INSERT INTO practicas (
        alumno_id, empresa_id, fecha_inicio, fecha_fin,
        horas_realizadas, evaluacion,
        tutor_empresa, tutor_instituto,
        estado, observaciones
    )
    VALUES (
        1, 1,
        TRUNC(SYSDATE)+3,
        TRUNC(SYSDATE)+93,
        NULL,
        5,
        'Juan García',
        'Ana Fernández',
        'Finalizada',
        'Comienza en pocos días'
    );
END;
