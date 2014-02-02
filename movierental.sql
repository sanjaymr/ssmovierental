DROP SCHEMA IF EXISTS `movierental` ;
CREATE SCHEMA IF NOT EXISTS `movierental` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

USE `movierental` ;

-- -----------------------------------------------------
-- Table  `movie_genres`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `movie_genres` (
  `genres_cd` VARCHAR(25) NOT NULL,
  `description` VARCHAR(200) NULL,
  `create_date` DATETIME NULL,
  `created_by` VARCHAR(100) NULL,
  PRIMARY KEY (`genres_cd`))
  ;

-- -----------------------------------------------------
-- Table  `movie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `movie` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(55) NULL,
  `description` VARCHAR(200) NOT NULL,
  `genres_cd` VARCHAR(25) NULL,
  `release_date` DATETIME NULL,
  `create_date` DATETIME NULL,
  `created_by` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_movie_genres_1`
    FOREIGN KEY (`genres_cd`)
    REFERENCES  `movie_genres` (`genres_cd`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ;


-- -----------------------------------------------------
-- Table  `renter`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `renter` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) ,
  `password` VARCHAR(45) ,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `address_line1` VARCHAR(255) NULL,
  `address_line2` VARCHAR(255) NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `area_code` VARCHAR(45) NULL,
  `country_code` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `fax` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
  ;
  
  -- -----------------------------------------------------
-- Table  `movie_renter`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `movie_renter` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `movie_id` INT NOT NULL,
  `renter_id` INT NOT NULL,
  `checkin_date` DATETIME NULL,
  `checkout_date` DATETIME NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_movie_1`
    FOREIGN KEY (`movie_id`)
    REFERENCES  `movie` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_renter_1`
    FOREIGN KEY (`renter_id`)
    REFERENCES  `renter` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ;