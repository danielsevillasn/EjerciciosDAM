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
    SUMA_TOTAL NUMBER;
BEGIN
    SELECT SUM(SUELDO)
    INTO SUMA_TOTAL
    FROM EMPLEADOS;

    WHILE SUMA_TOTAL < 7000 LOOP
        UPDATE EMPLEADOS
        SET SUELDO = SUELDO+ SUELDO*0.1;

        SELECT SUM(SUELDO)
        INTO SUMA_TOTAL
        FROM EMPLEADOS;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Salarios actualizados correctamente');
    DBMS_OUTPUT.PUT_LINE('Suma total actual: ' || SUMA_TOTAL);
END;

--5--
SELECT * 
FROM empleados;

--6--
SELECT MAX(SUELDO)
FROM EMPLEADOS;

--7--