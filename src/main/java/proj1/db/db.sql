CREATE TABLE `firma_transpotowa`.`Raporty` (
  `ID` INT NOT NULL,
  `listaKierowcow` VARCHAR(200) NULL,
  `listaPojazdów` VARCHAR(200) NULL,
  `listaRezerwacji` VARCHAR(200) NULL,
  PRIMARY KEY (`ID`));

CREATE TABLE `firma_transpotowa`.`Nagrody` (
  `ID` INT NOT NULL,
  `iloscPkt` INT NULL,
  `iloscSztuk` INT NULL,
  `nazwa` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`));


CREATE TABLE `firma_transpotowa`.`Pojazd` (
  `ID` INT NOT NULL,
  `iloscKM` DOUBLE NULL,
  `iloscMiejsc` INT NULL,
  `marka` VARCHAR(45) NULL,
  `miejsceParkingowe` VARCHAR(45) NULL,
  `model` VARCHAR(45) NULL,
  `numerPojazdu` VARCHAR(45) NULL,
  `srednieZuzyciePaliwa` DOUBLE NULL,
  PRIMARY KEY (`ID`));

CREATE TABLE `firma_transpotowa`.`Cennik` (
  `ID` INT NOT NULL,
  `cena` DOUBLE NULL,
  PRIMARY KEY (`ID`));

CREATE TABLE `firma_transpotowa`.`Klient` (
  `ID` INT NOT NULL,
  `Imie` VARCHAR(45) NULL,
  `Nazwisko` VARCHAR(45) NULL,
  `nrTelefonu` VARCHAR(45) NULL,
  `iloscPkt` INT NULL,
  `Email` VARCHAR(45) NULL,
  `Zniżka` DOUBLE NULL,
  PRIMARY KEY (`ID`));


CREATE TABLE `firma_transpotowa`.`Przystanek` (
  `ID` INT NOT NULL,
  `miejscowosc` VARCHAR(45) NULL,
  `nazwaPrzystanku` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`));

CREATE TABLE `firma_transpotowa`.`Rezerwacje` (
  `ID` INT NOT NULL,
  `Cena` DOUBLE NULL,
  `date` DATE NULL,
  `listaKlientow` VARCHAR(45) NULL,
  `Przystanek_ID` INT NOT NULL,
  `Klient_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY(Klient_ID) REFERENCES Klient(ID),
  FOREIGN KEY(Przystanek_ID) REFERENCES Przystanek(ID)
  );

CREATE TABLE `firma_transpotowa`.`Pracownicy` (
  `ID` INT NOT NULL,
  `Imie` VARCHAR(45) NULL,
  `Nazwisko` VARCHAR(45) NULL,
  `Stanowisko` VARCHAR(45) NULL,
  `Cennik_ID` INT NOT NULL,
  `Pojazd_ID` INT NOT NULL,
  `Rezerwacja_ID` INT NOT NULL,
  `Nagroda_ID` INT NOT NULL,
  `Raport_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY(Cennik_ID) REFERENCES Cennik(ID),
  FOREIGN KEY(Pojazd_ID) REFERENCES Pojazd(ID),
  FOREIGN KEY(Rezerwacja_ID) REFERENCES Rezerwacje(ID),
  FOREIGN KEY(Nagroda_ID) REFERENCES Nagrody(ID),
  FOREIGN KEY(Raport_ID) REFERENCES Raporty(ID),
  );


CREATE TABLE `firma_transpotowa`.`Grafik` (
  `ID` INT NOT NULL,
  `dataRozpoczecia` DATE NULL,
  `dataZakonczenia` DATE NULL,
  `harmonogram` VARCHAR(45) NULL,
  `Pracownicy_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY(Pracownicy_ID) REFERENCES Pracownicy(ID)
  );


CREATE TABLE `firma_transportowa1`.`User` (
  `ID` INT NOT NULL,
  `email` VARCHAR(100) NULL,
  `enabled` BIT NULL,
  `password` VARCHAR(245) NULL,
  `secret` VARCHAR(245) NULL,
  `username` VARCHAR(245) NULL,
  PRIMARY KEY (`ID`));


CREATE TABLE `firma_transportowa1`.`User_roles` (
  `User_ID` INT NOT NULL,
  `roles` VARCHAR(45) NULL);
