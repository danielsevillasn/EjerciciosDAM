SET SERVEROUTPUT ON;

--1--
DROP TABLE empleados; 
CREATE TABLE empleados( 
    nombre VARCHAR2(40), 
    sueldo NUMBER(6,2) 
);

--2--
INSERT INTO empleados VALUES('Acosta Ana',550);  
INSERT INTO empleados VALUES('Bustos Bernardo',850);  
INSERT INTO empleados VALUES('Caseros Carolina',900);  
INSERT INTO empleados VALUES('Dominguez Daniel',490);  
INSERT INTO empleados VALUES('Fuentes Fabiola',820);  
INSERT INTO empleados VALUES('Gomez Gaston',740);  
INSERT INTO empleados VALUES('Huerta Hernan',1050);
COMMIT;

--3--
SELECT SUM(SUELDO) AS SUMA_TOTAL
FROM EMPLEADOS;

--4--
DECLARE
    SALARIO_TOTAL NUMBER;
BEGIN
    SELECT SUM(SUELDO)
    INTO SALARIO_TOTAL
    FROM EMPLEADOS;

    WHILE SALARIO_TOTAL < 7000 LOOP
        UPDATE EMPLEADOS
        SET SUELDO = SUELDO+ SUELDO*0.1;

        SELECT SUM(SUELDO)
        INTO SALARIO_TOTAL
        FROM EMPLEADOS;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Salarios actualizados correctamente');
    DBMS_OUTPUT.PUT_LINE('Suma del salario total actual: ' || SALARIO_TOTAL);
END;

DECLARE
    salario_total NUMBER;
BEGIN
    LOOP
        SELECT SUM(sueldo) INTO salario_total FROM empleados;
        
        -- Si ya llegó o superó los 7000, salimos antes de volver a incrementar
        EXIT WHEN salario_total >= 7000;
        
        UPDATE empleados
        SET sueldo = sueldo * 1.10;
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('--- PUNTO 4 ---');
    DBMS_OUTPUT.PUT_LINE('Suma del salario total actual: ' || salario_total);
END;

--5--
SELECT * 
FROM EMPLEADOS;

--6--
SELECT MAX(SUELDO)
FROM EMPLEADOS;

--7--
DECLARE
    SUELDO_MAXIMO NUMBER;
    CONTADOR NUMBER := 0;
BEGIN
    SELECT MAX(SUELDO)
    INTO SUELDO_MAXIMO
    FROM EMPLEADOS;

    WHILE SUELDO_MAXIMO < 1600 LOOP
        UPDATE EMPLEADOS
        SET SUELDO = SUELDO+ SUELDO*0.05;

        SELECT MAX(SUELDO)
        INTO SUELDO_MAXIMO
        FROM EMPLEADOS;

        CONTADOR := CONTADOR +1;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Salarios actualizados correctamente');
    DBMS_OUTPUT.PUT_LINE('Sueldo maximo actual: ' || SUELDO_MAXIMO);
    DBMS_OUTPUT.PUT_LINE('Veces repetidas del bucle: ' || CONTADOR);
END;

DECLARE
    sueldo_maximo NUMBER;
    contador NUMBER := 0;
BEGIN
    LOOP
        SELECT MAX(sueldo) INTO sueldo_maximo FROM empleados;
        
        EXIT WHEN sueldo_maximo >= 1600;
        
        UPDATE empleados
        SET sueldo = sueldo * 1.05;
        
        contador := contador + 1;
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('--- PUNTO 7 ---');
    DBMS_OUTPUT.PUT_LINE('Sueldo maximo actual: ' || sueldo_maximo);
    DBMS_OUTPUT.PUT_LINE('Veces repetidas del bucle: ' || contador);
END;

--8--
SELECT * 
FROM EMPLEADOS;

--9--
SELECT MIN(SUELDO)
FROM EMPLEADOS;

--10--
DECLARE
    SUELDO_MINIMO NUMBER;
BEGIN
    LOOP
        SELECT MIN(SUELDO) 
        INTO SUELDO_MINIMO 
        FROM EMPLEADOS;

        IF SUELDO_MINIMO >= 900 THEN
            EXIT;
        END IF;

        UPDATE EMPLEADOS 
        SET SUELDO = SUELDO * 1.10;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Salarios actualizados correctamente');
    DBMS_OUTPUT.PUT_LINE('Sueldo minimo actual: ' || SUELDO_MINIMO);
END;

--11--
SELECT MIN(SUELDO) 
FROM EMPLEADOS;