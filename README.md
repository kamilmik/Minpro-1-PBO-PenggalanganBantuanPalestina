# Minpro PBO Sistem Penggalangan Bantuan Palestina
2509116012

## Deskripsi Singkat Program
Program ini adalah sebuah program untuk mengelola pendataan Bantuan kemanusiaan ke Palestina. Sistem ini dibangun menggunakan konsep OOP sederhana yang memanfaatkan Array untuk meenyimpan data. Fokus utama program ini terbagi menjadi dua, mencatat Bantuan Dana dan Bantuan Logistik. Setiap data donasi yang diinput akan berelasi dengan Lembaga Penyalur.

## Class yang Digunakan
Program ini menggunakan 4 class, yang terdiri dari 1 class utama (Entry Point) dan 3 class entitas pendukung. Berikut rinciannya:

### 1. Class Lembaga
Menjadi kerangka untuk menyimpan data instansi penyalur bantuan. Atribut:
  - 'namaLembaga' (String): Nama lembaga penyalur (contoh: BAZNAS).
  - 'asalNegara' (String): Wilayah atau negara asal lembaga.
  - 'kontak' (String): Nomor kontak lembaga.

### 2. Class BantuanDana
Class entitas untuk mencatat data donasi yang berupa uang. Atribut:
  - 'idDana' (int): ID unik untuk pendataan dana.
  - 'namaDonatur' (String): Nama pihak yang memberikan donasi.
  - 'nominal' (double): Jumlah uang yang didonasikan.
  - 'lembagaPenyalur' (Lembaga): Menyimpan objek dari class Lembaga.

### 3. Class BantuanLogistik
Class entitas untuk mencatat data donasi yang berupa barang fisik. Atribut:
  - 'idLogistik' (int): ID unik untuk pendataan barang.
  - 'namaBarang' (String): Jenis barang yang disumbangkan (contoh: Pakaian, Makanan).
  - 'beratKg' (int): Berat barang dalam hitungan kilogram.
  - 'lembagaPenyalur' (Lembaga): Menyimpan objek dari class Lembaga.

### 4. Class MinproPalestina
Class utama tempat program pertama kali berjalan, Berperan Mengatur jalannya aplikasi, menampilkan menu interaktif menampilkan opsi opsi yang mengeksekusi perulangan dan CRUD berdasarkan pilihan user.

## Penjelasan Alur Program

### 1. Inisialisasi Data
Saat program pertama kali dijalankan, sistem akan otomatis bekerja untuk memasukkan 6 daftar Lembaga Penyalur (BAZNAS, PMI, UNICEF, NGO, INFORSA, dan Aksi Bersama) ke dalam memori program.

### 2. Menu Utama
Setelah proses inisialisasi, layar akan menampilkan Menu Utama. Menu ini dibungkus dengan sistem perulangan, sehingga program tidak akan mati secara tiba-tiba sebelum user memilih opsi keluar. Pilihan di Menu Utama:
1. Kelola Bantuan Dana
2. Kelola Bantuan Logistik
3. Keluar

<img width="566" height="120" alt="image" src="https://github.com/user-attachments/assets/549f0d51-69da-49f1-a62c-f7c9f43b8cfc" />

### 3. Sub-Menu Kelola Bantuan (Fitur CRUD)
Jika memilih menu 1 atau 2, program akan masuk ke dalam submenu khusus. Alur kerja untuk Dana dan Logistik hampir sama persis (hanya berbeda di input Nominal Uang dan Berat Barang).

<img width="267" height="201" alt="image" src="https://github.com/user-attachments/assets/ffa57391-bf32-461f-ba8f-67f49b67dfa5" />


1. Tambah Data:
  *User* diminta untuk memasukkan data seperti ID, Nama (Donatur/Barang), dan jumlah (Nominal/Berat). Setelah itu, program akan menampilkan daftar 6 Lembaga Penyalur. *User* tinggal mengetik nomor urut untuk memilih lembaga. Jika proses input benar, akan muncul notifikasi '>> Alhamdulillah Berhasil ditambah'.
  <img width="398" height="291" alt="image" src="https://github.com/user-attachments/assets/fedc4cbb-1d02-4341-ac78-1a4eb9f339cb" />


2. Tampilkan Data:
  Sistem akan mengecek ketersediaan data. Jika memori masih kosong, program akan merespon dengan 'syafakillah Data kosong.'. Namun jika ada data, program akan mencetak seluruh rincian donasi ke layar dengan rapi.
  <img width="370" height="153" alt="image" src="https://github.com/user-attachments/assets/4f5fe47b-c927-4fc7-b5b7-857837ddc0bf" />


4. Ubah Nominal / Berat:
  *User* diminta memasukkan ID target yang ingin diubah. Program akan melakukan pencarian. Jika ID ditemukan, *user* bisa memasukkan jumlah nominal atau berat yang baru. Jika ID salah atau tidak ada, sistem akan memunculkan peringatan ID tidak ditemukan.'
  <img width="374" height="97" alt="image" src="https://github.com/user-attachments/assets/91ac7c46-5ae7-437d-ac83-887538b96975" />


6. Hapus Data:
  Program kembali meminta input ID target. Jika ID cocok dengan data di sistem, data tersebut akan dihapus secara permanen dari daftar. 
<img width="264" height="72" alt="image" src="https://github.com/user-attachments/assets/e01b483e-dfc2-407a-aa86-4b1711aeda7f" />


7. Kembali:
  Mengeluarkan *user* dari sub-menu tersebut dan mengembalikannya ke layar Menu Utama.

### 4. Keluar (Exit)
Jika pada Menu Utama user memilih opsi 3 (Keluar), sistem akan menghentikan perulangan variabel boolean 'berjalan' menjadi false, dan program langsung tertutup (selesai).
