-- =============================================================================
--       CHULETA COMPLETA DE PL/SQL: FUNDAMENTOS Y CONCEPTOS AVANZADOS
-- =============================================================================
-- Esta guía integra los criterios de evaluación del RA5 y la chuleta técnica.
-- Habilitar salida por consola:
SET SERVEROUTPUT ON;

-- =============================================================================
-- 1. ESTRUCTURA BÁSICA Y AUTOMATIZACIÓN (Criterios a, b, c, d)
-- =============================================================================
-- Un script o "guion" PL/SQL permite automatizar tareas repetitivas en la BD.
-- BLOQUE ANÓNIMO: Unidad básica de trabajo estructurada en tres secciones.
-- DECLARE: (Opcional) Definición de variables y objetos.
-- BEGIN: (Obligatorio) Instrucciones lógicas y SQL.
-- EXCEPTION: (Opcional) Control de errores.
DECLARE
    -- SECCIÓN DE DECLARACIÓN (Opcional): Variables, constantes, excepciones.
    v_nombre VARCHAR2(30); 
BEGIN
    -- SECCIÓN DE EJECUCIÓN (Obligatorio): Lógica y sentencias SQL.
    DBMS_OUTPUT.PUT_LINE('Iniciando tarea automatizada...');
EXCEPTION
    -- SECCIÓN DE EXCEPCIONES (Opcional): Gestión de errores.
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error detectado.');
END;
/

-- =============================================================================
-- 2. VARIABLES Y ATRIBUTOS DINÁMICOS
-- =============================================================================
DECLARE
    -- %TYPE: Hereda el tipo de una columna.
    v_salario empleados.salario%TYPE;
    
    -- %ROWTYPE: Hereda la estructura completa de una fila.
    v_emple_reg empleados%ROWTYPE;
    
    -- CONSTANTES: Valor inalterable, inicialización obligatoria.
    c_iva CONSTANT NUMBER := 0.21;
BEGIN
    SELECT * INTO v_emple_reg FROM empleados WHERE id = 10;
END;
/

-- =============================================================================
-- 3. ESTRUCTURAS DE CONTROL DE FLUJO (Criterio g)
-- =============================================================================
DECLARE
    v_num NUMBER := 10;
BEGIN
    -- Condicionales
    IF v_num > 5 THEN
        DBMS_OUTPUT.PUT_LINE('Mayor que 5');
    ELSIF v_num = 5 THEN
        DBMS_OUTPUT.PUT_LINE('Es 5');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Menor');
    END IF;

    -- CASE (Selección múltiple)
    CASE v_num
        WHEN 10 THEN DBMS_OUTPUT.PUT_LINE('Diez');
        ELSE DBMS_OUTPUT.PUT_LINE('Otro');
    END CASE;

    -- BUCLES
    -- Loop Básico (Requiere EXIT)
    LOOP
        EXIT WHEN v_num > 15;
        v_num := v_num + 1;
    END LOOP;

    -- Bucle FOR (Rango fijo)
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Iteración: ' || i);
    END LOOP;

    -- Bucle WHILE (Evaluación previa)
    WHILE v_num < 20 LOOP
        v_num := v_num + 1;
    END LOOP;
END;
/

-- =============================================================================
-- 4. FUNCIONES DEL SISTEMA GESTOR Y FECHAS (Criterio e)
-- =============================================================================
-- Uso de funciones integradas de Oracle para transformar datos.
DECLARE
    v_fecha DATE := SYSDATE;
    v_texto VARCHAR2(50);
BEGIN
    v_texto := TO_CHAR(v_fecha, 'DD-MM-YYYY'); -- Conversión a texto
    v_fecha := ADD_MONTHS(v_fecha, 2);         -- Añadir meses
    v_fecha := LAST_DAY(v_fecha);              -- Último día del mes
    
    -- NVL: Gestión de nulos
    -- SELECT NVL(comision, 0) INTO v_variable FROM empleados;
END;
/
-- EXTRACT: Extrae una parte (año, mes, día) de una fecha.
-- SELECT EXTRACT(YEAR FROM SYSDATE) FROM DUAL;

-- =============================================================================
-- 5. CURSORES (Criterio i)
-- =============================================================================
-- Gestión de múltiples filas.
DECLARE
    -- Cursor Explícito
    CURSOR c_departamentos IS SELECT * FROM departamentos;
    v_dep_reg departamentos%ROWTYPE;
    CURSOR c_emple IS SELECT * FROM empleados;
