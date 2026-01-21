
# Laporan Praktikum Minggu [3]
<<<<<<< HEAD
Topik: Manajemen File dan Permission di Linux
=======
Topik: [Manajemen File dan Permission di Linux]
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Identitas
<<<<<<< HEAD
- **Nama**  : Aster Rifani
- **NIM**   : 250202915  
- **Kelas** : 1IKRB

---

## Tujuan  
> Menggunakan perintah `ls`, `pwd`, `cd`, `cat` untuk navigasi file dan direktori.

> Menggunakan `chmod` dan `chown` untuk manajemen hak akses file.

> Menjelaskan hasil output dari perintah Linux dasar.
=======
- **Nama**  : [Lutfi Khoerunnisa]  
- **NIM**   : [250202947]  
- **Kelas** : [1IKRB]

---

## Tujuan
Tuliskan tujuan praktikum minggu ini.    
> Menggunakan perintah ls, pwd, cd, cat untuk navigasi file dan direktori.
> Menggunakan chmod dan chown untuk manajemen hak akses file.
> Menjelaskan hasil output dari perintah Linux dasar.
> Menyusun laporan praktikum dengan struktur yang benar.
> Mengunggah dokumentasi hasil ke Git Repository tepat waktu.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Dasar Teori
<<<<<<< HEAD
   Setiap file dan direktori di Linux memiliki kepemilikan yang terdiri dari tiga bagian: user (pemilik), group (kelompok pengguna), dan others (pengguna lain). Kepemilikan ini menentukan siapa yang memiliki hak akses terhadap file tersebut. Pengguna dan administrator dapat mengubah kepemilikan menggunakan perintah `chown` dan `chgrp`.

   Linux mengatur hak akses file melalui tiga jenis izin:
   1. read (r)
   2. write (w)
   3. execute (x)

   Hak akses ini berlaku untuk user, group, dan others secara terpisah. Izin tersebut dapat dilihat dengan ls -l dan diubah menggunakan chmod, baik dengan format simbolik maupun oktal.

   Ownership menentukan siapa yang berhak mengakses file, sementara permission menentukan tindakan apa yang boleh dilakukan. Kombinasi keduanya menjadi dasar kontrol akses yang menjaga keamanan dan stabilitas sistem file Linux, serta mencegah akses tidak sah.
=======
1. File tersebut adalah File Biasa (-) yang memiliki konfigurasi hak akses yang ketat bagi pengguna selain pemilik. Secara spesifik:
Pemilik (Owner) memiliki hak penuh (rwx): Mereka dapat Membaca, Menulis/Mengubah, dan Mengeksekusi file.
2. Grup (Group) memiliki hak terbatas (r-x): Mereka hanya dapat Membaca dan Mengeksekusi file, tetapi tidak dapat memodifikasinya.
3. Secara keseluruhan, permission ini sering digunakan untuk file yang dapat dieksekusi (seperti skrip atau program) yang boleh dibaca dan dijalankan oleh anggota grup, tetapi hanya boleh dimodifikasi oleh pemiliknya.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Langkah Praktikum
<<<<<<< HEAD
1. Setup Environment
   - Gunakan Linux (Ubuntu/WSL).
   - Pastikan folder kerja berada di  dalam direktori repositori Git praktikum:
praktikum week3-linux-fs-permission/
2. Eksperimen 1 –Navigasi Sistem File 
Menjalankan perintah berikut:

   `pwd`
   `ls -l`
   `cd /tmp`
   `ls -a`
3. Eksperimen 2 – Membaca File Jalankan perintah:

   `cat /etc/passwd | head -n 5`
4. Eksperimen 3 – Permission & Ownership 
Buat file baru:

  - `echo "Hello <NAME><NIM>" > percobaan.txt
   ls -l percobaan.txt
   chmod 600 percobaan.txt
   ls -l percobaan.txt`
  - Ubah pemilik file (jika memiliki izin sudo):
   `sudo chown root percobaan.txt
ls -l percobaan.txt`
5. Eksperimen 4 – Dokumentasi
   screenshot hasil terminal dan simpan di:
   `praktikum/week3-linux-fs-permission/screenshots/`
