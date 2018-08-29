CREATE DATABASE  IF NOT EXISTS `fifabd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `fifabd`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: fifabd
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jugador` (
  `Cedula` varchar(11) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Apellido` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `FechaNacimiento` date DEFAULT NULL,
  `NoCamiseta` int(11) DEFAULT NULL,
  `Altura` decimal(10,0) DEFAULT NULL,
  `Peso` decimal(10,0) DEFAULT NULL,
  `Debut` date DEFAULT NULL,
  `Estado` bit(1) DEFAULT NULL,
  `FK_IdEquipo` int(11) DEFAULT NULL,
  `FK_Nacionalidad` int(11) DEFAULT NULL,
  `FK_IdPosicion` int(11) DEFAULT NULL,
  PRIMARY KEY (`Cedula`),
  KEY `IndexFK_IdEquipo` (`FK_IdEquipo`),
  KEY `IndexFK_Nacionalidad` (`FK_Nacionalidad`),
  KEY `IndexFK_IdPosicion` (`FK_IdPosicion`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES ('40215563657','Eduardo','Valenzuela','1999-02-21',14,180,185,'2004-05-06','',1,5,4),('00104060570','Carlos ','Torres Graciano','1990-10-30',25,175,190,'2003-06-04','',3,3,3),('40215563658','Messi','Citriani','1980-04-06',15,185,190,'2005-06-04','',1,2,1);
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-01  2:19:06
