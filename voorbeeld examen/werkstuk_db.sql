/* DDL */
DROP DATABASE IF EXISTS `werkstuk_db`;

CREATE DATABASE `werkstuk_db`
/*COLLATE Latin1_General_CS_AS*/
/*!10400 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */
/*!80016 DEFAULT ENCRYPTION='N' */;

USE `werkstuk_db`;

CREATE TABLE `boek` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
    `titel` varchar(50) NOT NULL,
    `prijs` double NOT NULL,
    `paginas` double NOT NULL,
    `auteur` int UNSIGNED NOT NULL REFERENCES auteur(id),
    `isbn` int NOT NULL,
    `genre` enum ('THRILLER','KINDERBOEK','ROMAN','DETECTIVE') NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `id_UNIQUE` (`id`),
    UNIQUE KEY `isbn_UNIQUE` (`isbn`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci KEY_BLOCK_SIZE=16;

ALTER TABLE `boek` ADD UNIQUE `unique_index`(`titel`, `prijs`, `paginas`, `auteur`,`isbn`,`genre`);

/* DML */
INSERT INTO `boek` (`titel`,`prijs`,`paginas`,`auteur`,`isbn`,`genre`) VALUES ('The Lion, The Witch and the Wardrobe','155','5','1','1','ROMAN');
INSERT INTO `boek` (`titel`,`prijs`,`paginas`,`auteur`,`isbn`,`genre`) VALUES ('The Da Vinci Code','145','75','2','2','THRILLER');
INSERT INTO `boek` (`titel`,`prijs`,`paginas`,`auteur`,`isbn`,`genre`) VALUES ('The Alchemist','248','44','3','3','THRILLER');
INSERT INTO `boek` (`titel`,`prijs`,`paginas`,`auteur`,`isbn`,`genre`) VALUES ('Lolita','478','58','4','4','DETECTIVE');
INSERT INTO `boek` (`titel`,`prijs`,`paginas`,`auteur`,`isbn`,`genre`) VALUES ('The Eagle Has Landed','578','58','4','5','THRILLER');


CREATE TABLE `auteur` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
    `naam` varchar(15) NOT NULL,
    `voornaam` varchar(15) NOT NULL,
    `geboortedatum` date NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `id_UNIQUE` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci KEY_BLOCK_SIZE=16;

ALTER TABLE `auteur` ADD UNIQUE `unique_index`(`naam`, `voornaam`, `geboortedatum`);

/* DML */
INSERT INTO `auteur` (`naam`,`voornaam`,`geboortedatum`) VALUES ('C.S.', 'Lewis','1999-10-12');
INSERT INTO `auteur` (`naam`,`voornaam`,`geboortedatum`) VALUES ('Brown', 'Dan','1989-10-12');
INSERT INTO `auteur` (`naam`,`voornaam`,`geboortedatum`) VALUES ('Coelho', 'Paulo','1989-10-12');
INSERT INTO `auteur` (`naam`,`voornaam`,`geboortedatum`) VALUES ('Nabokov', 'Vladimir','1989-10-12');
INSERT INTO `auteur` (`naam`,`voornaam`,`geboortedatum`) VALUES ('Higgins', 'Jack','1989-10-12');
