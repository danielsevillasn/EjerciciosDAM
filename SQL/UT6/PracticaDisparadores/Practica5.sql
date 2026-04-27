CREATE OR REPLACE TRIGGER trg_statement_update
--Despues de un update sobre la tabla empleados se ejecuta
AFTER UPDATE ON empleados
BEGIN
    INSERT INTO auditoria (accion, descripcion, fecha)
    VALUES ('UPDATE MASIVO', 'Se ha hecho un UPDATE en empleados', SYSDATE);
END;

--Prueba--
UPDATE empleados
SET salario = salario + 100;