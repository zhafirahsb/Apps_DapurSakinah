-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Aug 02, 2019 at 11:43 PM
-- Server version: 10.2.25-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `u5836381_saki`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_hak_akses`
--

CREATE TABLE `tbl_hak_akses` (
  `id` int(11) NOT NULL,
  `id_user_level` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_hak_akses`
--

INSERT INTO `tbl_hak_akses` (`id`, `id_user_level`, `id_menu`) VALUES
(15, 1, 1),
(19, 1, 3),
(21, 2, 1),
(24, 1, 9),
(28, 2, 3),
(29, 2, 2),
(30, 1, 2),
(31, 1, 10);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_makanan`
--

CREATE TABLE `tbl_makanan` (
  `id` int(11) NOT NULL,
  `nama_makanan` varchar(255) NOT NULL,
  `gambar` varchar(255) NOT NULL,
  `bahan` text NOT NULL,
  `resep` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_makanan`
--

INSERT INTO `tbl_makanan` (`id`, `nama_makanan`, `gambar`, `bahan`, `resep`) VALUES
(11, 'Jamur crispy', 'resep1.jpg', 'Jamur\r\n5 sdm tepung maizena\r\n3,5 sdm terigu\r\n1 sdm tepung tapioka(skip gak masalah)\r\nGaram\r\nPenyedap rasa skip gapaa', '- Campur semua tepung taruh wadah masukkan kulkas 24jam\r\n- Jamur masukan kulkas terpisah sm tepung\r\n- Keluarkan jamur,cuci jamur,peras hingga kering.\r\n- Potong2 jamur gulingkan ke tepung. (Nb: tepung JANGAN ditambah air)\r\n- Goreng hingga matang. Simpel kan cepet banget.'),
(12, 'Sup telur puyuh tofu sederhana dan murah', 'resep2.jpg', '5 gelas Air untuk merebus\r\n24 pcs Telur puyuh rebus\r\n2 buah tofu, potong agak tebal dan goreng (agar tidak hancur)\r\n\r\nSayuran\r\n1 pcs Wortel ukuran sedang\r\n1 pcs Kentang yg besar\r\nKembang kol (jika suka)\r\n\r\nBumbu\r\n4 siung bawang putih, geprek\r\n3 cm jahe, geprek\r\n1 sdt garam\r\n1/2 sdt merica\r\n1/2 sdt gula\r\n1/2 sdt Royco', '- Rebus air sampai mendidih, kemudian masukkan bawang putih dan jahe\r\n- Masukkan kentang dan wortel, masak sampai empuk dan jangan terlalu lunak dan kemudian masukkan, gula, garam, royco dan merica\r\n- Masukkan telur puyuh dan tofu yang sudah di goreng\r\n- Masukkan daun bawang seledri yang sudah diiris lalu masukkan bawang goreng, koreksi rasa dan sajikan'),
(13, 'Ayam Krispi Irit', 'resep3.jpg', '1/4 kg dada ayam\r\n1 gelas tepung terigu\r\n1 gelas tepung bumbu serba guna (saya pakai sasa hot & spicy)\r\nsecukupnya Air\r\nSedikit garam\r\nSedikit merica bubuk', '- Bersihkan dan potong dada ayam kecil-kecil dan tidak terlalu tipis. Rendam dengan sedikit air, garam dan merica bubuk.\r\n- Ambil 3 sendok tepung serbaguna letakkan ke dalam wadah dan beri air yang nantinya akan digunakan sebagai adonan basah.\r\n- Ambil sebuah wadah lain, campur tepung terigu dan tepung bumbu serbaguna dg perbandingan 2:1,5 untuk digunakan sebagai adonan kering\r\n- Lalu ambil satu persatu ayam, masukkan dalam adonan basah dan gulingkan pada adonan kering. Ulangi langkah tersebut hingga ayam terakhir\r\n- Panaskan minyak, setelah panas masukkan ayam yang telah ditepungi. Goreng dengan api sedang hingga kecoklatan.\r\n- Angkat, tiriskan dan kemudian siap untuk di nikmati'),
(14, 'Bakso Tempe', 'resep4.jpg', '1 papan tempe\r\n150 gr tepung tapioka (sy pake rose brand)\r\n1 butir telur uk besar\r\nsecukupnya garam, bawang putih bubuk, merica bubuk, dan penyedap\r\nsecukupnya air', '- Kukus tempe sampai matang, lalu haluskan bisa menggunakan blender\r\n- Ketika menghaluskan tambahkan telur dan air secukupnya\r\n- Setelah selesai, pindahkan ke wadah lalu campurkan bahan2 pelengkap (garam,merica dll)\r\n- Campurkan tepung, tambahkan bila dirasa adonan belum bisa dibentuk\r\n- Koreksi rasa\r\n- Rebus dalam air mendidih\r\n- Bakso Tempe (Bakso Hemat+sehat ala anak kos) ???? langkah memasak 6 foto\r\n- Tunggu sampai bakso naik ke permukaan\r\n- Tiriskan, dan baksooo siap dinikmati ????\r\n- Saya cuma buat camilan, digoreng dicocol saus sambal lebih enaqueeee ????\r\n- Bakso Tempe (Bakso Hemat+sehat ala anak kos) ???? langkah memasak 9 foto\r\n- Selamat mencobaaaaa'),
(15, 'Nasi Goreng', 'resep5.jpg', '2 Piring Nasi Putih\r\n2 Potong Ayam (di Goreng)\r\n2 Biji Bawang Putih (dihaluskan)\r\n6 Sendok Makan Saori Saos Tiram\r\n4 Sendok Makan Saos Extra Pedas\r\n6 Sendok Makan Kecap Manis\r\nTelor Ayam (Di Orak-Arik)\r\nSecukupnya Daun Seledri (Di Iris Halus)\r\nSecukupnya Garam\r\n2 Biji Cabe Merah Kriting (potong kcil²)\r\nSecukupnya Ayam DiSuir', '- Panaskan Wajan, Tuangkan Minyak Goreng Secukupnya. Tumis Bawang Putih Halus.tumis hingga harum dgn api kecil kurlep 10 dtk\r\n- Lalu Masukan nasi Putih, Aduk rata. Siram dgn Kecap Manis, Kecap Asin, Saori Tiram, Saos Extra Pedas, Telor Ayam yg sdh diOrak - Arik, Seledri yg sdh dihaluskan, Ayam Yg Sdh Di Suir, Garam, Cabe Merah Kriting yg sdh dipotong². Aduk hingga Rata dgn Api Kecil Kurlep selama 15 Menit. Sajikan\r\n- Nasi Goreng Anak Kost Simple Gaez Irit langkah memasak 2 foto\r\n- Siapin bahan² Wadah Sebagai Hiasan Nasi Goreng. Mangkuk Kecil, Piring Rata, Tomat, Ayam Goreng, Daun Seledri Sebagai Hiasan diatas nya nasi Goreng..hmm nikmat disajikan pedas hangat2..selamat mencaba yah dirumah...semoga bermanfaat.\r\n- Nasi Goreng Anak Kost Simple Gaez Irit langkah memasak 3 foto\r\n- Hiasan Nasi Goreng\r\n- Nasi Goreng Anak Kost Simple Gaez Irit langkah memasak 4 foto\r\n- Laparr waktu makannn.....selamat makan...'),
(16, 'Popcorn Caramel', 'resep6.jpg', 'Biji jagung kemasan beli di indomar*t\r\nBahan Karamel\r\nMargarin (aku pake blue band)\r\nGula Jawa\r\nGula pasir\r\nAir putih', '- Panaskan teflon, masukkan 1 sdm margarin hingga cair\r\n- Setelah agak panas, masukkan segenggam biji jagung. Dan pastikan semua biji kena margarin cairnya. Tutup teflon sambil sesekali goyang teflonnya biar panasnya merata.\r\n- Jika sudah tidak ada suara letupan jagungnya, angkat dan tiriskan. Ulangi step dr awal jika popcornnya masih kurang.\r\n- Bahan karamel. Siapkan panci. Masukkan gula jawa dan gula pasir, tunggu sampai cair dan tambahkan sedikit air. Tunggu sampai mendidih.\r\n- Tuangkan karamel ke popcorn lalu diaduk/dikocok2. Dan popcorn karamel siap menemani kamu nonton drakor tanpa harus mahal ke XXI ????????????');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_menu`
--

CREATE TABLE `tbl_menu` (
  `id_menu` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `url` varchar(30) NOT NULL,
  `icon` varchar(30) NOT NULL,
  `is_main_menu` int(11) NOT NULL,
  `is_aktif` enum('y','n') NOT NULL COMMENT 'y=yes,n=no'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_menu`
