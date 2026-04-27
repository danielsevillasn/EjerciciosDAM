--Crea o reemplaza un trigger y le agrega un nombre
CREATE OR REPLACE TRIGGER trg_validar_salario
--Antes de hacer un INSERT en empleados hace lo impuesto en el script
BEFORE INSERT ON empleados
--Afecta a cada fila modificada
FOR EACH ROW
BEGIN
    --Si el nuevo salario es menos que 1000 entonces lanza una excepción
    IF :NEW.salario < 1000 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Salario demasiado bajo');
    END IF;
END;

--Prueba--
--Lanza la excepción -20001
INSERT INTO empleados VALUES (4, 'Pedro', 900, 1, SYSDATE);