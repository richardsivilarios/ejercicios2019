CREATE TABLE Madre (
  Ci       varchar(255) NOT NULL, 
  Nombre   varchar(255), 
  Apellido varchar(255), 
  PRIMARY KEY (Ci));
CREATE TABLE Hijo (
  Ci      varchar(255) NOT NULL, 
  MadreCi varchar(255) NOT NULL, 
  Nombre  varchar(255), 
  PRIMARY KEY (Ci));
ALTER TABLE Hijo ADD CONSTRAINT FKHijo435143 FOREIGN KEY (MadreCi) REFERENCES Madre (Ci);
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('1', 'Maria', 'Perez');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('2', 'Martha', 'Copa');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('3', 'Ana', 'Castellon');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('1', '1', 'Pedro');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('2', '1', 'Cecilia');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('3', '2', 'Ricardo');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('4', '3', 'Angel');
