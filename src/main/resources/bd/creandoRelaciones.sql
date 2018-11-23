alter table alumnos add column fk_Alu_Cur int null;
alter table alumnos add constraint fk_Alu_Cur foreign key (fk_Alu_Cur)
references cursos(id) on delete cascade;

alter table usuarios add column fk_Usu_Pro int null;
alter table usuarios add constraint fk_Usu_Pro foreign key (fk_Usu_Pro)
references profesores(id) on delete cascade;

alter table materias_alumnos add column fk_Mat_Alu int null;
alter table materias_alumnos add constraint fk_Mat_Alu foreign key (fk_Mat_Alu)
references alumnos(id) on delete cascade;

alter table materias_alumnos add column fk_Mat int null;
alter table materias_alumnos add constraint fk_Mat foreign key (fk_Mat)
references materias(id) on delete cascade;
/*
alter table materias_alumnos add column fk_Mat_Exa int null;
alter table materias_alumnos add constraint fk_Mat_Exa foreign key (fk_Mat_Exa)
references examenes(id) on delete cascade;

alter table materias_alumnos add column fk_Mat_Pra int null;
alter table materias_alumnos add constraint fk_Mat_Pra foreign key (fk_Mat_Pra)
references practicos(id) on delete cascade; */

alter table materias add column fk_Mat_Pro int null;
alter table materias add constraint fk_Mat_Pro foreign key (fk_Mat_Pro)
references profesores(id) on delete cascade;

alter table agendas add column fk_Age_Mat int null;
alter table agendas add constraint fk_Age_Mat foreign key (fk_Age_Mat)
references materias(id) on delete cascade;


alter table cursos add column fk_Cur_Div int null;
alter table cursos add constraint fk_Cur_Div foreign key (fk_Cur_Div)
references divisiones(id) on delete cascade;