´/*PRUEBO CON EL USUARIO BIBLIO QUE TIENE EL ROL DE BIBLIOTECARIO
PARA ELLO CREO UNA CONEXIÓN CON ESE USUARIO
    NOMBRE DE LA CONEXIÓN EL QUE QUIERA: PruebaUserBiblio
    usuario:biblio
    pass:biblio

prueno los privilegios de su rol*/


SELECT * FROM EjercicioDDL_DCL.LIBROS;
SELECT * FROM EjercicioDDL_DCL.AUTORES;
SELECT * FROM EjercicioDDL_DCL.PRESTAMOS;

/*no tiene privilegios*/
INSERT INTO EjercicioDDL_DCL.AUTORES VALUES (4, 'Miguel de Cervantes', 'España');

/*sí tiene privilegios*/
INSERT INTO EjercicioDDL_DCL.PRESTAMOS VALUES (4, 3, TO_DATE('2021-01-01', 'YYYY-MM-DD'), TO_DATE('2021-01-15', 'YYYY-MM-DD'), 2); 