CREATE DATABASE  IF NOT EXISTS `new_schema` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `new_schema`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: new_schema
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chamcong`
--

DROP TABLE IF EXISTS `chamcong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chamcong` (
  `macn` int NOT NULL,
  `maxuong` int NOT NULL,
  `ngaybd` date NOT NULL,
  `songaylam` int NOT NULL,
  KEY `maxuong_idx` (`maxuong`),
  KEY `macn_idx` (`macn`),
  CONSTRAINT `macn` FOREIGN KEY (`macn`) REFERENCES `congnhan` (`macn`),
  CONSTRAINT `maxuong` FOREIGN KEY (`maxuong`) REFERENCES `xuong` (`maxuong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chamcong`
--

LOCK TABLES `chamcong` WRITE;
/*!40000 ALTER TABLE `chamcong` DISABLE KEYS */;
INSERT INTO `chamcong` VALUES (1,1,'2019-02-02',1),(2,1,'2023-01-01',21),(2,1,'2023-01-01',2),(8,1,'2023-01-02',31),(2,1,'2023-01-02',29),(2,1,'2023-01-02',29);
/*!40000 ALTER TABLE `chamcong` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `before_insert_chamcong1` BEFORE INSERT ON `chamcong` FOR EACH ROW begin
	if new.songaylam > 30 then
		signal sqlstate '45000' set message_text = 'Tổng số ngày làm việc của nhân viên có mã vượt quá 30.';
    end if;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `before_insert_chamcong2` BEFORE INSERT ON `chamcong` FOR EACH ROW begin
	DECLARE total_days int;
    
    set total_days = (
		select sum(songaylam)
        from chamcong
        where macn = new.macn
	);
    
	if new.songaylam > 30 then
		signal sqlstate '45000' set message_text = 'Tổng số ngày làm việc của nhân viên có mã vượt quá 30.';
    end if;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `congnhan`
--

DROP TABLE IF EXISTS `congnhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `congnhan` (
  `macn` int NOT NULL,
  `hovaten` varchar(60) NOT NULL,
  `diachi` varchar(60) NOT NULL,
  `sdt` varchar(10) NOT NULL,
  `bac` int NOT NULL,
  PRIMARY KEY (`macn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `congnhan`
--

LOCK TABLES `congnhan` WRITE;
/*!40000 ALTER TABLE `congnhan` DISABLE KEYS */;
INSERT INTO `congnhan` VALUES (1,'nguyễn chí trường','hà đông','0123456789',7),(2,'nguyễn chí trường','hà đông','0123456789',7),(3,'ee','nguyễnc  hítrường 3625734','0123456789',7),(4,'lê ','nguyễnc  hítrường 3625734','0123456789',7),(5,'lê ','nguyễnc  hítrường 3625734','123456789',7),(6,'nguynê','1','1234567788',1),(7,'lê ','nguyên24234','123456789',7),(8,'abc','nguyễn chí trường 3625734','1234567891',7),(9,'abc','a','1234567891',7),(10,'abc','nguyễnc  hítrường 3625734','123456789',7),(11,'abc','nguyễnc  hítrường 3625734','123456789',7),(12,'ee','nguyễnc  hítrường 3625734','123456789',7),(13,'lê ','nguyễnc  hítrường 3625734','123456789',7),(14,'lê ','nguyễnc  hítrường 3625734','123456789',7),(15,'lê ','nguyễnc  hítrường 3625734','123456789',7),(17,'nguynê','nguynê','1234567788',1),(18,'nguynê','nguynê','1234567788',1),(20,'nguynê','nguynê','1234567788',1),(21,'abc','nguyễnc  hítrường 3625734','123456789',7),(22,'abc','nguyễnc  hítrường 3625734','123456789',7),(23,'nguyễn','nguyễnc  hítrường 3625734','123456789',7),(24,'ng','r','123456789',2),(25,'nguyen','25','123456789',3),(26,'nguyen','25','1234567891',3),(27,'nguyen','25ê','1234567891',3),(28,'nguyen','25ê','1234567891',3),(29,'nguyen','25ê','1234567891',3),(33,'nguyen','234234','987654321',3),(34,'nguyeenc','8','123456789',3),(35,'nguyeenc','8','123456789',3),(36,'nguyeenc','8','123456789',3),(37,'nguyn','8','123456789',3),(38,'nguyn','8','123456789',3),(39,'u','nguyn','123456789',3),(40,'nguyn1','nguyn','123456789',4),(41,'nguyenc','nguynÊÊ','123456789',4),(42,'nguyencnguyễn','nguynÊÊ','123456789',4),(46,' nguyene','ewe','987654321',1),(47,'nguyễn ','ewe','987654321',1),(50,'nguyenss','sdf','987654321',5),(123,'ee','e','987654321',1),(144,'nguyenss','sdf','987654321',2),(666,'đfsfdsf','3443','987654321',3),(1111,'ttttt','112rrr','987654321',1),(1209,'nguyenaa','dsds','987654321',2),(3231,'ee','nguyễnc  hítrường 3625734','1234567891',7);
/*!40000 ALTER TABLE `congnhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuong`
--

DROP TABLE IF EXISTS `xuong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xuong` (
  `maxuong` int NOT NULL,
  `tenxuong` varchar(45) NOT NULL,
  `mota` varchar(45) NOT NULL,
  `hscv` float NOT NULL,
  PRIMARY KEY (`maxuong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuong`
--

LOCK TABLES `xuong` WRITE;
/*!40000 ALTER TABLE `xuong` DISABLE KEYS */;
INSERT INTO `xuong` VALUES (1,'x23','2',1),(2,'x','2',1),(3,'3','2',1),(4,'3','2',1),(5,'3','2',1),(6,'3','2',2),(7,'3','2',2),(8,'x','2',1),(9,'xf','2',1),(21,'3','2',4),(124,'frgrg','fsfdfd',4),(2222,'2','2',1);
/*!40000 ALTER TABLE `xuong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-01  0:03:09
