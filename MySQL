-- MySQL dump 10.13  Distrib 8.0.25, for macos11 (x86_64)
--
-- Host: localhost    Database: CoronaApp
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Geolokalisering`
--

DROP TABLE IF EXISTS `Geolokalisering`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Geolokalisering` (
  `idGeolokalisering` int NOT NULL AUTO_INCREMENT,
  `zipCode` varchar(4) NOT NULL,
  `tidspunkt` datetime NOT NULL,
  `idPatient` int NOT NULL,
  PRIMARY KEY (`idGeolokalisering`),
  UNIQUE KEY `idGeolokalisering_UNIQUE` (`idGeolokalisering`),
  KEY `FK_Geolokalisering_Patient_idx` (`idPatient`),
  CONSTRAINT `FK_Geolokalisering_Patient` FOREIGN KEY (`idPatient`) REFERENCES `Patient` (`idPatient`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Geolokalisering`
--

LOCK TABLES `Geolokalisering` WRITE;
/*!40000 ALTER TABLE `Geolokalisering` DISABLE KEYS */;
INSERT INTO `Geolokalisering` VALUES (1,'3460','2021-05-27 00:00:00',1),(2,'3460','2021-05-27 00:00:00',2),(3,'1207','2021-05-22 00:00:00',3),(4,'1302','2021-05-23 00:00:00',4),(5,'2400','2021-04-22 00:00:00',5),(6,'4500','2021-03-22 00:00:00',6),(7,'3300','2021-05-22 00:00:00',7),(8,'1207','2021-04-02 00:00:00',8),(9,'1207','2021-04-02 00:00:00',9),(10,'1050','2021-04-02 00:00:00',10),(11,'2400','2021-06-10 00:00:00',11),(12,'5040','2021-03-02 00:00:00',12),(13,'5010','2021-03-10 00:00:00',13),(14,'4500','2021-03-19 00:00:00',14),(15,'1202','2021-04-02 00:00:00',15),(16,'2500','2021-06-12 00:00:00',16),(17,'3460','2021-05-30 00:00:00',17),(18,'1050','2021-05-31 00:00:00',18),(19,'3300','2021-05-19 00:00:00',19),(20,'4550','2021-06-12 00:00:00',20),(21,'1234','2021-05-02 00:00:00',21),(22,'2500','2021-06-02 00:00:00',22),(23,'1307','2021-06-19 00:00:00',3),(24,'2500','2021-06-19 00:00:00',5);
/*!40000 ALTER TABLE `Geolokalisering` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Mutation`
--

DROP TABLE IF EXISTS `Mutation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Mutation` (
  `idMutation` int NOT NULL AUTO_INCREMENT,
  `Navn` varchar(45) NOT NULL,
  PRIMARY KEY (`idMutation`),
  UNIQUE KEY `Navn_UNIQUE` (`Navn`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Mutation`
--

LOCK TABLES `Mutation` WRITE;
/*!40000 ALTER TABLE `Mutation` DISABLE KEYS */;
INSERT INTO `Mutation` VALUES (1,'B.1.1.7'),(2,'B.1.351'),(5,'B.1.427'),(6,'B.1.429'),(8,'B.1.525'),(3,'B.1.526.1'),(9,'B.1.617'),(4,'P.1'),(7,'P.2');
/*!40000 ALTER TABLE `Mutation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Patient`
--

DROP TABLE IF EXISTS `Patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Patient` (
  `idPatient` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `phoneNumber` varchar(15) NOT NULL,
  `cpr` varchar(11) NOT NULL,
  `zipCode` int NOT NULL,
  PRIMARY KEY (`idPatient`),
  UNIQUE KEY `idPatient_UNIQUE` (`idPatient`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Patient`
--

LOCK TABLES `Patient` WRITE;
/*!40000 ALTER TABLE `Patient` DISABLE KEYS */;
INSERT INTO `Patient` VALUES (1,'Hanne','Larsen','+45 77840968','230567-1782',2000),(2,'Anne ','Hansen','+45 12345678','120456-5678',3460),(3,'Peter','Mogensen','+45 23456789','211234-6579',2900),(4,'Ludvig ','Hansen','+45 56473828','120763-8767',2300),(5,'Peter','Olfertsen','+45 12473828','120846-9873',2100),(6,'Kenneth','Corneliusen','+45 54573828','031252-9821',2200),(7,'Thorvald','Sommer','+45 56473821','121298-0823',2400),(8,'Keld','Ulriksen','+45 56223828','230598-4537',2800),(9,'Shamasay','Achmes','+45 11473828','120574-7653',2300),(10,'Theo','Ludvigsen','+45 56473876','170276-4569',2800),(11,'Pa','Ole','+45 99473828','101083-9783',2400),(12,'Solvej','Gunnar','+45 56444428','120896-2454',2200),(13,'Helene','Kirsten','+45 11173828','231298-3454',2930),(14,'Poul','Jettesen','+45 56473654','121296-6543',2930),(15,'Simon','Larsen','+45 12341234','120987-5423',2930),(16,'Kurt','Larsen','+45 24473828','240867-3453',2930),(17,'Fie','Larsen','+45 12373828','030397-5644',2200),(18,'Kalle','Lyng','+45 56473827','080301-1515',2400),(19,'Baloo','Lyng','+45 56473821','211278-2343',2000),(20,'Pølle','Jensen','+45 20860103','250632-1923',2900),(21,'Karen','Mogens','+45 56473803','454545-3544',2000),(22,'Fack','Gunnarsen','+45 22473828','240898-4533',3460);
/*!40000 ALTER TABLE `Patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Regeringen`
--

DROP TABLE IF EXISTS `Regeringen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Regeringen` (
  `idRegeringen` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `password` varchar(8) NOT NULL,
  `ID` varchar(10) NOT NULL,
  PRIMARY KEY (`idRegeringen`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Regeringen`
--

LOCK TABLES `Regeringen` WRITE;
/*!40000 ALTER TABLE `Regeringen` DISABLE KEYS */;
INSERT INTO `Regeringen` VALUES (1,'Maria','Hansen','Hansen12','024D2'),(2,'Henrik','Drejø','aBemaden','331O3'),(3,'Hanne','Vester','Gyvel262','987S7'),(4,'Morten','Lille','hejhejo!','078L0'),(5,'Mette','Frederiksen','Coronaxx','000S1');
/*!40000 ALTER TABLE `Regeringen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sensordata`
--

DROP TABLE IF EXISTS `Sensordata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Sensordata` (
  `idSensordata` int NOT NULL AUTO_INCREMENT,
  `temperatur` decimal(10,0) NOT NULL,
  `hjerterytme` int NOT NULL,
  `dato` datetime NOT NULL,
  `idPatient` int DEFAULT NULL,
  PRIMARY KEY (`idSensordata`),
  KEY `FK_Sensordata_Patient_idx` (`idPatient`),
  CONSTRAINT `FK_Sensordata_Patient` FOREIGN KEY (`idPatient`) REFERENCES `Patient` (`idPatient`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sensordata`
--

LOCK TABLES `Sensordata` WRITE;
/*!40000 ALTER TABLE `Sensordata` DISABLE KEYS */;
INSERT INTO `Sensordata` VALUES (1,38,60,'2021-06-27 00:00:00',1),(2,38,80,'2021-05-22 00:00:00',2),(3,37,61,'2021-04-21 00:00:00',3),(4,37,74,'2021-05-12 00:00:00',4),(5,38,61,'2021-03-14 00:00:00',5),(6,40,85,'2021-04-02 00:00:00',6),(7,38,59,'2021-03-21 00:00:00',7),(8,36,81,'2021-02-10 00:00:00',8),(9,36,66,'2021-06-01 00:00:00',9),(10,36,72,'2021-06-02 00:00:00',10),(11,38,60,'2021-05-30 00:00:00',11),(12,37,60,'2021-05-21 00:00:00',12),(13,39,81,'2021-04-02 00:00:00',13),(14,37,62,'2021-03-21 00:00:00',14),(15,36,75,'2021-06-30 00:00:00',15),(16,37,66,'2021-03-23 00:00:00',16),(17,41,88,'2021-02-13 00:00:00',17),(18,38,73,'2021-04-01 00:00:00',18),(19,36,60,'2021-02-14 00:00:00',19),(20,38,64,'2021-01-31 00:00:00',20),(21,36,77,'2021-03-28 00:00:00',21),(22,38,81,'2021-02-18 00:00:00',22),(23,40,80,'2021-06-30 00:00:00',1),(24,137,60,'2021-05-30 00:00:00',2);
/*!40000 ALTER TABLE `Sensordata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Statistics`
--

DROP TABLE IF EXISTS `Statistics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Statistics` (
  `idStatistics` int NOT NULL AUTO_INCREMENT,
  `Dato` datetime DEFAULT NULL,
  `idMutation` int DEFAULT NULL,
  `antalSmittede` int DEFAULT NULL,
  `zipCode` int DEFAULT NULL,
  `infektionsRate` decimal(5,4) DEFAULT NULL,
  PRIMARY KEY (`idStatistics`),
  KEY `FK_Statistics_Mutation_idx` (`idMutation`),
  CONSTRAINT `FK_Statistics_Mutation` FOREIGN KEY (`idMutation`) REFERENCES `Mutation` (`idMutation`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Statistics`
--

LOCK TABLES `Statistics` WRITE;
/*!40000 ALTER TABLE `Statistics` DISABLE KEYS */;
INSERT INTO `Statistics` VALUES (1,'2021-05-02 00:00:00',1,3,1202,0.1111),(2,'2021-05-03 00:00:00',2,3,1202,0.1111),(3,'2021-04-22 00:00:00',3,2,2200,0.0740),(4,'2021-04-22 00:00:00',4,3,2100,0.1111),(5,'2021-05-04 00:00:00',5,3,1307,0.1111),(6,'2021-06-01 00:00:00',6,1,4550,0.0370),(7,'2021-05-05 00:00:00',7,2,2300,0.0740);
/*!40000 ALTER TABLE `Statistics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sundhedspersonale`
--

DROP TABLE IF EXISTS `Sundhedspersonale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Sundhedspersonale` (
  `idSundhedspersonale` int NOT NULL AUTO_INCREMENT,
  `ID` varchar(10) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `password` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`idSundhedspersonale`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sundhedspersonale`
--

LOCK TABLES `Sundhedspersonale` WRITE;
/*!40000 ALTER TABLE `Sundhedspersonale` DISABLE KEYS */;
INSERT INTO `Sundhedspersonale` VALUES (1,'030L1','Hans','Hansen',NULL),(2,'050L2','Inge','Mejer',NULL),(3,'123U5','Jakob','Henriksen',NULL),(4,'871S4','Katrine','Lange',NULL),(5,'040G3','Hans','Jansen',NULL),(6,'090T4','Nikoline','Abram',NULL),(7,'132J7','Daniel','Monster',NULL),(8,'412N4','Josephine','Lol',NULL),(9,'993E7','Mads','Nielsen',NULL),(10,'477I3','Aase','Pedersen',NULL),(11,'090F3','Henrik','Drewes',NULL),(12,'880K3','Maj','Nielsen',NULL),(13,'043Y8','Anders','Jensen',NULL),(14,'709D3','Christian','Bonde',NULL),(15,'051J4','Maria','Ganti',NULL),(16,'142F9','Kristian','Drejø',NULL),(17,'098D3','Charlotte','Holgersen',NULL),(18,'001L4','Finn','Pølseskind',NULL),(19,'473S2','Pernille','Liljendal',NULL);
/*!40000 ALTER TABLE `Sundhedspersonale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Test`
--

DROP TABLE IF EXISTS `Test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Test` (
  `idTest` int NOT NULL AUTO_INCREMENT,
  `testDate` datetime NOT NULL,
  `result` varchar(45) DEFAULT NULL,
  `idMutation` int DEFAULT NULL,
  `testType` varchar(45) NOT NULL,
  `place` varchar(45) NOT NULL,
  `idPatient` int DEFAULT NULL,
  `idSundhedspersonale` int NOT NULL,
  PRIMARY KEY (`idTest`),
  KEY `FK_Test_Patient_idx` (`idPatient`),
  KEY `FK_Test_Mutation_idx` (`idMutation`),
  KEY `FK_Test_Sundhedspersonale_idx` (`idSundhedspersonale`),
  CONSTRAINT `FK_Test_Mutation` FOREIGN KEY (`idMutation`) REFERENCES `Mutation` (`idMutation`),
  CONSTRAINT `FK_Test_Patient` FOREIGN KEY (`idPatient`) REFERENCES `Patient` (`idPatient`),
  CONSTRAINT `FK_Test_Sundhedspersonale` FOREIGN KEY (`idSundhedspersonale`) REFERENCES `Sundhedspersonale` (`idSundhedspersonale`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Test`
--

LOCK TABLES `Test` WRITE;
/*!40000 ALTER TABLE `Test` DISABLE KEYS */;
INSERT INTO `Test` VALUES (1,'2021-05-27 00:00:00','Negativ',1,'PCR','Forum',1,1),(2,'2021-06-14 00:00:00','Positiv',2,'PCR','Holte',2,2),(3,'2021-06-26 00:00:00','Negativ',1,'PCR','Forum',3,3),(4,'2021-06-14 00:00:00','Positiv',2,'PCR','Hillerød',4,4),(5,'2021-05-17 00:00:00','Negativ',1,'PCR','Hillerød',5,5),(6,'2021-06-20 00:00:00','Positiv',1,'PCR','Valby',6,6),(7,'2021-06-13 00:00:00','Positiv',2,'PCR','Forum',7,5),(8,'2021-05-28 00:00:00','Negativ',1,'Kviktest','Valby',8,7),(9,'2021-05-31 00:00:00','Positiv',3,'Kviktest','Hillerød',9,2),(10,'2021-05-30 00:00:00','Positiv',4,'PCR','Lufthavnen',10,9),(11,'2021-06-02 00:00:00','Negativ',1,'Kviktest','Forum',11,5),(12,'2021-05-30 00:00:00','Positiv',6,'PCR','Lufthavnen',12,2),(13,'2021-05-30 00:00:00','Positiv',7,'Kviktest','Valby',13,1),(14,'2021-05-30 00:00:00','Positiv',7,'PCR','Trianglen',14,11),(15,'2021-05-30 00:00:00','Positiv',5,'Kviktest','Valby',15,10),(16,'2021-06-15 00:00:00','Negativ',1,'PCR','Hillerød',16,14),(17,'2021-04-21 00:00:00','Positiv',4,'PCR','Trianglen',17,12),(18,'2021-06-13 00:00:00','Positiv',5,'Kviktest','Forum',18,14),(19,'2021-05-31 00:00:00','Positiv',3,'Kviktest','Valby',19,13),(20,'2021-06-01 00:00:00','Negativ',1,'Kviktest','Lufthavnen',20,1),(21,'2021-06-01 00:00:00','Negativ',1,'PCR','Hillerød',21,1),(22,'2021-06-02 00:00:00','Positiv',5,'Kviktest','Forum',22,12),(23,'2021-06-01 00:00:00','Positiv',1,'Kviktest','Lufthavnen',1,7),(24,'2021-05-27 00:00:00','Negativ',1,'Kviktest','Valby',6,6),(25,'2021-05-30 00:00:00','Positiv',1,'PCR','Lufthavnen',11,3),(26,'2021-05-28 00:00:00','Positiv',4,'Kviktest','Holte',16,8),(27,'2021-05-29 00:00:00','Negativ',1,'PCR','Holte',21,9);
/*!40000 ALTER TABLE `Test` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-13 16:31:20
