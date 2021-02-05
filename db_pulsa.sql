-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 05, 2021 at 02:28 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pulsa`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_pulsatelkomdata`
--

CREATE TABLE `tb_pulsatelkomdata` (
  `id` int(11) NOT NULL,
  `idpulsa` varchar(100) NOT NULL,
  `idoperator` varchar(100) NOT NULL,
  `namaoperator` varchar(100) NOT NULL,
  `namakartu` varchar(100) NOT NULL,
  `beli` int(100) NOT NULL,
  `jual` int(100) NOT NULL,
  `stock` int(100) NOT NULL,
  `jenispulsa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pulsatelkomdata`
--

INSERT INTO `tb_pulsatelkomdata` (`id`, `idpulsa`, `idoperator`, `namaoperator`, `namakartu`, `beli`, `jual`, `stock`, `jenispulsa`) VALUES
(1, 'DT001', 'TLKM01', 'TELKOMSEL', 'SIMPATI', 10000, 15000, 10, 'Data'),
(2, 'DT002', 'TLKM02', 'TELKOMSEL', 'SIMPATI', 20000, 25000, 20, 'Data'),
(3, 'DT003', 'TLKM03', 'TELKOMSEL', 'SIMPATI', 50000, 55000, 50, 'Data');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pulsatelkomreguler`
--

CREATE TABLE `tb_pulsatelkomreguler` (
  `id` int(11) NOT NULL,
  `idpulsa` varchar(100) NOT NULL,
  `idoperator` varchar(100) NOT NULL,
  `namaoperator` varchar(100) NOT NULL,
  `namakartu` varchar(100) NOT NULL,
  `beli` int(100) NOT NULL,
  `jual` int(100) NOT NULL,
  `stock` int(100) NOT NULL,
  `jenispulsa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pulsatelkomreguler`
--

INSERT INTO `tb_pulsatelkomreguler` (`id`, `idpulsa`, `idoperator`, `namaoperator`, `namakartu`, `beli`, `jual`, `stock`, `jenispulsa`) VALUES
(2, 'RG002', 'TLKM02', 'TELKOMSEL', 'SIMPATI', 10000, 12000, 10, 'Reguler'),
(3, 'RG003', 'TLKM03', 'TELKOMSEL', 'SIMPATI', 50000, 55000, 8, 'Reguler');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pulsatridata`
--

CREATE TABLE `tb_pulsatridata` (
  `id` int(11) NOT NULL,
  `idpulsa` varchar(100) NOT NULL,
  `idoperator` varchar(100) NOT NULL,
  `namaoperator` varchar(100) NOT NULL,
  `namakartu` varchar(100) NOT NULL,
  `beli` int(100) NOT NULL,
  `jual` int(100) NOT NULL,
  `stock` int(11) NOT NULL,
  `jenispulsa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pulsatridata`
--

INSERT INTO `tb_pulsatridata` (`id`, `idpulsa`, `idoperator`, `namaoperator`, `namakartu`, `beli`, `jual`, `stock`, `jenispulsa`) VALUES
(1, '12', 'asa', '1212', 'asda', 1111, 1, 1, 'Data');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pulsatrireguler`
--

CREATE TABLE `tb_pulsatrireguler` (
  `id` int(11) NOT NULL,
  `idpulsa` varchar(100) NOT NULL,
  `idoperator` varchar(100) NOT NULL,
  `namaoperator` varchar(100) NOT NULL,
  `namakartu` varchar(100) NOT NULL,
  `beli` int(100) NOT NULL,
  `jual` int(100) NOT NULL,
  `stock` int(11) NOT NULL,
  `jenispulsa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_riwayat`
--

CREATE TABLE `tb_riwayat` (
  `id` int(100) NOT NULL,
  `id_transaksi` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `hp` int(8) NOT NULL,
  `harga` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `kembali` int(10) NOT NULL,
  `namaoperator` varchar(100) NOT NULL,
  `namakartu` varchar(100) NOT NULL,
  `jenispulsa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_riwayat`
--

INSERT INTO `tb_riwayat` (`id`, `id_transaksi`, `tanggal`, `hp`, `harga`, `bayar`, `kembali`, `namaoperator`, `namakartu`, `jenispulsa`) VALUES
(10, 'as', '2021-02-04', 121212, 12000, 20000, 8000, 'TELKOMSEL', 'SIMPATI', 'Reguler'),
(11, 'TLKM01', '2021-02-04', 1234567, 12000, 20000, 8000, 'TELKOMSEL', 'SIMPATI', 'Reguler'),
(12, 'TLKM04', '2021-02-04', 1234567, 55000, 100000, 45000, 'TELKOMSEL', 'SIMPATI', 'Reguler');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(6) NOT NULL,
  `level` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id`, `nama`, `username`, `password`, `level`) VALUES
(2, 'Kalvin Ryan', 'kalvin', 'kalvin', 'user'),
(5, 'Admin', 'admin', 'admin', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_pulsatelkomdata`
--
ALTER TABLE `tb_pulsatelkomdata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_pulsatelkomreguler`
--
ALTER TABLE `tb_pulsatelkomreguler`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_pulsatridata`
--
ALTER TABLE `tb_pulsatridata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_pulsatrireguler`
--
ALTER TABLE `tb_pulsatrireguler`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_riwayat`
--
ALTER TABLE `tb_riwayat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_pulsatelkomdata`
--
ALTER TABLE `tb_pulsatelkomdata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_pulsatelkomreguler`
--
ALTER TABLE `tb_pulsatelkomreguler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_pulsatridata`
--
ALTER TABLE `tb_pulsatridata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_pulsatrireguler`
--
ALTER TABLE `tb_pulsatrireguler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_riwayat`
--
ALTER TABLE `tb_riwayat`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
