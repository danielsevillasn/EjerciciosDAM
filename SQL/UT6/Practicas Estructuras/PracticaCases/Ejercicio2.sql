SET SERVEROUTPUT ON;


--1--
create table alumnos( 
  identificacion  char(5) not null, 
  nombre varchar2(30), 
  nota number(4,2) 
);

--2--
  insert into alumnos values(3456,'Perez Luis',8.5); 
  insert into alumnos values(3456,'Perez Luis',9.9); 
  insert into alumnos values(3456,'Perez Luis',7.8); 
  insert into alumnos values(3556,'Garcia Ana',7.0); 
  insert into alumnos values(3556,'Garcia Ana',6.0); 
  insert into alumnos values(3656,'Ludueña Juan',9.6); 
  insert into alumnos values(3656,'Ludueña Juan',10); 
  insert into alumnos values(2756,'Moreno Gabriela',4.2); 
  insert into alumnos values(2756,'Moreno Gabriela',2.6); 
  insert into alumnos values(2756,'Moreno Gabriela',2); 
  insert into alumnos values(4856,'Morales Hugo',3.2); 
  insert into alumnos values(4856,'Morales Hugo',4.7); 
  insert into alumnos values(7856,'Gomez Susana',6.4); 
  insert into alumnos values(7856,'Gomez Susana',8.6);

--3--
create or replace function f_resultado(nota number)
  return varchar2
is
    notaObtenida varchar2(20);
begin
  case TRUNC(nota,0)
    when 1 then notaObtenida := 'suspenso';
    when 2 then notaObtenida := 'suspenso';
    when 3 then notaObtenida := 'suspenso';
    when 4 then notaObtenida := 'suspenso';
    when 5 then notaObtenida := 'bien';
    when 6 then notaObtenida := 'bien';
    when 7 then notaObtenida := 'notable';
    when 8 then notaObtenida := 'notable';
    when 9 then notaObtenida := 'sobresaliente';
    when 10 then notaObtenida := 'sobresaliente';
    else notaObtenida:='SIN NOTA';
  end case;
  return notaObtenida;
end;
/

SELECT nombre, f_resultado(AVG(nota))
FROM alumnos
GROUP BY nombre;

--4--
drop table alumnosCondicion; 

create table alumnosCondicion( 
  identificacion  char(5), 
  notafinal number(4,2), 
  condicion varchar2(15) 
  );

--5--
CREATE OR REPLACE PROCEDURE pa_cargarCondicion
AS
BEGIN
    DELETE FROM alumnosCondicion;

    INSERT INTO alumnosCondicion(identificacion, notafinal, condicion)
    SELECT identificacion, AVG(nota), f_resultado(AVG(nota))
    FROM alumnos
    GROUP BY identificacion;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Datos introducidos en la tabla alumnosCondicion');
END;

--6--
BEGIN
  pa_cargarCondicion;
END;
