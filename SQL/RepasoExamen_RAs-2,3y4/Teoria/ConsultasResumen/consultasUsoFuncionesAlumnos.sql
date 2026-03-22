--Mostrar el nombre del cliente en mayúsculas y su email en minúsculas
SELECT UPPER(NOMBRE) AS NOMBRE, LOWER(EMAIL) AS EMAIL
FROM CLIENTES;

--Mostrar el nombre del cliente y la longitud de su nombre
SELECT NOMBRE, LENGTH(NOMBRE) AS LONGITUD_NOMBRE
FROM CLIENTES;

--Mostrar los clientes cuyo email termina en .com
SELECT NOMBRE, EMAIL
FROM USUARIOS
WHERE SUBSTR(EMAIL,INSTR(EMAIL,'.')) = '.com'; --Esto no sirve

SELECT NOMBRE, EMAIL
FROM USUARIOS
WHERE SUBSTR(EMAIL,-4) = '.com';

SELECT NOMBRE, EMAIL
FROM USUARIOS
WHERE email LIKE '%.com';

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
SELECT MOTIVO, TO_CHAR(FECHA_CITA,'DD/MM/YY')
FROM CITAS;

--Mostrar las mascotas, con sus dueños y su edad (la de la mascota) aproximada en años ordenadas por nombre de dueño
SELECT M.NOMBRE, D.NOMBRE, ROUND(MONTHS_BETWEEN(SYSDATE,FECHA_NAC)/12) AS EDAD
FROM CLIENTES D JOIN MASCOTAS M ON D.ID_CLIENTE = M.ID_CLIENTE
ORDER BY D.NOMBRE;

--Mostrar las citas(para qué mascota son, de qué cliente y con qué motivo) cuya fecha sea anterior a hoy
SELECT M.MASCOTAS, CLI.NOMBRE, C.MOTIVO, FECHA_CITA
FROM CITAS C JOIN MASCOTAS M ON C.ID_MASCOTA = M.ID_MASCOTA AND C.ID_CLIENTE = M.ID_CLIENTE
JOIN CLIENTES CLI ON C.ID_CLIENTE = CLI.ID_CLIENTE
WHERE FECHA_CITA < SYSDATE;


--Mostrar los pagos realizados(importe y fecha de pago) un día distinto al de la cita(fecha cita) junto con de qué mascota se trata y de qué cliente
SELECT P.IMPORTE, P.FECHA_PAGO, CI.FECHA_CITA, M.NOMBRE, C.NOMBRE
FROM PAGOS P JOIN MASCOTAS M ON P.ID_MASCOTA = M.ID_MASCOTA
JOIN CLIENTES C ON M.ID_CLIENTE = C.ID_CLIENTE
JOIN CITAS CI ON M.ID_MASCOTA = CI.ID_MASCOTA
WHERE CI.FECHA_CITA != P.FECHA_PAGO;

--Mostrar los pagos redondeando el importe (mostrar toda la info pedida en la consulta anterior)
SELECT ROUND(P.IMPORTE,2), P.FECHA_PAGO, CI.FECHA_CITA, M.NOMBRE, C.NOMBRE
FROM PAGOS P JOIN MASCOTAS M ON P.ID_MASCOTA = M.ID_MASCOTA
JOIN CLIENTES C ON M.ID_CLIENTE = C.ID_CLIENTE
JOIN CITAS CI ON M.ID_MASCOTA = CI.ID_MASCOTA
WHERE CI.FECHA_CITA != P.FECHA_PAGO;


--Mostrar los pagos incrementando el importe en un 21% (IVA) (con toda la información anterior)
SELECT ROUND(P.IMPORTE+P.IMPORTE*0.21,2), P.FECHA_PAGO, CI.FECHA_CITA, M.NOMBRE, C.NOMBRE
FROM PAGOS P JOIN CITAS C ON P.ID_MASCOTA = M.ID_MASCOTA AND P.ID_CLIENTE = C.ID_CLIENTE AND P.FECHA_CITA = C.FECHA_CITA
JOIN MASCOTAS M ON C.ID_MASCOTA = M.ID_MASCOTA AND C.ID_CLIENTE = M.ID_CLIENTE
JOIN CLIENTES CI ON C.ID_CLIENTE = CLI.ID_CLIENTE;

--Mostrar los pagos (con el iva calculado) truncados
SELECT TRUNC(P.IMPORTE+P.IMPORTE*0.21), P.FECHA_PAGO, CI.FECHA_CITA, M.NOMBRE, C.NOMBRE
FROM PAGOS P JOIN CITAS C ON P.ID_MASCOTA = M.ID_MASCOTA AND P.ID_CLIENTE = C.ID_CLIENTE AND P.FECHA_CITA = C.FECHA_CITA
JOIN MASCOTAS M ON C.ID_MASCOTA = M.ID_MASCOTA AND C.ID_CLIENTE = M.ID_CLIENTE
JOIN CLIENTES CI ON C.ID_CLIENTE = CLI.ID_CLIENTE;

