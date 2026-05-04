CREATE OR REPLACE TRIGGER trg_multi_evento
--Antes de hacer un insert o un update o un delete en empleados
BEFORE INSERT OR UPDATE OR DELETE ON empleados
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO auditoria VALUES (DEFAULT, 'INSERT', 'Insertado ' ||
        :NEW.nombre, SYSDATE);

    ELSIF UPDATING THEN
        INSERT INTO auditoria VALUES (DEFAULT, 'UPDATE', 'Actualizado ' ||
        :OLD.nombre, SYSDATE);

    ELSIF DELETING THEN
        INSERT INTO auditoria VALUES (DEFAULT, 'DELETE', 'Eliminado ' ||
:OLD.nombre, SYSDATE);
    END IF;
END;

--Prueba--
UPDATE empleados
SET salario = salario+1;

INSERT INTO empleados VALUES (5, 'Pepe', 1500, 1, SYSDATE);

DELETE FROM empleados
WHERE NOMBRE LIKE 'Pepe';