6. Commit & Push

   `git add .
   git commit -m "Minggu 3 - Linux File   System & Permission"
   git push origin main`

---

## Kode / Perintah
1. Hasil observasi perintah Linux dimasukkan ke dalam `laporan.md.`
2. Screenshot hasil eksekusi disimpan di `screenshots/.`
3. Laporan lengkap tersimpan di `laporan.md.`
4. Eksperimen 1:`pwd`
   `ls -l`
   `cd /tmp`
   `ls -a`
5. Eksperimen 2:
   `cat /etc/passwd | head -n 5`
6. Eksperimen 3:
   `echo "Hello <NAME><NIM>" > percobaan.txt
   ls -l percobaan.txt
   chmod 600 percobaan.txt
   ls -l percobaan.txt`
   `sudo chown root percobaan.txt
ls -l percobaan.txt`
7. Eksperimen 4:
   `praktikum/week3-linux-fs-permission/screenshots/`
8. Commit & Push:
   `git add .
   git commit -m "Minggu 3 - Linux File   System & Permission"
   git push origin main`
=======
1. Open folder praktikum/week3-linux-fs-permission/
2. Eksperimen satu navigasi file pwd,ls -l.cd /tmp,ls -a
3. Eksperimen 2 membaca file cat /etc/passwd | head -n 5
4. Masukan name dan chmod 600 percobaan.txt
5. Dokumentasi 
6. Push 
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Hasil Eksekusi
<<<<<<< HEAD
![Screenshot](![alt text](image.png))
### 1. Eksperimen 1-Navigasi Sistem File
| **Perintah** | **Hasil Output** |**Keterangan Singkat**|
|:---:|:---:|:---:|
|`pwd`|`/home/asterrifani0624`|Direktori aktif: /home/asterrifani0624. Tidak menampilkan isi folder atau file tersembunyi.|
|`ls -l`|`drwxrwxr-x 2 asterrifani0624 asterrifani0624 4096 Oct 23 10:35 praktkum-week-3`|Menampilkan isi lengkap folder home, ada file dan direktori, ukuran dan permission. Folder praktkum-week-3 sudah berhasil dibuat.|
|`cd /tmp`|(Prompt berubah ke `tmp`)|Direktori aktif berubah ke /tmp.|
|`ls -a`|Menampilkan file dan folder tersembunyi di `/tmp`, termasuk file sementara dan file konfigurasi.|Direktori aktif: `/tmp.` Isi lengkap dengan file biasa dan tersembunyi (., .., dan banyak file prefiks `tmp.`).|
### 2. Eksperimen 2-Membaca File
   ``asterrifani0624@cloudshell:/tmp$ cat /etc/passwd | head -n 5 root:x:0:0:root:/root:/bin/bash daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin bin:x:2:2:bin:/bin:/usr/sbin/nologin sys:x:3:3:sys:/dev:/usr/sbin/nologin sync:x:4:65534:sync:/bin:/bin/sync``
   |**Perintah**|**Keterangan**|
   |:---:|:---:|
   |`cat/etc/passwd head -n 5`|Perintah cat /etc/passwd | head -n 5 menampilkan 5 baris pertama dari file `/etc/passwd`, yang berisi informasi akun pengguna di sistem Linux. Informasi tersebut meliputi username, user ID (UID), group ID (GID), direktori home, dan shell yang digunakan saat login.(`root`,`daemon`,`bin`,`sys`,dan `sync`)|
### 3. Eksperimen 3-Permission & Ownership
   ``asterrifani0624@cloudshell:~$ echo "Hello Aster Rifani - 250202915" > percobaan.txt
