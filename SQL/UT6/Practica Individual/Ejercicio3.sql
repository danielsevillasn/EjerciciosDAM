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