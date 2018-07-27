/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.36-community : Database -  navarasan_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/` navarasan_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE ` navarasan_db`;

/*Table structure for table `nnaadminregistration` */

DROP TABLE IF EXISTS `nnaadminregistration`;

CREATE TABLE `nnaadminregistration` (
  `admin_id` int(5) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) DEFAULT NULL,
  `admin_email` varchar(50) DEFAULT NULL,
  `admin_phone` varchar(50) DEFAULT NULL,
  `admin_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `nnaadminregistration` */

insert  into `nnaadminregistration`(`admin_id`,`admin_name`,`admin_email`,`admin_phone`,`admin_password`) values (1,'punith','punithkumar325@gmail.com','9738562088','Punith@1234'),(2,'nna','nna@gmail.com','1234567890','nna1234');

/*Table structure for table `nnaadmission` */

DROP TABLE IF EXISTS `nnaadmission`;

CREATE TABLE `nnaadmission` (
  `admission_id` int(6) NOT NULL AUTO_INCREMENT,
  `admission_image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `nnaadmission` */

insert  into `nnaadmission`(`admission_id`,`admission_image`) values (1,'application.jpg');

/*Table structure for table `nnaads` */

DROP TABLE IF EXISTS `nnaads`;

CREATE TABLE `nnaads` (
  `ads_id` int(5) NOT NULL AUTO_INCREMENT,
  `ads_image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ads_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `nnaads` */

insert  into `nnaads`(`ads_id`,`ads_image`) values (1,'ad1.jpg'),(2,'ad2.jpg');

/*Table structure for table `nnaauditions` */

DROP TABLE IF EXISTS `nnaauditions`;

CREATE TABLE `nnaauditions` (
  `auditions_id` int(6) NOT NULL AUTO_INCREMENT,
  `auditions_image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`auditions_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `nnaauditions` */

insert  into `nnaauditions`(`auditions_id`,`auditions_image`) values (1,'aud1.jpg'),(2,'aud2.jpg'),(3,'aud4.jpg');

/*Table structure for table `nnabanner` */

DROP TABLE IF EXISTS `nnabanner`;

CREATE TABLE `nnabanner` (
  `banner_id` int(5) NOT NULL AUTO_INCREMENT,
  `banner_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `nnabanner` */

insert  into `nnabanner`(`banner_id`,`banner_name`) values (1,'banner1.jpg'),(2,'banner2.jpg'),(3,'banner3.jpg');

/*Table structure for table `nnafaculty` */

DROP TABLE IF EXISTS `nnafaculty`;

CREATE TABLE `nnafaculty` (
  `faculty_id` int(5) NOT NULL AUTO_INCREMENT,
  `faculty_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `faculty_disc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `faculty_image` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`faculty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `nnafaculty` */

insert  into `nnafaculty`(`faculty_id`,`faculty_name`,`faculty_disc`,`faculty_image`) values (1,'ನಾರಾಯಣ್  ','ನಟ ಹಾಗು ನಿರ್ದೇಶಕ','narayan.png'),(2,'ಮಹೇಂದರ್','ನಟ ಹಾಗು ನಿರ್ದೇಶಕ','mahender.png'),(3,'ಮಾಲೂರ್ ಶ್ರೀನಿವಾಸ್','ನೃತ್ಯ ನಿರ್ದೇಶಕ','mallur.png'),(4,'ಅನಂತರಾಜು','ನಟ ಹಾಗು ನಿರ್ದೇಶಕ','anantharaju.png'),(5,'ಲಕ್ಕಿ ಶಂಕರ್ ','ನಟ ಹಾಗು ನಿರ್ದೇಶಕ','laxshmishankar.png'),(6,'ಅನಿಲ್ ಅಂಬಾರಿ\r\n','ಹಿನ್ನೆಲೆ ಗಾಯಕ','anantharaju.png');

/*Table structure for table `nnafeedback` */

DROP TABLE IF EXISTS `nnafeedback`;

CREATE TABLE `nnafeedback` (
  `feed_id` int(10) NOT NULL AUTO_INCREMENT,
  `feed_name` varchar(50) DEFAULT NULL,
  `feed_email` varchar(50) DEFAULT NULL,
  `feed_subject` varchar(50) DEFAULT NULL,
  `feed_msg` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`feed_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `nnafeedback` */

insert  into `nnafeedback`(`feed_id`,`feed_name`,`feed_email`,`feed_subject`,`feed_msg`) values (1,'punith','punith@gmail.com','sub','zbxavcagagcvbcvac'),(2,'punith','punith@gmail.com','subject ','message');

/*Table structure for table `nnagallery` */

DROP TABLE IF EXISTS `nnagallery`;

CREATE TABLE `nnagallery` (
  `gallery_id` int(6) NOT NULL AUTO_INCREMENT,
  `gallery_image` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`gallery_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `nnagallery` */

insert  into `nnagallery`(`gallery_id`,`gallery_image`) values (1,'g1.jpg'),(2,'g2.jpg'),(3,'g3.jpg'),(4,'g4.jpg'),(5,'g5.jpg'),(6,'g6.jpg'),(7,'g7.jpg'),(8,'g8.jpg');

/*Table structure for table `nnateam` */

DROP TABLE IF EXISTS `nnateam`;

CREATE TABLE `nnateam` (
  `team_id` int(6) NOT NULL AUTO_INCREMENT,
  `member_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `member_disg` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `member_image` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`team_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `nnateam` */

insert  into `nnateam`(`team_id`,`member_name`,`member_disg`,`member_image`) values (1,'ನಾರಾಯಣ್ ','ನಟ ಹಾಗೂ ನಿರ್ದೇಶಕ','n1.jpg'),(2,'ಮಹೇಂದರ್','ನಟ ಹಾಗೂ ನಿರ್ದೇಶಕ','m1.jpg'),(3,'ಮಾಲೂರ್ ಶ್ರೀನಿವಾಸ್ ','ನೃತ್ಯ ನಿರ್ದೇಶಕ','h8.png'),(4,'ಲಕ್ಕಿ ಶಂಕರ್ ','ನಟ ಹಾಗೂ ನಿರ್ದೇಶಕ','h3.png'),(5,'ಅನಿಲ್ ಅಂಬಾರಿ ','ಹಿನ್ನೆಲೆ ಗಾಯಕ','h1.png'),(6,'ಅನಂತರಾಜು ','ನಟ ಹಾಗೂ ನಿರ್ದೇಶಕ','h2.png'),(12,'ಸುದೀಪ್','ನಾಯಕನಟ','sudeep.jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
