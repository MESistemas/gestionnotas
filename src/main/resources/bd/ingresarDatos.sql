

insert into divisiones(nombre_Division) values
('A'),
('B');

insert into cursos(nombre_Curso, cantidad_Alumnos, fk_Cur_Div) values
('3',13,1),
('3',13,2);

insert into profesores(nombre, apellido, dni, genero, fecha_Nacimiento) values
('Luisina', 'Espindola', '28374944', 'F', '1989-04-22');

insert into alumnos(nombre,apellido,dni,genero,fecha_Nacimiento,fk_Alu_Cur) values
('Lucas', 'Escobar', '25111000', 'M', '1996-05-25',1),
('Martín', 'Perez', '25000555', 'M', '1996-05-25',1),
('Lucas', 'Martinez', '25000444', 'M', '1996-05-25',1),
('Pedro', 'Torres', '25000333', 'M', '1996-05-25',1),
('Leonardo', 'Britez', '25230234', 'M', '1996-05-25',1),
('Patricio', 'Jacobo', '25111001', 'M', '1996-05-25',1),
('Carlos', 'Lucrecio', '25001911', 'M', '1996-05-25',1),
('Carla', 'Perez', '25000333', 'F', '1996-05-25',1),
('Florencia', 'Alario', '25111222', 'F', '1996-05-25',1),
('María', 'Martinez', '25222111', 'F', '1996-05-25',1),
('Lourdes', 'Espinoza', '25333999', 'F', '1996-05-25',1),
('Ludmila', 'Ruth', '25666333', 'F', '1996-05-25',1),
('Fiorela', 'Perez', '25888333', 'F', '1996-05-25',1),

('Javier', 'Lopez', '25909090', 'M', '1996-05-25',2),
('Jorge', 'Aguirre', '25434343', 'M', '1996-05-25',2),
('Dario', 'Sosa', '25232232', 'M', '1996-05-25',2),
('Ruben', 'Sanchez', '25123123', 'M', '1996-05-25',2),
('Pablo', 'Villareal', '25434344', 'M', '1996-05-25',2),
('Franco', 'Acosta', '25934344', 'M', '1996-05-25',2),
('Federico', 'Pratto', '25854534', 'M', '1996-05-25',2),
('Melani', 'Martinez', '25794565', 'F', '1996-05-25',2),
('Rosario', 'Ingrid', '25676765', 'F', '1996-05-25',2),
('María', 'Palacios', '25545646', 'F', '1996-05-25',2),
('Micaela', 'Jacobo', '25231314', 'F', '1996-05-25',2),
('Karen', 'Esquivel', '25123934', 'F', '1996-05-25',2),
('Eugenia', 'Toledo', '25329324', 'F', '1996-05-25',2);

insert into materias(nombre_Materia, fk_Mat_Pro) values
('Informática I', 1),
('Informática II', 1);

insert into calendarios_de_Materias(titulo, descripcion, fecha, fk_Cal_Mat) values
('Inicio de Clases', 'Comienzo 1er Trimestre', '2019-03-04', 1),
('Inicio de Clases', 'Comienzo 1er Trimestre', '2019-03-05', 2);


select * from cursos;

select * from alumnos;

select * from materias;

select * from profesores;

select * from calendarios_de_Materias;

select * from materias_alumnos;

select nombre_Curso as 'Curso',
	   nombre_Division as 'Division'
from cursos inner join divisiones on divisiones.id = cursos.fk_Cur_Div;

insert into profesores(nombre,apellido,dni,genero,fecha_Nacimiento) values
('Luisina', 'Espindola', '25378394', 'F', '1989-05-25');


insert into usuarios(us,ps,fk_Usu_Per) values
('admin','root',1);