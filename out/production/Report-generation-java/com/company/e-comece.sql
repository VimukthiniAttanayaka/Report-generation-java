-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 02, 2021 at 04:12 AM
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
-- Database: `e-comece`
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
  `OrderShipName` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `OrderShipAddress` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `OrderCity` varchar(50) COLLATE latin1_german2_ci NOT NULL,
  `OrderCountry` varchar(50) COLLATE latin1_german2_ci NOT NULL,
  `OrderPhone` varchar(20) COLLATE latin1_german2_ci NOT NULL,
  `OrderEmail` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `OrderDate` timestamp NOT NULL DEFAULT current_timestamp(),
  `OrderShipped` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`OrderID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_german2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `ProductID` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(100) COLLATE latin1_german2_ci NOT NULL,
  `ProductPrice` float NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp(),
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
(18, 'clothe18', 600, '2021-07-01'),
(19, 'clothe19', 700, '2021-07-02'),
(20, 'clothe20', 800, '2021-07-03'),
(21, 'clothe21', 900, '2021-07-04'),
(22, 'clothe22', 1000, '2021-07-05'),
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
(42, 'clothe42', 3000, '2021-07-25'),
(43, 'clothe43', 3100, '2021-07-26'),
(44, 'clothe44', 3200, '2021-07-27'),
(45, 'clothe45', 3300, '2021-07-28'),
(46, 'clothe46', 3400, '2021-07-29'),
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
  `UserFirstName` varchar(50) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserLastName` varchar(50) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserCity` varchar(90) COLLATE latin1_german2_ci DEFAULT NULL,
  `UserEmailVerified` tinyint(1) DEFAULT 0,
  `UserRegistrationDate` timestamp NULL DEFAULT current_timestamp(),
  `UserPhone` varchar(20) COLLATE latin1_german2_ci DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_german2_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
