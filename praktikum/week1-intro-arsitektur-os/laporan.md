
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
# Laporan Praktikum Minggu 1
Topik: Arsitektur Sistem Operasi dan Kernel
=======
# Laporan Praktikum Minggu [X]
Topik:  "Arsitektur Sistem Operasi dan Kernel"
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
# Laporan Praktikum Minggu [1]
Topik: [Analisis arsitektur kernel dan model sistem operasi]
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======
# Laporan Praktikum Minggu [1]
Topik: "Arsitektur Sistem Operasi dan Kernel"
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Identitas
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
- **Nama**  : Aster Rifani 
- **NIM**   : 250202915 
- **Kelas** : 1IKRB
=======
- **Nama**  : [Lutfi Khoerunnisa]  
- **NIM**   : [250202947]  
- **Kelas** : [1IKRB]
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
- **Nama**  : [Ani Ngismatul Hawa]  
- **NIM**   : [250202914]  
- **Kelas** : [1IKRB ]
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======
- **Nama**  : [Dyah Retno Wulandari]  
- **NIM**   : [250202934]  
- **Kelas** : [IKRB]
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Tujuan
<<<<<<< HEAD
> Mengetahui peran sistem operasi dalam arsitektur komputer.
> Mengindentifikasi komponen utama OS (kernel, system call, device komputer, device driver, file sistem).
> Membandingkan model arsitektur OS (monolithic kernel, microkernel, layered architecture).
> Menggambar diagram sederhana arsitekture OS menggunakan alat bantu digital.
=======
Tuliskan tujuan praktikum minggu ini.  
<<<<<<< HEAD
Contoh:  
<<<<<<< HEAD
> Mahasiswa mampu membuat visual code,gitbash.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
> Mahasiswa mampu memahami cara kerja kernel dan sisem operasi, meningkatkan modularitas.
> Membandingkan model arsitektur OS
> Mengidentifikasi komponen utama OS
> Menggambarkan diagram sederhana arsitektur OS menggunakan alat bantu
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======

> Mahasiswa mampu menjelaskan fungsi utama sistem operasi dan peran kernel serta system call.
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Dasar Teori
<<<<<<< HEAD
<<<<<<< HEAD
Operating System Architecture 
 Operating system architecture merupakan struktur desain yang menentukan bagaimana sistem operasi dibangun dan bagian-bagiannya saling berkomunikasi untuk mengelola seluruh aktivitas komputer.
 
  Terdapat perbedaan dalam jenis arsitektur sistem operasi, antara lain:
 1. _Monolithic Kernel_: seluruh layanan sistem operasi (manajemen proses,manajemen memori,file system,device driver,dan networking) berjalan dalam ruangan kernel (kernel space)dengan mode hak akses teringgi (supervisor mode).
 2. _Micro Kernel_: kernel dikurangi seminim mungkin, hanya mencakup fungsi-fungsi inti (manajemen komunikasi antar-proses/IPC, penjadwalan dasar,dan manjemen memori level rendah).Layanan sistem operasi lainnya (seperti file system, device driver, dan networking)diimplementasikan sebagai proses pengguna (user-level servers)diluar kernel.
 3. _Layered Architecture_: arsitektur ini mengatur sistem operasi ke dalam lapisan-lapisan (layers), di mana setiap lapisan hanya dapat menggunakan fungsi dan layanan yang disediakan oleh lapisan yang lebih rendah.Lapisan 0 adalah perangkat kers (hardware), dan lapisan N adalah antarmuka pengguna (user interface).Dan tujuannya untuk mempermudah desain, implementasi, dan debugging.
  
  Contoh OS yang nyata menggunakan masing masing model :
 1. Monolithic Kernel: LINUX & UNIX
 2. Microkernel: MINIX & macOS
 3. Layered Architecture: The OS
=======
Tuliskan ringkasan teori (3–5 poin) yang mendasari percobaan.
Sistem operasi adalah perangkat lunak dasar yang mengelola semua sumber daya perangkat keras dan lunak komputer serta menjadi perantara antara pengguna dan perangkat keras.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
 Monolithic kernel : semua layanan inti sistem operasi dijalankan dalam kernel space  yang sama
 Micro kernel      : yang dijalankan hanya fungsi-fungsi paling esensial di ruang kernel,seperti manajemen proses dan komuinikasi antar proses.
 Layered           : disusun dalam lapisan-lapisan terpisah yang memiliki fungsi berbeda, seperti lapisan presentasi, dsb.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

