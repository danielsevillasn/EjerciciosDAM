SET SERVEROUTPUT ON;

DECLARE
    CURSOR c1 IS
    SELECT apellido FROM emple WHERE dept_no=20;
    v_apellido VARCHAR2(10);
BEGIN
    OPEN c1;
    LOOP
        FETCH c1 INTO v_apellido;
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(c1%ROWCOUNT,'99.')||v_apellido);
        EXIT WHEN c1%NOTFOUND;
    END LOOP;
    CLOSE C1;
END;

--El resultado de la ejecución será:
--1.SANCHEZ
--2.JIMENEZ
--3.GIL
--4.ALONSO
--5.FERNANDEZ


--Practica propuesta--

--1 Opcion

DECLARE
    CURSOR c1 IS
        SELECT apellido FROM emple WHERE dept_no = 20;
    v_apellido VARCHAR2(10);
BEGIN
    OPEN c1;
    LOOP
        FETCH c1 INTO v_apellido;
        -- CORRECCIÓN: Comprobamos inmediatamente después de recuperar
        EXIT WHEN c1%NOTFOUND; 
        
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(c1%ROWCOUNT, '99.') || v_apellido);
    END LOOP;
    CLOSE c1;
END;
/

--2 Opcion
DECLARE
    CURSOR c1 IS
        SELECT apellido FROM emple WHERE dept_no = 20;
    v_apellido VARCHAR2(10);
BEGIN
    OPEN c1;
    -- FETCH de inicialización para que %FOUND tenga un estado válido
    FETCH c1 INTO v_apellido; 
    
    WHILE c1%FOUND LOOP
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(c1%ROWCOUNT, '99.') || v_apellido);
        -- FETCH de avance
        FETCH c1 INTO v_apellido; 
    END LOOP;
    CLOSE c1;
END;
/