SET SERVEROUTPUT ON;

--1--
drop table empleados; 
create table empleados( 
    nombre varchar2(40), 
    sueldo number(6,2) 
); 

--2--
insert into empleados values('Acosta Ana',550);  
insert into empleados values('Bustos Bernardo',850);  
insert into empleados values('Caseros Carolina',900);  
insert into empleados values('Dominguez Daniel',490);  
insert into empleados values('Fuentes Fabiola',820);  
insert into empleados values('Gomez Gaston',740);  
insert into empleados values('Huerta Hernan',1050);

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
        UPDATE EMPLEADOS 
        SET SUELDO = SUELDO * 1.10;

        SELECT MIN(SUELDO) 
        INTO SUELDO_MINIMO 
        FROM EMPLEADOS;

        IF SUELDO_MINIMO > 900 THEN
            EXIT;
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Salarios actualizados correctamente');
    DBMS_OUTPUT.PUT_LINE('Sueldo minimo actual: ' || SUELDO_MINIMO);
END;

--11--
SELECT MIN(SUELDO) 
FROM EMPLEADOS;