CREATE USER practicaGuiadaDisparadores IDENTIFIED BY practicaGuiadaDisparadores;

GRANT CREATE SESSION TO practicaGuiadaDisparadores WITH ADMIN OPTION;
GRANT CREATE TABLE TO practicaGuiadaDisparadores WITH ADMIN OPTION;
GRANT CREATE PROCEDURE TO practicaGuiadaDisparadores;
GRANT CREATE TRIGGER TO practicaGuiadaDisparadores;


/*ROLES*/
GRANT CREATE ROLE TO practicaGuiadaDisparadores;
GRANT DROP ANY ROLE TO practicaGuiadaDisparadores;
/*USUARIOS*/
GRANT CREATE USER TO practicaGuiadaDisparadores;
GRANT DROP USER TO practicaGuiadaDisparadores;

GRANT CREATE SEQUENCE TO practicaGuiadaDisparadores;

ALTER USER practicaGuiadaDisparadores QUOTA UNLIMITED ON USERS;

--Usuario creado--
SET SERVEROUTPUT ON;