insert into curso (nombre) values ('1A');
insert into curso (nombre) values ('1B');
insert into curso (nombre) values ('2A');
insert into curso (nombre) values ('2B');
insert into curso (nombre) values ('3A');
insert into curso (nombre) values ('3B');
insert into plan (nombre) values ('P2023-2024-1A');
insert into plan (nombre) values ('P2023-2024-1B');
insert into plan (nombre) values ('P2023-2024-2A');
insert into plan (nombre) values ('P2023-2024-2B');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3A','1A');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3B','1B');
insert into tutor (nombre,email) values ('Marcos','marcos@educastur.org');
insert into tutor (nombre,email) values ('Javier','javier@educastur.org');
insert into tutor (nombre,email,plan) values ('Maria','maria@educastur.org',3);
insert into tutor (nombre,email,plan) values ('Marta','marta@educastur.org',4);
insert into tutor (nombre,email,plan) values ('Pedro','pedro@educastur.org',5);
insert into tutor (nombre,email,plan) values ('Lucia','lucia@educastur.org',6);
insert into actividad (obligatoria, nombre, descripcion) values (true, 'Actividad 1', 'Descripción de la Actividad 1');
insert into actividad (obligatoria, nombre, descripcion) values (false, 'Actividad 2', 'Descripción de la Actividad 2');
insert into actividad (obligatoria, nombre, descripcion) values (true, 'Actividad 3', 'Descripción de la Actividad 3');
insert into actividad (obligatoria, nombre, descripcion) values (false, 'Actividad 4', 'Descripción de la Actividad 4');
insert into actividad (obligatoria, nombre, descripcion) values (true, 'Actividad 5', 'Descripción de la Actividad 5');
insert into actividad (obligatoria, nombre, descripcion) values (false, 'Actividad 6', 'Descripción de la Actividad 6');
insert into enmarca (FK_PLAN, FK_ACTIVIDAD, fecha) values (1, 1, '2024-01-24');
insert into enmarca (FK_PLAN, FK_ACTIVIDAD, fecha) values (1, 2, '2024-01-25');









