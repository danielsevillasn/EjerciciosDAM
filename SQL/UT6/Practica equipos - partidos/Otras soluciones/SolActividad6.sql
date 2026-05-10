/*
Este trigger valida automáticamente los datos antes de insertar o modificar un resultado.

Funcionalidad
Impide goles negativos.
Impide que un equipo juegue contra sí mismo.
*/
CREATE OR REPLACE TRIGGER CONTROL_GOLES
BEFORE INSERT OR UPDATE
ON RESULTADOS
FOR EACH ROW
BEGIN

    -- Validar goles negativos
    IF :NEW.GOLES_LOCAL < 0 OR :NEW.GOLES_VISITANTE < 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Los goles no pueden ser negativos.');
    END IF;

    -- Validar mismo equipo
    IF :NEW.EQUIPO_LOCAL = :NEW.EQUIPO_VISITANTE THEN
        RAISE_APPLICATION_ERROR(-20002, 'Un equipo no puede jugar contra sí mismo.');
    END IF;

END;

/*PRUEBAS*/
--Error por goles negativos
INSERT INTO RESULTADOS
VALUES ('EQUIPO A',-1,'EQUIPO B',2);
--Error por mismo equipo
INSERT INTO RESULTADOS
VALUES ('EQUIPO A',2,'EQUIPO A',1);