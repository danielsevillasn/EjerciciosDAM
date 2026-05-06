CREATE OR REPLACE TRIGGER trg_statement_empleados
AFTER INSERT OR UPDATE OR DELETE ON empleados
BEGIN
    INSERT INTO auditoria (accion, descripcion, fecha)
    VALUES('STATEMENT',
            'Se ha ejecutado una operación global sobre empleados',
            SYSDATE);
END;