asterrifani0624@cloudshell:~$ ls -l percobaan.txt
-rw-rw-r-- 1 asterrifani0624 asterrifani0624 31 Oct 23 11:48 percobaan.txt
asterrifani0624@cloudshell:~$ chmod 600 percobaan.txt
asterrifani0624@cloudshell:~$ ls -l percobaan.txt
-rw------- 1 asterrifani0624 asterrifani0624 31 Oct 23 11:48 percobaan.txt
asterrifani0624@cloudshell:~$ sudo chown root percobaan.txt
asterrifani0624@cloudshell:~$ ls -l percobaan.txt
-rw------- 1 root asterrifani0624 31 Oct 23 11:48 percobaan.txt
asterrifani0624@cloudshell:~$ sudo cat percobaan.txt
Hello Aster Rifani - 250202915``
   - Analisi Perbedaan Sebelum dan Sesudah `chmod`:
      1. Sebelum `chmod`

         Setelah membuat file `percobaan.txt`, hak akses file dengan perintah : `ls -l percobaan.txt`
         
         Diperoleh dengan hasil : `-rw-rw-r-- 1 asterrifani0624 asterrifani0624 31 Oct 23 11:48 percobaan.txt`
         Hak akses `rw-rw-r--` yang berarti pemilik dan grup dapat membaca dan menulis, sedangkan pengguna lain hanya dapat membaca.
      2. Sesudah `chmod 600 percobaan.txt`

         Perintah chmod 600 percobaan.txt dijalankan untuk mengubah hak akses file menjadi: `-rw-------`

         Hasil cek dengan `ls -l percobaan.txt`: `-rw------- 1 asterrifani0624 asterrifani0624 31 Oct 23 11:48 percobaan.txt`
         Artinya hanya pemilik file yang dapat membaca dan menulis, sementara grup dan pengguna lain tidak memiliki akses apapun.
      3. Setelah Mengubah Pemilik File dengan `sudo chown root percobaan.txt`

         Setelah mengganti pemilik file menjadi root dengan perintah:`sudo chown root percobaan.txt`

         Saya cek kembali dengan: `ls -l percobaan.txt`

         Didapatkan hasil:`-rw------- 1 root asterrifani0624 31 Oct 23 11:48 percobaan.txt`
         Setelah menjalankan perintah `sudo chown root percobaan.txt`, pemilik file berubah menjadi root sehingga hanya pengguna `root` yang memiliki hak akses membaca dan menulis file tersebut, sementara pengguna lain, termasuk pemilik sebelumnya, tidak dapat mengakses file tersebut.
