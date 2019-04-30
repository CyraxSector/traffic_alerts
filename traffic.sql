-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.47-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema traffic
--

CREATE DATABASE IF NOT EXISTS traffic;
USE traffic;

--
-- Definition of table `accident`
--

DROP TABLE IF EXISTS `accident`;
CREATE TABLE `accident` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accident`
--

/*!40000 ALTER TABLE `accident` DISABLE KEYS */;
INSERT INTO `accident` (`id`,`note`) VALUES 
 (1,'null'),
 (2,'null'),
 (3,'null'),
 (4,'null'),
 (5,'null'),
 (6,'Dehiwala to Wallawatte'),
 (7,'null'),
 (8,'null'),
 (9,'null'),
 (10,'null'),
 (11,'null'),
 (12,'null'),
 (13,'null'),
 (14,'null'),
 (15,'null'),
 (16,'null'),
 (17,'null'),
 (18,'null'),
 (19,'null'),
 (20,'null'),
 (21,'null'),
 (22,'null'),
 (23,'null'),
 (24,'null'),
 (25,'Katubedda to Rathmalana'),
 (26,'null'),
 (27,'null'),
 (28,'null'),
 (29,'null'),
 (30,'Katubedda to Rathmalana'),
 (31,'null'),
 (32,'null'),
 (33,'null'),
 (34,'null'),
 (35,'null'),
 (36,'null'),
 (37,'null'),
 (38,'null'),
 (39,'null'),
 (40,'Katubedda to Rathmalana'),
 (41,'null'),
 (42,'null'),
 (43,'null'),
 (44,'null'),
 (45,'null'),
 (46,'null'),
 (47,'null'),
 (48,'null'),
 (49,'null'),
 (50,'null'),
 (51,'null'),
 (52,'Katubedda to Rathmalana'),
 (53,'Katubedda to Rathmalana'),
 (54,'Katubedda to Rathmalana'),
 (55,'null'),
 (56,'null'),
 (57,'Katubedda to Rathmalana'),
 (58,'Katubedda to Rathmalana'),
 (59,'Katubedda to Rathmalana'),
 (60,'null'),
 (61,'null'),
 (62,'null'),
 (63,'null'),
 (64,'null'),
 (65,'null'),
 (66,'null'),
 (67,'null'),
 (68,'Dehiwala to Wallawatte'),
 (69,'Dehiwala to Wallawatte'),
 (70,'Dehiwala to Wallawatte'),
 (71,'null'),
 (72,'null'),
 (73,'null'),
 (74,'null'),
 (75,'null'),
 (76,'null'),
 (77,'null'),
 (78,'null'),
 (79,'Dehiwala to Wallawatte'),
 (80,'Dehiwala to Wallawatte'),
 (81,'Dehiwala to Wallawatte'),
 (82,'Dehiwala to Wallawatte'),
 (83,'Dehiwala to Wallawatte'),
 (84,'null'),
 (85,'null'),
 (86,'null'),
 (87,'null'),
 (88,'null'),
 (89,'null'),
 (90,'null'),
 (91,'null'),
 (92,'null'),
 (93,'null'),
 (94,'null'),
 (95,'null'),
 (96,'null'),
 (97,'null'),
 (98,'Dehiwala to Wallawatte'),
 (99,'Dehiwala to Wallawatte'),
 (100,'Dehiwala to Wallawatte'),
 (101,'Dehiwala to Wallawatte'),
 (102,'Dehiwala to Wallawatte'),
 (103,'Dehiwala to Wallawatte'),
 (104,'Dehiwala to Wallawatte'),
 (105,'Dehiwala to Wallawatte'),
 (106,'Mt.lavinia to Dehiwala'),
 (107,'Mt.lavinia to Dehiwala'),
 (108,'Mt.lavinia to Dehiwala'),
 (109,'null'),
 (110,'null'),
 (111,'null'),
 (112,'Mt.lavinia to Dehiwala'),
 (113,'Mt.lavinia to Dehiwala'),
 (114,'Dehiwala to Wallawatte'),
 (115,'Dehiwala to Wallawatte'),
 (116,'Dehiwala to Wallawatte'),
 (117,'null'),
 (118,'null'),
 (119,'null'),
 (120,'null'),
 (121,'null'),
 (122,'Wallawatte to Bambalapitiya'),
 (123,'Wallawatte to Bambalapitiya'),
 (124,'Wallawatte to Bambalapitiya'),
 (125,'null'),
 (126,'null'),
 (127,'null'),
 (128,'null'),
 (129,'null'),
 (130,'Mt.lavinia to Dehiwala'),
 (131,'Mt.lavinia to Dehiwala'),
 (132,'Mt.lavinia to Dehiwala'),
 (133,'null'),
 (134,'null'),
 (135,'null'),
 (136,'null'),
 (137,'null'),
 (138,'null'),
 (139,'null'),
 (140,'null'),
 (141,'Dehiwala to Wallawatte'),
 (142,'Dehiwala to Wallawatte'),
 (143,'Dehiwala to Wallawatte'),
 (144,'null'),
 (145,'null'),
 (146,'null'),
 (147,'null'),
 (148,'null'),
 (149,'Mt.lavinia to Dehiwala'),
 (150,'Mt.lavinia to Dehiwala'),
 (151,'Mt.lavinia to Dehiwala');
/*!40000 ALTER TABLE `accident` ENABLE KEYS */;


--
-- Definition of table `alter`
--

DROP TABLE IF EXISTS `alter`;
CREATE TABLE `alter` (
  `rout_no` int(4) unsigned NOT NULL,
  `alter_rout` int(4) unsigned NOT NULL,
  PRIMARY KEY (`alter_rout`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alter`
