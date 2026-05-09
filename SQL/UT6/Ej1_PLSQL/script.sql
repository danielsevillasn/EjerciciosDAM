
create table agentes (
     identificador     number(6) not null primary key,
     nombre          varchar2(60) not null,
     apellido        varchar2(11) not null,
     usuario          varchar2(20) not null unique,
     clave          varchar2(20) not null,
     habilidad     number(1) not null,
     categoria     number(1) not null,
     familia          number(6),
     oficina          number(6)
);


CREATE TABLE Productos (
  Codigo varchar(15) NOT NULL primary key,
  Nombre varchar(20) NOT NULL,
  Tienda varchar(20) NOT NULL,
  CantidadEnStock smallint NOT NULL,
  Precio number(15,2) NOT NULL
);


create table TEMP(
     numero          number(6) not null primary key,
     mensaje         varchar2(100) not null
);


create table libros
(
  codigo number(3),
  titulo varchar2(40),
  autor varchar2(30),
  precio number(5,2)
);


CREATE TABLE HRCLIENTE 
(
  id NUMBER NOT NULL,
  nombres VARCHAR(200) NOT NULL,
  apellidos VARCHAR(200) NOT NULL,
  fecha_afiliacion DATE NOT NULL,
  PRIMARY KEY(id)
);


insert into libros values(100,'Uno','Richard Bach',15);
insert into libros values(300,'Aprenda PHP','Mario Molina',55);
insert into libros values(102,'Matematica estas ahi','Paenza',18);
insert into libros values(105,'El aleph','Borges',25);
insert into libros values(109,'El experto en laberintos','Gaskin',20);
insert into libros values(204,'Alicia en el pais de las maravillas','Carroll',31);


INSERT INTO Productos VALUES ('FR-4','tvplasma','Miró',15,900);
INSERT INTO Productos VALUES ('FR-40','tvled','Tien21',400,400);
INSERT INTO Productos VALUES ('FR-41','tv4k','Carrefour',400,800);
INSERT INTO Productos VALUES ('FR-42','tv3D','Alcampo',400,800);
INSERT INTO Productos VALUES ('FR-43','tv3D','El Corte Ingles',400,700);


insert into agentes values (31, 'José Ramón', 'Jiménez', 'jrjr', 'sup31', 9, 2, NULL, 3);
insert into agentes values (311, 'Pedro', 'Fernández', 'pfa', 'ag311', 5, 0, 31, NULL);
insert into agentes values (312, 'Vanesa', 'Sánchez', 'vsr', 'ag312', 5, 0, 31, NULL);
insert into agentes values (313, 'Francisco Javier', 'García', 'fjge', 'ag313', 5, 0, 31, NULL);
insert into agentes values (314, 'Pilar', 'Ramirez', 'prp', 'ag314', 5, 0, 31, NULL);
insert into agentes values (315, 'José Luis', 'García', 'jlgm', 'ag315', 5, 0, 31, NULL);
insert into agentes values (21, 'Sebastián', 'López', 'slo', 'sup21', 9, 2, NULL, 2);
insert into agentes values (211, 'Diosdado', 'Sánchez', 'dsh', 'ag211', 8, 1, 21, NULL);
insert into agentes values (2111, 'José Juan', 'Cano', 'jjcp', 'ag2111', 5, 0, 211, NULL);
insert into agentes values (2112, 'Flor', 'Moncada', 'ag2112', 'fma', 5, 0, 211, NULL);
insert into agentes values (2113, 'Juan Manuel', 'Alcazar', 'jmad', 'ag2113', 5, 0, 211, NULL);
insert into agentes values (2121, 'Manuel Jesús', 'Rubia', 'mjrm', 'ag2121', 5, 0, 212, NULL);
insert into agentes values (2122, 'Esther', 'López', 'eld', 'ag2122', 5, 0, 212, NULL);
insert into agentes values (2123, 'Francisco Javier', 'Cabrerizo', 'fjcm', 'ag2123', 5, 0, 212, NULL);
insert into agentes values (2124, 'Verónica', 'Cabrerizo', 'vcm', 'ag2124', 5, 0, 212, NULL);
insert into agentes values (2125, 'María José', 'Navascués', 'mjnm', 'ag2125', 5, 0, 212, NULL);
insert into agentes values (2131, 'Isabel', 'Cruz', 'icg', 'ag2131', 5, 0, 213, NULL);
insert into agentes values (2132, 'Antonio', 'Casado', 'acf', 'ag2132', 5, 0, 213, NULL);
insert into agentes values (2133, 'Gabriel', 'Callejón', 'gcg', 'ag2133', 5, 0, 213, NULL);
insert into agentes values (2134, 'Enrique', 'Cano', 'ecb', 'ag2134', 5, 0, 213, NULL);
insert into agentes values (11, 'Narciso', 'Jáimez', 'njt', 'sup11', 9, 2, NULL, 1);
insert into agentes values (111, 'Jesús', 'Baños', 'jbs', 'ag111', 8, 1, 11, NULL);
insert into agentes values (1111, 'Salvador', 'Romero', 'srv', 'ag1111', 7, 1, 111, NULL);
insert into agentes values (1112, 'José Javier', 'Bermúdez', 'jjbh', 'ag1112', 7, 1, 111, NULL);
insert into agentes values (1113, 'Alfonso', 'Bonillo', 'abs', 'ag1113', 7, 1, 111, NULL);
insert into agentes values (1121, 'Silvia', 'Thomas', 'stb', 'ag1121', 7, 1, 112, NULL);
insert into agentes values (11211, 'Ernesto', 'Osoro', 'eog', 'ag11211', 5, 0, 1121, NULL);
insert into agentes values (11212, 'Guillermo', 'Campos', 'gcag', 'ag11212', 5, 0, 1121, NULL);
insert into agentes values (11213, 'Antonio', 'Fernández', 'afr', 'ag11213', 5, 0, 1121, NULL);
insert into agentes values (11214, 'María Luisa', 'López', 'mllc', 'ag11214', 5, 0, 1121, NULL);
insert into agentes values (11221, 'Virginia', 'Morenas', 'vmr', 'ag11221', 5, 0, 1121, NULL);
insert into agentes values (11222, 'Rosario', 'Castro', 'rcg', 'ag11222', 5, 0, 1122, NULL);
insert into agentes values (11223, 'Antonio', 'Álvarez', 'aap', 'ag11223', 5, 0, 1122, NULL);
insert into agentes values (11224, 'David', 'Martínez', 'dmm', 'ag11224', 5, 0, 1122, NULL);
insert into agentes values (11225, 'Juan', 'González', 'jcg', 'ag11225', 5, 0, 1122, NULL);
insert into agentes values (11226, 'Eduardo', 'Alfada', 'eap', 'ag11226', 5, 0, 1122, NULL);
insert into agentes values (11231, 'Cayetano', 'García', 'cgh', 'ag11231', 5, 0, 1123, NULL);
insert into agentes values (11232, 'José Antonio', 'Sieres', 'jasv', 'ag11232', 5, 0, 1123, NULL);
insert into agentes values (11233, 'Juan Manuel', 'Guzmán', 'jmgg', 'ag11233', 5, 0, 1123, NULL);