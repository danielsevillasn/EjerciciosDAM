--Opcion 1--
CREATE OR REPLACE PROCEDURE GENERAR_INFORME_PRACTICAS_EMPRESA(EMPRESA NUMBER)
AS

    CURSOR C_EMPRESAS IS SELECT * FROM EMPRESAS;
    CURSOR C_PRACTICAS_EMPRESAS(NUM_EMPRESA NUMBER) IS SELECT * FROM PRACTICAS WHERE EMPRESA_ID = NUM_EMPRESA;
    
    V_EMPRESA_ENTRADA NUMBER;
    V_EXISTE_EMPRESA_ENTRADA NUMBER;
    --DATOS INFORME
    V_NOMBRE_EMPRESA EMPRESAS.NOMBRE%TYPE;
    V_TOTAL_PRACTICAS NUMBER;
    V_PRACTICAS_FINALIZADAS NUMBER;
    V_PROMEDIO_EVAS NUMBER;
    V_CUENTA_EVAS NUMBER;

    EXCEPTION_EMPRESA_ENTRADA_NO_EXISTE EXCEPTION;

BEGIN
    --VERIFICAR SI ME PASAN EMPRESA COMO PARÁMETRO
    IF EMPRESA IS NULL THEN V_EMPRESA_ENTRADA := 0;
    ELSE V_EMPRESA_ENTRADA := 1;
    END IF;

    --VERIFICAR SI EXISTE LA EMPRESA PASADA COMO PARÁMETRO
    IF V_EMPRESA_ENTRADA = 1 THEN
        SELECT COUNT(*) INTO V_EXISTE_EMPRESA_ENTRADA FROM EMPRESAS WHERE EMPRESA_ID = EMPRESA;
    END IF;

    IF V_EXISTE_EMPRESA_ENTRADA = 0 THEN
        RAISE EXCEPTION_EMPRESA_ENTRADA_NO_EXISTE;
    END IF;

    --CASO ME PASAN LA EMPRESA COMO PARÁMETRO
    DBMS_OUTPUT.PUT_LINE('-----------------------INFORME PRÁCTICAS EMPRESA-----------------------');
    IF (V_EMPRESA_ENTRADA = 1) THEN
        --NOMBRE DE LA EMPRESA
        SELECT NOMBRE INTO V_NOMBRE_EMPRESA FROM EMPRESAS WHERE EMPRESA_ID = EMPRESA;
        --TOTAL DE PRÁCTICAS
        SELECT COUNT(EMPRESA_ID) INTO V_TOTAL_PRACTICAS FROM PRACTICAS WHERE EMPRESA_ID = EMPRESA;
        --TOTAL PRÁCTICAS FINALIZADAS
        SELECT COUNT(EMPRESA_ID) INTO V_PRACTICAS_FINALIZADAS
        FROM PRACTICAS
        WHERE EMPRESA_ID = EMPRESA AND ESTADO = 'Finalizada';
        --PROMEDIO DE EVALUACIONES
        SELECT AVG(EVALUACION), COUNT(*) INTO V_PROMEDIO_EVAS, V_CUENTA_EVAS
        FROM PRACTICAS
        WHERE EMPRESA_ID = EMPRESA AND EVALUACION IS NOT NULL;

        DBMS_OUTPUT.PUT_LINE('EMPRESA: '||EMPRESA ||' '||V_NOMBRE_EMPRESA);
        DBMS_OUTPUT.PUT_LINE('TOTAL DE PRÁCTICAS: '||V_TOTAL_PRACTICAS);
        DBMS_OUTPUT.PUT_LINE('PRÁCTICAS FINALIZADAS: '||V_PRACTICAS_FINALIZADAS);
        
        IF (V_CUENTA_EVAS != 0) THEN
            DBMS_OUTPUT.PUT_LINE('PROMEDIO DE EVALUACIONES: '|| V_PROMEDIO_EVAS);
        ELSE
            DBMS_OUTPUT.PUT_LINE('NO TIENE AÚN EVALUACIONES HECHAS');
        END IF;
        
        DBMS_OUTPUT.PUT_LINE('-----------------------------------------------------------------------');
        DBMS_OUTPUT.PUT_LINE('-----------------------------------------------------------------------');

    ELSE
        --NO ME PASAN EMPRESA COMO PARÁMETRO HAGO INFORME PARA CADA EMPRESA
        FOR V_C1 IN C_EMPRESAS LOOP
            --BUCLE POR CADA EMPRESA
            FOR V_C2 IN C_PRACTICAS_EMPRESAS(V_C1.EMPRESA_ID) LOOP
                --BUCLE POR PRÁCTICA POR EMPRESA
                --TOTAL DE PRÁCTICAS
                SELECT COUNT(EMPRESA_ID) INTO V_TOTAL_PRACTICAS FROM PRACTICAS WHERE EMPRESA_ID = V_C1.EMPRESA_ID;
                --TOTAL PRÁCTICAS FINALIZADAS
                SELECT COUNT(EMPRESA_ID) INTO V_PRACTICAS_FINALIZADAS
                FROM PRACTICAS
                WHERE EMPRESA_ID = V_C1.EMPRESA_ID AND ESTADO = 'Finalizada';
                --PROMEDIO DE EVALUACIONES
                SELECT AVG(EVALUACION), COUNT(*) INTO V_PROMEDIO_EVAS, V_CUENTA_EVAS
                FROM PRACTICAS
                WHERE EMPRESA_ID = V_C1.EMPRESA_ID AND EVALUACION IS NOT NULL;
            END LOOP;

            --SACO DATOS POR PANTALLA
            DBMS_OUTPUT.PUT_LINE('EMPRESA: ' || V_C1.EMPRESA_ID || ' ' || V_C1.NOMBRE);
            DBMS_OUTPUT.PUT_LINE('TOTAL DE PRÁCTICAS: '||V_TOTAL_PRACTICAS);
            DBMS_OUTPUT.PUT_LINE('PRÁCTICAS FINALIZADAS: '||V_PRACTICAS_FINALIZADAS);
            
            IF (V_CUENTA_EVAS != 0) THEN
                DBMS_OUTPUT.PUT_LINE('PROMEDIO DE EVALUACIONES: '|| V_PROMEDIO_EVAS);
            ELSE
                DBMS_OUTPUT.PUT_LINE('NO TIENE AÚN EVALUACIONES HECHAS');
            END IF;
        END LOOP;
    END IF;

EXCEPTION
    WHEN EXCEPTION_EMPRESA_ENTRADA_NO_EXISTE THEN
        DBMS_OUTPUT.PUT_LINE('LA EMPRESA RECIBIDA COMO PARÁMETRO NO ESTÁ REGISTRADA EN LA BASE DE DATOS');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('HA OCURRIDO UN ERROR INESPERADO: ' || SQLERRM);
END;
/

--Opcion 2--
CREATE OR REPLACE PROCEDURE GENEREAR_INFORME_PRACTICAS_EMPRESA(EMPRES NUMBER DEFAULT NULL) 
AS
    -- 1er Cursor explícito: Trae TODAS las empresas (se usará solo en el ELSE)
    CURSOR c_todas_empresas IS
        SELECT empresa_id, nombre
        FROM EMPRESAS;

    -- 2do Cursor explícito: Trae las prácticas de una empresa (se usará en ambos bloques)
    CURSOR c_practicas(p_empresa_id NUMBER) IS
        SELECT estado, evaluacion
        FROM PRACTICAS
        WHERE empresa_id = p_empresa_id;

    -- Variables para los cálculos de estadísticas
    v_nombre_empresa        VARCHAR2(100);
    v_total_practicas       NUMBER;
    v_practicas_finalizadas NUMBER;
    v_suma_evaluaciones     NUMBER;
    v_cuenta_evaluaciones   NUMBER;
    
    -- Control de excepciones
    v_existe_empresa        NUMBER := 0;
    e_no_existe_empresa     EXCEPTION;

