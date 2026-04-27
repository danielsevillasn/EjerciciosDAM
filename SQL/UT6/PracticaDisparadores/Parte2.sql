CREATE OR REPLACE TRIGGER trg_audit_insert
--Despues del insert en empleados en una fila
AFTER INSERT ON empleados
FOR EACH ROW
BEGIN
    --Inserta en auditorias el registro del nuevo empleado
    INSERT INTO auditoria (accion, descripcion, fecha)
    VALUES ('INSERT', 'Nuevo empleado: ' || :NEW.nombre, SYSDATE);
END;

--Prueba--
INSERT INTO empleados VALUES (4, 'Pedro', 1500, 1, SYSDATE);