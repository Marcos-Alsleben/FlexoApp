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
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
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
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
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
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `flexo`.`ProdutoCliche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flexo`.`ProdutoCliche` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `rp_cliche` VARCHAR(45) NULL COMMENT 'relatorio de producao',
  `faca` VARCHAR(45) NULL,
  `ft` VARCHAR(45) NULL COMMENT 'ficha tecnica',
  `Cliente_id` INT UNSIGNED NOT NULL,
  `TipoCliche_id` INT UNSIGNED NOT NULL,
  `DestinoCliche_id` INT UNSIGNED NOT NULL,
  `status` VARCHAR(45) NOT NULL COMMENT 'Ativo ou eliminado.',
  `cliche_criado` TIMESTAMP NULL,
  `cliche_modificado` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
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
  `rp_trabalho` VARCHAR(45) NULL COMMENT 'relatorio de producao',
  `condicao_uso` VARCHAR(45) NOT NULL,
  `ProdutoCliche_id` INT UNSIGNED NOT NULL,
  `trabalho_criado` TIMESTAMP NULL,
  `trabalho_modificado` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
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