BEGIN
    ---------------------------------------------------------------------------
    -- CASO 1: NOS PASAN UNA EMPRESA POR PARÁMETRO (Informe Único)
    ---------------------------------------------------------------------------
    IF EMPRES IS NOT NULL THEN
        
        -- 1. Validar si existe en la base de datos
        SELECT COUNT(*) INTO v_existe_empresa 
        FROM EMPRESAS 
        WHERE empresa_id = EMPRES;
        
        IF v_existe_empresa = 0 THEN
            RAISE e_no_existe_empresa;
        END IF;

        -- 2. Obtener el nombre de esa empresa específica
        SELECT nombre INTO v_nombre_empresa FROM EMPRESAS WHERE empresa_id = EMPRES;

        -- 3. Inicializar contadores
        v_total_practicas       := 0;
        v_practicas_finalizadas := 0;
        v_suma_evaluaciones     := 0;
        v_cuenta_evaluaciones   := 0;

        -- 4. Procesar SOLO las prácticas de esta empresa
        FOR reg_practica IN c_practicas(EMPRES) LOOP
            v_total_practicas := v_total_practicas + 1;
            
            IF reg_practica.estado = 'Finalizada' THEN
                v_practicas_finalizadas := v_practicas_finalizadas + 1;
            END IF;

            IF reg_practica.evaluacion IS NOT NULL THEN
                v_suma_evaluaciones   := v_suma_evaluaciones + reg_practica.evaluacion;
                v_cuenta_evaluaciones := v_cuenta_evaluaciones + 1;
            END IF;
        END LOOP;

        -- 5. Mostrar el informe único por pantalla
        DBMS_OUTPUT.PUT_LINE('==================================================');
        DBMS_OUTPUT.PUT_LINE('EMPRESA SOLICITADA: ' || EMPRES || ' - ' || v_nombre_empresa);
        DBMS_OUTPUT.PUT_LINE('Total de prácticas: ' || v_total_practicas);
        DBMS_OUTPUT.PUT_LINE('Prácticas finalizadas: ' || v_practicas_finalizadas);
        
        IF v_cuenta_evaluaciones > 0 THEN
            DBMS_OUTPUT.PUT_LINE('Promedio de evaluaciones: ' || ROUND(v_suma_evaluaciones / v_cuenta_evaluaciones, 2));
        ELSE
            DBMS_OUTPUT.PUT_LINE('No tiene aún evaluaciones hechas');
        END IF;
        DBMS_OUTPUT.PUT_LINE('==================================================');

    ---------------------------------------------------------------------------
    -- CASO 2: EL PARÁMETRO ES NULL (Informe Global de todas las empresas)
    ---------------------------------------------------------------------------
    ELSE
        DBMS_OUTPUT.PUT_LINE('==================================================');
        DBMS_OUTPUT.PUT_LINE('          INFORME GLOBAL DE TODAS LAS EMPRESAS    ');
        DBMS_OUTPUT.PUT_LINE('==================================================');

        -- Recorremos el cursor de todas las empresas
        FOR reg_empresa IN c_todas_empresas LOOP
            
            -- Resetear contadores para cada empresa del bucle
            v_total_practicas       := 0;
            v_practicas_finalizadas := 0;
            v_suma_evaluaciones     := 0;
            v_cuenta_evaluaciones   := 0;

            -- Recorremos las prácticas de la empresa actual del bucle
            FOR reg_practica IN c_practicas(reg_empresa.empresa_id) LOOP
                v_total_practicas := v_total_practicas + 1;
                
                IF reg_practica.estado = 'Finalizada' THEN
                    v_practicas_finalizadas := v_practicas_finalizadas + 1;
                END IF;

                IF reg_practica.evaluacion IS NOT NULL THEN
                    v_suma_evaluaciones   := v_suma_evaluaciones + reg_practica.evaluacion;
                    v_cuenta_evaluaciones := v_cuenta_evaluaciones + 1;
                END IF;
            END LOOP;

            -- Imprimir los datos de la empresa actual
            DBMS_OUTPUT.PUT_LINE('EMPRESA: ' || reg_empresa.empresa_id || ' - ' || reg_empresa.nombre);
            DBMS_OUTPUT.PUT_LINE('Total de prácticas: ' || v_total_practicas);
            DBMS_OUTPUT.PUT_LINE('Prácticas finalizadas: ' || v_practicas_finalizadas);
            
            IF v_cuenta_evaluaciones > 0 THEN
                DBMS_OUTPUT.PUT_LINE('Promedio de evaluaciones: ' || ROUND(v_suma_evaluaciones / v_cuenta_evaluaciones, 2));
            ELSE
                DBMS_OUTPUT.PUT_LINE('No tiene aún evaluaciones hechas');
            END IF;
            DBMS_OUTPUT.PUT_LINE('--------------------------------------------------');
        END LOOP;
        
    END IF;

EXCEPTION
    WHEN e_no_existe_empresa THEN
        DBMS_OUTPUT.PUT_LINE('Error: La empresa con ID ' || EMPRES || ' no existe en la base de datos.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error inesperado [' || SQLCODE || ']: ' || SQLERRM);
END;
/