-- =============================================================================
--       CHULETILLA COMPLETA DE PL/SQL: FUNDAMENTOS Y CONCEPTOS AVANZADOS
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
DECLARE
    v_nombre empleados.nombre%TYPE;
BEGIN
    SELECT nombre INTO v_nombre FROM empleados WHERE id = 100;
END;
/

-- %ROWTYPE: Declara un registro que representa una fila completa de una tabla o cursor.
DECLARE
    v_reg_empleado empleados%ROWTYPE;
BEGIN
    SELECT * INTO v_reg_empleado FROM empleados WHERE id = 100;
    DBMS_OUTPUT.PUT_LINE(v_reg_empleado.nombre);
END;
/

-- CONSTANTES: Variables cuyo valor no cambia tras su inicialización.
DECLARE
    c_iva CONSTANT NUMBER(2,2) := 0.21;
BEGIN
    NULL; -- Instrucción que no hace nada, útil para rellenar bloques vacíos.
END;

-- VARIABLES DE SUSTITUCIÓN (Solo bloques anónimos)
-- Permiten pedir datos al usuario al ejecutar el bloque.
DECLARE
    v_id NUMBER := &introduzca_id;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Consultando datos para el ID: ' || v_id);
END;

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

-- =============================================================================
-- 4. CURSORES EXPLÍCITOS 
-- =============================================================================

-- CURSOR EXPLÍCITO: Se usa para procesar consultas que devuelven MÚLTIPLES filas.
-- Pasos: DECLARE -> OPEN -> FETCH -> CLOSE.
DECLARE
    CURSOR c_empleados IS 
        SELECT nombre, salario FROM empleados WHERE dept_no = 20;
    v_nom empleados.nombre%TYPE;
    v_sal empleados.salario%TYPE;
BEGIN
    OPEN c_empleados;
    LOOP
        FETCH c_empleados INTO v_nom, v_sal;
        EXIT WHEN c_empleados%NOTFOUND; -- Atributo de cursor
        DBMS_OUTPUT.PUT_LINE(v_nom || ' gana ' || v_sal);
    END LOOP;
    CLOSE c_empleados;
END;
/

-- BUCLE FOR DE CURSOR: Abre, extrae y cierra el cursor automáticamente.
DECLARE
    CURSOR c_emple IS SELECT * FROM empleados;
BEGIN
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
-- 5. CONTROL DE TRANSACCIONES 
-- =============================================================================

-- COMMIT: Confirma los cambios realizados en la base de datos.
-- ROLLBACK: Deshace los cambios realizados desde el último COMMIT.
-- SAVEPOINT: Crea un punto de retorno dentro de una transacción.
BEGIN
    INSERT INTO empleados (id, nombre) VALUES (500, 'NUEVO');
    SAVEPOINT punto1;
    UPDATE empleados SET salario = 3000 WHERE id = 500;
    -- Si algo sale mal, podemos volver al punto1 sin deshacer el INSERT
    ROLLBACK TO punto1;
    COMMIT;
END;
/
-- TRANSACCIÓN DE SOLO LECTURA: Garantiza consistencia ("foto" de la BD).
BEGIN
    COMMIT; -- Finaliza cualquier transacción previa.
    SET TRANSACTION READ ONLY;
    -- Aquí todas las SELECT verán los mismos datos aunque otros usuarios los cambien.
    -- No se permiten INSERT, UPDATE o DELETE aquí.
    COMMIT; -- Finaliza el modo lectura.
END;

-- =============================================================================
-- 6. GESTIÓN DE ERRORES Y EXCEPCIONES
-- =============================================================================

-- RAISE_APPLICATION_ERROR: Permite crear mensajes de error personalizados (códigos -20000 a -20999).
DECLARE
    v_stock NUMBER := 0;
BEGIN
    IF v_stock = 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'No hay existencias disponibles.');
    END IF;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(SQLERRM); -- Muestra el mensaje del error

-- SQLCODE y SQLERRM sirven para imprimir por pantalla mensajes específicos de la excepcion

        DBMS_OUTPUT.PUT_LINE('Error Código: ' || SQLCODE);
        DBMS_OUTPUT.PUT_LINE('Mensaje: ' || SQLERRM);
END;

-- =============================================================================
-- 7. SUBPROGRAMAS ALMACENADOS (CASOS PRÁCTICOS)
-- =============================================================================

-- FUNCIONES CON PARÁMETROS OPCIONALES (DEFAULT):
CREATE OR REPLACE FUNCTION calcular_iva (cantidad NUMBER, tipo NUMBER DEFAULT 21)
RETURN NUMBER AS
BEGIN
    RETURN cantidad * (1 + (tipo/100));
END;
/

-- Ejemplo de uso de la función:
-- SELECT calcular_iva(100) FROM DUAL; -- Usa el 21 por defecto
-- SELECT calcular_iva(100, 10) FROM DUAL; -- Usa el 10

-- =============================================================================
-- 8. CONFIGURACIÓN, FECHAS Y UTILIDADES SQL
-- =============================================================================

-- CONFIGURACIÓN NLS
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';

-- FUNCIONES DE UTILIDAD (Indispensables en exámenes)
-- NVL: SELECT nombre, NVL(comision, 0) FROM empleados;
-- DECODE: SELECT DECODE(dept_no, 10, 'CONT', 20, 'VENT', 'OTRO') FROM empleados;
-- TO_CHAR: SELECT TO_CHAR(SYSDATE, 'Day, DD "de" Month') FROM DUAL;

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