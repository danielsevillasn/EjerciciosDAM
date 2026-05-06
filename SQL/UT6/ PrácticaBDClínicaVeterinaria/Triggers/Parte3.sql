CREATE OR REPLACE TRIGGER mascotasFuturo
BEFORE INSERT or UPDATE ON MASCOTAS
FOR EACH ROW
BEGIN
    IF :NEW.FECHA_NAC > SYSDATE THEN
        RAISE_APPLICATION_ERROR(-20002,'No se puede registrar una mascota con fecha de nacimiento futura.');
    END IF;
END;

--PRUEBA
INSERT INTO MASCOTAS VALUES (5, 2, 'Marty McFly', 'Perro', DATE '2030-01-01');