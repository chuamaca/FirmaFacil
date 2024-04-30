USE MASTER;

DROP DATABASE FIRMAFACIL;


CREATE database FIRMAFACIL;

USE  FIRMAFACIL;


CREATE TABLE Usuario(
	IdUsuario int IDENTITY(1,1) NOT NULL,
	NombreUsuario varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	Contrasena varchar(MAX) COLLATE Modern_Spanish_CI_AS NULL,
	Correo varchar(MAX) COLLATE Modern_Spanish_CI_AS NULL,
	TipoDocumento varchar(10) COLLATE Modern_Spanish_CI_AS NULL,
	NumeroDocumento varchar(10) COLLATE Modern_Spanish_CI_AS NULL,
	Imagen varchar(MAX) COLLATE Modern_Spanish_CI_AS NULL,
	Estado int NULL,
	UsuarioCrea int NOT NULL,
	FechaCrea datetime2 NOT NULL,
	UsuarioModifica int NULL,
	FechaModifica datetime2 NULL,
	UsuarioElimina int NULL,
	FechaElimina datetime2 NOT NULL,
	CONSTRAINT PK__Usuario__1788CC4CEF453EEC PRIMARY KEY (IdUsuario)
);


CREATE TABLE Cliente (
	IdCliente int IDENTITY(1,1) NOT NULL,
	Nombre varchar(100) COLLATE Modern_Spanish_CI_AS NULL,
	NumeroDocumento varchar(20) COLLATE Modern_Spanish_CI_AS NULL,
	Direccion varchar(MAX) COLLATE Modern_Spanish_CI_AS NULL,
	Telefono varchar(20) COLLATE Modern_Spanish_CI_AS NULL,
	Correo varchar(255) COLLATE Modern_Spanish_CI_AS NULL,
	Estado int NOT NULL,
	UsuarioCrea int NOT NULL,
	FechaCrea datetime2 NOT NULL,
	UsuarioModifica int NULL,
	FechaModifica datetime2 NULL,
	UsuarioElimina int NULL,
	FechaElimina datetime2 NULL,
	CONSTRAINT PK__Cliente__E67E1A24905183B9 PRIMARY KEY (IdCliente)
);

-- Categoria de FIrmas (Firma Simple, Avanzada)
CREATE TABLE Categoria (
	IdCategoria int IDENTITY(1,1) NOT NULL,
	Nombre nvarchar(100) COLLATE Modern_Spanish_CI_AS NULL,
	Descripcion nvarchar(MAX) COLLATE Modern_Spanish_CI_AS NULL,
	UsuarioCrea int NOT NULL,
	FechaCrea datetime2 NOT NULL,
	UsuarioModifica int NULL,
	FechaModifica datetime2 NULL,
	UsuarioElimina int NULL,
	FechaElimina datetime2 NULL,
	Estado int NOT NULL,
	CONSTRAINT PK__Categori__19093A0BE54103B6 PRIMARY KEY (IdCategoria)
);


CREATE TABLE Documento (
IdDocumento int IDENTITY(1,1) NOT NULL,
IdCliente int NULL,
IdCategoria int NULL,
ArchivoOrigen varbinary(MAX) NULL,
TipoDocumento varchar(10)  NULL,
NombreDocumento varchar(50)  NULL,
Estado int NULL,
UsuarioCrea int NOT NULL,
FechaCrea datetime2 NOT NULL,
UsuarioModifica int NULL,
FechaModifica datetime2 NULL,
UsuarioElimina int NULL,
FechaElimina datetime2 NULL,
CONSTRAINT PK__Documento__1EE3C4532 PRIMARY KEY (IdDocumento),
CONSTRAINT FK_Documento_Cliente FOREIGN KEY (IdCliente) REFERENCES Cliente(IdCliente),
CONSTRAINT FK_Documento_Categoria FOREIGN KEY (IdCategoria) REFERENCES Categoria(IdCategoria)
)


-- Files
CREATE TABLE Servicio(
	IdServicio int IDENTITY(1,1) NOT NULL,
	IdUsuario int NULL,
	IdDocumento int NULL,
	ContenidoDocumento varbinary(MAX) NULL,
	TipoDocumento varchar(10)  NULL,
	NombreDocumento varchar(50)  NULL,
	Lugar varchar(50)  NULL,
	FechaServicio datetime2 NULL,
	FechaVigencia datetime2 NULL,
	Estado int NULL,
	UsuarioCrea int NOT NULL,
	FechaCrea datetime2 NOT NULL,
	UsuarioModifica int NULL,
	FechaModifica datetime2 NULL,
	UsuarioElimina int NULL,
	FechaElimina datetime2 NULL,
	CONSTRAINT PK__Servicio__1EE3C3FF2E104532 PRIMARY KEY (IdServicio),
	CONSTRAINT FK_Servicio_Usuario FOREIGN KEY (IdUsuario) REFERENCES Usuario(IdUsuario),
	CONSTRAINT FK_Documento_Servicio FOREIGN KEY (IdDocumento) REFERENCES Documento(IdDocumento)
);


alter table Documento
alter column NombreDocumento varchar(max)