--

INSERT INTO `tbl_menu` (`id_menu`, `title`, `url`, `icon`, `is_main_menu`, `is_aktif`) VALUES
(1, 'KELOLA MENU', 'kelolamenu', 'fa fa-server', 0, 'y'),
(2, 'KELOLA PENGGUNA', 'user', 'fa fa-user-o', 0, 'y'),
(3, 'level PENGGUNA', 'userlevel', 'fa fa-users', 0, 'y'),
(9, 'Contoh Form', 'welcome/form', 'fa fa-id-card', 0, 'y'),
(10, 'Menu Makanan', 'makanan', 'glyphicon glyphicon-user', 0, 'y'),
(12, 'MENU MINUMAN', 'minuman', '-', 0, 'y'),
(13, 'Menu Minuman', 'minuman', 'glyphicon glyphicon-user', 12, 'y');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_minuman`
--

CREATE TABLE `tbl_minuman` (
  `id` int(11) NOT NULL,
  `nama_minuman` varchar(255) NOT NULL,
  `gambar` varchar(255) NOT NULL,
  `bahan` text NOT NULL,
  `resep` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_minuman`
--

INSERT INTO `tbl_minuman` (`id`, `nama_minuman`, `gambar`, `bahan`, `resep`) VALUES
(1, 'Es buah', 'minuman1.jpg', '1 buah naga (aku dapat yang ungu)\r\n1 buah alpukat\r\n1/4 lingkaran buah melon\r\n3 tangkai rumput laut masak (minta temen ini ceritanya, dan cuma buat hiasan aja hehe, walaupun akhirnya tetep tak makan juga sih)\r\n100 gram gula\r\n50 ml santan masak\r\nsecukupnya air', '- Didihkan 1 gelas air dan masukkan gula pasir, aduk hingga membentuk larutan gula yang agak mengental dan berwarna agak kecoklatan.\r\n \r\n-Cuci bersih buah-buahan, kupas dan potong-potong. ambil beberapa dan masukkan ke dalam gelas, tambahkan larutan gula dan santan kemudian aduk-aduk sebentar biar tercampur rata.\r\n \r\n-Tambahkan es batu diatasnya (bisa digosrok dulu atau langsung dimasukkan gitu aja). silahkan dinikmati. kalo di foto ku kasih hiasan rumpt laut sih,tapi kalau suka dan bahannya ada bisa ditambahkan kok'),
(2, 'Manggo smoothies', 'minuman2.jpg', '1 buah mangga harum manis, potong\r\n1 gelas belimbing susu full cream dingin\r\n3 sendok gula\r\nsecukupnya Es batu\r\nWhipped cream\r\n1/2 sachet Susu kental manis', '- Masukkan potongan mangga, campur dengan susu dan gula lalu blender sampai lembut\r\n  \r\n- Whipped cream : kocok whipped cream cair dengan mixer menggunakan kecepatan tinggi sampai whipped cream mengembang dan kaku\r\n\r\n- Manggo smoothies langkah memasak 2 foto\r\n  \r\n- Taruh es batu di gelas, tuang smoothies mangga sampai setengah gelas. Beri whipped cream. Tuang lagi smoothiesnya, ulangi sampai bibir gelas.\r\n\r\n- Beri whipped cream di paling atas, lalu beri sedikit potongan mangga. Siap disajikan\r\n\r\n- Manggo smoothies langkah memasak 4 foto\r\n  \r\n- Jika kurang manis, bisa tambahkan gula dan susu saat memblender mangga, kebetulan saya tidak terlalu suka yang manis.'),
(3, 'Watermelon mojito ', 'minuman3.jpg', '2 pucuk daun mint (beli saja di gia*t atau yg lain)\r\n1 slice semangka\r\n1 botol kecil Sprite\r\nEs batu', '- Siapkan gelas\r\n  \r\n- Masukkan es batu kedalam gelas.\r\n  \r\n- Masukkan daun mint (geprek dulu pakai tangan, seperti tepuk tangan ?)\r\n  \r\n- Masukkan semangka (potong dadu)\r\n  \r\n- Masukkan sprite sampai penuh.\r\n  \r\n- Watermelon mojito siap dinikmati. ?'),
(4, 'Layered juice', 'minuman4.jpg', '100 gram buah mangga\r\n100 gram buah strawberry\r\nsecukupnya Es batu\r\nsecukupnya Gula pasir', '- Kupas buah mangga iris kecil lalu kemudian jus dengan menambah sedikit es batu\r\n  \r\n- Jika sudah masukkan ke dalam gelas. Dengan berhati hati agar tidak mengenai pinggirannya.\r\n  \r\n- Cuci juicer, lanjutkan membuat jus buah yang satunya. Dan tuangkan secara perlahan kerataan gelas dengan sendok agar lapisan tidak rusak. Garnish tipis tipis sajikan.'),
(5, 'Es Tipis (Timun-Jeruk nipis)', 'minuman5.jpg', '2 buah timun (ketimun)\r\n2 buah jeruk nipis\r\n4 sendok makan gula putih\r\n2 gelas air mineral\r\nEs batu (Selera)', '- Parut timun/ketimun menggunakan parutan instan sehingga timun berukuran halus halus (potongan memanjang tipis)\r\n\r\n- Setelah itu peras jeruk nipis kedalam gelas. \r\nTips agar jeruk nipis menghasilkan air yang banyak ektika diperas adalah tumbuk jeruk nipis menggunakan ulekan sebelum jeruk nipis dipotong kemudian diperas. Gunakan saringan agar biji jeruk nipis tidak ikut terbawa kedalam gelas.\r\n\r\n- Setelah itu tambahkan gula kedalam gelas berisi jeruk nipis. Aduk hingga gula larut. (Gunakan sedikit air panas untuk memudahkan air gula melarut.)\r\n\r\n- Tambahkan air mineral kedalam gelas (secukupnya, menyesuaikan selera manisnya gula).\r\n\r\n- Masukkan ketimun yang telah di parut dibagian atas gelas.\r\n\r\n- Es Tipis siap untuk menjadi pereda dahaga ataupun teman segar untuk berbuka puasa :)\r\n\r\n- Selamat mencoba sist :)'),
(6, 'Cream cheese homemade ', 'minuman6.jpg', '100 gr keju cheddar\r\n100 ml susu UHT plain', '- Parut keju lalu campurkan dengan susu UHT\r\n\r\n- Tim dengan cara double boiler sambil diaduk hingga keju larut\r\n\r\n- Sampai mulai kental yaa lalu angkat\r\n\r\n- Blender agar cream halus\r\n\r\n- Taraaaaa cream cheese sudah jadii dan siap digunakan\r\n\r\n- Satu resep ini jadi -+ 200 gr cream cheese yaa\r\n\r\n- Kalo ada sisa simpan di wadah tertutup dan masukan kulkas yaa\r\n\r\n- Selamat mencoba ');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_setting`
--

CREATE TABLE `tbl_setting` (
  `id_setting` int(11) NOT NULL,
  `nama_setting` varchar(50) NOT NULL,
  `value` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_setting`
