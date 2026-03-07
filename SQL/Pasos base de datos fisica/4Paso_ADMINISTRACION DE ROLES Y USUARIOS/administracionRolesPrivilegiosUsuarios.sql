/*
Gestión de roles y usuarios desde el usuario propietario de la base de datos
    Para esto el usuario tiene que tener los permisos
    
    GRANT CREATE SESSION TO EjemploDDL_DCL WITH ADMIN OPTION;
    GRANT CREATE TABLE TO EjemploDDL_DCL WITH ADMIN OPTION;
    GRANT CREATE ROLE TO EjemploDDL_DCL; 
    GRANT CREATE USER TO EjemploDDL_DCL; 
    GRANT DROP ANY ROLE TO EjemploDDL_DCL;
    GRANT DROP USER TO EjemploDDL_DCL;
*/
CREATE ROLE administrador;
CREATE ROLE bibliotecario;
CREATE ROLE usuario;

GRANT CREATE SESSION, CREATE TABLE TO administrador;
GRANT CREATE SESSION TO bibliotecario;
GRANT CREATE SESSION TO usuario;    

GRANT SELECT, INSERT, UPDATE, DELETE ON LIBROS TO administrador;
GRANT SELECT, INSERT, UPDATE, DELETE ON AUTORES TO administrador;
GRANT SELECT, INSERT, UPDATE, DELETE ON USUARIOS TO administrador;

GRANT SELECT ON Libros TO bibliotecario;
GRANT SELECT ON Autores TO bibliotecario;
GRANT SELECT, INSERT, UPDATE, DELETE ON Prestamos TO bibliotecario;

GRANT SELECT ON LIBROS TO usuario;
GRANT SELECT ON AUTORES TO usuario;
GRANT SELECT ON PRESTAMOS TO usuario;

CREATE USER admin IDENTIFIED BY admin;
CREATE USER biblio IDENTIFIED BY biblio;
CREATE USER usus IDENTIFIED BY usus;

GRANT administrador TO admin;
GRANT bibliotecario TO biblio;
GRANT usuario TO usus;  
