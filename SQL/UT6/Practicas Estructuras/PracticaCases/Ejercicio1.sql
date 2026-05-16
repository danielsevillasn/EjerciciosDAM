CREATE OR REPLACE FUNCTION f_mes(afecha DATE)
RETURN VARCHAR2
IS
  mes VARCHAR2(20);
BEGIN
    CASE EXTRACT(MONTH FROM afecha)
      WHEN 1 THEN mes:='enero';
      WHEN 2 THEN mes:='febrero';
      WHEN 3 THEN mes:='marzo';
      WHEN 4 THEN mes:='abril';
      WHEN 5 THEN mes:='mayo';
      WHEN 6 then mes:='junio';
      WHEN 7 THEN mes:='julio';
      WHEN 8 THEN mes:='agosto';
      WHEN 9 THEN mes:='setiembre';
      WHEN 10 THEN mes:='octubre';
      WHEN 11 THEN mes:='noviembre';
      ELSE mes:='diciembre';
    END CASE;
  RETURN mes;
END;

--Recuperamos el nombre del empleado y el mes de su cumpleaños realizando un "select":

SELECT nombre, f_mes(fechanacimiento) AS cumpleaños 
FROM empleados;

--Podemos probar la función creada anteriormente enviándole la siguiente fecha: junio

SELECT f_mes(TO_DATE('10/06/2018', 'DD/MM/YYYY')) 
FROM dual;

--Realizamos una función que reciba una fecha y retorne si se encuentra en el 1er, 2º, 3er o 4º trimestre del año:

CREATE OR REPLACE FUNCTION f_trimestre(afecha DATE)
RETURN VARCHAR2
IS
  v_mes NUMBER;
  v_trimestre VARCHAR2(20);
BEGIN
    v_mes := EXTRACT(MONTH FROM afecha);

    CASE v_mes
      WHEN 1 THEN v_trimestre := '1º Trimestre';
      WHEN 2 THEN v_trimestre := '1º Trimestre';
      WHEN 3 THEN v_trimestre := '1º Trimestre';
      WHEN 4 THEN v_trimestre := '2º Trimestre';
      WHEN 5 THEN v_trimestre := '2º Trimestre';
      WHEN 6 THEN v_trimestre := '2º Trimestre';
      WHEN 7 THEN v_trimestre := '3º Trimestre';
      WHEN 8 THEN v_trimestre := '3º Trimestre';
      WHEN 9 THEN v_trimestre := '3º Trimestre';
      ELSE v_trimestre := '4º Trimestre';
    END CASE;
    RETURN v_trimestre;
END;

--Recuperamos el nombre del empleado y el trimestre de su cumpleaños empleando la función creada anteriormente:

SELECT nombre, f_trimestre(fechanacimiento) AS trimestre 
FROM empleados;

--Vamos a emplear "case" dentro de un "select". Veamos un ejemplo similar a la función anterior:

SELECT nombre, fechanacimiento,
  CASE EXTRACT(MONTH FROM fechanacimiento)
    WHEN 1 THEN '1º Trimestre'
    WHEN 2 THEN '1º Trimestre'
    WHEN 3 THEN '1º Trimestre'
    WHEN 4 THEN '2º Trimestre'
    WHEN 5 THEN '2º Trimestre'
    WHEN 6 THEN '2º Trimestre'
    WHEN 7 THEN '3º Trimestre'
    WHEN 8 THEN '3º Trimestre'
    WHEN 9 THEN '3º Trimestre'
  ELSE '4º Trimestre'
  END AS trimestre
FROM empleados
ORDER BY trimestre;