CREATE OR REPLACE TRIGGER trg_control_salario
BEFORE UPDATE OF salario ON empleados
FOR EACH ROW
BEGIN
    --Si el nuevo salario es menor que el salario anterior entonces lanza una excepcion
    IF :NEW.salario < :OLD.salario THEN
        RAISE_APPLICATION_ERROR(-20002, 'No se puede bajar el salario');
    END IF;
END;

--Prueba--
UPDATE empleados SET salario = 1500 WHERE id_empleado = 1;