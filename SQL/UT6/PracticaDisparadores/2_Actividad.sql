CREATE OR REPLACE TRIGGER trg_auditoria_empleados
AFTER INSERT OR UPDATE OR DELETE ON empleados
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO auditoria (accion, descripcion, fecha)
        VALUES ('INSERT', 'Empleado creado: ' || :NEW.nombre || ' (ID=' || :NEW.id_empleado || ')',
        SYSDATE);
    ELSIF UPDATING THEN
        INSERT INTO auditoria (accion, descripcion, fecha)
        VALUES ('UPDATE', 'Empleado: ' || :OLD.nombre || ' salario:' || :OLD.salario || ' -> ',
        NEW.salario);
    ELSIF DELETING THEN
        INSERT INTO auditoria (accion, descripcion, fecha)
        VALUES ('DELETE', 'Empleado eliminado: ' || :OLD.nombre || ' (ID=' || :OLD.id_empleado || ')',
        SYSDATE);
    END IF;
END;