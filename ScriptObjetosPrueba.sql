-- SCRIPTS DE DATOS

-- Todos los datos se cargan en la aplicacion con su uso pero al hacer el insert desde el script no carga
-- bien caracteres de utf-8

-- Usuarios

INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('administrador@eventosgo.com', '12345', 'Administrador Julian', 0);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('juanma@gmail.com', '12345', 'Juan Manuel', 4);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('pablo@gmail.com', '12345', 'Pablo', 4);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('fundacion@eventosgo.com', '12345', 'Fundacion Victoria', 1);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('rodrigo@eventosgo.com', '12345', 'Rodrigo', 2);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('pancha@eventosgo.com', '12345', 'Pancha', 2);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('unicaja@eventosgo.com', '12345', 'Unicaja', 1);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('stephen@eventosgo.com', '12345', 'Stephen Hawking', 3);
INSERT INTO EVENTOSGO.USUARIO (CORREO, CONTRASENA, NOMBRE, ROL) 
	VALUES ('albert@eventosgo.com', '12345', 'Albert Einstein', 3);

INSERT INTO EVENTOSGO.USUARIO_EVENTO (ID, APELLIDOS, DOMICILIO, CIUDAD, FECHA_NACIMIENTO, SEXO) 
	VALUES (2, 'Gonzalez', 'Malaga Capital', 'Malaga', '2000-09-02', 0);
INSERT INTO EVENTOSGO.USUARIO_EVENTO (ID, APELLIDOS, DOMICILIO, CIUDAD, FECHA_NACIMIENTO, SEXO) 
	VALUES (3, 'Duran', 'Kandinsky', 'Malaga', '2000-11-01', 0);

-- Eventos

INSERT INTO EVENTOSGO.EVENTO (TITULO, DESCRIPCION, FECHA_EVENTO, FECHA_FIN_RESERVAS, COSTE, MAXIMO_ENTRADAS_USUARIO, AFORO, ID_CREADOR) 
	VALUES ('Cine de verano', 'Tintin y el Secreto del Unicornio', '2021-06-13', '2021-06-16', 0.0, 3, 25, 4);
INSERT INTO EVENTOSGO.EVENTO (TITULO, DESCRIPCION, FECHA_EVENTO, FECHA_FIN_RESERVAS, COSTE, MAXIMO_ENTRADAS_USUARIO, AFORO, ID_CREADOR) 
	VALUES ('Carrera de Karts', 'Carrera en Campillos', '2021-07-31', '2021-07-18', 30.0, 1, 12, 4);

-- Etiquetas

INSERT INTO EVENTOSGO.ETIQUETA (NOMBRE) 
	VALUES ('Cine');
INSERT INTO EVENTOSGO.ETIQUETA (NOMBRE) 
	VALUES ('ocio');
INSERT INTO EVENTOSGO.ETIQUETA (NOMBRE) 
	VALUES ('Ocio');
INSERT INTO EVENTOSGO.ETIQUETA (NOMBRE) 
	VALUES ('Verano');
INSERT INTO EVENTOSGO.ETIQUETA (NOMBRE) 
	VALUES ('Coches');
INSERT INTO EVENTOSGO.ETIQUETA (NOMBRE) 
	VALUES ('Velocidad');

INSERT INTO EVENTOSGO.EVENTO_ETIQUETA (ID_EVENTO, ID_ETIQUETA) 
	VALUES (1, 1);
INSERT INTO EVENTOSGO.EVENTO_ETIQUETA (ID_EVENTO, ID_ETIQUETA) 
	VALUES (1, 2);
INSERT INTO EVENTOSGO.EVENTO_ETIQUETA (ID_EVENTO, ID_ETIQUETA) 
	VALUES (2, 3);
INSERT INTO EVENTOSGO.EVENTO_ETIQUETA (ID_EVENTO, ID_ETIQUETA) 
	VALUES (1, 4);
INSERT INTO EVENTOSGO.EVENTO_ETIQUETA (ID_EVENTO, ID_ETIQUETA) 
	VALUES (2, 5);
INSERT INTO EVENTOSGO.EVENTO_ETIQUETA (ID_EVENTO, ID_ETIQUETA) 
	VALUES (2, 6);

-- Entradas

INSERT INTO EVENTOSGO.ENTRADA (ID_EVENTO, ID_USUARIO) 
	VALUES (1, 2);
INSERT INTO EVENTOSGO.ENTRADA (ID_EVENTO, ID_USUARIO) 
	VALUES (1, 2);
INSERT INTO EVENTOSGO.ENTRADA (ID_EVENTO, ID_USUARIO) 
	VALUES (1, 2);
INSERT INTO EVENTOSGO.ENTRADA (ID_EVENTO, ID_USUARIO) 
	VALUES (2, 2);

-- Conversaciones

INSERT INTO EVENTOSGO.CONVERSACION (ASUNTO, ID_TELEOPERADOR, ID_USUARIO) 
	VALUES ('He creado un evento y no me sale en la lista', 5, 4);
INSERT INTO EVENTOSGO.CONVERSACION (ASUNTO, ID_TELEOPERADOR, ID_USUARIO) 
	VALUES ('He comprado una entrada y no me aparece', 6, 2);

-- Mensajes

INSERT INTO EVENTOSGO.MENSAJE (ID_CONVERSACION, ID_USUARIO, FECHA, HORA, TEXTO, VISTO) 
	VALUES (1, 4, '2021-05-16', '21:10:50', 'Hola no se realmento como se crea bien un evento, como seria', 0);
INSERT INTO EVENTOSGO.MENSAJE (ID_CONVERSACION, ID_USUARIO, FECHA, HORA, TEXTO, VISTO) 
	VALUES (2, 2, '2021-05-16', '21:15:16', 'He comprado una entrada y ya no me aparece, que timais', 0);

-- Estudios

INSERT INTO EVENTOSGO.ESTUDIO (ID_ANALISTA, TITULO, RESULTADO) 
	VALUES (8, 'Usuarios menores de 25 anios que se han apuntado a cualquier evento durante el 2021', '0;24;;2021;0;1;2');
INSERT INTO EVENTOSGO.ESTUDIO (ID_ANALISTA, TITULO, RESULTADO) 
	VALUES (8, 'Usuarios masculinos menores de 26 anios', '0;25;;-1;0;-1;-1');


																													
