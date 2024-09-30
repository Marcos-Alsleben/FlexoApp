-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema flexo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema flexo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `flexo` DEFAULT CHARACTER SET utf8 ;


USE `flexo` ;


-- -----------------------------------------------------
-- Table `flexo`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flexo`.`Cliente` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `criado` TIMESTAMP NOT NULL,
  `modificado` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `flexo`.`TipoCliche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flexo`.`TipoCliche` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `criado` TIMESTAMP NOT NULL,
  `modificado` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `flexo`.`DestinoCliche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flexo`.`DestinoCliche` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `criado` TIMESTAMP NOT NULL,
  `modificado` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `flexo`.`ProdutoCliche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flexo`.`ProdutoCliche` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `rp_cliche` VARCHAR(45) NOT NULL COMMENT 'relatorio de producao',
  `faca` VARCHAR(45) NOT NULL,
  `ft` VARCHAR(45) NOT NULL COMMENT 'ficha tecnica',
  `Cliente_id` INT UNSIGNED NOT NULL,
  `TipoCliche_id` INT UNSIGNED NOT NULL,
  `DestinoCliche_id` INT UNSIGNED NOT NULL,
  `status` VARCHAR(45) NOT NULL COMMENT 'Ativo ou eliminado.',
  `cliche_criado` TIMESTAMP NOT NULL,
  `cliche_modificado` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_ProdutoCliche_Cliente1_idx` (`Cliente_id` ASC) VISIBLE,
  INDEX `fk_ProdutoCliche_TipoCliche1_idx` (`TipoCliche_id` ASC) VISIBLE,
  INDEX `fk_ProdutoCliche_DestinoCliche1_idx` (`DestinoCliche_id` ASC) VISIBLE,
  CONSTRAINT `fk_ProdutoCliche_Cliente1`
    FOREIGN KEY (`Cliente_id`)
    REFERENCES `flexo`.`Cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProdutoCliche_TipoCliche1`
    FOREIGN KEY (`TipoCliche_id`)
    REFERENCES `flexo`.`TipoCliche` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProdutoCliche_DestinoCliche1`
    FOREIGN KEY (`DestinoCliche_id`)
    REFERENCES `flexo`.`DestinoCliche` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `flexo`.`TrabalhoProdutoCliche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flexo`.`TrabalhoProdutoCliche` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `rp_trabalho` VARCHAR(45) NOT NULL COMMENT 'relatorio de producao',
  `condicao_uso` VARCHAR(45) NOT NULL,
  `ProdutoCliche_id` INT UNSIGNED NOT NULL,
  `trabalho_criado` TIMESTAMP NOT NULL,
  `trabalho_modificado` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_TrabalhoProdutoCliche_ProdutoCliche1_idx` (`ProdutoCliche_id` ASC) VISIBLE,
  CONSTRAINT `fk_TrabalhoProdutoCliche_ProdutoCliche1`
    FOREIGN KEY (`ProdutoCliche_id`)
    REFERENCES `flexo`.`ProdutoCliche` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


CREATE USER IF NOT EXISTS 'carton'@'%' IDENTIFIED BY '2574';

GRANT ALL ON *.* TO 'carton'@'%' WITH GRANT OPTION;


flush privileges;



INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (1,'3RHO','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (2,'ACHE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (3,'AMGEN','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (4,'APSEN','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (5,'AVON','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (6,'CARTONDRUCK','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (7,'CARTONARTE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (8,'DELLY','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (9,'DENGO','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (10,'EMBELLEZE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (11,'EUROFARMA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (12,'GSK','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (13,'HINODE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (14,'JBS','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (17,'MARTIN-BROWER','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (18,'MOMENTA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (19,'MONDELEZ','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (20,'MEGA VITAL','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (21,'NATURA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (22,'NIVEA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (23,'PERFETTI','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (24,'PROCOSA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (25,'PLATLOG','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (26,'PROCTER','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (27,'PHITOTERAPHIA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (28,'RAZZO','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (29,'SAVOY','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (30,'SOUZA CRUZ','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (31,'LIBBS','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (32,'LIPSON','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (33,'FAST FOOD','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (34,'WECKERLE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (35,'ZODIAC','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (36,'BERGAMO','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (37,'UNILEVER','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (38,'PHILIP MORRIS','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (39,'J T I','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (40,'BOBS','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (41,'PEOPLE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (44,'VAN CLEVE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (45,'SANPHAR','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (46,'BRASIL ESPRESSO','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (47,'LECLAIR','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (48,'R F G','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (49,'COLGATE','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (50,'DAHUER','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (51,'NACIONAL','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (52,'SINTER','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (53,'CRISTÁLIA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (54,'NORDISK','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (55,'SINTER','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (56,'ALTHAIA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (57,'BRASCUBA','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (58,'CHROMAVIS','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (59,'VOSSKO','2024-09-17 14:00:00');
INSERT INTO `cliente` (`id`,`nome`,`criado`) VALUES (60,'COSMO','2024-09-17 14:00:00');
