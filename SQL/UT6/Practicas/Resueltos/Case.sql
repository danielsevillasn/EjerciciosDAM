/*
Necesitamos, dada una fecha, obtener el nombre del mes en español.
Podemos utilizar la estructura condicional "case".
Para ello crearemos una función que reciba una fecha y retorne una cadena de caracteres
indicando el nombre del mes de la fecha enviada como argumento:
*/
 create or replace function f_mes(afecha date)
   return varchar2
 is
  mes varchar2(20);
 begin
   mes:='enero';
   case extract(month from afecha)
     when 1 then mes:='enero';
     when 2 then mes:='febrero';
     when 3 then mes:='marzo';
     when 4 then mes:='abril';
     when 5 then mes:='mayo';
     when 6 then mes:='junio';
     when 7 then mes:='julio';
     when 8 then mes:='agosto';
     when 9 then mes:='setiembre';
     when 10 then mes:='octubre';
     when 11 then mes:='noviembre';
     else mes:='diciembre';
   end case;
   return mes;
 end;
 /

--Si probamos la función anterior enviándole la siguiente fecha: obtendremos "octubre"
alter session set nls_date_format = 'DD/MM/YYYY';
select f_mes('10/10/2008') from dual;

--La siguiente función recibe una fecha y retorna si se encuentra en el 1er, 2º, 3er o 4º trimestre del año:

create or replace function f_trimestre(afecha date)
   return varchar2
 is
  mes varchar2(20);
  trimestre number;
 begin
   mes:=extract(month from afecha);
   trimestre:=4;
   case mes
     when 1 then trimestre:=1;
     when 2 then trimestre:=1;
     when 3 then trimestre:=1;
     when 4 then trimestre:=2;
     when 5 then trimestre:=2;
     when 6 then trimestre:=2;
     when 7 then trimestre:=3;
     when 8 then trimestre:=3;
     when 9 then trimestre:=3;
     else trimestre:=4;
   end case;
   return trimestre;
 end;
 /

--La cláusula "else" puede omitirse, en caso que no se encuentre coincidencia con ninguno de los "when",
--se sale del "case" sin modificar el valor de la variable "trimestre", con lo cual, retorna el valor 4,
--que estaba almacenada antes de entrar a la estructura "case".

--Otra diferencia con "if" es que el "case" toma valores puntuales, no expresiones.
--No es posible realizar comparaciones en cada "when". La siguiente sintaxis provocaría un error:

/*  ...
  case mes
   when >=1 then trimestre:=1;
   when >=4 then trimestre:=2;
   when >=7 then trimestre:=3;
   when >=10 then trimestre:=4;
  end case;
*/

--Si hay más de una sentencia en un "when...then" NO es necesario delimitarlas con "begin... end".

--Podemos emplear "case" dentro de un "select". Veamos un ejemplo similar a la función anterior:

create table ejemploCase (
   nombre varchar(20),
   fechanacimiento date
);

insert into ejemploCase values ('Juan',to_date('02/05/2000','DD/MM/YYYY'));
insert into ejemploCase values ('Carlos',to_date('06/06/1974','DD/MM/YYYY'));
insert into ejemploCase values ('Cristina',to_date('10/03/1974','DD/MM/YYYY'));
insert into ejemploCase values ('Julia',to_date('22/07/2010','DD/MM/YYYY'));

 select nombre,fechanacimiento,
  case extract(month from fechanacimiento)
   when 1 then 1
   when 2 then 1
   when 3 then 1
   when 4 then 2
   when 5 then 2
   when 6 then 2
   when 7 then 3
   when 8 then 3
   when 9 then 3
  else  4
  end as trimestre
  from ejemploCase
  order by trimestre;

--Problema resuelto:
--Trabajamos con la tabla "empleados". Eliminamos la tabla y luego la creamos con la siguiente estructura:

 drop table empleados;

 create table empleados (
  documento char(8),
  nombre varchar(30),
  fechanacimiento date  
 );

--Ingresamos algunos registros:

 insert into empleados values('20111111','Acosta Ana','10/05/1968');
 insert into empleados values('22222222','Bustos Bernardo','09/07/1970');
 insert into empleados values('22333333','Caseros Carlos','15/10/1971');
 insert into empleados values('23444444','Fuentes Fabiana','25/01/1972');
 insert into empleados values('23555555','Gomez Gaston','28/03/1979');
 insert into empleados values('24666666','Juarez Julieta','18/02/1981');
 insert into empleados values('25777777','Lopez Luis','17/09/1978');
 insert into empleados values('26888888','Morales Marta','22/12/1975');

--Nos interesa el nombre del mes del cumpleaños de cada empleado.
--Podemos utilizar la estructura condicional "case".
--Para ello crearemos una función que reciba una fecha y retorne una cadena de caracteres
--indicando el nombre del mes de la fecha enviada como argumento:

 create or replace function f_mes(afecha date)
   return varchar2
 is
  mes varchar2(20);
 begin
   mes:='enero';
   case extract(month from afecha)
     when 1 then mes:='enero';
     when 2 then mes:='febrero';
     when 3 then mes:='marzo';
     when 4 then mes:='abril';
     when 5 then mes:='mayo';
     when 6 then mes:='junio';
     when 7 then mes:='julio';
     when 8 then mes:='agosto';
     when 9 then mes:='setiembre';
     when 10 then mes:='octubre';
     when 11 then mes:='noviembre';
     else mes:='diciembre';
   end case;
   return mes;
 end;
 /

--Recuperamos el nombre del empleado y el mes de su cumpleaños realizando un "select":

select nombre, f_mes(fechanacimiento) as cumpleaños from empleados;

--Podemos probar la función creada anteriormente enviándole la siguiente fecha: junio

select f_mes('10/06/2018') from dual;

--Realizamos una función que reciba una fecha y retorne si se encuentra en el 1er, 2º, 3er o 4º trimestre del año:

create or replace function f_trimestre(afecha date)
   return varchar2
 is
  mes varchar2(20);
  trimestre number;
 begin
   mes:=extract(month from afecha);
   trimestre:=4;
   case mes
     when 1 then trimestre:=1;
     when 2 then trimestre:=1;
     when 3 then trimestre:=1;
     when 4 then trimestre:=2;
     when 5 then trimestre:=2;
     when 6 then trimestre:=2;
     when 7 then trimestre:=3;
     when 8 then trimestre:=3;
     when 9 then trimestre:=3;
     else trimestre:=4;
   end case;
   return trimestre;
 end;
 /
 
 --Recuperamos el nombre del empleado y el trimestre de su cumpleaños empleando la función creada anteriormente:

 select nombre, f_trimestre(fechanacimiento) trimestre from empleados;

--Vamos a emplear "case" dentro de un "select". Veamos un ejemplo similar a la función anterior:

 select nombre,fechanacimiento,
  case extract(month from fechanacimiento)
   when 1 then 1
   when 2 then 1
   when 3 then 1
   when 4 then 2
   when 5 then 2
   when 6 then 2
   when 7 then 3
   when 8 then 3
   when 9 then 3
  else  4
  end as trimestre
  from empleados
  order by trimestre;