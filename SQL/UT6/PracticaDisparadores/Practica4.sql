CREATE OR REPLACE TRIGGER trg_audit_delete
--Despues del delete realiza lo impuesto en el script
AFTER DELETE ON empleados
FOR EACH ROW
BEGIN
    INSERT INTO auditoria (accion, descripcion, fecha)
    VALUES ('DELETE', 'Empleado eliminado: ' || :OLD.nombre, SYSDATE);
END;

--Prueba--
DELETE FROM empleados
WHERE NOMBRE LIKE '%Ana%';