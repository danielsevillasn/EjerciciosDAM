--Mostrar el nombre del cliente en mayúsculas y su email en minúsculas
SELECT UPPER(NOMBRE), UPPER(EMAIL)
FROM CLIENTES;

--Mostrar el nombre del cliente y la longitud de su nombre
SELECT NOMBRE,LENGTH(NOMBRE) AS LONGITUD_NOMBRE
FROM CLIENTES;

--Mostrar los clientes cuyo email termina en .com
SELECT NOMBRE, EMAIL
FROM CLIENTES
WHERE SUBSTR(EMAIL,-4) = '.com';

--Mostrar el nombre del personal sustituyendo “Dr.” por “Doctor”
SELECT REPLACE(NOMBRE, 'Dr','Doctor') AS NOMBRE_DOCTOR
FROM PERSONAL;

--Mostrar el nombre del cliente y solo los 3 primeros caracteres de su DNI
SELECT NOMBRE, SUBSTR(DNI,0,3) AS DNI
FROM CLIENTES;

--Mostrar las citas indicando el año de la cita
SELECT MOTIVO, EXTRACT(YEAR FROM FECHA_CITA)
FROM CITAS;

--Mostrar las citas con la fecha formateada a día-mes-año (dos dígitos para cada campo)


--Mostrar las mascotas, con sus dueños y su edad (la de la mascota) aproximada en años ordenadas por nombre de dueño


--Mostrar las citas(para qué mascota son, de qué cliente y con qué motivo) cuya fecha sea anterior a hoy


--Mostrar los pagos realizados(importe y fecha de pago) un día distinto al de la cita(fecha cita) junto con de qué mascota se trata y de qué cliente


--Mostrar los pagos redondeando el importe (mostrar toda la info pedida en la consulta anterior)


--Mostrar los pagos incrementando el importe en un 21% (IVA) (con toda la información anterior)


--Mostrar los pagos (con el iva calculado) truncados 


--Mostrar las mascotas indicando su nombre o “SIN NOMBRE” (por si fuera nulo)


--Mostrar las citas(nombre mascota, nombre cliente) indicando motivo o “SIN MOTIVO”


--Funciones condicionales (CASE)
/*
CASE vs DECODE
    DECODE solo compara igualdad
    CASE permite:
        rangos
        condiciones
        expresiones booleanas
        combinaciones complejas
Todo lo que sea “si X = valor” → DECODE
Todo lo que sea “si X > …, < …, IS NULL…” → CASE
*/
--Clasificar las mascotas como “JOVEN” (menos de 5 años) o “ADULTA”(más de 5 años) según su edad, mostrando nombre y años de la mascota
SELECT M.NOMBRE, TRUNC(MONTHS_BETWEEN (FECHA_NAC, SYSDATE)/12) AS AÑOS_MASCOTA,
    CASE
        WHEN TRUNC(MONTHS_BETWEEN (FECHA_NAC, SYSDATE)/12) <5 THEN 'JOVEN'
        ELSE 'ADULTA'
    END AS EDAD
FROM MASCOTAS;

--Indicar si una cita tiene pago o no (muestra nombre de mascota, de cliente, motivo de la cita y fecha)
SELECT M.NOMBRE AS NOMBRE_MASCOTA, C.NOMBRE AS NOMBRE_CLIENTE, C.MOTIVO, C.FECHA_CITA,
    CASE
        WHEN P.IMPORTE IS NULL 'NO'
        ELSE 'SI'
    END AS TIENE_PAGO
FROM MASCOTAS M JOIN CLIENTES C ON M.ID_CLIENTE = C.ID_CLIENTE
JOIN CITAS CI ON M.ID_CLIENTE = CI.ID_CLIENTE AND M.ID_MASCOTA = CI.ID_MASCOTA
LEFT JOIN PAGOS P ON CI.ID_MASCOTA = CI.ID_MASCOTA AND CI.ID_CLIENTE = P.ID_CLIENTE AND CI.FECHA_CITA = P.FECHA_CITA;

--Clasificar tipo de atención (Veterinario / Auxiliar)
SELECT NOMBRE, DECODE(ROL, 'Veterinario', 'Veterinario','Auxiliar','Auxiliar') AS TIPO_ATENCION
FROM PERSONAL;


--Mostrar las mascotas cuyo nombre tenga más de 4 caracteres, con su especie y dueño



--Mostrar nombre del cliente, nombre de la mascota y fecha de la cita en formato texto (debe aparecer con formato Lunes 15 de enero),
--es decir, día de la semana, número de día 'de' mes.



--Mostrar toda la información: nombre de cliente, nombre de mascota, fecha de la cita, motivo, quién atendió, 
    --si era veterinario mostrar 'atención médica'
    --si era auxiliar mostrar 'apoyo auxiliar'
--las observaciones registradas (o 'no hay'), las recomendaciones registradas (o 'no hay'),
--el diagnóstico registrado (o 'no hay')
SELECT C.NOMBRE AS NOMBRE_CLIENTE, M.NOMBRE AS NOMBRE_MASCOTA, CI.FECHA_CITA, CI.MOTIVO,
    CASE
        WHEN PE.ROL = 'Veterinario' THEN 'atención médica'
        ELSE 'apoyo auxiliar'
    END AS TIPO_ATENCION,
    NVL(A.OBSERVACIONES, 'no hay') AS OBSERVACIONES_REGISTRADAS,
    NVL(R.TEXTO, 'no hay') AS RECOMENDACIONES_REGISTRADAS,
    NVL(D.DESCRIPCION, 'no hay') AS DIAGNOSTICOS_REGISTRADOS
FROM CLIENTES C JOIN MASCOTAS M ON C.ID_CLIENTE = M.ID_CLIENTE
JOIN CITAS CI ON M.ID_CLIENTE = CI.ID_CLIENTE AND M.ID_MASCOTA = CI.ID_MASCOTA
LEFT JOIN ATENCIONES A ON CI.ID_CLIENTE = A.ID_CLIENTE AND CI.ID_MASCOTA = A.ID_MASCOTA AND CI.FECHA_CITA = A.FECHA_CITA
LEFT JOIN PERSONAL PE ON A.ID_PERSONAL = PE.ID_PERSONAL
LEFT JOIN RECOMENDACIONES R ON A.ID_CLIENTE = R.ID_CLIENTE AND A.ID_MASCOTA = R.ID_MASCOTA AND A.FECHA_CITA = R.FECHA_CITA
LEFT JOIN DIAGNOSTICOS D ON A.ID_CLIENTE = D.ID_CLIENTE AND A.ID_MASCOTA = D.ID_MASCOTA AND A.FECHA_CITA = D.FECHA_CITA