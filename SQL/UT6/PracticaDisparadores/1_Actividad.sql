CREATE OR REPLACE TRIGGER trg_control_salario
BEFORE INSERT OR UPDATE OF salario ON empleados
FOR EACH ROW
BEGIN
    IF :NEW.salario < 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'El salario no puede ser negativo');
    END IF;

    IF UPDATING THEN
        IF :NEW.salario > :OLD.salario * 1.2 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Subida de salario superior al 20% no permitida');
        END IF;
    END IF;
END;

