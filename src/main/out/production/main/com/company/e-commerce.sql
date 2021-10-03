-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 03, 2021 at 04:07 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e-commerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `OrderID` int(11) NOT NULL AUTO_INCREMENT,
  `OrderUserID` int(11) NOT NULL,
  `OrderAmount` float NOT NULL,
  `OrderShipAddress` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `OrderCity` varchar(50) COLLATE latin1_german2_ci NOT NULL,
  `OrderPhone` varchar(20) COLLATE latin1_german2_ci NOT NULL,
  `OrderEmail` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=MyISAM AUTO_INCREMENT=51 DEFAULT CHARSET=latin1 COLLATE=latin1_german2_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`OrderID`, `OrderUserID`, `OrderAmount`, `OrderShipAddress`, `OrderCity`, `OrderPhone`, `OrderEmail`, `date`) VALUES
(1, 11, 1000, 'address1', 'city1', '0000000001', 'person1@gmail.com', '2020-10-01'),
(2, 12, 1100, 'address2', 'city2', '0000000002', 'person2@gmail.com', '2020-10-02'),
(3, 13, 1200, 'address3', 'city3', '0000000003', 'person3@gmail.com', '2020-10-03'),
(4, 14, 1300, 'address4', 'city4', '0000000004', 'person4@gmail.com', '2020-10-04'),
(5, 15, 1400, 'address5', 'city5', '0000000005', 'person5@gmail.com', '2020-10-05'),
(6, 16, 1500, 'address6', 'city6', '0000000006', 'person6@gmail.com', '2020-10-06'),
(7, 17, 1600, 'address7', 'city7', '0000000007', 'person7@gmail.com', '2020-10-07'),
(8, 18, 1700, 'address8', 'city8', '0000000008', 'person8@gmail.com', '2020-10-08'),
(9, 19, 1800, 'address9', 'city9', '0000000009', 'person9@gmail.com', '2020-10-09'),
(10, 20, 1900, 'address10', 'city10', '0000000010', 'person10@gmail.com', '2020-10-10'),
(11, 21, 2000, 'address11', 'city11', '0000000011', 'person11@gmail.com', '2020-10-11'),
(12, 22, 2100, 'address12', 'city12', '0000000012', 'person12@gmail.com', '2020-10-12'),
(13, 23, 2200, 'address13', 'city13', '0000000013', 'person13@gmail.com', '2020-10-13'),
(14, 24, 2300, 'address14', 'city14', '0000000014', 'person14@gmail.com', '2020-10-14'),
(15, 25, 2400, 'address15', 'city15', '0000000015', 'person15@gmail.com', '2020-10-15'),
(16, 26, 2500, 'address16', 'city16', '0000000016', 'person16@gmail.com', '2020-10-16'),
(17, 27, 2600, 'address17', 'city17', '0000000017', 'person17@gmail.com', '2020-10-17'),
(18, 28, 2700, 'address18', 'city18', '0000000018 ', 'person18@gmail.com', '2020-10-18'),
(19, 29, 2800, 'address19', 'city19', '0000000019', 'person19@gmail.com', '2020-10-19'),
(20, 30, 2900, 'address20', 'city20', '0000000020', 'person20@gmail.com', '2020-10-20'),
(21, 31, 3000, 'address21', 'city21', '0000000021', 'person21@gmail.com', '2020-10-21'),
(22, 32, 3100, 'address22', 'city22', '0000000022', 'person22@gmail.com', '2020-10-22'),
(23, 33, 3200, 'address23', 'city23', '0000000023', 'person23@gmail.com', '2020-10-23'),
(24, 34, 3300, 'address24', 'city24', '0000000024', 'person24@gmail.com', '2020-10-24'),
(25, 35, 3400, 'address25', 'city25', '0000000025', 'person25@gmail.com', '2020-10-25'),
(26, 36, 3500, 'address26', 'city26', '0000000026', 'person26@gmail.com', '2020-10-26'),
(27, 37, 3600, 'address27', 'city27', '0000000027', 'person27@gmail.com', '2020-10-27'),
(28, 38, 3700, 'address28', 'city28', '0000000028', 'person28@gmail.com', '2020-10-28'),
(29, 39, 3800, 'address29', 'city29', '0000000029', 'person29@gmail.com', '2020-10-29'),
(30, 40, 3900, 'address30', 'city30', '0000000030', 'person30@gmail.com', '2020-10-30'),
(31, 41, 4000, 'address31', 'city31', '0000000031', 'person31@gmail.com', '2020-10-31'),
(32, 42, 4100, 'address32', 'city32', '0000000032', 'person32@gmail.com', '2020-11-01'),
(33, 43, 4200, 'address 33', 'city 33', '0000000033', 'person33@gmail.com', '2020-11-02'),
(34, 44, 4300, 'address34', 'city34', '0000000034', 'person34@gmail.com', '2020-11-03'),
(35, 45, 4400, 'address35', 'city35', '0000000035', 'person35@gmail.com', '2020-11-04'),
(36, 46, 4500, 'address36', 'city36', '0000000036', 'person36@gmail.com', '2020-11-05'),
(37, 47, 4600, 'address37', 'city37', '0000000037', 'person37@gmail.com', '2020-11-06'),
(38, 48, 4700, 'address38', 'city38', '0000000038', 'person38@gmail.com', '2020-11-07'),
(39, 49, 4800, 'address39', 'city39', '0000000039', 'person39@gmail.com', '2020-11-08'),
(40, 50, 4900, 'address40', 'city40', '0000000040', 'person40@gmail.com', '2020-11-09'),
(41, 51, 5000, 'address41', 'city41', '0000000041', 'person41@gmail.com', '2020-11-10'),
(42, 52, 5100, 'address42', 'city42', '0000000042', 'person42@gmail.com', '2020-11-11'),
(43, 53, 5200, 'address43', 'city43', '0000000043', 'perso43n@gmail.com', '2020-11-12'),
(44, 54, 5300, 'address44', 'city44', '0000000044', 'person44@gmail.com', '2020-11-13'),
(45, 55, 5400, 'address45', 'city45', '0000000045', 'person45@gmail.com', '2020-11-14'),
(46, 56, 5500, 'address46', 'city46', '0000000046', 'person46@gmail.com', '2020-11-15'),
(47, 57, 5600, 'address47', 'city47', '0000000047', 'person47@gmail.com', '2020-11-16'),
(48, 58, 5700, 'address48', 'city48', '0000000048', 'person48@gmail.com', '2020-11-17'),
(49, 59, 5800, 'address49', 'city49', '0000000049', 'person49@gmail.com', '2020-11-18'),
(50, 60, 5900, 'address50', 'city50', '0000000050', 'person50@gmail.com', '2020-11-19');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `ProductID` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `ProductPrice` float NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`ProductID`)
) ENGINE=MyISAM AUTO_INCREMENT=991 DEFAULT CHARSET=latin1 COLLATE=latin1_german2_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ProductID`, `ProductName`, `ProductPrice`, `date`) VALUES
(1, 'clothe1', 1095, '2021-06-13'),
(2, 'clothe2', 995, '2021-06-14'),
(3, 'clothe3', 895, '2021-06-15'),
(4, 'clothe4', 795, '2021-06-16'),
(5, 'clothe5', 695, '2021-06-17'),
(6, 'clothe6', 595, '2021-06-18'),
(7, 'clothe7', 495, '2021-06-19'),
(8, 'clothe8', 395, '2021-06-20'),
(9, 'clothe9', 295, '2021-06-21'),
(10, 'clothe10', 195, '2021-06-22'),
(11, 'clothe11', 95, '2021-06-23'),
(12, 'clothe12', 95, '2021-06-24'),
(13, 'clothe13', 100, '2021-06-25'),
(14, 'clothe14', 200, '2021-06-26'),
(15, 'clothe15', 300, '2021-06-27'),
(16, 'clothe16', 400, '2021-06-28'),
(17, 'clothe17', 500, '2021-06-29'),
(18, 'clothe18', 600, '2021-06-30'),
(19, 'clothe19', 700, '2021-07-01'),
(20, 'clothe20', 800, '2021-07-02'),
(21, 'clothe21', 900, '2021-07-03'),
(22, 'clothe22', 1000, '2021-07-04'),
(23, 'clothe23', 1100, '2021-07-05'),
(24, 'clothe24', 1200, '2021-07-06'),
(25, 'clothe25', 1300, '2021-07-07'),
(26, 'clothe26', 1400, '2021-07-08'),
(27, 'clothe27', 1500, '2021-07-09'),
(28, 'clothe28', 1600, '2021-07-10'),
(29, 'clothe29', 1700, '2021-07-11'),
(30, 'clothe30', 1800, '2021-07-12'),
(31, 'clothe31', 1900, '2021-07-13'),
(32, 'clothe32', 2000, '2021-07-14'),
(33, 'clothe33', 2100, '2021-07-15'),
(34, 'clothe34', 2200, '2021-07-16'),
(35, 'clothe35', 2300, '2021-07-17'),
(36, 'clothe36', 2400, '2021-07-18'),
(37, 'clothe37', 2500, '2021-07-19'),
(38, 'clothe38', 2600, '2021-07-20'),
(39, 'clothe39', 2700, '2021-07-21'),
(40, 'clothe40', 2800, '2021-07-22'),
(41, 'clothe41', 2900, '2021-07-23'),
(42, 'clothe42', 3000, '2021-07-24'),
(43, 'clothe43', 3100, '2021-07-25'),
(44, 'clothe44', 3200, '2021-07-26'),
(45, 'clothe45', 3300, '2021-07-27'),
(46, 'clothe46', 3400, '2021-07-28'),
(47, 'clothe47', 3500, '2021-07-29'),
(48, 'clothe48', 3600, '2021-07-30'),
(49, 'clothe49', 3700, '2021-07-31'),
(50, 'clothe50', 3800, '2021-08-01');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `UserEmail` varchar(500) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserPassword` varchar(500) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserName` varchar(50) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserCity` varchar(90) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserPhone` varchar(20) COLLATE latin1_german2_ci DEFAULT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=MyISAM AUTO_INCREMENT=51 DEFAULT CHARSET=latin1 COLLATE=latin1_german2_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `UserEmail`, `UserPassword`, `UserName`, `UserCity`, `UserPhone`, `date`) VALUES
(1, 'user1@gmail.com', 'password1', 'user1', 'city1', '0000000001', '2021-08-10'),
(2, 'user2@gmail.com', 'password2', 'user2', 'city2', '0000000002', '2021-08-11'),
(3, 'user3@gmail.com', 'password3', 'user3', 'city3', '0000000003', '2021-08-12'),
(4, 'user4@gmail.com', 'password4', 'user4', 'city4', '0007000001', '2021-08-13'),
(5, 'user5@gmail.com', 'password5', 'user5', 'city5', '0000040002', '2021-08-14'),
(6, 'user6@gmail.com', 'password6', 'user6', 'city6', '0000100003', '2021-08-15'),
(7, 'user7@gmail.com', 'password7', 'user7', 'city7', '0000600001', '2021-08-16'),
(8, 'user8@gmail.com', 'password8', 'user8', 'city8', '0800000002', '2021-08-17'),
(9, 'user9@gmail.com', 'password9', 'user9', 'city9', '0000400003', '2021-08-18'),
(10, 'user10@gmail.com', 'password10', 'user10', 'city10', '0770000001', '2021-08-19'),
(11, 'use11r@gmail.com', 'password11', 'user11', 'city11', '0088000002', '2021-08-20'),
(12, 'user12@gmail.com', 'password12', 'user12', 'city12', '0006800003', '2021-08-21'),
(13, 'user13@gmail.com', 'password13', 'user13', 'city13', '0000000001', '2021-08-22'),
(14, 'use14r@gmail.com', 'password14', 'user14', 'city14', '2000000002', '2021-08-23'),
(15, 'user15@gmail.com', 'password15', 'user15', 'city15', '002200003', '2021-08-24'),
(16, 'user16@gmail.com', 'password16', 'user16', 'city16', '0000550001', '2021-08-25'),
(17, 'user17@gmail.com', 'password17', 'user17', 'city17', '0005500002', '2021-08-26'),
(18, 'user18@gmail.com', 'password18', 'user18', 'city18', '0450000003', '2021-08-27'),
(19, 'use19r@gmail.com', 'password19', 'user19', 'city19', '0000220001', '2021-08-28'),
(20, 'use20r@gmail.com', 'password20', 'user20', 'city20', '0250000002', '2021-08-29'),
(21, 'user21@gmail.com', 'password21', 'user21', 'city21', '0056000003', '2021-08-30'),
(22, 'user22@gmail.com', 'password22', 'user22', 'city22', '0022000001', '2021-09-01'),
(23, 'user23@gmail.com', 'password23', 'user23', 'city23', '0004400002', '2021-09-02'),
(24, 'user24@gmail.com', 'password24', 'user24', 'city24', '0220000003', '2021-09-03'),
(25, 'user25@gmail.com', 'password25', 'user25', 'city25', '0088000001', '2021-09-04'),
(26, 'use26r@gmail.com', ' password26', 'user26', 'city26', '0000250002', '2021-09-05'),
(27, 'user27@gmail.com', 'password27', 'user27', 'city27', '0000007783', '2021-09-06'),
(28, 'user28@gmail.com', 'password28', 'user28', 'city28', '0004440001', '2021-09-07'),
(29, 'use29r@gmail.com', 'password29', 'user29', 'city29', '0558000002', '2021-09-08'),
(30, 'user30@gmail.com', 'password30', 'user30', 'city30', '00125000003', '2021-09-09'),
(31, 'user31@gmail.com', 'password31', 'user31', 'city31', '00058800001', '2021-09-10'),
(32, 'user32@gmail.com', 'password32', 'user32', 'city32', '00007770002', '2021-09-11'),
(33, 'user33@gmail.com', 'password33', 'user33', 'city33', '0000225003', '2021-09-12'),
(34, 'user34@gmail.com', 'password34', 'user34', 'city34', '0007890001', '2021-09-13'),
(35, 'user35@gmail.com', 'password35', 'user35', 'city35', '0004560002', '2021-09-14'),
(36, 'user36@gmail.com', 'password36', 'user36', 'city36', '0028500003', '2021-09-15'),
(37, 'use37r@gmail.com', 'password37', 'user37', 'city37', '0045600001', '2021-09-16'),
(38, 'user38@gmail.com', 'password38', 'user38', 'city38', '0000012202', '2021-09-17'),
(39, 'user39@gmail.com', 'password39', 'user39', 'city39', '0141000003', '2021-09-18'),
(40, 'user40@gmail.com', 'password40', 'user40', 'city40', '0078950001', '2021-09-19'),
(41, 'user41@gmail.com', 'password41', 'user41', 'city41', '0001257002', '2021-09-20'),
(42, 'use42r@gmail.com', 'password42', 'user42', 'city42', '1400000003', '2021-09-21'),
(43, 'use43r@gmail.com', 'password43', 'user43', 'city43', '0001450001', '2021-09-22'),
(44, 'user44@gmail.com', 'password44', 'user44', 'city44', '0001250002', '2021-09-23'),
(45, 'user45@gmail.com', 'password45', 'user45', 'city45', '00001280003', '2021-09-24'),
(46, 'user46@gmail.com', 'password46', 'user46', 'city46', '00255000041', '2021-09-25'),
(47, 'user47@gmail.com', 'password47', 'user47', 'city47', '00000255802', '2021-09-26'),
(48, 'user48@gmail.com', 'password48', 'user48', ' city48', '0000255003', '2021-09-27'),
(49, 'user49@gmail.com', 'password49', 'user49', 'city49', '0000255001', '2021-09-28'),
(50, 'user50@gmail.com', 'password50', 'user50', 'city50', '0000258002', '2021-09-29');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
