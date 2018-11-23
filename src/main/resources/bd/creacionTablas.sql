drop database gestionNotas;
create database gestionNotas;
use gestionNotas;

create table cursos(
    id int not null primary key auto_increment,
    nombre_Curso varchar(1) not null
);

create table divisiones(
    id int not null primary key auto_increment,
    nombre_Division varchar(1) not null
);

/*
 create table examenes(
   id int not null primary key auto_increment,
    fecha_Examen date not null,
    nota float
 ); */
/*
create table practicos(
    id int not null primary key auto_increment,
    fecha_Practico date not null,
    nota float
);
*/
create table alumnos(
    id int not null primary key auto_increment,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    dni varchar(8) not null,
    genero varchar(1) not null, 
    fecha_Nacimiento varchar(10) not null
);

create table profesores(
    id int not null primary key auto_increment,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    dni varchar(8) not null,
    genero varchar(1) not null, 
    fecha_Nacimiento varchar(10) not null
);

create table usuarios(
    id int not null primary key auto_increment,
    us varchar(15) not null,
    ps varchar(15) not null
);

create table materias_alumnos(
	id int not null primary key auto_increment,
    nota_Primer_Examen int,
    nota_Segundo_Examen int,
    nota_Tercer_Examen int,
    nota_Primer_TP int,
    nota_Segundo_TP int,
	nota_Primer_Trimestre int,
    nota_Segundo_Trimestre int,
    nota_Tercer_Trimestre int,
    nota_Final int,
    condicion varchar(15)
);

create table materias(
    id int not null primary key auto_increment,
    nombre_Materia varchar(25) not null
);

create table agendas(
	id int not null primary key auto_increment,
    titulo varchar(20) not null,
    descripcion varchar(100) not null,
    fecha varchar(10) not null
);