--Mostrar las mascotas indicando su nombre o “SIN NOMBRE” (por si fuera nulo)
SELECT NVL(NOMBRE, 'SIN NOMBRE') AS NOMBRE_MASCOTA, ESPECIE
FROM MASCOTAS;

--Mostrar las citas(nombre mascota, nombre cliente) indicando motivo o “SIN MOTIVO”
SELECT M.NOMBRE AS NOMBRE_MASCOTA, M.NOMBRE AS NOMBRE_CLIENTE, NVL(CI.MOTIVO, 'SIN MOTIVO')
FROM MASCOTAS M JOIN CITAS C ON M.ID_MASCOTA = C.ID_MASCOTA AND M.ID_CLIENTE = C.ID_CLIENTE
JOIN CLIENTES CLI ON CLI.ID_CLIENTE = C.ID_CLIENTE;

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
SELECT NOMBRE, TRUNC(MONTHS_BETWEEN(SYSDATE,FECHA_NAC)/12) AS AÑOS,
    CASE
        WHEN TRUNC(MONTHS_BETWEEN(SYSDATE,FECHA_NAC)/12) < 5 THEN 'JOVEN'
        ELSE 'ADULTA'
    END AS CLASIFICACION
FROM MASCOTAS;

--Indicar si una cita tiene pago o no (muestra nombre de mascota, de cliente, motivo de la cita y fecha)
SELECT M.NOMBRE AS NOMBRE_MASCOTA, C.NOMBRE AS NOMBRE_CLIENTE, CI.MOTIVO, CI.FECHA_CITA,
    CASE
        WHEN IMPORTE IS NULL THEN 'NO'
        ELSE 'SI'
    END AS TIENE_PAGO
FROM CITAS CI JOIN MASCOTAS M ON CI.ID_MASCOTA = M.ID_MASCOTA
JOIN CLIENTES CI ON M.ID_CLIENTE = CI.ID_CLIENTE
LEFT JOIN PAGOS P ON P.ID_MASCOTA = M.ID_MASCOTA
AND P.FECHA_PAGO = CI.FECHA_PAGO;



--Clasificar tipo de atención (Veterinario / Auxiliar)
SELECT NOMBRE, DECODE(ROL, 'Veterinario', 'Veterinario','Auxiliar','Auxiliar') AS TIPO_ATENCION
FROM PERSONAL;


--Mostrar las mascotas cuyo nombre tenga más de 4 caracteres, con su especie y dueño
SELECT M.NOMBRE, M.ESPECIE, C.NOMBRE
FROM MASCOTAS M JOIN CLIENTES C ON M.ID_CLIENTE = C.ID_CLIENTE
WHERE LENGTH(M.NOMBRE) > 4;


--Mostrar nombre del cliente, nombre de la mascota y fecha de la cita en formato texto (debe aparecer con formato Lunes 15 de enero),
--es decir, día de la semana, número de día 'de' mes.
SELECT C.NOMBRE, M.NOMBRE, TO_CHAR(CI.FECHA_CITA,'Day DD "de" Month') AS FECHA_CITA
FROM MASCOTAS M JOIN CLIENTES C ON M.ID_CLIENTE = C.ID_CLIENTE
JOIN CITAS CI ON M.ID_MASCOTA = CI.ID_MASCOTA;


--Mostrar toda la información: nombre de cliente, nombre de mascota, fecha de la cita, motivo, quién atendió, 
    --si era veterinario mostrar 'atención médica'
    --si era auxiliar mostrar 'apoyo auxiliar'
--las observaciones registradas (o 'no hay'), las recomendaciones registradas (o 'no hay'),
--el diagnóstico registrado (o 'no hay')
SELECT C.NOMBRE AS NOMBRE_CLIENTE, M.NOMBRE AS NOMBRE_MASCOTA, CI.FECHA_CITA, CI.MOTIVO,
    CASE 
        WHEN E.ROL = 'Veterinario' THEN 'atención médica'
        WHEN E.ROL = 'Auxiliar' THEN 'apoyo auxiliar'
        ELSE 'otro'
    END AS TIPO_ATENCION,
    NVL(CI.OBSERVACIONES, 'no hay') AS OBSERVACIONES,
    NVL(CI.RECOMENDACIONES, 'no hay') AS RECOMENDACIONES,
    NVL(CI.DIAGNOSTICO, 'no hay') AS DIAGNOSTICO
FROM CITAS CI JOIN MASCOTAS M ON CI.ID_MASCOTA = M.ID_MASCOTA
JOIN CLIENTES C ON M.ID_CLIENTE = C.ID_CLIENTE
JOIN EMPLEADOS E ON CI.ID_EMPLEADO = E.ID_EMPLEADO;