Pada praktikum minggu ini, mahasiswa akan mempelajari arsitektur dasar sistem operasi: bagaimana komponen OS bekerja, serta bagaimana interaksi antara user, aplikasi, kernel, dan hardware terjadi.

Mahasiswa juga diperkenalkan pada:

⦁	Perbedaan mode eksekusi kernel mode dan user mode.

⦁	Mekanisme system call (panggilan sistem).

⦁	Perbandingan model arsitektur OS seperti monolithic kernel, layered approach, dan microkernel.

Eksperimen akan dilakukan menggunakan perintah dasar Linux untuk melihat informasi kernel dan modul aktif.


---

## Langkah Praktikum
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
1. Membaca materi pengantar tentang komponen OS.  
2. Perintah yang dijalankan.
```bash
=======
1. Langkah-langkah yang dilakukan.
 Setup Environment

Pastikan Linux (Ubuntu/WSL) sudah terinstal.
Pastikan Git sudah dikonfigurasi dengan benar:
git config --global user.name "Nama Anda"
git config --global user.email "email@contoh.com"
Diskusi Konsep

Baca materi pengantar tentang komponen OS.
Identifikasi komponen yang ada pada Linux/Windows/Android.
Eksperimen Dasar Jalankan perintah berikut di terminal:

>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
uname -a
whoami
lsmod | head
dmesg | head
<<<<<<< HEAD
```
3. Membuat diagram arsitektur menggunakan alat bantu digital (**draw.io**).  
4. Commit messege:
 
  hasil laporan 
```bash
praktikum/week1 - intro - arsitektur - os/laporan.md
```
  hasil diagram
 ```bash
praktikum/week1 - intro - arsitektur os/screenshots/diagram-os.png
 ```
=======
Catat dan analisis modul kernel yang tampil.

Membuat Diagram Arsitektur

Buat diagram hubungan antara User → System Call → Kernel → Hardware.
Gunakan draw.io atau Mermaid.
Simpan hasilnya di:
praktikum/week1-intro-arsitektur-os/screenshots/diagram-os.png
Penulisan Laporan

Tuliskan hasil pengamatan, analisis, dan kesimpulan ke dalam laporan.md.
Tambahkan screenshot hasil terminal ke folder screenshots/.
Commit & Push

git add .
git commit -m "Minggu 1 - Arsitektur Sistem Operasi dan Kernel"
git push origin main

2. Perintah yang dijalankan.  
Menjelaskan peran sistem operasi dalam arsitektur komputer.
Mengidentifikasi komponen utama OS (kernel, system call, device driver, file system).
Membandingkan model arsitektur OS (monolithic, layered, microkernel).
Menggambarkan diagram sederhana arsitektur OS menggunakan alat bantu digital (draw.io / mermaid).

3. File dan kode yang dibuat. 
code github,code visual code,code gitbash 
4. Commit message yang digunakan.
git add .

git commit -m "Minggu 1 - Arsitektur Sistem Operasi dan Kernel"

git push origin main
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
1. Langkah-langkah yang dilakukan.  

   Setup Environment

   Pastikan Linux (Ubuntu/WSL) sudah terinstal.

   Pastikan Git sudah dikonfigurasi dengan benar:

         git config --global user.name "Nama Anda" 

         git config --global user.email "email@contoh.com"


2. ## Diskusi Konsep
      Baca materi pengantar tentang komponen OS.

      Identifikasi komponen yang ada pada Linux/Windows/Android.

3. ## Eksperimen Dasar 
      Jalankan perintah berikut di terminal:

         uname -a

         whoami

         lsmod | head

         dmesg | head

      Catat dan analisis modul kernel yang tampil.

  
4. ## Membuat Diagram Arsitektur
   ⦁	Buat diagram hubungan antara User → System Call → Kernel → Hardware.

   ⦁	Gunakan draw.io atau Mermaid.

   ⦁	Simpan hasilnya di:

       praktikum/week1-intro-arsitektur-os/screenshots/diagram-os.png

