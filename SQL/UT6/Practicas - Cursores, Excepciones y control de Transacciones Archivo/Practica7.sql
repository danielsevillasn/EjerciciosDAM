CREATE OR REPLACE PROCEDURE pr_subir_salario_media AS
BEGIN
    -- Establecemos un punto de guardado por si algo falla
    SAVEPOINT inicio_transaccion;
    
    UPDATE empleados e1
    SET salario = salario + (
        ( (SELECT AVG(salario) FROM empleados e2 WHERE e2.oficio = e1.oficio) - salario ) * 0.5
    )
    WHERE salario < (SELECT AVG(salario) FROM empleados e3 WHERE e3.oficio = e1.oficio);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Subida salarial aplicada con éxito.');
EXCEPTION
    WHEN OTHERS THEN
        -- Si hay error, deshacemos todo hasta el punto de guardado
        ROLLBACK TO inicio_transaccion;
        DBMS_OUTPUT.PUT_LINE('Error durante la transacción. Cambios deshechos: ' || SQLERRM);
END;
/