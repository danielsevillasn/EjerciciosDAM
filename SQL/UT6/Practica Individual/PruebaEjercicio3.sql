--PRUEBA SIN HORAS--

    --INSERT
    BEGIN
        INSERT INTO practicas (
        alumno_id, empresa_id, fecha_inicio, fecha_fin,
        horas_realizadas, evaluacion,
        tutor_empresa, tutor_instituto,
        estado, observaciones
        )
        VALUES (
            5, 3,
            TRUNC(SYSDATE)-150,
            TRUNC(SYSDATE)-60,
            NULL,
            9.4,
            'Laura Gómez',
            'Luis Pérez',
            'Finalizada',
            'Excelente rendimiento'
        );
    END;

    --UPDATE
    BEGIN
        UPDATE practicas
        SET horas_realizadas = NULL
        WHERE alumno_id = 5 AND empresa_id = 3;
    END;


--PRUEBA SIN EVALUACION--

    --INSERT
    BEGIN
        INSERT INTO practicas (
        alumno_id, empresa_id, fecha_inicio, fecha_fin,
        horas_realizadas, evaluacion,
        tutor_empresa, tutor_instituto,
        estado, observaciones
        )
        VALUES (
            5, 3,
            TRUNC(SYSDATE)-150,
            TRUNC(SYSDATE)-60,
            400,
            NULL,
            'Laura Gómez',
            'Luis Pérez',
            'Finalizada',
            'Excelente rendimiento'
        );
    END;

    --UPDATE
    BEGIN
        UPDATE practicas
        SET evaluacion = NULL
        WHERE alumno_id = 5 AND empresa_id = 3;
    END;


--INSERCIÓN CORRECTA--
BEGIN
    INSERT INTO practicas (
    alumno_id, empresa_id, fecha_inicio, fecha_fin,
    horas_realizadas, evaluacion,
    tutor_empresa, tutor_instituto,
    estado, observaciones
    )
    VALUES (
        1, 1,
        TRUNC(SYSDATE)-150,
        TRUNC(SYSDATE)-60,
        400,
        9.0,
        'Pedro Gómez',
        'Luis Pérez',
        'Finalizada',
        'Excelente rendimiento'
    );
END;


--ACTUALIZACIÓN CORRECTA--
BEGIN
    UPDATE practicas
    SET evaluacion = 10
    WHERE alumno_id = 5 AND empresa_id = 3;
 END;