DECLARE 
    v_num_empleados NUMBER(2); -- Variable para contar cuántos empleados movemos
BEGIN 
    -- Creamos el departamento de "respaldo" para no dejar a los empleados huérfanos
    INSERT INTO depart VALUES (99,'PROVISIONAL',NULL); 
    
    -- Actualizamos los empleados del depto 20 al 99 antes de borrar el original
    UPDATE emple SET dept_no = 99 
    WHERE dept_no = 20; 
    
    -- SQL%ROWCOUNT devuelve el número de filas afectadas por el último comando (el UPDATE)
    v_num_empleados := SQL%ROWCOUNT; 
    
    -- Ahora que el depto 20 está vacío, podemos borrarlo sin errores de integridad
    DELETE FROM depart 
    WHERE dept_no = 20; 
    
    DBMS_OUTPUT.PUT_LINE(v_num_empleados || ' Empleados ubicados en PROVISIONAL'); 
    
EXCEPTION 
    WHEN OTHERS THEN 
    -- Si algo falla, lanzamos un error personalizado
    RAISE_APPLICATION_ERROR(-20000, 'Error en aplicación'); 
END;