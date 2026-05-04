CREATE OR REPLACE TRIGGER trg_salario_alto
AFTER INSERT ON empleados
FOR EACH ROW
WHEN (NEW.salario > 3000) --Dentro de la condicion del TRIGGER el NEW no tiene que ir precedido de los :
BEGIN
    INSERT INTO auditoria (accion, descripcion, fecha)
    VALUES ('ALERTA', 'Salario alto: ' || :NEW.nombre, SYSDATE);
END;

INSERT INTO empleados VALUES (6, 'Juan', 3500, 1, SYSDATE);