5. ## Penulisan Laporan
      ⦁	Tuliskan hasil pengamatan, analisis, dan kesimpulan ke dalam laporan.md.

      ⦁	Tambahkan screenshot hasil terminal ke folder screenshots/.

6. ## Commit & Push

         git add .

         git commit -m "Minggu 1 - Arsitektur Sistem Operasi dan Kernel"

         git push origin main
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Kode / Perintah
```bash
git add.
git commit -m "Minggu 1 - Arsitektur Sistem Operasi dan Kernel"
git push origin main
```
```bash
=======
1. Membaca dan memahami materi bagaimana cara bekerja OS atau Sistem operasi dengan rinci dan jelas.  
2. Perintah yang dijalankan.
 ```bash
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
uname -a
whoami
lsmod | head
dmesg | head
```

3. Membuat diagram arsitektur menggunakan ala bantu (Draw.io).  
5. Commit message yang digunakan
 Hasil Laporan
```praktikum/week1-intro-arsitektur-os/laporan.md```
Hasil Diagram
```praktikum/week1-intro-arsitektur-os/screenshoots/diagram-os.png```
---

## Kode / Perintah
Tuliskan potongan kode atau perintah utama:
```git add.
git commit-m "Minggu 1"
git push origin main
```

## Hasil Eksekusi
<<<<<<< HEAD
<<<<<<< HEAD
Screenshot hasil percobaan atau diagram:
![Tugas Diagram](TugasDiagram.PNG)
=======
Sertakan screenshot hasil percobaan atau diagram:
<<<<<<< HEAD
![Screenshot hasil](./screenshots/Screenshot%202025-10-11%20210447.png)
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
![schreenshots/.](screenshots/example.png)
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======
Sertakan screenshot hasil percobaan:

![Screenshot hasil](screenshots/ubuntuW.png)


Sertakan screenshot hasil diagram:

![Screenshot hasil](screenshots/diagram-os.png)
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Analisis
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
- Makna dari percobaan atau membuat diagram tersebut adalah untuk mengetahui hubungan antara _User → System Call → Kernel → Hardware_ 
- Hubungan antara Kernel, system Call, dan Arsitektur OS, yaitu:
 
  1. Kernel merupakan pelaksana fungsi utama OS.
  2. System Call merupakan mekanisme komunikasi antara _user mode → kernel mode_.
  3. Arsitektur OS menentukan bagaimana kernel dan system call diorganisasikan dan dijalankan dalam sistem.
  
  Jadi,fungsi kernel dan system call bekerja sesuai pola yang ditetapkan arsitektur OS.
- Perbedaan antara Linux dan Windows terjadi karena perbedaan arsitektur kernel, system call, format file,dan lingkungan eksekusi.   
=======
- Jelaskan makna hasil percobaan.

      * uname -a   adalah perintah di Linux yang digunakan untuk menampilkan semua informasi detail tentang sistem, termasuk nama kernel, nama mesin 
      *  uname -a adalah perintah di Linux yang digunakan untuk menampilkan semua informasi detail tentang sistem, termasuk nama kernel, nama mesin (
         *  Perintah lsmod digunakan untuk menampilkan daftar modul kernel yang saat ini sedang dimuat (loaded) di sistem. Modul kernel ini bisa berupa driver perangkat keras atau modul fungsional lainnya yang digunakan oleh kernel Linux
- Hubungkan hasil dengan teori (fungsi kernel, system call, arsitektur OS).
Hasil dapat dihubungkan dengan fungsi kernel sebagai inti sistem operasi yang menjembatani hardware dan software; panggilan sistem (\(syscall\)) sebagai jembatan antara aplikasi pengguna dan kernel untuk meminta layanan; dan arsitektur OS yang mendefinisikan struktur ini, di mana kernel menjadi komponen sentral yang mengelola sumber daya melalui panggilan sistem. 

- Apa perbedaan hasil di lingkungan OS berbeda (Linux vs Windows)?
  Perbedaan hasil antara Linux dan Windows terlihat dari struktur sistem file (garis miring / di Linux vs `C:\` di Windows), cara penamaan berkas (bisa ada dua berkas dengan nama sama di direktori berbeda di Linux, tidak bisa di Windows), sistem partisi (Linux lebih fleksibel, Windows mendukung partisi Linux namun Linux belum tentu mendukung partisi Windows), dan penggunaan baris perintah (terminal di Linux lebih ampuh, cmd di Windows lebih terbatas).
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
1.	Makna hasil percobaan

      1.1 uname -a, perintah uname digunakan untuk menampilkan informasi tentang sistem operasi dan kernel yang dicetak

      1.2 whoami, perintah whoami digunakan untuk menampilkan nama pengguns ysng sedang login ke sistem

    1.3 lsmod | head, perintah lsmod | head digunakan untuk menampilkan daftar modul kernel yang sedang dimuat di sistem Linux

    1.4 dmesg | head, perintah dmesg | head digubakan untuk menampilkan pesan-pesan kernel

2.	Hubungan dengan teori (fungsi kernel, system call, arsitektur OS)

      2.1 Kernel adalah inti dari sistem operasi yang berfungsi mengelola sumber daya manusia sistem seperti memori, CPU, dan perangkat I/O. Kernel bertanggungjawab atas manajemen proses, memori, dan perangkat keras. Berdasarkan hasil percobaan yang saya lakukan uname -a menampilkan informasi tentang sistem operasi dan kernel yang digunakan. 

         retnowulandari0504@LAPTOP-CA0KHU5V:~$ uname -a
         Linux LAPTOP-CA0KHU5V 6.6.87.2-microsoft-standard-WSL2 #1 SMP PREEMPT_DYNAMIC Thu Jun 5 18:30:46 UTC 2025 x86_64 x86_64 x86_64 GNU/Linux


      Berdasarkan kode diatas menunjukkan hasil bahwa perintah uname -a menampilkan nama kernel yang digunakan yaitu Linux, versi kernel linux yang digunakan “6.6.87.2-microsoft-standard-WSL2”. WSL2 artinya sistem Linux ini berjalan di Windows Subsystem for Linux 2 (WSL2). Hasil perintah juga menampilkan nama komputer dan tanggal waktu kompilasi kernel.

      2.2 System call adalah antarmuka antara pengguna dan kernel.
whoami digunakan untuk mendapatkan informasi atau melakukan operasi tertentu. Berdasarkan hasil percobaan yang saya lakukan whoami menampilkan informasi identitas pengguna yang sedang login.

         retnowulandari0504@LAPTOP-CA0KHU5V:~$ whoami

         retnowulandari0504

      2.3 Arsitektur OS

      Sistem operasi Linux memiliki arsitektur monilitik dimana kernel berjalan dalam mode kernel (kernel space) dengan akses langsung ke hardware.
lsmod | head menampilkan modul-modul kernel yang sedang dimuat.

         retnowulandari0504@LAPTOP-CA0KHU5V:~$ lsmod | head
         Module                  Size  Used by
         intel_rapl_msr         16384  0
         intel_rapl_common      32768  1 intel_rapl_msr
         kvm_intel             356352  0
         kvm                   970752  1 kvm_intel
         irqbypass              12288  1 kvm
         crc32c_intel           16384  0
         battery                20480  0
         ac                     16384  0
         sch_fq_codel           16384  1

   dmesg | head menampilkan pesan-pesan dari ring buffer kernel. 

      retnowulandari0504@LAPTOP-CA0KHU5V:~$ dmesg | head
      [    0.000000] Linux version 6.6.87.2-microsoft-standard-WSL2 (root@439a258ad544) (gcc (GCC) 11.2.0, GNU ld (GNU Binutils) 2.37) #1 SMP PREEMPT_DYNAMIC Thu Jun  5 18:30:46 UTC 2025
      [    0.000000] Command line: initrd=\initrd.img WSL_ROOT_INIT=1 panic=-1 nr_cpus=8 hv_utils.timesync_implicit=1 console=hvc0 debug pty.legacy_count=0 WSL_ENABLE_CRASH_DUMP=1
      [    0.000000] KERNEL supported cpus:
      [    0.000000]   Intel GenuineIntel
      [    0.000000]   AMD AuthenticAMD
      [    0.000000] BIOS-provided physical RAM map:
      [    0.000000] BIOS-e820: [mem 0x0000000000000000-0x000000000009ffff] usable
      [    0.000000] BIOS-e820: [mem 0x00000000000e0000-0x00000000000e0fff] reserved
      [    0.000000] BIOS-e820: [mem 0x0000000000100000-0x00000000001fffff] ACPI data
      [    0.000000] BIOS-e820: [mem 0x0000000000200000-0x00000000f7ffffff] usable


3.	Perbedaan hasil di lingkungan OS berbeda (Linux vs Windows)
Untuk menampilkan informasi tentang sistem operasi dan kernel yang digunakan pada windows menggunakan ver sedangkan pada linux menggunakan uname -a

3.1 uname -a (Linux)

      retnowulandari0504@LAPTOP-CA0KHU5V:~$ uname -a
      Linux LAPTOP-CA0KHU5V 6.6.87.2-microsoft-standard-WSL2 #1 SMP PREEMPT_DYNAMIC Thu Jun  5 18:30:46 UTC 2025 x86_64 x86_64 x86_64 GNU/Linux

   ver (Windows)

      C:\Users\LENOVO>ver

      Microsoft Windows [Version 10.0.26100.6725]

   percobaan menggunakan perintah uname -a pada windows tidak bisa dilakukan

      C:\Users\LENOVO>uname -a
      'uname' is not recognized as an internal or external command,
      operable program or batch file. 

3.2 whoami (Linux) vs (Windows)
   Linux

      retnowulandari0504@LAPTOP-CA0KHU5V:~$ whoami
      retnowulandari0504

   Windows

      C:\Users\LENOVO>whoami
      laptop-ca0khu5v\lenovo

   perintah whoami bisa digunakan di Linux maupun Windows

3.3 lsmod | head (Linux) vs (Windows)

   Linux

      retnowulandari0504@LAPTOP-CA0KHU5V:~$ lsmod | head
      Module                  Size  Used by
      intel_rapl_msr         16384  0
      intel_rapl_common      32768  1 intel_rapl_msr
      kvm_intel             356352  0
      kvm                   970752  1 kvm_intel
      irqbypass              12288  1 kvm
      crc32c_intel           16384  0
      battery                20480  0
      ac                     16384  0
      sch_fq_codel           16384  1

   driverquery (Windows)

         C:\Users\LENOVO>driverquery
         Module Name  Display Name           Driver Type   Link Date
         ============ ====================== ============= ======================
         1394ohci     1394 OHCI Compliant Ho Kernel
         3ware        3ware                  Kernel        19/05/2015 05:28:03
         ACPI         Microsoft ACPI Driver  Kernel
         AcpiAudioCom ACPI Audio Compositor  Kernel
         AcpiDev      ACPI Devices driver    Kernel
         acpiex       Microsoft ACPIEx Drive Kernel
         acpipagr     ACPI Processor Aggrega Kernel
         AcpiPmi      ACPI Power Meter Drive Kernel
         acpitime     ACPI Wake Alarm Driver Kernel
         ACPIVPC      Lenovo Virtual Power C Kernel        30/05/2024 13:36:31
      Dst…
   

3.4 dmesg | head (Linux) vs (Windows) 

Perintah dmesg | head adalah perintah Linux untuk melihat pesan kernel sedangkan pada windows tidak ada perintah tunggal seperti dmesg. Pada windows ada beberapa cara untuk melihat log sistem yang mirip dengan fungsi dmesg pada Linux misalnya dengan membuka Event Viewer di pencarian Windows.

>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Kesimpulan
<<<<<<< HEAD
<<<<<<< HEAD
 Berdasarkan hasil praktikum yang telah dilakukan, dapat disimpulkan bahwa sistem operasi memiliki peran penting sebagai dalam arsitektur komputer. Sistem operasi bertanggung jawab dalam mengatur penggunaan sumber daya komputer agar setiap komponen dapatbekerja secara efisien dan terkoordinasi.
 
 Melalui perbandingan model OS,dapat diketahui bahwa monolithic kernel memiliki performa yang lebih tinggi karena seluruh layanan berjalan di ruang kernel, microkernel lebih aman dan modular karena layanan berjalan di ruang pengguna,sedangkan layered architecture menawarkan struktur yang terorganisir berdasarkan lapisan fungsi.

 Pembuatan diagram arsitektur menggunakan alat bantu digital membantu memperjelas hubungan antara user, system call, kernel, hardware. Dan memperkuat pemahaman tentang cara kerja sistem operasi dalam arsitektur komputer. 
=======
Monolithic kernel adalah arsitektur sistem operasi di mana semua layanan inti OS, seperti manajemen memori, penjadwalan proses, dan manajemen perangkat keras, berjalan dalam satu ruang alamat (satu program besar)bagian dapat menyebabkan crash seluruh.Mikrokernel adalah jenis kernel sistem operasi yang hanya berisi fungsionalitas inti minimal, seperti manajemen memori dan komunikasi antarproses (IPC), sementara layanan lainnya (seperti driver perangkat dan sistem berkas) berjalan di ruang pengguna Arsitektur berlapis (layered architecture) adalah pola desain perangkat lunak yang membagi aplikasi menjadi beberapa lapisan terpisah, di mana setiap lapisan memiliki tanggung jawab tertentu dan hanya berinteraksi dengan lapisan di bawahnya. sebagai server terpisah.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
- makna hasil percobaan antara lain menganalisis kelebihan dan kekurangan setiap os, mengidentifikasi suatu masalah pada os  .  
- arsitektur os adalah struktur dasar,kernel adalah inti yang menghubungkan software dan hardware, sistem call adalah suatu mekanisme yang dapat digunakan aplikasi untuk meminta layanan dari kernel, dan sementara itu aplikasi tidak dapat langsung mengakses hardware ataupun sebaliknya .  
- Apa perbedaan hasil di lingkungan OS berbeda (Linux vs Windows)? linux lebih efisiens tetapi windows mempermudah hardware melalui sistem komersialnya  

---

## kesimpulan yang saya ambil adalah
perbedaan sistem operasi seperti kernel, sistem call dan arsitektur os sangat berbeda satu sama lain,selain itu saya  jadi tahu bagaimana cara bekerja sistem operasi, dan mengetahui sisi linux aaupun windows, saya lebih mudah mengidentifikasi software bagaimana dan juga hardware .
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======
1.	Berdasarkan hasil percobaan, perintah-perintah seperti uname -a, whoami, lsmod, dan dmesg pada Linux berfungsi untuk menampilkan informasi yang berhubungan langsung dengan kernel, sistem operasi, pengguna, serta perangkat keras. Ada perintah yang bisa digunakan pada kedua sistem operasi dan ada yang tidak
2.	Linux dan Windows menunjukan kedua sistem operasi memiliki fungsi yang serupa, tetapi cara kerja dan perintahnya berbeda, seperti ver, driverquery pada Windows dan uname -a, lsomd pada Linux
3.	Linux lebih terbuka dan berorientasi pada kernel (akses langsung ke informasi sistem), sedangkan Windows menggunakan pendekatan yang lebih tertutup. Linux lebih terfokus pada fleksibilitas sedangkan Windows lebih pada kemudahan penggunaan.
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

## Quiz
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
1. Sebutkan tiga fungsi utama sistem operasi.
2. 
   **Jawaban:** Manajemen proses, Manajemen memori, & Manajemen I/O.  
3. Jelaskan perbedaan antara _kernel mode_ dan _user mode_.
   
   **Jawaban:** Perbedaan antara _kernel mode_ dan _user mode_ terletak pada tingkat hak akses terhadap sumber daya sistem.Pada _kernel mode_, memiliki akses penuh, memungkinkan sistem operasi menjalankn instruksi yang bersifat istimewa yaitu mengelola memori serta berinteraksi langsung dengan perangkat keras.Sebaliknya _user mode_ memiliki program aplikasi berjalan dengan hak akses terbatas dan tidak dapat langsung mengakses perangkat keras atau menjalankan instruksi istimewa (semua operasi semacam itu harus dilakukan melalui system call ke sistem operasi.
4. Sebutkan contoh OS dengan arsitektur monolithic dan microkernel.
   
   **Jawaban:** 1.Monolithic Kernel : UNIX, LINUX, MS-DOS, & BSD.  
                2.Microkernel : MINIX & MACH.
=======
1. [ Sebutkan tiga fungsi utama sistem operasi]
   **Jawaban:** 
   Tiga fungsi utama sistem operasi adalah Manajemen Sumber Daya, Manajemen Proses dan File, serta Penyediaan Antarmuka Pengguna
2. [Jelaskan perbedaan antara kernel mode dan user mode]  
   **Jawaban:** 
   Perbedaan utama antara mode kernel dan mode pengguna adalah tingkat akses dan hak istimewa terhadap sumber daya sistem. 
3. [Sebutkan contoh OS dengan arsitektur monolithic dan microkernel]  
=======
1. [Sebutkan tiga fungsi utama sistem operasi]  
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a
   **Jawaban:**  
   Contoh OS arsitektur monolitik antara lain adalah Linux dan varian Unix tradisional (seperti BSD), sementara contoh OS dengan arsitektur mikrokernel (monokernel) adalah GNU Hurd
=======
1. [jelaskan fungsi utama sistem operasi]  
   **Jawaban: memanajemen proses,menjadi perantara antara software dan hardware,menjalankan dan mengatur aplikasi.**  
2. [jelaskan perbedaan antara kernel mode dan user mode]  
   **Jawaban: user mode bisa menyentuh os tetapi hanya bisa menjalankan aplikasi yang terlihat dengan terbatas sedangkan kernel mode mempunyai hak penuh atas os yang tak terlihat oleh user maupun yang terlihat oleh user,dan mempunyai hak istimewa terhadap hardware**  
3. [sebutkan contoh OS dengan arsitektur monolithic dan microcernel]  
   **Jawaban:monolithic antara lain, Linux, dan Windows, sedangkan Mikrokernel, QNX, dan minix**  
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

<<<<<<< HEAD
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
      (1) Sistem operasi mengelola proses-proses yang berjalan di komputer

      (2) Sistem operasi mengelola memori komputer untuk alokasi dan penggunaan yang efisien

      (3) Sistem operasi mengelola perangkat input output (I/O) seperti keyboard, disk, printer

2. [Jelaskan perbedaan antara kernel mode dan user mode]  
   **Jawaban:** 
   Kernel mode punya akses lebih tinggi disbanding user mode. Tetapi User mode lebih aman digunakan, sedangkan kernel mode lebih rentan jika ada bug. Aplikasi user mode menggunakan system call untuk meminta layanan kernel

3. [Sebutkan contoh OS dengan arsitektur monolithic dan mickrokenel]  
   **Jawaban:**  
   Monolithic Kernel ( Contohnya : Linux, Solaris, Windows)

   MicroKernel (Contohnya :  QNX, Mach, Minix)
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a
---

## Refleksi Diri
Tuliskan secara singkat:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
- Apa bagian yang paling menantang minggu ini?

  Bagian yang paling menantang pada minggu ini yaitu cara menyelesaikan tugas dan pengunggahan tugas.   
- Bagaimana cara Anda mengatasinya?

   Dengan cara mencari dan melihat tutorial serta bertanya kepada teman.
=======
- Apa bagian yang paling menantang minggu ini? 
semua menantang leptop rusak 
- Bagaimana cara Anda mengatasinya?  
bersabar
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
- Apa bagian yang paling menantang minggu ini? cara pengerjaan dengan membuat code,kesalahan update didashboard github,membaca referensi dari beberapa sumber 
- Bagaimana cara Anda mengatasinya? melihat tutorial diaplikasi yt, mengulang kembali tugas (revisi), memilih 1 buku yang mengacu pada materi kali ini.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======
- Apa bagian yang paling menantang minggu ini? 

   Pertama tentunya baru mengenal Github, Visual Code, Ubuntu, Draw id. Saat mengkoneksikan github dan visual code sedikit bingung karena setiap tutorial yang ada di youtube mempunyai caranya masing masing jadi sempat beberapa kali login dan logout.  

- Bagaimana cara Anda mengatasinya?  
Belajar bersama sama teman-teman dan melihat tutorial dari youtube
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

---

**Credit:**  
_Template laporan praktikum Sistem Operasi (SO-202501) – Universitas Putra Bangsa_