BEGIN
    -- Apertura manual
    OPEN c_departamentos;
    LOOP
        FETCH c_departamentos INTO v_dep_reg;
        EXIT WHEN c_departamentos%NOTFOUND; -- Atributo %NOTFOUND
        DBMS_OUTPUT.PUT_LINE('Dep: ' || v_dep_reg.dname);
    END LOOP;
    CLOSE c_departamentos;

    -- Bucle FOR de cursor (Gestión automática de OPEN, FETCH y CLOSE)
    FOR reg IN c_emple LOOP
        DBMS_OUTPUT.PUT_LINE('Empleado: ' || reg.nombre);
    END LOOP;
END;
/
-- ATRIBUTOS DE CURSOR EXPLÍCITO (Referenciados por nombre):
-- c_nom%FOUND: TRUE si el último FETCH recuperó una fila.
-- c_nom%NOTFOUND: TRUE si el último FETCH NO recuperó nada.
-- c_nom%ROWCOUNT: Número total de filas recuperadas hasta el momento.
-- c_nom%ISOPEN: TRUE si el cursor está abierto (útil antes de un OPEN o CLOSE).
DECLARE
    CURSOR c_emple IS SELECT nombre FROM empleados;
    v_nom empleados.nombre%TYPE;
BEGIN
    IF NOT c_emple%ISOPEN THEN
        OPEN c_emple;
    END IF;
    
    LOOP
        FETCH c_emple INTO v_nom;
        EXIT WHEN c_emple%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Fila nº: ' || c_emple%ROWCOUNT || ' - ' || v_nom);
    END LOOP;
    
    CLOSE c_emple;
END;

-- =============================================================================
-- 6. GESTIÓN DE EXCEPCIONES (Criterio j)
-- =============================================================================
DECLARE
    e_mi_error EXCEPTION; -- Excepción de usuario
    v_valor NUMBER;
BEGIN
    -- Lanzar error personalizado
    RAISE e_mi_error;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No se encontraron datos.');
    WHEN e_mi_error THEN
        DBMS_OUTPUT.PUT_LINE('Capturado error de usuario.');
    WHEN OTHERS THEN
        -- Errores genéricos y personalizados
        RAISE_APPLICATION_ERROR(-20001, 'Error crítico en el proceso.');
        -- SQLCODE y SQLERRM sirven para imprimir por pantalla mensajes específicos de la excepcion
        DBMS_OUTPUT.PUT_LINE('Error Código: ' || SQLCODE);
        DBMS_OUTPUT.PUT_LINE('Mensaje: ' || SQLERRM);
END;
/

-- =============================================================================
-- 7. SUBPROGRAMAS ALMACENADOS (Criterio f)
-- =============================================================================
-- PROCEDIMIENTOS: Ejecutan una acción.
CREATE OR REPLACE PROCEDURE actualizar_salario (p_id IN NUMBER, p_incremento IN NUMBER) 
AS
BEGIN
    UPDATE empleados SET salario = salario + p_incremento WHERE id = p_id;
END;
/

-- FUNCIONES: Devuelven un valor obligatorio.
CREATE OR REPLACE FUNCTION obtener_iva (p_precio IN NUMBER) 
RETURN NUMBER AS
BEGIN
    RETURN p_precio * 0.21;
END;
/

-- =============================================================================
-- 8. DISPARADORES (TRIGGERS) (Criterio h)
-- =============================================================================
-- Ejecución automática ante eventos DML.
CREATE OR REPLACE TRIGGER audit_empleados
BEFORE UPDATE ON empleados
FOR EACH ROW -- Nivel de fila 
-- Si lo quitamos por defecto seria Statement por lo cual si se dispara una vez no se vuelve a disparar
BEGIN
    -- Uso de pseudocolumnas :OLD y :NEW
    IF :OLD.salario != :NEW.salario THEN
        DBMS_OUTPUT.PUT_LINE('El salario ha cambiado.');
    END IF;
END;
/

-- =============================================================================
-- 9. CONTROL DE TRANSACCIONES
-- =============================================================================
-- COMMIT: Confirma. ROLLBACK: Deshace. SAVEPOINT: Punto parcial.
BEGIN
    SAVEPOINT inicio_proceso;
    UPDATE empleados SET salario = 2000 WHERE id = 100;
    
    -- Si hay error, volver al punto
    -- ROLLBACK TO inicio_proceso;
    
    COMMIT;
END;
/

-- PRAGMA AUTONOMOUS_TRANSACTION: Transacción independiente (útil para logs).
CREATE OR REPLACE PROCEDURE log_error (p_msg VARCHAR2) AS
    PRAGMA AUTONOMOUS_TRANSACTION;
BEGIN
    INSERT INTO logs_errores VALUES (SYSDATE, p_msg);
    COMMIT; -- Solo confirma este INSERT, no afecta a la transacción principal.
END;
/
