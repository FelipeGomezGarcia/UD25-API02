drop table if exists Empleados;
drop table if exists Departamentos;

create table Departamentos(
codigo int,
nombre varchar(100),
presupuesto int,
Primary key(codigo)
);

create table Empleados (
DNI varchar(9) not null,
nombre varchar (100),
apellidos varchar(255),
departamento int,
primary key (DNI),
constraint fk_codigoDepartamento FOREIGN KEY (departamento) 
REFERENCES Departamentos(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

insert into departamentos values 
(1,'Ventas',40000),
(2,'Diseño',30000),
(3,'RRHH',35000),
(4,'Marketing',60000);

insert into empleados values
('12345678E','Felipe','Gonzalez',4),
('12456326C','Irene','Garcia',1),
('97868472T','Alberto','Gonzalez',4),
('27426432G','Aurora','Gomez',3),
('32459682F','David','Diaz',2);
