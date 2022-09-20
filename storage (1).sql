-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 18, 2022 at 06:14 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `storage`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_account`
--

CREATE TABLE `tbl_account` (
  `kodeakun` int(10) NOT NULL,
  `kelompok_akun` int(10) NOT NULL,
  `nama_akun` varchar(50) NOT NULL,
  `tipe_akun` enum('Header','Detail') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_account`
--

INSERT INTO `tbl_account` (`kodeakun`, `kelompok_akun`, `nama_akun`, `tipe_akun`) VALUES
(100009, 3, 'yanto', 'Header'),
(100010, 1, 'dimas', 'Detail'),
(100011, 1, 'BenzTech', 'Header'),
(100013, 2, 'Johan', 'Header'),
(100014, 1, 'Anak kecil', 'Header'),
(100078, 2, 'Bocah', 'Header');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_barang`
--

CREATE TABLE `tbl_barang` (
  `id_barang` int(10) NOT NULL,
  `harga_beli` varchar(20) NOT NULL,
  `kategori_barang` varchar(50) NOT NULL,
  `kode_barcode` varchar(20) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_barang`
--

INSERT INTO `tbl_barang` (`id_barang`, `harga_beli`, `kategori_barang`, `kode_barcode`, `nama_barang`, `satuan`) VALUES
(53, '20000', 'Bangunan', '9090122', 'Batu Bata', 'buah'),
(54, '10000', 'Pemain', '12131231', 'Celana kain', 'meter');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_databarangkeluar`
--

CREATE TABLE `tbl_databarangkeluar` (
  `noTransaksi` varchar(50) NOT NULL,
  `idSupplier` varchar(50) NOT NULL,
  `namaSupplier` varchar(50) NOT NULL,
  `tglTransaksi` varchar(50) NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `id_barang` int(10) NOT NULL,
  `kode_barcode` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_masuk` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `harga_satuan` varchar(50) NOT NULL,
  `sub_total` varchar(50) NOT NULL,
  `pajak` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_databarangmasuk`
--

CREATE TABLE `tbl_databarangmasuk` (
  `noTransaksi` varchar(50) NOT NULL,
  `idSupplier` varchar(50) NOT NULL,
  `namaSupplier` varchar(50) NOT NULL,
  `tglTransaksi` varchar(50) NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `id_barang` int(10) NOT NULL,
  `kode_barcode` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_masuk` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `harga_satuan` varchar(50) NOT NULL,
  `sub_total` varchar(50) NOT NULL,
  `pajak` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_databarangmasuk`
--

INSERT INTO `tbl_databarangmasuk` (`noTransaksi`, `idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, `id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`, `sub_total`, `pajak`) VALUES
('1203191026', '110191024', 'Ariyanto', 'Fri Sep 16 00:00:00 ICT 2022', 'Data Masuk', 53, '9090122', 'Batu Bata', '5', 'buah', '20000', '100000', '3000'),
('1203191027', '110191024', 'Ariyanto', 'Fri Sep 16 00:00:00 ICT 2022', 'Data Masuk', 54, '12131231', 'Celana kain', '4', 'meter', '10000', '40000', '1200'),
('1203191028', '110191024', 'Ariyanto', 'Fri Sep 16 00:00:00 ICT 2022', 'Data Masuk', 54, '12131231', 'Celana kain', '5', 'meter', '10000', '50000', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_jurnalpembeliaandetail`
--

CREATE TABLE `tbl_jurnalpembeliaandetail` (
  `id_jurnalDetail` int(10) NOT NULL,
  `debet` int(20) NOT NULL,
  `kredit` int(20) NOT NULL,
  `kodeakun` int(10) NOT NULL,
  `id_jurnal` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_jurnalpembeliaanheader`
--

CREATE TABLE `tbl_jurnalpembeliaanheader` (
  `id_jurnal` int(10) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `no_faktur` int(10) NOT NULL,
  `tanggal` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kategori`
--

CREATE TABLE `tbl_kategori` (
  `idKategori` varchar(50) NOT NULL,
  `KategoriBarang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_kategori`
--

INSERT INTO `tbl_kategori` (`idKategori`, `KategoriBarang`) VALUES
('1203191001', 'Sepatu'),
('1203191016', 'Pajak'),
('1203191017', 'Kaos'),
('1203191018', 'Pemain'),
('1203191023', 'Bangunan'),
('1203191025', 'Makanan'),
('1203191027', 'Lapangan'),
('1203191028', 'Minuman');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pembeliandetail`
--

CREATE TABLE `tbl_pembeliandetail` (
  `id_PembelianDetail` int(10) NOT NULL,
  `harga_Satuan` int(10) NOT NULL,
  `jumlah` int(8) NOT NULL,
  `ppn` int(8) NOT NULL,
  `satuan` varchar(8) NOT NULL,
  `tanggal kadaluarsa` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `id_barang` int(10) NOT NULL,
  `no_faktur` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pembelianfix`
--

CREATE TABLE `tbl_pembelianfix` (
  `noTransaksi` varchar(50) NOT NULL,
  `idSupplier` varchar(50) NOT NULL,
  `namaSupplier` varchar(50) NOT NULL,
  `tglTransaksi` varchar(50) NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `Metode` enum('tunai','kredit') NOT NULL,
  `id_barang` int(10) NOT NULL,
  `kode_barcode` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_masuk` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `harga_satuan` varchar(50) NOT NULL,
  `sub_total` varchar(50) NOT NULL,
  `pajak` varchar(50) NOT NULL,
  `kadaluwarsa` varchar(50) NOT NULL,
  `noNota` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pembelianheader`
--

CREATE TABLE `tbl_pembelianheader` (
  `no_Faktur` int(8) NOT NULL,
  `keterangan` int(11) NOT NULL,
  `metode` int(11) NOT NULL,
  `status` enum('kredit','debit') NOT NULL,
  `tanggalPembelian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `kode_Supplier` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pengguna`
--

CREATE TABLE `tbl_pengguna` (
  `id_pengguna` int(10) NOT NULL,
  `hak_akses` varchar(50) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `status` enum('Aktif','Tidak Aktif') NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_pengguna`
--

INSERT INTO `tbl_pengguna` (`id_pengguna`, `hak_akses`, `nama_lengkap`, `password`, `status`, `username`) VALUES
(10003, 'superadmin', 'maguire ', 'maguire', 'Aktif', 'maguire'),
(10005, 'admin', 'frediansyah', 'adminadmin', 'Aktif', 'fred');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_persediaan`
--

CREATE TABLE `tbl_persediaan` (
  `nama_barang` varchar(50) NOT NULL,
  `kode_barang` int(8) NOT NULL,
  `harga_barang` int(10) NOT NULL,
  `stok_barang` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_persediaanfix`
--

CREATE TABLE `tbl_persediaanfix` (
  `noTransaksi` varchar(50) NOT NULL,
  `idSupplier` varchar(50) NOT NULL,
  `namaSupplier` varchar(50) NOT NULL,
  `tglTransaksi` varchar(50) NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `Metode` enum('tunai','kredit') NOT NULL,
  `id_barang` int(10) NOT NULL,
  `kode_barcode` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_masuk` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `harga_satuan` varchar(50) NOT NULL,
  `sub_total` varchar(50) NOT NULL,
  `pajak` varchar(50) NOT NULL,
  `kadaluwarsa` varchar(50) NOT NULL,
  `noNota` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_persediaanfix`
--

INSERT INTO `tbl_persediaanfix` (`noTransaksi`, `idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, `Metode`, `id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`, `sub_total`, `pajak`, `kadaluwarsa`, `noNota`, `Status`) VALUES
('314', '121212', 'Andi', 'Thu Aug 04 00:00:00 ICT 2022', 'persediaan satu', 'tunai', 25, '75745', 'okeewew', '32', 'keke', '2344', '75008', '6750', 'Thu Sep 22 00:00:00 ICT 2022', '234', 'Belum Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_returfix`
--

CREATE TABLE `tbl_returfix` (
  `noTransaksi` varchar(50) NOT NULL,
  `idSupplier` varchar(50) NOT NULL,
  `namaSupplier` varchar(50) NOT NULL,
  `tglTransaksi` varchar(50) NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `Metode` enum('tunai','kredit') NOT NULL,
  `id_barang` int(10) NOT NULL,
  `kode_barcode` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_masuk` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `harga_satuan` varchar(50) NOT NULL,
  `sub_total` varchar(50) NOT NULL,
  `pajak` varchar(50) NOT NULL,
  `kadaluwarsa` varchar(50) NOT NULL,
  `noNota` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_returfix`
--

INSERT INTO `tbl_returfix` (`noTransaksi`, `idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, `Metode`, `id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`, `sub_total`, `pajak`, `kadaluwarsa`, `noNota`, `Status`) VALUES
('879', '98789', 'emyu', 'Wed Aug 17 00:00:00 ICT 2022', 'dari retur', 'kredit', 15, '674749', 'maguire', '2', 'pemain', '8500000', '17000000', '2550000', 'Thu Oct 20 00:00:00 ICT 2022', '876', 'Belum Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_returpersediaandetail`
--

CREATE TABLE `tbl_returpersediaandetail` (
  `id_ReturPersediaanDetail` int(10) NOT NULL,
  `harag_satuan` int(20) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `ppn` int(20) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `id_barang` int(10) NOT NULL,
  `id_retur` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_returpersediaanheader`
--

CREATE TABLE `tbl_returpersediaanheader` (
  `id_ReturPersediaan` int(10) NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `no_Faktur` int(10) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `kodeSupplier` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_supplier`
--

CREATE TABLE `tbl_supplier` (
  `KodeSupplier` int(10) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `jenis_usaha` varchar(50) NOT NULL,
  `npwp` varchar(30) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telepon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_supplier`
--

INSERT INTO `tbl_supplier` (`KodeSupplier`, `nama_supplier`, `jenis_usaha`, `npwp`, `alamat`, `telepon`) VALUES
(110191023, 'Dimas', 'Perusahaan', '250.80.909.087.908', 'Jl. Semarang, No.67, Yogyakarta', '089765456789'),
(110191024, 'Ariyanto', 'Dagang', '209.907.231.23.009.1', 'Jl. Margo Utomo, No.1, Yogyakarta', '089765456234');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id_user` int(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id_user`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_account`
--
ALTER TABLE `tbl_account`
  ADD PRIMARY KEY (`kodeakun`);

--
-- Indexes for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `kategori_barang` (`kategori_barang`) USING BTREE;

--
-- Indexes for table `tbl_databarangkeluar`
--
ALTER TABLE `tbl_databarangkeluar`
  ADD PRIMARY KEY (`noTransaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tbl_databarangmasuk`
--
ALTER TABLE `tbl_databarangmasuk`
  ADD PRIMARY KEY (`noTransaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tbl_jurnalpembeliaandetail`
--
ALTER TABLE `tbl_jurnalpembeliaandetail`
  ADD PRIMARY KEY (`id_jurnalDetail`),
  ADD UNIQUE KEY `kodeakun` (`kodeakun`),
  ADD UNIQUE KEY `id_jurnal` (`id_jurnal`);

--
-- Indexes for table `tbl_jurnalpembeliaanheader`
--
ALTER TABLE `tbl_jurnalpembeliaanheader`
  ADD PRIMARY KEY (`id_jurnal`),
  ADD UNIQUE KEY `no_faktur` (`no_faktur`);

--
-- Indexes for table `tbl_kategori`
--
ALTER TABLE `tbl_kategori`
  ADD PRIMARY KEY (`KategoriBarang`),
  ADD UNIQUE KEY `idKategori` (`idKategori`) USING BTREE;

--
-- Indexes for table `tbl_pembeliandetail`
--
ALTER TABLE `tbl_pembeliandetail`
  ADD UNIQUE KEY `id_barang` (`id_barang`),
  ADD UNIQUE KEY `no_faktur` (`no_faktur`);

--
-- Indexes for table `tbl_pembelianfix`
--
ALTER TABLE `tbl_pembelianfix`
  ADD PRIMARY KEY (`noTransaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tbl_pembelianheader`
--
ALTER TABLE `tbl_pembelianheader`
  ADD PRIMARY KEY (`no_Faktur`);

--
-- Indexes for table `tbl_pengguna`
--
ALTER TABLE `tbl_pengguna`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indexes for table `tbl_persediaanfix`
--
ALTER TABLE `tbl_persediaanfix`
  ADD PRIMARY KEY (`noTransaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tbl_returfix`
--
ALTER TABLE `tbl_returfix`
  ADD PRIMARY KEY (`noTransaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tbl_returpersediaandetail`
--
ALTER TABLE `tbl_returpersediaandetail`
  ADD PRIMARY KEY (`id_ReturPersediaanDetail`),
  ADD UNIQUE KEY `id_barang` (`id_barang`),
  ADD UNIQUE KEY `id_retur` (`id_retur`);

--
-- Indexes for table `tbl_returpersediaanheader`
--
ALTER TABLE `tbl_returpersediaanheader`
  ADD PRIMARY KEY (`id_ReturPersediaan`),
  ADD UNIQUE KEY `kodeSupplier` (`kodeSupplier`);

--
-- Indexes for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  ADD PRIMARY KEY (`KodeSupplier`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  MODIFY `id_barang` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT for table `tbl_jurnalpembeliaandetail`
--
ALTER TABLE `tbl_jurnalpembeliaandetail`
  MODIFY `id_jurnalDetail` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_jurnalpembeliaanheader`
--
ALTER TABLE `tbl_jurnalpembeliaanheader`
  MODIFY `id_jurnal` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_pengguna`
--
ALTER TABLE `tbl_pengguna`
  MODIFY `id_pengguna` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21122;

--
-- AUTO_INCREMENT for table `tbl_returpersediaandetail`
--
ALTER TABLE `tbl_returpersediaandetail`
  MODIFY `id_ReturPersediaanDetail` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_returpersediaanheader`
--
ALTER TABLE `tbl_returpersediaanheader`
  MODIFY `id_ReturPersediaan` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id_user` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  ADD CONSTRAINT `tbl_barang_ibfk_1` FOREIGN KEY (`kategori_barang`) REFERENCES `tbl_kategori` (`KategoriBarang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_databarangkeluar`
--
ALTER TABLE `tbl_databarangkeluar`
  ADD CONSTRAINT `tbl_databarangkeluar_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tbl_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_databarangmasuk`
--
ALTER TABLE `tbl_databarangmasuk`
  ADD CONSTRAINT `tbl_databarangmasuk_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tbl_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_jurnalpembeliaandetail`
--
ALTER TABLE `tbl_jurnalpembeliaandetail`
  ADD CONSTRAINT `tbl_jurnalpembeliaandetail_ibfk_1` FOREIGN KEY (`kodeakun`) REFERENCES `tbl_account` (`kodeakun`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_jurnalpembeliaandetail_ibfk_2` FOREIGN KEY (`id_jurnal`) REFERENCES `tbl_jurnalpembeliaanheader` (`id_jurnal`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_jurnalpembeliaanheader`
--
ALTER TABLE `tbl_jurnalpembeliaanheader`
  ADD CONSTRAINT `tbl_jurnalpembeliaanheader_ibfk_1` FOREIGN KEY (`no_faktur`) REFERENCES `tbl_pembelianheader` (`no_Faktur`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_pembeliandetail`
--
ALTER TABLE `tbl_pembeliandetail`
  ADD CONSTRAINT `tbl_pembeliandetail_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tbl_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_pembeliandetail_ibfk_2` FOREIGN KEY (`no_faktur`) REFERENCES `tbl_pembelianheader` (`no_Faktur`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_returpersediaandetail`
--
ALTER TABLE `tbl_returpersediaandetail`
  ADD CONSTRAINT `tbl_returpersediaandetail_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tbl_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_returpersediaandetail_ibfk_2` FOREIGN KEY (`id_retur`) REFERENCES `tbl_returpersediaanheader` (`id_ReturPersediaan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_returpersediaanheader`
--
ALTER TABLE `tbl_returpersediaanheader`
  ADD CONSTRAINT `tbl_returpersediaanheader_ibfk_1` FOREIGN KEY (`kodeSupplier`) REFERENCES `tbl_supplier` (`KodeSupplier`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
