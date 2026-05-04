--VISTA--
CREATE VIEW vista_empleados AS
SELECT e.id_empleado, e.nombre, d.nombre AS departamento
FROM empleados e
JOIN departamentos d ON e.id_departamento = d.id_departamento;

--TRIGGER--
CREATE OR REPLACE TRIGGER trg_instead_of_insert
--En vez de insertar en la vista creada (Ya que no se puede) inserta de una forma especifica
INSTEAD OF INSERT ON vista_empleados
FOR EACH ROW
BEGIN
    INSERT INTO empleados (id_empleado, nombre, salario, id_departamento,
                            fecha_alta)
    VALUES (:NEW.id_empleado, :NEW.nombre, 1500, 1, SYSDATE);
    --Las variables con el new son los de la vista
END;

--PRUEBA--
INSERT INTO vista_empleados VALUES (10, 'Carlos', 'Informática');