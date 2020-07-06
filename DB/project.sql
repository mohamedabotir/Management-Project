-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2019 at 10:50 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `name` varchar(30) COLLATE utf8_general_mysql500_ci NOT NULL,
  `phone` int(15) NOT NULL,
  `visa` varchar(25) COLLATE utf8_general_mysql500_ci NOT NULL,
  `country` varchar(30) COLLATE utf8_general_mysql500_ci NOT NULL,
  `national` int(20) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`name`, `phone`, `visa`, `country`, `national`, `date`) VALUES
('mohamed', 9043414, 'LDJFHI', 'Afghanistan', 2131, '2019-12-26'),
('mohamedessa', 1234, 'wfgjjyt', 'Afghanistan', 41456, '2019-12-31'),
('mohamedas', 289163, 'dsgdsgsd', 'Antarctica', 124566, '2019-12-27'),
('mariano', 123141, 'ASDASD-FSAF-ASD', 'Egypt', 1242564, '0000-00-00'),
('mohamedmetwally', 109914785, 'LKOU-AJOFFU-ASDJD', 'Italia', 1889647, '0000-00-00'),
('mohamed', 123, 'LADDIW-ASDJF-OWQI', 'amsterdam', 39219641, '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `name` varchar(30) COLLATE utf8_general_mysql500_ci NOT NULL,
  `password` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `password`) VALUES
('mohamed', 123);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`national`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