--

INSERT INTO `tbl_setting` (`id_setting`, `nama_setting`, `value`) VALUES
(1, 'Tampil Menu', 'ya');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id_users` int(11) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `images` text NOT NULL,
  `id_user_level` int(11) NOT NULL,
  `is_aktif` enum('y','n') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id_users`, `full_name`, `email`, `password`, `images`, `id_user_level`, `is_aktif`) VALUES
(1, 'Zhafirah Sakinah Baity', 'zhafirah1998@gmail.com', '$2y$04$Wbyfv4xwihb..POfhxY5Y.jHOJqEFIG3dLfBYwAmnOACpH0EWCCdq', 'atomix_user31.png', 1, 'y');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user_level`
--

CREATE TABLE `tbl_user_level` (
  `id_user_level` int(11) NOT NULL,
  `nama_level` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user_level`
--

INSERT INTO `tbl_user_level` (`id_user_level`, `nama_level`) VALUES
(1, 'Super Admin'),
(2, 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_hak_akses`
--
ALTER TABLE `tbl_hak_akses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_makanan`
--
ALTER TABLE `tbl_makanan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_menu`
--
ALTER TABLE `tbl_menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indexes for table `tbl_minuman`
--
ALTER TABLE `tbl_minuman`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_setting`
--
ALTER TABLE `tbl_setting`
  ADD PRIMARY KEY (`id_setting`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id_users`);

--
-- Indexes for table `tbl_user_level`
--
ALTER TABLE `tbl_user_level`
  ADD PRIMARY KEY (`id_user_level`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_hak_akses`
--
ALTER TABLE `tbl_hak_akses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `tbl_makanan`
--
ALTER TABLE `tbl_makanan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `tbl_menu`
--
ALTER TABLE `tbl_menu`
  MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tbl_minuman`
--
ALTER TABLE `tbl_minuman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_setting`
--
ALTER TABLE `tbl_setting`
  MODIFY `id_setting` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id_users` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user_level`
--
ALTER TABLE `tbl_user_level`
  MODIFY `id_user_level` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
