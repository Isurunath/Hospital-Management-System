-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 01, 2015 at 09:59 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `addinfo`
--

CREATE TABLE IF NOT EXISTS `addinfo` (
  `Patient_ID` int(11) NOT NULL,
  `Patient_Name` varchar(50) DEFAULT NULL,
  `Patient_Type` varchar(50) NOT NULL,
  `Test_date` date DEFAULT NULL,
  `Test_Type` varchar(50) DEFAULT NULL,
  `Test_Info` varchar(200) DEFAULT NULL,
  `Approver` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addinfo`
--

INSERT INTO `addinfo` (`Patient_ID`, `Patient_Name`, `Patient_Type`, `Test_date`, `Test_Type`, `Test_Info`, `Approver`) VALUES
(64, 'C.C.Bandara', 'OPD', '2015-10-31', 'Blood', 'for suger', 'Perera');

-- --------------------------------------------------------

--
-- Table structure for table `add_staff`
--

CREATE TABLE IF NOT EXISTS `add_staff` (
  `Employee_Id` int(8) NOT NULL AUTO_INCREMENT,
  `Employee_Name` varchar(20) DEFAULT NULL,
  `Designation` text,
  `Join_Date` varchar(100) DEFAULT NULL,
  `Qulifications` text,
  `Department` varchar(15) DEFAULT NULL,
  `Date_of_Birth` varchar(100) DEFAULT NULL,
  `Gender` text,
  `Phone` varchar(10) DEFAULT NULL,
  `Current_Address` varchar(20) DEFAULT NULL,
  `Permenent_Address` varchar(20) DEFAULT NULL,
  `E_Mail` varchar(20) DEFAULT NULL,
  `User_Name` varchar(15) DEFAULT NULL,
  `Password` varchar(10) DEFAULT NULL,
  `ward` varchar(10) DEFAULT NULL,
  `NIC` varchar(60) NOT NULL,
  PRIMARY KEY (`Employee_Id`),
  UNIQUE KEY `Phone` (`Phone`),
  UNIQUE KEY `E_Mail` (`E_Mail`,`User_Name`,`NIC`),
  UNIQUE KEY `E_Mail_2` (`E_Mail`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1040 ;

--
-- Dumping data for table `add_staff`
--

INSERT INTO `add_staff` (`Employee_Id`, `Employee_Name`, `Designation`, `Join_Date`, `Qulifications`, `Department`, `Date_of_Birth`, `Gender`, `Phone`, `Current_Address`, `Permenent_Address`, `E_Mail`, `User_Name`, `Password`, `ward`, `NIC`) VALUES
(1028, 'vineetha', 'Senior Head Officer(SHO)', 'Sep 15, 2015', 'MBBS', 'Health', 'Dec 22, 1991', 'Male', '0782998546', 'Piliyandala', 'Piliyandala', 'vinee@gmail.com', 'vineethaaa', 'vinee', 'W001', '916046474V'),
(1029, 'surangi', 'Nurse', 'Sep 3, 2015', 'Nursing Degree', 'Health', 'Sep 9, 1992', 'Female', '0719433300', 'Malabe	', 'Malabe', 'sura@gmail.com', 'suraaaa', 'sura', 'W001', '926226474V'),
(1031, 'samitha', 'Medical Officer(MO)', 'Sep 16, 2015', 'MBBS', 'Health', 'Oct 12, 1993', 'Male', '0716633311', 'Dehiwala	', 'Dehiwala', 'samitha@gmail.com', 'samithaa', 'samitha', 'W001', '936226474V'),
(1034, 'Amila', 'Medical Officer(MO)', 'Oct 2, 2015', 'MBBS', 'Health', 'Oct 13, 1988', 'Male', '0782998543', 'Rathnapura', 'Rathnapura', 'isoo@gmail.com', 'isoo', '123', 'W001', '936046474V'),
(1035, 'gayani', 'Sister', 'Oct 1, 2015', 'Nursing Degree', 'Health', 'Aug 14, 1991', 'Male', '0782998547', 'Rathnapura', 'Rathnapura', 'isoo1@gmail.com', 'abc', 'abc', 'W001', '931046474V'),
(1039, 'sunil', 'Labours', 'Oct 2, 2015', 'n', 'Health', 'Oct 21, 2009', 'Male', '0784998547', 'Rathnapura', 'Rathnapura', 'isoo2@gmail.com', 'abc', 'abc', NULL, '944046474V');

-- --------------------------------------------------------

--
-- Table structure for table `assign_property`
--

CREATE TABLE IF NOT EXISTS `assign_property` (
  `AssignId` int(10) NOT NULL AUTO_INCREMENT,
  `PropertyId` int(10) NOT NULL,
  `SupplierId` int(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Quantity` int(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Warrenty` varchar(100) NOT NULL,
  `Location` varchar(100) NOT NULL,
  PRIMARY KEY (`AssignId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=30 ;

--
-- Dumping data for table `assign_property`
--

INSERT INTO `assign_property` (`AssignId`, `PropertyId`, `SupplierId`, `Name`, `Type`, `Quantity`, `Date`, `Warrenty`, `Location`) VALUES
(22, 15, 39, 'fan', 'Electrical', 1, '2015-10-28', '5', 'lab07'),
(25, 13, 39, 'bed', 'Other', 1, '2015-10-21', '5', 'lab01'),
(26, 6, 38, 'silinger', 'Labotary', 10, '2015-10-28', '5', 'w008'),
(27, 15, 39, 'fan', 'Electrical', 1, '2015-10-28', '5', 'w005'),
(28, 25, 40, 'fan', 'Electrical', 1, '2015-10-29', '5', 'icu'),
(29, 24, 39, 'chair', 'Other', 1, '2015-10-21', '3', 'w002');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE IF NOT EXISTS `attendance` (
  `staffID` varchar(20) NOT NULL,
  `workin_date` datetime NOT NULL,
  `workout_date` datetime DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`staffID`, `workin_date`, `workout_date`, `status`) VALUES
('amila', '2015-08-23 00:00:00', NULL, NULL),
('amila', '2015-08-23 11:49:49', NULL, NULL),
('amila', '2015-08-23 12:03:34', '2015-08-23 12:26:28', 'complete'),
('amila', '2015-08-23 12:40:37', '2015-08-23 12:40:46', 'complete'),
('S0001', '2015-08-23 14:43:53', '2015-08-23 14:43:57', 'complete'),
('null', '2015-08-30 09:46:57', '2015-09-29 00:29:54', 'complete'),
('null', '2015-09-29 00:29:56', '2015-09-29 00:30:00', 'complete'),
('null', '2015-09-29 12:36:41', '2015-09-29 12:37:19', 'complete'),
('null', '2015-09-29 12:45:44', '2015-09-29 12:46:27', 'complete'),
('null', '2015-09-30 21:20:55', '2015-09-30 21:24:27', 'complete'),
('ll', '2015-09-30 21:24:29', NULL, 'incomplete'),
('suraaaa', '2015-09-30 21:33:08', '2015-09-30 21:33:13', 'complete'),
('suraaaa', '2015-10-01 21:24:13', '2015-10-01 21:24:24', 'complete');

-- --------------------------------------------------------

--
-- Table structure for table `bed`
--

CREATE TABLE IF NOT EXISTS `bed` (
  `bedID` varchar(5) NOT NULL,
  `wardID` varchar(5) NOT NULL,
  `patientID` varchar(5) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bed`
--

INSERT INTO `bed` (`bedID`, `wardID`, `patientID`, `note`) VALUES
('B03', 'W002', '34', NULL),
('B03', 'W001', '32', ''),
('B04', 'W001', '64', NULL),
('B05', 'W001', '66', ''),
('B06', 'W001', '67', ''),
('B07', 'W001', 'null', NULL),
('B08', 'W001', '71', NULL),
('B02', 'W002', '76', NULL),
('B05', 'W002', '68', NULL),
('B14', 'W002', '73', NULL),
('B01', 'W002', '72', NULL),
('B29', 'W001', '70', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `bloodreceived`
--

CREATE TABLE IF NOT EXISTS `bloodreceived` (
  `id` varchar(45) NOT NULL,
  `volume` varchar(45) DEFAULT NULL,
  `receivedate` varchar(45) DEFAULT NULL,
  `bloodtype` varchar(45) DEFAULT NULL,
  `rhd` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodreceived`
--

INSERT INTO `bloodreceived` (`id`, `volume`, `receivedate`, `bloodtype`, `rhd`, `type`) VALUES
('883194349', '21212', '2015-08-30 03:15:55', 'A', 'Positive', 'Person'),
('883194349V', '200', '2015-08-23 15:57:44', 'person', NULL, NULL),
('883194349V', '222', '2015-08-30 03:51:27', 'A', 'Positive', 'Person'),
('883194349V', '22', '2015-08-30 03:53:15', 'A', 'Positive', 'Person'),
('883194349V', '222', '2015-08-30 03:55:30', 'A', 'Positive', 'Person'),
('abc', '33', '2015-08-30 03:56:05', 'AB', 'Positive', 'Blood Bank'),
('14', '5', '2015-09-01 19:58:06', 'A', 'Positive', 'Person');

-- --------------------------------------------------------

--
-- Table structure for table `clinic`
--

CREATE TABLE IF NOT EXISTS `clinic` (
  `clno` int(100) NOT NULL AUTO_INCREMENT,
  `clname` varchar(100) NOT NULL,
  `cltype` varchar(100) NOT NULL,
  `cldate` varchar(100) NOT NULL,
  `cltime` varchar(100) NOT NULL,
  `ward` varchar(100) NOT NULL,
  `consult` varchar(100) NOT NULL,
  PRIMARY KEY (`clno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `clinic`
--

INSERT INTO `clinic` (`clno`, `clname`, `cltype`, `cldate`, `cltime`, `ward`, `consult`) VALUES
(4, 'Heart', 'Weeekly', 'Monday', '08.30', '5', 'A.B.Kulathunga'),
(5, 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
(6, 'Dental', 'Monthly', 'Friday', '10.30', '8', 'A.B.Perera'),
(7, 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
(8, 'Heart', 'Weeekly', 'Monday', '08.30', '5', 'A.B.Kulathunga');

-- --------------------------------------------------------

--
-- Table structure for table `discharge`
--

CREATE TABLE IF NOT EXISTS `discharge` (
  `patientID` varchar(10) NOT NULL,
  `wardID` varchar(10) NOT NULL,
  `bedID` varchar(10) NOT NULL,
  `lab` varchar(50) NOT NULL,
  `clinic` varchar(50) NOT NULL,
  `condition` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`patientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `discharge`
--

INSERT INTO `discharge` (`patientID`, `wardID`, `bedID`, `lab`, `clinic`, `condition`) VALUES
('67', 'W001', 'B06', 'z', 'czx', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `doner`
--

CREATE TABLE IF NOT EXISTS `doner` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `weight` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `tp` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `bloodtype` varchar(45) DEFAULT NULL,
  `rhd` varchar(45) DEFAULT NULL,
  `regdate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doner`
--

INSERT INTO `doner` (`id`, `name`, `age`, `weight`, `address`, `tp`, `sex`, `bloodtype`, `rhd`, `regdate`) VALUES
('212212212121', 'ewew', '323', '3323', '323232', '323232', 'Male', 'A', 'Positive', '2015-08-30 00:23:15'),
('32334324234', 'eqweqwewq', 'eqweqwe', 'qweqwe', 'qweqwe', 'qweqweqweqwe', 'Male', 'A', 'Positive', '2015-08-29 22:52:06'),
('8121821821V', 'AAA', '32', '399', 'Add', '21', 'Male', 'AB', 'Positive', '2015-08-29 22:09:21'),
('883191348V', 'Aplus', '21', '400', 'Add', '2121', 'Female', 'AB', 'Positive', '2015-08-29 23:57:58'),
('883194349V', 'Asanka', '26', '81', 'Nugegoda', '0710818494', 'Male', 'A', 'Positive', '2015-08-22 22:54:08');

-- --------------------------------------------------------

--
-- Table structure for table `donerbanks`
--

CREATE TABLE IF NOT EXISTS `donerbanks` (
  `name` varchar(45) NOT NULL,
  `hospital` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `bloodtype` varchar(45) DEFAULT NULL,
  `rhd` varchar(45) DEFAULT NULL,
  `tp` varchar(45) DEFAULT NULL,
  `regdate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donerbanks`
--

INSERT INTO `donerbanks` (`name`, `hospital`, `address`, `bloodtype`, `rhd`, `tp`, `regdate`) VALUES
('', '', '', 'O', 'Negative', '', '2015-09-01 20:52:24'),
('13', 'hemas', 'kottawa', 'A', 'Positive', '0774222620', '2015-09-01 19:57:12'),
('16', 'lanka', 'www', 'O', 'Positive', '0774222620', '2015-09-27 12:55:06'),
('2323', 'KURUNEGALA', 'IBBAGAMUWA', 'A', 'Positive', '07712', '2015-09-24 11:27:11'),
('3489', '', '', 'A', 'Positive', '', '2015-09-24 10:29:50'),
('abc', 'H11', 'DWEIO', '32323', 'A', 'Positive', '2015-08-30 02:13:27'),
('namal', 'kurunegala', 'kutti', 'A', 'Positive', '077123', '2015-09-24 11:38:10'),
('thanuri', 'angoda', 'kottawa', 'A', 'Positive', '0372260566', '2015-09-22 10:13:42');

-- --------------------------------------------------------

--
-- Table structure for table `donerdt`
--

CREATE TABLE IF NOT EXISTS `donerdt` (
  `id` int(255) NOT NULL,
  `volume` int(255) NOT NULL,
  `bltype` varchar(255) NOT NULL,
  `rhd` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donerdt`
--

INSERT INTO `donerdt` (`id`, `volume`, `bltype`, `rhd`) VALUES
(11, 11, 'A', 'positive');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE IF NOT EXISTS `donor` (
  `id` int(100) NOT NULL,
  `age` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `sex` text NOT NULL,
  `bloodtype` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `weight` varchar(100) NOT NULL,
  `tp` varchar(100) NOT NULL,
  `rhd` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`id`, `age`, `address`, `sex`, `bloodtype`, `name`, `weight`, `tp`, `rhd`) VALUES
(1, '34', 'wee', 'rrr', 'rr', 'rr', '5555', 'fff', 'ff'),
(2, '12we', 'wert', 'ert', 'rty', 'dfgh', 'fgh', 'fgh', 'fgh'),
(6, '34', 'wee', 'rrr', 'rr', 'rr', '5555', 'fff', 'ff'),
(12, '21', 'weee', 'Male', 'A', 'siri', '31', '123456781', 'Positive'),
(23, '12', 'werty', 'Female', 'AB', 'ertyu', '123', '123456', 'Negative');

-- --------------------------------------------------------

--
-- Table structure for table `drive`
--

CREATE TABLE IF NOT EXISTS `drive` (
  `Driver_ID` varchar(100) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `National_Identy` varchar(100) NOT NULL,
  `Phone_Number` int(10) NOT NULL,
  `Lincense_number` int(10) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`Driver_ID`),
  UNIQUE KEY `id` (`Driver_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drive`
--

INSERT INTO `drive` (`Driver_ID`, `First_Name`, `Last_Name`, `Address`, `National_Identy`, `Phone_Number`, `Lincense_number`, `Date`) VALUES
(' 2', 'samitha', ' perera', ' angoda', ' 12345689V', 123456789, 1982469152, '2015-08-17'),
(' 3', 'surandi', ' perera', 'yapahuwa', ' 52364172V', 1234567891, 1982469152, '2015-08-17'),
(' 4', 'apple', ' perera', ' angoda', ' 12345689V', 1234567891, 1982469152, '2015-08-17');

-- --------------------------------------------------------

--
-- Table structure for table `emp_leave`
--

CREATE TABLE IF NOT EXISTS `emp_leave` (
  `EmpID` varchar(20) NOT NULL,
  `Leave_type` varchar(20) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Leave_Begin` varchar(20) NOT NULL,
  `Leave_End` varchar(20) NOT NULL,
  `Purpose` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Comment` varchar(50) NOT NULL,
  `Duration` varchar(10) NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_leave`
--

INSERT INTO `emp_leave` (`EmpID`, `Leave_type`, `Date`, `Leave_Begin`, `Leave_End`, `Purpose`, `Status`, `Comment`, `Duration`) VALUES
('1000', 'casual', '2015-09-09', '0000-00-00', '0000-00-00', 'wedding', 'pending', '', '2'),
('1032', 'sick', '2015-09-15', '0000-00-00', '0000-00-00', 'ddd', 'Approve', 'dgf', '10'),
('12', 'sick', '2015-08-10', '0000-00-00', '0000-00-00', 'loose', 'Approve', 'hjk', '4'),
('2000', 'annual', '2015-09-16', '0000-00-00', '0000-00-00', 'funaral', 'Approve', 'rghj', '4'),
('300', 'sick', '2015-09-01', '0000-00-00', '0000-00-00', 'wedding', '', '', '10'),
('3000', 'sick', '2015-09-07', '0000-00-00', '0000-00-00', 'fever', 'pending', '', '1'),
('400', 'sick', '2015-09-01', '0000-00-00', '0000-00-00', 'wedding', 'Approve', 'yes', '10'),
('4000', 'sick', '2015-09-01', '0000-00-00', '0000-00-00', 'sick', 'Approve', '11', '4'),
('500', 'sick', '2015-09-01', '0000-00-00', '0000-00-00', 'wedding', 'Approve', 'ghj', '10'),
('5000', 'annual', '2015-09-04', '0000-00-00', '0000-00-00', 'trip', 'Approve', 'yes', '2'),
('555', 'sick', '2015-08-11', '0000-00-00', '0000-00-00', 'fghj', 'Approve', 'dfh', '8'),
('6', 'vacation', '2015-08-03', '0000-00-00', '0000-00-00', 'ghu', '', '', '8'),
('suraaaa', 'annual leave', 'Date', '2015-10-13', '2015-10-21', 'db', 'Pending', '', '8'),
('xcv', 'annual leave', '1/10/2015', '2015-10-08', '2015-10-29', 'xcv', 'Pending', '', '21');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_transfer`
--

CREATE TABLE IF NOT EXISTS `hospital_transfer` (
  `patientID` varchar(20) NOT NULL,
  `reason` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital_transfer`
--

INSERT INTO `hospital_transfer` (`patientID`, `reason`) VALUES
('75', ''),
('77', ''),
('74', 'sd');

-- --------------------------------------------------------

--
-- Table structure for table `inventoryup`
--

CREATE TABLE IF NOT EXISTS `inventoryup` (
  `PropertyId` int(10) NOT NULL AUTO_INCREMENT,
  `SupplierId` int(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Quantity` int(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Warrenty` varchar(100) NOT NULL,
  `Location` varchar(100) NOT NULL,
  PRIMARY KEY (`PropertyId`),
  UNIQUE KEY `SupplierId` (`SupplierId`,`Name`,`Type`,`Quantity`,`Date`,`Warrenty`,`Location`),
  UNIQUE KEY `SupplierId_2` (`SupplierId`,`Name`,`Type`,`Quantity`,`Date`,`Warrenty`,`Location`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Dumping data for table `inventoryup`
--

INSERT INTO `inventoryup` (`PropertyId`, `SupplierId`, `Name`, `Type`, `Quantity`, `Date`, `Warrenty`, `Location`) VALUES
(4, 7, 'xray', 'Machines', 2, '2015-09-24', '10', 'Stock'),
(6, 38, 'silinger', 'Labotary', 90, '2015-10-28', '5', 'Stock'),
(13, 39, 'bed', 'Other', 4, '2015-10-21', '5', 'Stock'),
(24, 39, 'chair', 'Other', 24, '2015-10-21', '3', 'Stock'),
(15, 39, 'fan', 'Electrical', 4, '2015-10-28', '5', 'Stock'),
(23, 39, 'table', 'Other', 20, '2015-10-21', '3', 'Stock'),
(22, 40, 'AC', 'Machines', 1, '2015-10-21', '5', 'Stock'),
(25, 40, 'fan', 'Electrical', 4, '2015-10-29', '5', 'Stock');

-- --------------------------------------------------------

--
-- Table structure for table `med_assaign`
--

CREATE TABLE IF NOT EXISTS `med_assaign` (
  `Item_No` int(4) NOT NULL AUTO_INCREMENT,
  `Medicine_Name` varchar(35) NOT NULL,
  `Quantity` int(5) NOT NULL,
  `Location` varchar(35) NOT NULL,
  PRIMARY KEY (`Item_No`),
  KEY `Medicine_Name` (`Medicine_Name`),
  KEY `Medicine_Name_2` (`Medicine_Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Dumping data for table `med_assaign`
--

INSERT INTO `med_assaign` (`Item_No`, `Medicine_Name`, `Quantity`, `Location`) VALUES
(1, 'Insulin', 450, 'W001'),
(2, 'Chlorpropamide', 100, 'W005'),
(3, 'Glyclopyramide', 50, 'W006'),
(4, 'Levomilnacipran', 45, 'W002'),
(26, 'Chlorpropamide', 500, 'W005'),
(27, 'Chlorpropamide', 502, 'W005'),
(28, 'Chlorpropamide', 5550, 'W005'),
(29, 'Glyclopyramide', 10, 'W001'),
(30, 'Chlorpropamide', 5, 'W005'),
(31, 'Pioglitazone', 4, 'W006'),
(32, 'Chlorpropamide', 50, 'W005'),
(33, 'Vilazodone', 100, 'W003'),
(34, 'Chlorpropamide', 504, 'W005');

-- --------------------------------------------------------

--
-- Table structure for table `med_reg`
--

CREATE TABLE IF NOT EXISTS `med_reg` (
  `No` int(5) NOT NULL AUTO_INCREMENT,
  `Medicine_Name` varchar(30) NOT NULL,
  `Medicine_Type` varchar(20) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Manufacture_Name` varchar(20) NOT NULL,
  `Manufacture_Date` varchar(20) NOT NULL,
  `Expiry_Date` varchar(20) NOT NULL,
  UNIQUE KEY `No` (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=42 ;

--
-- Dumping data for table `med_reg`
--

INSERT INTO `med_reg` (`No`, `Medicine_Name`, `Medicine_Type`, `Quantity`, `Manufacture_Name`, `Manufacture_Date`, `Expiry_Date`) VALUES
(5, 'Levomilnacipran', 'Tablet', 70004, 'Boehringer Ingelheim', '2012-01-28', '2016-08-21'),
(8, 'Pioglitazone', 'Tablet', 565630, 'Phoneropica', '2007-10-23', '2015-08-05'),
(9, 'Chlorpropamide', 'Liquid', 0, 'Impax Laboratories, ', '2012-01-28', '2019-05-09'),
(10, 'Glyclopyramide', 'Capsules', 100000, 'Impoloda', '2014-04-16', '2017-09-16'),
(40, 'Tramadol', 'Tablet', 458, 'Impax_Labo', ' 13- Oct-2015', '2014-Dec-17');

-- --------------------------------------------------------

--
-- Table structure for table `med_request`
--

CREATE TABLE IF NOT EXISTS `med_request` (
  `No` int(4) NOT NULL AUTO_INCREMENT,
  `medname` varchar(100) NOT NULL,
  `qty` int(5) NOT NULL,
  `location` varchar(50) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `med_request`
--

INSERT INTO `med_request` (`No`, `medname`, `qty`, `location`) VALUES
(1, 'Glyclopyramide', 100, 'W001'),
(2, 'Chlorpropamide', 500, 'W005'),
(3, 'Pioglitazone', 45, 'W006'),
(4, 'Vilazodone', 100, 'W003');

-- --------------------------------------------------------

--
-- Table structure for table `odonor`
--

CREATE TABLE IF NOT EXISTS `odonor` (
  `bname` varchar(100) NOT NULL,
  `hospital` varchar(100) NOT NULL,
  `bloodtype` varchar(10) NOT NULL,
  `rhd` varchar(10) NOT NULL,
  `volume` int(10) NOT NULL,
  `cnumber` int(10) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`bname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `odonor`
--

INSERT INTO `odonor` (`bname`, `hospital`, `bloodtype`, `rhd`, `volume`, `cnumber`, `date`) VALUES
('aaa', 'aaaa', 'A', 'Positive', 123, 123, '2015-08-11'),
('ryryh', 'ruyyru', 'A', 'Positive', 12, 123456789, '2015-08-10'),
('vvvv', 'vvv', 'A', 'Positive', 123, 1111111111, '2015-08-11'),
('we', 'we', 'A', 'Positive', 12, 1234567891, '2015-08-17'),
('wet', 'tre', 'A', 'Positive', 12, 1234567892, '2015-08-04'),
('wewe', 'wew', 'B', 'Negative', 123, 12, '2015-08-18');

-- --------------------------------------------------------

--
-- Table structure for table `p1`
--

CREATE TABLE IF NOT EXISTS `p1` (
  `pid` int(100) NOT NULL AUTO_INCREMENT,
  `rdate` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `age` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `blood` varchar(100) NOT NULL,
  `nic` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `guard` varchar(100) NOT NULL,
  `dept` varchar(100) NOT NULL,
  `consult` varchar(100) NOT NULL,
  `pres` varchar(100) NOT NULL,
  `image` varchar(1000) NOT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `nic` (`nic`),
  UNIQUE KEY `nic_2` (`nic`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `p1`
--

INSERT INTO `p1` (`pid`, `rdate`, `name`, `dob`, `age`, `gender`, `blood`, `nic`, `address`, `contact`, `guard`, `dept`, `consult`, `pres`, `image`) VALUES
(17, '2015-08-02', 'A.P.Karunarathna', '1970-08-02', '45', 'Male', 'A+', '702356044V', 'kotte', '0785469508', 'K.Shiranthi', 'Dental', 'M.Konara', 'mouthwash', 'C:/Users/X55OL/Desktop/pi/kulla.jpg'),
(18, '2015-08-10', 'K.Gayan', '1988-04-08', '26', 'Male', 'O', '883505678V', 'Kandy', '0768905425', 'D.Wasudewa', 'General', 'P.K.Amarasiri', 'Panadol', 'C:/Users/X55OL/Desktop/pi/ruwaa.jpg'),
(19, '2015-08-10', 'S.P.Nishadhi', '1996-08-02', '19', 'Male', 'AB+', '968667854V', 'Malabe', '0725505678', 'L.U.Manike', 'Dental', 'H.Danapala', 'Piriton', 'C:/Users/X55OL/Desktop/pi/jaaa.jpg'),
(22, '2015-08-02', 'V.P.Karunarathna', '1990-08-02', '45', 'Female', 'A-', '902356044V', 'colombo', '0785469508', 'K.Shiranthi', 'Dental', 'M.Konara', 'mouthwash', 'C:/Users/X55OL/Desktop/pi/w/era.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `p2`
--

CREATE TABLE IF NOT EXISTS `p2` (
  `pid` int(100) NOT NULL AUTO_INCREMENT,
  `rdate` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `age` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `blood` varchar(100) NOT NULL,
  `nic` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `guard` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dept` varchar(100) NOT NULL,
  `wardno` varchar(100) NOT NULL,
  `wardname` varchar(100) NOT NULL,
  `cons` varchar(100) NOT NULL,
  `status` varchar(20) DEFAULT 'NULL',
  PRIMARY KEY (`pid`),
  UNIQUE KEY `nic` (`nic`),
  UNIQUE KEY `nic_2` (`nic`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=78 ;

--
-- Dumping data for table `p2`
--

INSERT INTO `p2` (`pid`, `rdate`, `name`, `dob`, `age`, `gender`, `blood`, `nic`, `address`, `contact`, `guard`, `email`, `dept`, `wardno`, `wardname`, `cons`, `status`) VALUES
(32, '2015-08-23', 'K.S.Perera', '1995-08-20', '20', 'Male', 'A+', '9520020233V', 'colombo', '0112550550', 'A.Perera', 'ks@gmail.com', 'Heart', '05', 'Heart', 'P.D.Silva', NULL),
(33, '2015-08-20', 'A.K.Bandara', '1980-05-05', '35', 'Female', 'O', '801245054V', 'Galle', '0725841123', 'B.M.Bandara', 'as@gmail.com', 'Dental', '02', 'DMU', 'H.G.Silva', NULL),
(34, '2015-08-20', 'A.K.Kumari', '1960-08-07', '55', 'Female', 'AB+', '605008023V', 'Kottwa', '0112562252', 'C.Wijepala', 'kum@gmail.com', 'General', '01', 'General', 'H.G.Kodikara', NULL),
(35, '2015-08-23', 'A.B.Ahungalla', '1993-10-25', '21', 'Male', 'B +', '935002066V', 'colombo', '0112550550', 'A.Perera', 'abah@gmail.com', 'General', '01', 'General', 'B.M.Ahungalla', NULL),
(36, '2015-7-29', 'O.P.Kumara', '1988-07-20', '26', 'Male', 'AB-', '885656044V', 'Horana', '0724567896', 'G.K.Alwis', 'opk@yahoo.com', 'Theraphy', '04', 'Theraphy', 'A.K.Kithsri', NULL),
(62, '2015-08-23', 'C.P.Perera', '1998-08-20', '17', 'Male', 'B +', '982002033V', 'colombo', '0112550550', 'A.Perera', 'ks@gmail.com', 'Heart', '05', 'Heart', 'P.D.Silva', 'discharged'),
(64, '2015-08-20', 'C.C.Bandara', '1988-05-05', '26', 'Female', 'B +', '881245054V', 'Galle', '0725841123', 'B.M.Bandara', 'cc@gmail.com', 'Dental', '02', 'DMU', 'H.G.Silva', 'added'),
(66, '2015-08-20', 'G.G.Amali', '1980-08-07', '35', 'Female', 'A-', '805008023V', 'Malabe', '0112562252', 'K.Wijesiri', 'amaa@gmail.com', 'General', '01', 'General', 'H.G.Kodikara', 'added'),
(67, '2015-08-23', 'A.Kamal', '1988-08-20', '27', 'Male', 'AB+', '882002033V', 'Kandy', '0812550550', 'H.Perera', 'ksaa@gmail.com', 'Heart', '05', 'Heart', 'P.D.Silva', 'added'),
(68, '2015-08-20', 'K.Rasika', '1998-05-05', '16', 'Female', 'A+', '981245054V', 'Borella', '0785841123', 'A.P.Silva', 'ssa@gmail.com', 'Dental', '02', 'DMU', 'H.G.Silva', 'added'),
(69, '2015-08-23', 'K.G.Sampath', '1973-10-25', '41', 'Male', 'AB-', '737400206V', 'Kotuwa', '0774561236', 'O.P.Silva', 'asas@gmail.com', 'General', '01', 'General', 'B.M.Ahungalla', 'NULL'),
(70, '2015-08-20', 'A.Y.T.Nimal', '1990-08-07', '25', 'Male', 'B +', '905008023V', 'Dompe', '0714816643', 'A.Saman', 'kumatt@gmail.com', 'General', '01', 'General', 'H.G.Kodikara', 'added'),
(71, '2015-08-20', 'S.Jayan', '1970-08-07', '55', 'Male', 'O', '705008023V', 'Poree', '0711065435', 'E.Abepala', 'jayaa@gmail.com', 'General', '01', 'General', 'H.G.Kodikara', 'added'),
(72, '2015-08-23', 'W.K.Silva', '1990-08-20', '25', 'Male', 'O', '908802033V', 'colombo', '0724925543', 'A.Perera', 'wws@gmail.com', 'Heart', '05', 'Heart', 'P.D.Silva', 'added'),
(73, '2015-08-20', 'G.C.Janakii', '1978-05-05', '36', 'Female', 'AB+', '781255054V', 'Matara', '0725841177', 'U.C.Janakii', 'cc@gmail.com', 'Dental', '02', 'DMU', 'H.G.Silva', 'added'),
(74, '2015-08-20', 'A.Naamalii', '1984-08-07', '30', 'Female', 'B-', '847708023V', 'Malabe', '0715846112', 'K.Wijesiri', 'naaamaa@gmail.com', 'General', '01', 'General', 'H.G.Kodikara', 'added'),
(75, '2015-08-23', 'Y.Somapala', '1953-10-25', '61', 'Male', 'B +', '537400206V', 'Meergama', '0774561799', 'B.Gunawathii', '77aa@gmail.com', 'General', '01', 'General', 'B.M.Ahungalla', 'added'),
(76, '2015-08-20', 'S.Damayanthii', '1978-05-05', '36', 'Female', 'A+', '781245054V', 'Borella', '0785841123', 'E.P.Silva', 'daaa@gmail.com', 'Dental', '02', 'DMU', 'H.G.Silva', 'added'),
(77, '2015-08-23', 'C.Shamini', '1993-10-25', '21', 'Female', 'AB+', '935882066V', 'Colombo', '0714856642', 'A.Perera', 'cccc@gmail.com', 'General', '01', 'General', 'B.M.Ahungalla', 'added');

-- --------------------------------------------------------

--
-- Table structure for table `paclinic3`
--

CREATE TABLE IF NOT EXISTS `paclinic3` (
  `id` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `clno` varchar(200) NOT NULL,
  `clname` varchar(200) NOT NULL,
  `cltype` varchar(200) NOT NULL,
  `cldate` varchar(200) NOT NULL,
  `cltime` varchar(200) NOT NULL,
  `ward` varchar(200) NOT NULL,
  `consult` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paclinic3`
--

INSERT INTO `paclinic3` (`id`, `name`, `clno`, `clname`, `cltype`, `cldate`, `cltime`, `ward`, `consult`) VALUES
('17', 'A.P.Karunarathna', '5', 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
('32', 'K.S.Perera', '4', 'Heart', 'Weeekly', 'Monday', '08.30', '5', 'A.B.Kulathunga'),
('34', 'A.K.Kumari', '5', 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
('62', 'C.P.Perera', '4', 'Heart', 'Weeekly', 'Monday', '08.30', '5', 'A.B.Kulathunga'),
('33', 'A.K.Bandara', '6', 'Dental', 'Monthly', 'Friday', '10.30', '8', 'A.B.Perera'),
('35', 'A.B.Ahungalla', '5', 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
('35', 'A.B.Ahungalla', '6', 'Dental', 'Monthly', 'Friday', '10.30', '8', 'A.B.Perera'),
('36', 'O.P.Kumara', '6', 'Dental', 'Monthly', 'Friday', '10.30', '8', 'A.B.Perera'),
('62', 'C.P.Perera', '5', 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
('18', 'K.Gayan', '5', 'Theraphy', 'Weeekly', 'Wednesday', '08.30', '4', 'C.Priyangi'),
('17', 'A.P.Karunarathna', 'clinicno', 'clinicname', 'clinictype', 'clinicdate', 'clinictime', 'clinicwardno', 'consulta'),
('17', 'A.P.Karunarathna', 'clinicno', 'clinicname', 'clinictype', 'clinicdate', 'clinictime', 'clinicwardno', 'consulta');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `patientID` varchar(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientID`, `name`, `age`) VALUES
('I0001', 'Amila', 22),
('I002', 'Isurunath', 20),
('I0002', 'Isurunath', 20),
('I0003', 'Samith', 24);

-- --------------------------------------------------------

--
-- Table structure for table `pres`
--

CREATE TABLE IF NOT EXISTS `pres` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `mor` varchar(100) NOT NULL,
  `eve` varchar(100) NOT NULL,
  `ngt` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pres`
--

INSERT INTO `pres` (`id`, `name`, `mor`, `eve`, `ngt`) VALUES
('4', 'samitha', 'aaa', 'aaa', 'aaa'),
('', 'jLabel2', 'Panadol', 'Panadol', 'Panadol'),
('19', 'K.S.C.Perera', 'Piriton', 'Piriton', 'Piriton'),
('18', 'A.P.Pieris', 'Amoxlin', 'Amoxlin', 'Amoxlin'),
('34', 'A.K.Kumari', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `qntity`
--

CREATE TABLE IF NOT EXISTS `qntity` (
  `qnt_medreg` int(10) NOT NULL,
  `qnt_medrq` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `report_details`
--

CREATE TABLE IF NOT EXISTS `report_details` (
  `Patient_ID` varchar(6) DEFAULT NULL,
  `Patient_Name` varchar(200) DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `Patient_Age` varchar(10) DEFAULT NULL,
  `Test_Date` date DEFAULT NULL,
  `Test_Type` varchar(50) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Test_details` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report_details`
--

INSERT INTO `report_details` (`Patient_ID`, `Patient_Name`, `sex`, `Patient_Age`, `Test_Date`, `Test_Type`, `Status`, `Test_details`) VALUES
('17', 'A.P.Karunarathna', 'Male', '23', '2015-09-16', 'Blood', 'Succesfull', 'Want to get Emergency'),
('33', 'A.K.Bandara', 'Male', '65', '2015-11-17', 'Scan', 'Succesfull', 'uuuuu'),
('32', 'K.S.Perera', 'Male', '43', '2015-10-24', 'X-Ray', 'Pending', 'Have some problem');

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE IF NOT EXISTS `request` (
  `RequestId` int(10) NOT NULL AUTO_INCREMENT,
  `Property_Name` varchar(100) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Quantity` int(100) NOT NULL,
  `Location` varchar(100) NOT NULL,
  PRIMARY KEY (`RequestId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`RequestId`, `Property_Name`, `Type`, `Quantity`, `Location`) VALUES
(18, 'bed', 'other', 1, 'lab1'),
(19, 'fan', 'electrical', 1, 'w007');

-- --------------------------------------------------------

--
-- Table structure for table `shedule`
--

CREATE TABLE IF NOT EXISTS `shedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_Id` varchar(10) NOT NULL,
  `Start_Date` varchar(10) NOT NULL,
  `Start_Time` varchar(10) NOT NULL,
  `End_Date` varchar(10) NOT NULL,
  `End_Time` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=37 ;

--
-- Dumping data for table `shedule`
--

INSERT INTO `shedule` (`id`, `Employee_Id`, `Start_Date`, `Start_Time`, `End_Date`, `End_Time`) VALUES
(5, 'amila', 'x', 'x', 'x', 'x'),
(6, 'amila', 'xx', 'x', 'x', 'x'),
(7, 'amila', 'xx', 'x', 'x', 'xb'),
(24, 'S0005', '2015-08-10', '12 ', '2015-08-18', '3'),
(25, '1006', '2015-08-04', '23', '2015-08-25', '34'),
(26, '10', '2015-08-30', '8.00AM', '2015-08-30', '5.00PM'),
(27, '20', '2015-08-30', '8.00AM', '2015-08-30', '5.00PM'),
(28, '1000', '2015-08-30', '8.00AM', '2015-08-30', '5.00PM'),
(29, '10', '2015-08-31', '8.00AM', '2015-08-31', '5.00PM'),
(30, '10', '2015-09-01', '8.00AM', '2015-09-01', '5.00PM'),
(31, '1007', '2015-08-31', '8.00AM', '2015-08-31', '5.00PM'),
(32, '1000', '2015-08-18', '8.00AM', '2015-08-18', '8.00PM'),
(33, '1028', '2015/1/1', '8.00AM', '2015/1/1', '5.00PM'),
(34, '1029', '2015/1/1', '8.00AM', '2015/1/1', '5.00PM'),
(35, '1031', '2015/1/1', '8.00AM', '2015/1/1', '5.00PM'),
(36, '1031', '2015/1/2', '8.00AM', '2015/1/3', '5.00PM');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `staffID` varchar(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `accounttype` varchar(10) NOT NULL,
  `ward` varchar(5) NOT NULL,
  `special` varchar(50) NOT NULL,
  PRIMARY KEY (`staffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffID`, `username`, `password`, `accounttype`, `ward`, `special`) VALUES
('S0001', 'amila', 'abc', 'Doctor', 'W001', 'sergent'),
('S0002', 'isurunath ', 'abc', 'Doctor', 'W001', 'Senior Head Officer');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE IF NOT EXISTS `stock` (
  `bloodtype` varchar(45) DEFAULT NULL,
  `rhd` varchar(45) DEFAULT NULL,
  `volume` varchar(45) DEFAULT NULL,
  `minvolume` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`bloodtype`, `rhd`, `volume`, `minvolume`) VALUES
('A', 'Positive', '227.0', '0'),
('AB', 'Positive', '33.0', '0'),
('B', 'Positive', '0', '0'),
('B', 'Negative', '0', '0'),
('A', 'Negative', '0', '6'),
('AB', 'Negative', '0', '0'),
('A', 'Positive', '227.0', '0'),
('AB', 'Positive', '33.0', '0'),
('B', 'Positive', '0', '0'),
('B', 'Negative', '0', '0'),
('A', 'Negative', '0', '6'),
('AB', 'Negative', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE IF NOT EXISTS `supplier` (
  `SupplierId` int(10) NOT NULL AUTO_INCREMENT,
  `SupplierName` varchar(100) NOT NULL,
  `Company` varchar(100) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact` varchar(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  PRIMARY KEY (`SupplierId`),
  UNIQUE KEY `Contact` (`Contact`,`Email`),
  UNIQUE KEY `Contact_2` (`Contact`,`Email`),
  UNIQUE KEY `Email` (`Email`),
  UNIQUE KEY `Contact_3` (`Contact`,`Email`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=50 ;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`SupplierId`, `SupplierName`, `Company`, `Type`, `Address`, `Contact`, `Email`) VALUES
(37, 'anu', 'kent', 'electrical', 'nugegoda', '0715541176', 'suranu27@gmail.com'),
(38, 'isuru', 'olympia', 'other', 'colombo', '0712340391', 'isu12@gmail.lk'),
(39, 'samitha', 'sympic', 'labotary', 'athurugiriya', '0712345093', 'sam@s.lk'),
(40, 'ransi', 'dolosmahe', 'machine', 'kalalgoda', '0752998547', 'ransi@sliit.lk'),
(44, 'ishara', 'ninras', 'electrical', 'nawala', '0781287504', 'ishara@sliit.lk');

-- --------------------------------------------------------

--
-- Table structure for table `systemlogin`
--

CREATE TABLE IF NOT EXISTS `systemlogin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `account` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `systemlogin`
--

INSERT INTO `systemlogin` (`username`, `password`, `account`) VALUES
('S0001', 'abc', 'Laboratory'),
('S0002', 'abc', 'Reception'),
('S0003', 'abc', 'Inventory'),
('S0004', 'abc', 'Pharmacy'),
('S0005', 'abc', 'Ambulance');

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE IF NOT EXISTS `transfer` (
  `Vehicle_ID` int(11) NOT NULL,
  `Driver_ID` int(11) DEFAULT NULL,
  `Patient_ID` int(11) DEFAULT NULL,
  `Nurse_ID` int(11) DEFAULT NULL,
  `Destination` varchar(1000) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `hours` int(11) DEFAULT NULL,
  PRIMARY KEY (`Vehicle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`Vehicle_ID`, `Driver_ID`, `Patient_ID`, `Nurse_ID`, `Destination`, `Date`, `hours`) VALUES
(1, 2, 1, 2, 'Angoda', '2015-08-10', 6),
(2, 123, 132131, 2131321, 'Dabhana', '2015-08-23', 213),
(21321, 1211, 121, 121, 'Angoda', '2015-08-17', 121);

-- --------------------------------------------------------

--
-- Table structure for table `vehi`
--

CREATE TABLE IF NOT EXISTS `vehi` (
  `Vehicle_ID` int(10) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Insurance_Number` int(10) NOT NULL,
  `Fuel_Type` varchar(100) NOT NULL,
  `Chassis_Number` int(10) NOT NULL,
  `Gear` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`Vehicle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehi`
--

INSERT INTO `vehi` (`Vehicle_ID`, `Type`, `Insurance_Number`, `Fuel_Type`, `Chassis_Number`, `Gear`, `Date`) VALUES
(1, 'A/C', 12345, 'petrol', 1234567, 'Auto ', '2015-08-05'),
(2, 'A/C', 12314, 'petrol', 12414255, 'Manual', '2015-08-05'),
(3, 'Non A/C', 12314, 'dieasel', 12414255, 'Auto ', '2015-09-16');

-- --------------------------------------------------------

--
-- Table structure for table `ward`
--

CREATE TABLE IF NOT EXISTS `ward` (
  `wardNO` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `location` varchar(20) NOT NULL,
  `no_beds` int(11) NOT NULL,
  PRIMARY KEY (`wardNO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ward`
--

INSERT INTO `ward` (`wardNO`, `name`, `location`, `no_beds`) VALUES
('W001', 'cardiology', 'West Wing', 40),
('W002', 'orthopitic', 'east wing', 24),
('W003', 'neurology', 'east wing', 20),
('W004', 'accident', 'east wing', 33),
('W006', 'cardiology', 'North wing', 40);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