--

/*!40000 ALTER TABLE `alter` DISABLE KEYS */;
/*!40000 ALTER TABLE `alter` ENABLE KEYS */;


--
-- Definition of table `cabspeed`
--

DROP TABLE IF EXISTS `cabspeed`;
CREATE TABLE `cabspeed` (
  `id` int(4) unsigned NOT NULL,
  `cabfrom` varchar(45) DEFAULT NULL,
  `cabto` varchar(45) DEFAULT NULL,
  `cabno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cabspeed`
--

/*!40000 ALTER TABLE `cabspeed` DISABLE KEYS */;
INSERT INTO `cabspeed` (`id`,`cabfrom`,`cabto`,`cabno`) VALUES 
 (1,'dehiwala','pettah','1'),
 (2,'rathmalana','kollpitiya','2'),
 (3,'rathmalana','kollpitiya','3');
/*!40000 ALTER TABLE `cabspeed` ENABLE KEYS */;


--
-- Definition of table `data`
--

DROP TABLE IF EXISTS `data`;
CREATE TABLE `data` (
  `from` varchar(50) NOT NULL,
  `to` varchar(50) NOT NULL,
  `dataPoint` int(10) unsigned NOT NULL,
  `index` int(10) unsigned NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

/*!40000 ALTER TABLE `data` DISABLE KEYS */;
/*!40000 ALTER TABLE `data` ENABLE KEYS */;


--
-- Definition of table `datapoints`
--

DROP TABLE IF EXISTS `datapoints`;
CREATE TABLE `datapoints` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dpname` varchar(45) DEFAULT NULL,
  `long` varchar(45) DEFAULT NULL,
  `latd` varchar(45) DEFAULT NULL,
  `point` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datapoints`
--

/*!40000 ALTER TABLE `datapoints` DISABLE KEYS */;
INSERT INTO `datapoints` (`id`,`dpname`,`long`,`latd`,`point`) VALUES 
 (1,'a1','4.897546','6.87665','15'),
 (2,'a2','4.897654','8.97655','16'),
 (3,'a3','7.675432','7.987543','17'),
 (4,'a4','6.765432','8.876433','18'),
 (5,'a5','5.786543','7.876543','19'),
 (6,'b1','7.865345','8.953246','20'),
 (7,'b2','7.867231','8.956231','21');
/*!40000 ALTER TABLE `datapoints` ENABLE KEYS */;


--
-- Definition of table `dpvalues`
--

DROP TABLE IF EXISTS `dpvalues`;
CREATE TABLE `dpvalues` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dpname` varchar(45) DEFAULT NULL,
  `long` varchar(45) DEFAULT NULL,
  `latd` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dpvalues`
--

/*!40000 ALTER TABLE `dpvalues` DISABLE KEYS */;
INSERT INTO `dpvalues` (`id`,`dpname`,`long`,`latd`,`location`) VALUES 
 (1,'a1','4','7','1'),
 (2,'a2','5','8','1'),
 (3,'a3','6','9','1'),
 (4,'a4','7','10','1'),
 (5,'b1','8','11','2'),
 (6,'b2','9','12','2'),
 (7,'b3','10','13','2'),
 (8,'b4','11','14','2'),
 (9,'c1','12','15','3'),
 (10,'c2','13','16','3'),
 (11,'c3','14','17','3'),
 (12,'c4','15','18','3'),
 (13,'d1','16','19','4'),
 (14,'d2','17','20','4'),
 (15,'d3','18','21','4'),
 (16,'d4','19','22','4'),
 (17,'e1','20','23','5'),
 (18,'e2','21','24','5'),
 (19,'e3','22','25','5'),
 (20,'e4','23','26','5'),
 (21,'f1','24','27','6'),
 (22,'f2','25','28','6'),
 (23,'f3','26','29','6'),
 (24,'f4','27','30','6'),
 (25,'g1','28','31','7'),
 (26,'g2','29','32','7'),
 (27,'g3','30','33','7'),
 (28,'g4','31','34','7'),
 (29,'h1','32','35','8'),
 (30,'h2','33','36','8'),
 (31,'h3','34','37','8'),
 (32,'h4','35','38','8'),
 (33,'i1','36','39','9'),
 (34,'i2','37','40','9'),
 (35,'i3','38','41','9'),
 (36,'i4','39','42','9');
/*!40000 ALTER TABLE `dpvalues` ENABLE KEYS */;


--
-- Definition of table `load`
--

DROP TABLE IF EXISTS `load`;
CREATE TABLE `load` (
  `index` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `loader` varchar(100) NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `load`
--

/*!40000 ALTER TABLE `load` DISABLE KEYS */;
/*!40000 ALTER TABLE `load` ENABLE KEYS */;


--
-- Definition of table `longlatd`
--

DROP TABLE IF EXISTS `longlatd`;
CREATE TABLE `longlatd` (
  `location` varchar(50) NOT NULL,
  `long` double NOT NULL,
  `latd` double NOT NULL,
  PRIMARY KEY (`location`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `longlatd`
--

/*!40000 ALTER TABLE `longlatd` DISABLE KEYS */;
INSERT INTO `longlatd` (`location`,`long`,`latd`) VALUES 
 ('bambalapitiya',81.123789,21.896435),
 ('dehiwala',80.745876,15.765893),
 ('katubedda',80.234768,10.239015),
 ('kollpitiya',81.567987,22.789654),
 ('moratuwa',79.234768,7.984324),
 ('mt.lavinia',80.623987,14.876567),
 ('pettah',82.091234,24.908765),
 ('rathmalana',80.456734,13.678543),
 ('wallawatte',80.345789,20.879543);
/*!40000 ALTER TABLE `longlatd` ENABLE KEYS */;


--
-- Definition of table `mess`
--

DROP TABLE IF EXISTS `mess`;
CREATE TABLE `mess` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cabno` varchar(45) DEFAULT NULL,
  `long` varchar(45) DEFAULT NULL,
  `latd` varchar(45) DEFAULT NULL,
  `time1` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mess`
--

/*!40000 ALTER TABLE `mess` DISABLE KEYS */;
INSERT INTO `mess` (`id`,`cabno`,`long`,`latd`,`time1`) VALUES 
 (1,'1','80.234769','10.984325','1'),
 (2,'2','80.234773','11.346729','1'),
 (3,'3','80.234772','11.347923','1'),
 (4,'1','80.234771','10.984327','2'),
 (5,'2','80.234774','11.679230','2'),
 (6,'3','80.234774','12.289025','2'),
 (7,'1','80.234772','10.984330','3'),
 (8,'2','80.234776','12.379583','3'),
 (9,'3','80.234775','12.756192','3'),
 (10,'1','80.234775','10.984331','4'),
 (11,'2','80.234777','12.479307','4'),
 (12,'3','80.234777','12.832791','4'),
 (13,'1','80.234777','10.984334','5'),
 (14,'2','80.234779','12.805714','5'),
 (15,'3','80.234779','12.920142','5'),
 (16,'1','80.234778','10.984349','6'),
 (17,'2','80.234781','13.783461','6'),
 (18,'3','80.234782','13.278034','6'),
 (19,'1','80.234781','10.984479','7'),
 (20,'2','80.234784','13.914680','7'),
 (21,'3','80.234785','13.671920','7'),
 (22,'1','80.234783','10.984771','8'),
 (23,'2','80.234785','14.310849','8'),
 (24,'3','80.234786','13.980251','8'),
 (26,'1','80.234786','10.997836','9'),
 (27,'2','80.234789','14.480359','9'),
 (28,'3','80.234789','14.260138','9'),
 (30,'1','80.234789','11.347891','10'),
 (31,'2','80.234792','14.783129','10'),
 (32,'3','80.234792','14.579130','10'),
 (34,'1','80.234791','11.378920','11'),
 (35,'2','80.234793','14.197036','11'),
 (36,'3','80.234793','14.804921','11'),
 (38,'1','80.235279','11.692301','12'),
 (39,'2','80.236782','14.380173','12'),
 (40,'3','80.236891','14.892189','12'),
 (41,'1','80.469130','12.380174','13'),
 (42,'2','80.357931','14.579120','13'),
 (43,'3','80.367901','14.931037','13');
/*!40000 ALTER TABLE `mess` ENABLE KEYS */;


--
-- Definition of table `place`
--

DROP TABLE IF EXISTS `place`;
CREATE TABLE `place` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `place`
--

/*!40000 ALTER TABLE `place` DISABLE KEYS */;
INSERT INTO `place` (`id`,`location`) VALUES 
 (1,'u'),
 (2,'i'),
 (3,'o'),
 (4,''),
 (5,'4'),
 (6,''),
 (7,''),
 (8,''),
 (9,''),
 (10,''),
 (11,''),
 (12,''),
 (13,'null'),
 (14,'null'),
 (15,'Katubedda to Bambalapitiya'),
 (16,'null'),
 (17,'null'),
 (18,'null'),
 (19,'null'),
 (20,'Wallawatte to Fort'),
 (21,'null'),
 (22,'null'),
 (23,'null'),
 (24,'null'),
 (25,'Pettah to Fort'),
 (26,'null'),
 (27,'null'),
 (28,'Wallawatte to Bambalapitiya'),
 (29,'Wallawatte to Bambalapitiya'),
 (30,'Wallawatte to Bambalapitiya'),
 (31,'Wallawatte to Bambalapitiya'),
 (32,'null'),
 (33,'null'),
 (34,'Dehiwala to Fort'),
 (35,'Dehiwala to Fort'),
 (36,'Dehiwala to Fort'),
 (37,'Dehiwala to Fort'),
 (38,'Dehiwala to Fort'),
 (39,'Dehiwala to Fort'),
 (40,'Rathmalana to Dehiwala'),
 (41,'null'),
 (42,'null'),
 (43,'Moratuwa to Rathmalana'),
 (44,'null'),
 (45,'null'),
 (46,'Moratuwa to Rathmalana'),
 (47,'null'),
 (48,'null'),
 (49,'null'),
 (50,'null'),
 (51,'null'),
 (52,'null'),
 (53,'null'),
 (54,'null'),
 (55,'null'),
 (56,'null'),
 (57,'null'),
 (58,'null'),
 (59,'Dehiwala to Wallawatte'),
 (60,'null'),
 (61,'null'),
 (62,'Moratuwa to Rathmalana'),
 (63,'null'),
 (64,'null'),
 (65,'null'),
 (66,'null'),
 (67,'null'),
 (68,'Katubedda to Rathmalana'),
 (69,'null'),
 (70,'null'),
 (71,'Katubedda to Rathmalana'),
 (72,'Katubedda to Rathmalana'),
 (73,'Katubedda to Rathmalana'),
 (74,'null'),
 (75,'null'),
 (76,'null'),
 (77,'null'),
 (78,'null'),
 (79,'null'),
 (80,'null'),
 (81,'null'),
 (82,'null'),
 (83,'null'),
 (84,'null'),
 (85,'null'),
 (86,'null'),
 (87,'Wallawatte to Bambalapitiya'),
 (88,'null'),
 (89,'null'),
 (90,'Dehiwala to Wallawatte'),
 (91,'Dehiwala to Wallawatte'),
 (92,'Dehiwala to Wallawatte'),
 (93,'Dehiwala to Wallawatte'),
 (94,'Dehiwala to Wallawatte'),
 (95,'Dehiwala to Wallawatte'),
 (96,'null'),
 (97,'null'),
 (98,'Rathmalana to Wallawatte'),
 (99,'null'),
 (100,'null'),
 (101,'Moratuwa to Rathmalana'),
 (102,'Moratuwa to Rathmalana'),
 (103,'Moratuwa to Rathmalana'),
 (104,'Moratuwa to Rathmalana'),
 (105,'Moratuwa to Rathmalana'),
 (106,'Moratuwa to Rathmalana'),
 (107,'Moratuwa to Rathmalana'),
 (108,'Moratuwa to Rathmalana'),
 (109,'null'),
 (110,'null'),
 (111,'Katubedda to Dehiwala'),
 (112,'null'),
 (113,'null'),
 (114,'Moratuwa to Rathmalana'),
 (115,'null'),
 (116,'null'),
 (117,'Moratuwa to Rathmalana'),
 (118,'null'),
 (119,'null'),
 (120,'Rathmalana to Bambalapitiya'),
 (121,'null'),
 (122,'null'),
 (123,'null'),
 (124,'null'),
 (125,'null'),
 (126,'null'),
 (127,'null'),
 (128,'Katubedda to Bambalapitiya'),
 (129,'Katubedda to Bambalapitiya'),
 (130,'Katubedda to Bambalapitiya'),
 (131,'Katubedda to Bambalapitiya'),
 (132,'Katubedda to Bambalapitiya'),
 (133,'Katubedda to Bambalapitiya'),
 (134,'null'),
 (135,'null'),
 (136,'Moratuwa to Rathmalana'),
 (137,'Katubedda to Bambalapitiya'),
 (138,'Katubedda to Bambalapitiya'),
 (139,'Katubedda to Bambalapitiya'),
 (140,'Katubedda to Bambalapitiya'),
 (141,'Katubedda to Bambalapitiya'),
 (142,'null'),
 (143,'null'),
 (144,'Katubedda to Wallawatte'),
 (145,'Katubedda to Wallawatte'),
 (146,'Katubedda to Wallawatte'),
 (147,'Katubedda to Wallawatte'),
 (148,'Katubedda to Wallawatte'),
 (149,'Katubedda to Wallawatte'),
 (150,'null'),
 (151,'null'),
 (152,'Moratuwa to Rathmalana'),
 (153,'null'),
 (154,'null'),
 (155,'null'),
 (156,'null'),
 (157,'null'),
 (158,'null'),
 (159,'null'),
 (160,'Katubedda to Bambalapitiya'),
 (161,'null'),
 (162,'null'),
 (163,'Katubedda to Bambalapitiya'),
 (164,'Katubedda to Bambalapitiya'),
 (165,'Katubedda to Bambalapitiya'),
 (166,'Katubedda to Bambalapitiya'),
 (167,'Katubedda to Bambalapitiya'),
 (168,'Katubedda to Bambalapitiya'),
 (169,'null'),
 (170,'null'),
 (171,'Katubedda to Bambalapitiya'),
 (172,'Katubedda to Bambalapitiya'),
 (173,'Katubedda to Bambalapitiya'),
 (174,'Katubedda to Bambalapitiya'),
 (175,'Katubedda to Bambalapitiya'),
 (176,'Katubedda to Bambalapitiya');
/*!40000 ALTER TABLE `place` ENABLE KEYS */;


--
-- Definition of table `rda`
--

DROP TABLE IF EXISTS `rda`;
CREATE TABLE `rda` (
  `index` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `section` varchar(45) NOT NULL,
  `condition` varchar(45) NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rda`
--

/*!40000 ALTER TABLE `rda` DISABLE KEYS */;
INSERT INTO `rda` (`index`,`date`,`section`,`condition`) VALUES 
 (1,'Fri Mar 02 20:45:00 IST 2012','Katubedda-Rathmalana','Moderate Accident'),
 (2,'Sat Mar 03 00:02:31 IST 2012','Mt.lavinia-Dehiwala','Average Accident'),
 (3,'Sat Mar 03 00:48:14 IST 2012','Rathmalana-Mt.lavinia','Normal Accident'),
 (4,'Wed Mar 07 22:10:08 IST 2012','Mt.lavinia-Dehiwala','Moderate Accident'),
 (5,'Mon Mar 19 00:42:20 IST 2012','Katubedda to Rathmalana','Average Accident'),
 (6,'Thu Mar 22 14:03:23 IST 2012','Dehiwala to Wallawatte','Average Accident'),
 (7,'Sat Mar 24 11:06:08 IST 2012','Dehiwala to Wallawatte','Average Accident'),
 (8,'Sat Apr 28 11:43:24 IST 2012','Dehiwala to Wallawatte','Moderate Accident'),
 (9,'Sat Apr 28 11:56:09 IST 2012','Mt.lavinia to Dehiwala','Serious Accident'),
 (10,'Sat Apr 28 12:02:53 IST 2012','Dehiwala to Wallawatte','Moderate Accident'),
 (11,'Apr 28, 2012','Wallawatte to Bambalapitiya','Average Accident'),
 (12,'Sat Apr 28 16:21:48 IST 2012','Mt.lavinia to Dehiwala','Average Accident'),
 (13,'Sun Apr 29 20:51:49 IST 2012','Dehiwala to Wallawatte','Average Accident'),
 (14,'Mon Apr 30 14:52:05 IST 2012','Mt.lavinia to Dehiwala','Normal Accident');
/*!40000 ALTER TABLE `rda` ENABLE KEYS */;


--
-- Definition of table `rout`
--

DROP TABLE IF EXISTS `rout`;
CREATE TABLE `rout` (
  `index` int(4) unsigned NOT NULL,
  `cab_no` int(4) unsigned NOT NULL,
  `rout_no` int(4) unsigned NOT NULL,
  PRIMARY KEY (`index`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rout`
--

/*!40000 ALTER TABLE `rout` DISABLE KEYS */;
INSERT INTO `rout` (`index`,`cab_no`,`rout_no`) VALUES 
 (1,1,100),
 (2,2,100),
 (3,3,100),
 (4,4,101),
 (5,5,101),
 (6,6,101),
 (7,7,183),
 (8,8,183),
 (9,9,183),
 (10,10,255),
 (11,11,255),
 (12,12,255),
 (13,13,192),
 (14,14,192),
 (15,15,192),
 (16,16,192),
 (17,17,238),
 (18,18,238),
 (19,19,238),
 (20,20,238),
 (21,21,155);
/*!40000 ALTER TABLE `rout` ENABLE KEYS */;


--
-- Definition of table `speed`
--

DROP TABLE IF EXISTS `speed`;
CREATE TABLE `speed` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cab_no` varchar(45) DEFAULT NULL,
  `longt` varchar(45) DEFAULT NULL,
  `latd` varchar(45) DEFAULT NULL,
  `point` varchar(45) DEFAULT NULL,
  `speed` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `speed`
--

/*!40000 ALTER TABLE `speed` DISABLE KEYS */;
INSERT INTO `speed` (`id`,`cab_no`,`longt`,`latd`,`point`,`speed`) VALUES 
 (1,'1','80.234781','10.984479','45.609629999999996','-0.11467780000000047'),
 (2,'2','80.234784','13.914680','47.074732000000004','0.14651020000000087'),
 (3,'3','80.234785','13.671920','46.9533525','-0.012137950000000331');
/*!40000 ALTER TABLE `speed` ENABLE KEYS */;


--
-- Definition of table `type`
--

DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `type`
--

/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` (`id`,`note`) VALUES 
 (1,'null'),
 (2,'null'),
 (3,'null'),
 (4,'null'),
 (5,'Normal'),
 (6,'null'),
 (7,'null'),
 (8,'null'),
 (9,'null'),
 (10,'null'),
 (11,'null'),
 (12,'null'),
 (13,'null'),
 (14,'null'),
 (15,'null'),
 (16,'Average'),
 (17,'null'),
 (18,'null'),
 (19,'null'),
 (20,'null'),
 (21,'Average'),
 (22,'null'),
 (23,'null'),
 (24,'null'),
 (25,'null'),
 (26,'null'),
 (27,'null'),
 (28,'null'),
 (29,'Average'),
 (30,'null'),
 (31,'null'),
 (32,'null'),
 (33,'null'),
 (34,'null'),
 (35,'null'),
 (36,'null'),
 (37,'null'),
 (38,'null'),
 (39,'null'),
 (40,'Average'),
 (41,'null'),
 (42,'null'),
 (43,'null'),
 (44,'null'),
 (45,'null'),
 (46,'null'),
 (47,'null'),
 (48,'null'),
 (49,'null'),
 (50,'null'),
 (51,'Average'),
 (52,'Average'),
 (53,'Average'),
 (54,'null'),
 (55,'null'),
 (56,'null'),
 (57,'null'),
 (58,'null'),
 (59,'null'),
 (60,'null'),
 (61,'null'),
 (62,'null'),
 (63,'null'),
 (64,'null'),
 (65,'null'),
 (66,'null'),
 (67,'null'),
 (68,'null'),
 (69,'null'),
 (70,'Moderate'),
 (71,'Moderate'),
 (72,'Moderate'),
 (73,'Moderate'),
 (74,'Moderate'),
 (75,'Moderate'),
 (76,'Moderate'),
 (77,'Moderate'),
 (78,'Serious'),
 (79,'null'),
 (80,'null'),
 (81,'null'),
 (82,'Serious'),
 (83,'Serious'),
 (84,'Serious'),
 (85,'Serious'),
 (86,'Moderate'),
 (87,'null'),
 (88,'null'),
 (89,'null'),
 (90,'null'),
 (91,'null'),
 (92,'null'),
 (93,'null'),
 (94,'Average'),
 (95,'null'),
 (96,'null'),
 (97,'null'),
 (98,'null'),
 (99,'null'),
 (100,'null'),
 (101,'null'),
 (102,'Average'),
 (103,'null'),
 (104,'null'),
 (105,'null'),
 (106,'null'),
 (107,'null'),
 (108,'null'),
 (109,'null'),
 (110,'null'),
 (111,'null'),
 (112,'null'),
 (113,'Average'),
 (114,'null'),
 (115,'null'),
 (116,'null'),
 (117,'null'),
 (118,'null'),
 (119,'null'),
 (120,'null'),
 (121,'Normal');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(3) unsigned NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userid`,`name`,`password`) VALUES 
 (1,'prasan','123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
