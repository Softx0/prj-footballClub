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
-- Table structure for table `estadisticapartidojugador`
--

DROP TABLE IF EXISTS `estadisticapartidojugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadisticapartidojugador` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `FKIdJugador` int(11) DEFAULT NULL,
  `FKIdPartido` int(11) DEFAULT NULL,
  `GolesAFavor` int(11) DEFAULT NULL,
  `TarjetasAmarilla` int(11) DEFAULT NULL,
  `TarjetaRoja` int(11) DEFAULT NULL,
  `BalonesRecuperados` int(11) DEFAULT NULL,
  `BalonesPerdidos` int(11) DEFAULT NULL,
  `FaltasRecibidas` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `IndexFKIdJugador` (`FKIdJugador`),
  KEY `IndexFKFKIdPartido` (`FKIdPartido`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadisticapartidojugador`
--

LOCK TABLES `estadisticapartidojugador` WRITE;
/*!40000 ALTER TABLE `estadisticapartidojugador` DISABLE KEYS */;
INSERT INTO `estadisticapartidojugador` VALUES (1,3,1,4,1,0,10,5,24),(2,1,1,2,3,0,3,15,16),(3,2,1,1,3,1,21,0,0);
/*!40000 ALTER TABLE `estadisticapartidojugador` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-01  2:19:04
