-- =============================================================================
--       CHULETILLA COMPLETA DE PL/SQL: FUNDAMENTOS Y CONCEPTOS BÁSICOS
-- =============================================================================

-- Antes de empezar: Habilitar la salida por consola para ver resultados
SET SERVEROUTPUT ON;

-- =============================================================================
-- 1. ESTRUCTURA BÁSICA DE UN BLOQUE PL/SQL
-- =============================================================================

-- BLOQUE ANÓNIMO: Unidad básica de trabajo estructurada en tres secciones.
-- DECLARE: (Opcional) Definición de variables y objetos.
-- BEGIN: (Obligatorio) Instrucciones lógicas y SQL.
-- EXCEPTION: (Opcional) Control de errores.
DECLARE
    v_mensaje VARCHAR2(50) := 'Hola PL/SQL';
BEGIN
    DBMS_OUTPUT.PUT_LINE(v_mensaje);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Ha ocurrido un error inesperado');
END;
/

-- =============================================================================
-- 2. VARIABLES Y ATRIBUTOS DE TIPO
-- =============================================================================

-- %TYPE: Declara una variable del mismo tipo que una columna de una tabla.
-- Ejemplo: v_nom toma el tipo de la columna nombre de la tabla empleados.
DECLARE
    v_nombre empleados.nombre%TYPE;
BEGIN
    SELECT nombre INTO v_nombre FROM empleados WHERE id = 100;
END;
/

-- %ROWTYPE: Declara un registro que representa una fila completa de una tabla.
-- Ejemplo: v_empleado contendrá todos los campos de un registro de empleados.
DECLARE
    v_reg_empleado empleados%ROWTYPE;
BEGIN
    SELECT * INTO v_reg_empleado FROM empleados WHERE id = 100;
    DBMS_OUTPUT.PUT_LINE(v_reg_empleado.nombre || ' ' || v_reg_empleado.salario);
END;
/

-- CONSTANTES: Variables cuyo valor no cambia tras su inicialización.
DECLARE
    c_iva CONSTANT NUMBER(2,2) := 0.21;
BEGIN
    NULL; -- Instrucción que no hace nada, útil para rellenar bloques vacíos.
END;
/

-- =============================================================================
-- 3. ESTRUCTURAS DE CONTROL (FLUJO)
-- =============================================================================

-- IF-THEN-ELSIF-ELSE: Toma de decisiones condicional.
DECLARE
    v_edad NUMBER := 20;
BEGIN
    IF v_edad < 18 THEN
        DBMS_OUTPUT.PUT_LINE('Menor de edad');
    ELSIF v_edad BETWEEN 18 AND 65 THEN
        DBMS_OUTPUT.PUT_LINE('Adulto');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Jubilado');
    END IF;
END;
/

-- CASE: Selección múltiple de forma más limpia.
DECLARE
    v_grado CHAR(1) := 'B';
BEGIN
    CASE v_grado
        WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Excelente');
        WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Muy bueno');
        ELSE DBMS_OUTPUT.PUT_LINE('A mejorar');
    END CASE;
END;
/

-- BUCLE BÁSICO (LOOP): Repetición infinita hasta que se cumple un EXIT WHEN.
DECLARE
    v_cont NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('Contador: ' || v_cont);
        v_cont := v_cont + 1;
        EXIT WHEN v_cont > 5;
    END LOOP;
END;
/

-- BUCLE FOR: Repetición un número fijo de veces (incluye el rango).
BEGIN
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Vuelta número: ' || i);
    END LOOP;
END;
/

-- BUCLE WHILE: Se ejecuta mientras la condición sea verdadera.
DECLARE
    v_n NUMBER := 1;
BEGIN
    WHILE v_n <= 3 LOOP
        DBMS_OUTPUT.PUT_LINE('Valor: ' || v_n);
        v_n := v_n + 1;
    END LOOP;
END;
/

-- =============================================================================
-- 4. INTERACCIÓN CON LA BASE DE DATOS
-- =============================================================================

-- SELECT ... INTO: Recupera datos de la BD y los guarda en variables.
-- REGLA DE ORO: Debe devolver exactamente UNA fila.
DECLARE
    v_salario NUMBER;
BEGIN
    SELECT salario INTO v_salario FROM empleados WHERE id = 10;
END;
/

-- DML DIRECTO: INSERT, UPDATE, DELETE funcionan igual que en SQL.
BEGIN
    UPDATE empleados SET salario = salario * 1.1 WHERE depto = 'Ventas';
    COMMIT; -- Confirmar cambios
END;
/

-- =============================================================================
-- 5. SUBPROGRAMAS ALMACENADOS (PROCEDIMIENTOS Y FUNCIONES)
-- =============================================================================

-- PROCEDIMIENTO: Ejecuta una acción, se guarda en la base de datos.
CREATE OR REPLACE PROCEDURE saludar_empleado(p_id NUMBER) AS
    v_nom empleados.nombre%TYPE;
BEGIN
    SELECT nombre INTO v_nom FROM empleados WHERE id = p_id;
    DBMS_OUTPUT.PUT_LINE('Hola ' || v_nom);
END;
/

-- FUNCIÓN: Siempre devuelve un valor mediante RETURN.
CREATE OR REPLACE FUNCTION calcular_triplo(p_num NUMBER) 
RETURN NUMBER AS
BEGIN
    RETURN p_num * 3;
END;
/

-- =============================================================================
-- 6. GESTIÓN DE EXCEPCIONES (ERRORES)
-- =============================================================================

-- NO_DATA_FOUND: Se lanza cuando un SELECT INTO no encuentra resultados.
-- TOO_MANY_ROWS: Se lanza cuando un SELECT INTO devuelve más de una fila.
DECLARE
    v_dato VARCHAR2(100);
BEGIN
    SELECT nombre INTO v_dato FROM empleados WHERE id = 9999;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: El empleado no existe.');
    WHEN TOO_MANY_ROWS THEN
        DBMS_OUTPUT.PUT_LINE('Error: La consulta devolvió demasiados registros.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error desconocido.');
END;
/

-- =============================================================================
-- 7. CONFIGURACIÓN Y FUNCIONES DE FECHAS (Oracle SQL Developer)
-- =============================================================================

-- ALTER SESSION: Cambia el formato de fecha para la sesión actual.
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';

-- EXTRACT: Extrae una parte (año, mes, día) de una fecha.
-- SELECT EXTRACT(YEAR FROM SYSDATE) FROM DUAL;

-- MONTHS_BETWEEN(f1, f2): Cantidad de meses entre dos fechas.
-- SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('01/01/2023','DD/MM/YYYY')) FROM DUAL;

-- LAST_DAY(fecha): Devuelve el último día del mes de la fecha dada.
-- SELECT LAST_DAY(SYSDATE) FROM DUAL;

-- NEXT_DAY(fecha, 'DIA'): Fecha del siguiente día indicado (ej. 'LUNES').
-- SELECT NEXT_DAY(SYSDATE, 'LUNES') FROM DUAL;

-- CURRENT_DATE / CURRENT_TIMESTAMP: Retornan la fecha y hora actual del sistema.
-- SELECT CURRENT_TIMESTAMP FROM DUAL;