=======
Sertakan screenshot hasil percobaan atau diagram:
[Screenshot hasil](./screenshots/Week3.png)
[Screenshot hasil](./screenshots/week%203%20'.png)
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

 | Nomer | Perintah| Makna Hasil |
| :--- | :---: | ---: |
| Kondisi Deadlock | Terjadi di Versi Deadlock | Solusi di Versi Fixed |
| :--- | :---: | ---: |
     |kondisi | jalam |khvh |
     | Kondisi Deadlock | Terjadi di Versi Deadlock | Solusi di Versi Fixed |
     |jsksj| kdjd |jdjbf |
     
|2.| ls -lcd /tmp | Perintah ls -lcd /tmp di Linux memiliki fungsi untuk menampilkan detail file atau direktori /tmp saja, termasuk informasi hak akses (permissions), dan menggunakan timestamp waktu perubahan terakhir pada metadata (c-time).|
|3.| ls -a | Fungsi dari perintah ls -a di Linux adalah untuk menampilkan daftar semua file dan direktori dalam lokasi saat ini, termasuk file tersembunyi.ls: Perintah dasar untuk mendaftar isi suatu direktori.-a (all): Opsi ini (flag) memerintahkan ls untuk menyertakan file yang tersembunyi|

<<<<<<< HEAD
## Analisis
   **Eksperimen 1**
      Eksperimen ini bertujuan memahami bagaimana menavigasi dan melihat isi sistem file Linux, termasuk bagaimana melihat direktori saat ini, isi direktori dengan detail, berpindah lokasi, dan melihat file tersembunyi.
   **Eksperimen 2**
      Eksperimen ini memperlihatkan cara membaca isi file teks (dalam hal ini file konfigurasi sistem `/etc/passwd` yang berisi informasi akun pengguna). Penggunaan `head -n 5` membatasi output hanya pada 5 baris pertama agar lebih mudah dipahami.
   **Eksperimen 3**
      Eksperimen ini menjelaskan konsep dasar pengelolaan hak akses (permissions) dan kepemilikan (ownership) file pada Linux. Dengan `chmod`, hak akses file dapat dibatasi agar hanya pemilik yang bisa mengakses. Dengan `chown`, kepemilikan file dapat dialihkan ke user lain (misal root), sehingga akses file juga bergantung pada siapa pemiliknya. Ini penting untuk keamanan dan pengelolaan sistem file.

---

## Kesimpulan
Manajemen file di Linux melibatkan kemampuan untuk menavigasi sistem file dengan menggunakan perintah seperti `pwd` untuk mengetahui direktori saat ini, `ls` untuk melihat isi direktori, dan cd untuk berpindah antar folder. Selain itu, perintah `ls -a` memungkinkan pengguna melihat file tersembunyi, sehingga memudahkan dalam mengelola dan memahami struktur direktori di sistem Linux. Pemahaman dasar tentang cara membaca file menggunakan perintah `cat` dan `head` juga penting untuk memeriksa isi file teks, terutama file konfigurasi sistem.

Di sisi lain, manajemen permission dan kepemilikan file sangat krusial untuk menjaga keamanan dan kontrol akses di Linux. Dengan menggunakan perintah `chmod`, pengguna dapat mengatur hak akses file agar hanya pemilik atau grup tertentu yang dapat membaca, menulis, atau mengeksekusi file tersebut. Perintah `chown` memungkinkan penggantian pemilik file, yang berdampak langsung pada siapa yang memiliki kontrol penuh atas file tersebut. Kombinasi pengaturan permission dan ownership membantu melindungi file dari akses yang tidak diinginkan dan menjaga integritas sistem.
=======
| Nomer | Perintah| Makna Hasil |
| :--- | :---: | ---: |
|1.|cat /etc/passwd | head -n 5|Percobaan cat /etc/passwd | head -n 5 memiliki makna fungsional untuk menampilkan lima baris pertama dari file konfigurasi pengguna sistem (/etc/passwd).Ini adalah contoh klasik penggunaan pipa (|) untuk merangkai dua perintah Linux:Analisis Percobaan
1. Perintah Pertama: cat /etc/passwd
cat (concatenate): Perintah ini membaca seluruh isi file /etc/passwd./etc/passwd: Ini adalah file teks penting dalam sistem Linux yang menyimpan informasi dasar tentang semua akun pengguna terdaftar, termasuk nama pengguna, ID pengguna (UID), ID grup (GID), home directory, dan shell default mereka.2. Pipa (|)
Pipa (|): Simbol ini berfungsi sebagai penghubung (redirector). Ini mengambil seluruh output dari perintah di sebelah kirinya (cat /etc/passwd) dan menjadikannya sebagai input untuk perintah di sebelah kanannya3. Perintah Kedua: head -n 5
head: Perintah ini dirancang untuk menampilkan baris-baris awal dari suatu file atau input yang diterima.-n 5: Opsi ini menentukan bahwa head harus membatasi outputnya hanya pada 5 baris pertama. |
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

| Nomer | Perintah| Makna Hasil |
| :--- | :---: | ---: |
|1.|echo "Hello Lutfi Khoerunnisa - 250202947" > percobaan.txt | mengganti nama 
|2.| ls -l percobaan.txt | untuk menampilkan detail lengkap dari file teks tersebut, termasuk hak akses, ukuran, dan kepemilikan.
|3.| chmod 600 percobaan.txt |Percobaan ini menghasilkan konfigurasi keamanan yang sangat tinggi, biasanya digunakan untuk:File Konfigurasi Rahasia: Seperti kunci SSH (id_rsa) atau file kata sandi pribadi yang tidak boleh dilihat, diubah, atau diakses oleh siapa pun selain pemilik akun.Privasi Maksimal: Memastikan bahwa file tersebut sepenuhnya privat dan terisolasi dari pengguna lain di sistem.|
---

## Quiz
<<<<<<< HEAD
1. Apa fungsi dari perintah `chmod`? 
   **Jawaban:**  Perintah `chmod` (change mode) digunakan untuk mengubah hak akses (permission) file atau direktori di sistem Linux/Unix. Dengan `chmod`, kamu bisa mengatur siapa saja yang boleh membaca (read), menulis (write), atau mengeksekusi (execute) sebuah file atau direktori.
2. Apa arti dari kode permission `rwxr-xr--`? 
   **Jawaban:**  Kode permission `rwxr-xr--` terdiri dari tiga bagian (masing-masing tiga karakter) yang mewakili hak akses untuk:

   - Pemilik (owner): `rwx` → dapat membaca (read), menulis (write), dan mengeksekusi (execute) file/direktori.

   - Grup (group): `r-x` → dapat membaca dan mengeksekusi,    tapi tidak bisa menulis.

   - Lainnya (others): `r--` → hanya bisa membaca saja.
3. Jelaskan perbedaan antara `chown` dan `chmod`
   **Jawaban:**  `chmod` mengatur apa yang boleh dilakukan terhadap file, sedangkan `chown` mengatur siapa yang punya file tersebut.
=======
1. [Apa fungsi dari perintah chmod?]  
   **Jawaban:Fungsi utama dari perintah chmod (singkatan dari Change Mode) di Linux adalah untuk mengubah hak akses (permissions) dari file dan direktori.Perintah ini memungkinkan pengguna untuk mengatur secara spesifik siapa (Pemilik, Grup, atau Lainnya) yang diizinkan untuk Membaca (r), Menulis/Mengubah (w), dan Mengeksekusi/Menjalankan (x) suatu objek.**
   2.[Apa arti dari kode permission rwxr-xr--?]
   **Jawaban:Kode permission rwxr-xr-- artinya:Pemilik (owner): Punya izin baca (r), tulis (w), dan eksekusi (x).Grup (group): Punya izin baca (r) dan eksekusi (x).Lainnya (others): Hanya punya izin baca (r).**
   3.[Jelaskan perbedaan antara chown dan chmod.]
   **Jawaban: Perbedaan utama adalah chmod mengubah hak akses (izin untuk membaca, menulis, mengeksekusi) pada sebuah berkas atau direktori, sedangkan chown mengubah kepemilikan (siapa pemilik dan grupnya). chmod menentukan apa yang dapat dilakukan, sementara chown menentukan siapa yang memiliki izin tersebut.**
   4.[Upload hasil dan laporan ke repositori Git sebelum deadline.]
   **Jawaban:**
   ---

   ## Tugas
   1.[Dokumentasikan hasil seluruh perintah pada tabel observasi di laporan.md]
   **Jawaban:**
   2. [Jelaskan fungsi tiap perintah dan arti kolom permission (rwxr-xr--).]
   **Jawaban:Perintah chmod (Change Mode) berfungsi sebagai alat utama untuk mengubah hak akses (permissions) sebuah file atau direktori dengan menentukan siapa yang boleh Membaca (r), Menulis/Mengubah (w), dan Mengeksekusi (x) objek tersebut, sementara chown dan chgrp berfungsi untuk menentukan kepemilikan file oleh User dan Group. Kode permission seperti rwxr-xr-- yang terlihat melalui perintah ls -l mengartikan bahwa objek tersebut adalah File Biasa (-), yang memberikan izin Penuh (Baca, Tulis, Eksekusi) kepada Pemilik (rwx), izin Baca dan Eksekusi kepada Grup (r-x), dan izin Hanya Baca kepada Lainnya (r--).**
   3. [Analisis peran chmod dan chown dalam keamanan sistem Linux]
   **Jawaban:Peran chmod dan chown dalam keamanan sistem Linux adalah fundamental karena kedua perintah tersebut bekerja sama untuk menerapkan Prinsip Hak Istimewa Paling Rendah (Principle of Least Privilege). Perintah chown (Change Owner) bertanggung jawab untuk menetapkan Kepemilikan sebuah file atau direktori kepada User dan Group tertentu, yang merupakan langkah awal dalam menentukan akuntabilitas dan membatasi siapa yang masuk kategori Pemilik, Grup, atau Lainnya. Sementara itu, perintah chmod (Change Mode) bertanggung jawab untuk mengatur Hak Akses (Baca, Tulis, Eksekusi) untuk masing-masing kategori tersebut, memastikan bahwa User dan service hanya diberikan izin minimal yang diperlukan untuk menjalankan fungsinya, sehingga secara efektif mencegah user atau program yang disusupi untuk memodifikasi atau menghapus file sensitif dan menjaga integritas sistem.**
   4.[Upload hasil dan laporan ke repositori Git sebelum deadline.]
   **Jawaban:**

## Kesimpulan
Peran Sentral chmod dan chown dalam Keamanan Linux 
**Chmod (Change Mode) dan chown (Change Owner) merupakan fondasi utama dari model keamanan file di Linux, yang secara sinergis menerapkan Prinsip Hak Istimewa Paling Rendah (Principle of Least Privilege).Peran chown (Kepemilikan dan Akuntabilitas)Perintah chown menetapkan Kepemilikan (Ownership) file (yaitu User dan Group), yang merupakan penentuan siapa yang memiliki kendali administratif dan akuntabilitas atas file tersebut. Dengan menentukan owner, sistem secara efektif membagi pengguna menjadi tiga kategori akses: Pemilik, Anggota Grup, dan Lainnya. Pemisahan ini krusial untuk mengisolasi hak istimewa; misalnya, file sistem sensitif seringkali dimiliki oleh root untuk mencegah modifikasi oleh user atau service dengan hak akses terbatas.Peran chmod (Hak Akses dan Integritas) Perintah chmod kemudian mengatur Hak Akses (Permissions)—yaitu izin Baca (r), Tulis (w), dan Eksekusi (x)—untuk ketiga kategori yang telah ditetapkan oleh chown. Fungsi utama chmod adalah untuk membatasi risiko dengan memastikan bahwa setiap user dan service hanya memiliki izin minimal yang mutlak diperlukan.-Analisis Permission (rwxr-xr--)Struktur permission, seperti rwxr-xr--, menjadi bukti konkret dari pengaturan keamanan ini. Kode tersebut mengartikan:Pemilik (rwx atau 7) memiliki izin Penuh (Baca, Tulis, Eksekusi).Grup (r-x atau 5) hanya memiliki izin Baca dan Eksekusi, dilarang memodifikasi (Tulis).Lainnya (r-- atau 4) hanya memiliki izin Baca.Kombinasi ownership dan permission ini memastikan bahwa file sensitif tidak dapat diubah (integritas terjaga) atau dijalankan (eksekusi dicegah) oleh pihak yang tidak berwenang, menjamin stabilitas dan keamanan sistem secara menyeluruh.**
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Refleksi Diri
Tuliskan secara singkat:
<<<<<<< HEAD
- Apa bagian yang paling menantang minggu ini? 
 laptop nya ngelag 
- Bagaimana cara Anda mengatasinya?  
 dengan bersabar
=======
- Apa bagian yang paling menantang minggu ini?  
**Jawaban:Laporan Hilang**
- Bagaimana cara Anda mengatasinya?  
**Jawaban:Mengulang**
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
---

**Credit:**  
_Template laporan praktikum Sistem Operasi (SO-202501) – Universitas Putra Bangsa_
