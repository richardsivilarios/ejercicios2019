ALTER TABLE Hijo DROP CONSTRAINT madrehijo;
DROP TABLE IF EXISTS Madre CASCADE;
DROP TABLE IF EXISTS Hijo CASCADE;
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
ALTER TABLE Hijo ADD CONSTRAINT madrehijo FOREIGN KEY (MadreCi) REFERENCES Madre (Ci);
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('1', 'maria', 'perez');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('2', 'carla', 'suarez');
INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('3', 'daniela', 'rios');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('1', '1', 'filemon');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('2', '1', 'ricardo');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('3', '2', 'manuel');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('4', '2', 'carlos');
INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('5', '2', 'gonzalo');
