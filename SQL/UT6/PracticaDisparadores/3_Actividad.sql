CREATE OR REPLACE TRIGGER trg_registro_borrados
BEFORE DELETE ON empleados
FOR EACH ROW
BEGIN
    INSERT INTO auditoria (accion, descripcion, fecha)
        VALUES ('DELETE', 'Empleado eliminado: ' || :OLD.nombre || ' (ID=' || :OLD.id_empleado || ')',
        SYSDATE);
END;