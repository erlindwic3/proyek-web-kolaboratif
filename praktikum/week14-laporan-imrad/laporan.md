
# Laporan Praktikum Minggu 14
Topik: Penyusunan Laporan Praktikum Format IMRAD "Scheduling (FCFS/SJF)"
=======
# Laporan Praktikum Minggu [14]
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
=======
# Tugas Praktikum Minggu 14  
Topik: Penyusunan Laporan Praktikum Format IMRAD
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a

Topik: Penyusunan Laporan Praktikum Format IMRAD "Scheduling (FCFS/SJF)"
---

## Identitas
<<<<<<< HEAD
<<<<<<< HEAD
- **Nama**  : Aster Rifani  
- **NIM**   : 250202915  
- **Kelas** : 1IKRB

---

## Pendahuluan (Introduction)
### A. Latar Belakang
   Dalam sistem operasi modern,banyak proses yang dapat berada dalam keadaan siap untuk dieksekusi secara bersamaan.Kondisi ini menuntut adanya menkanisme pengaturan yang tepat agar pengguna CPU menjadi efisien dan adil.

   Penjadwalan CPU berperan penting untuk menentukan urutan eksekusi proses sehingga kinerja sistem dapat dioptimalkan, khususnya dalam meminimalkan *waiting time* dan *turnaround time*.

   Algoritma penjadwalan CPU memiliki karakteristik yang berbeda-beda.Algoritma **First Come First Served (FCFS)** merupakan algoritma yang paling mudah dan sederhana untuk diimplementasikan, namun sering kali kurang efisien ketika terdapat proses dengan waktu eksekusi yang panjang. Sebaliknya, Algoritma **Shortest Job First (SJF)** mampu meningkatkan efisiensi dengan mengeksekusi proses berdurasi pendek mampu meningkatkan efisiensi dengan mengeksekusi proses berdurasi pendek terlebih dahulu, tetapi berpotensi menimbulkan masalah *starvation* pada proses berdurasi panjang.

   Oleh karena itu, diperlukan pemahaman dan pengujian langsung terhadap kedua algoritma tersebut agar dapat diketahui perbedaan kinerja serta kondisi penggunaan yang paling sesuai.Praktikum ini dilakukan untuk membandingkan algoritma FCFS dan SJF melalui perhitungan dan analisis parameter kinerja sistem.
### B. Tujuan
Tujuan dari praktikum ini adalah:
   > Mempelajari konsep dasar penjadwalan CPU menggunakan algoritma FCFS dan SJF.

   > Menghitung nilai *waiting time* dan *turnaround time* pada masing-masing algoritma.

   > Membadingkan kinerja algoritma FCFS dan SJF.

   > Mengetahui kelebihan dan kekurangan masing-masing algoritma penjadwalan.

---

## Metode (Methods)
### A. Data Proses
   | Proses | Burst Time | Arrival Time |
   |--------|------------|--------------|
   |   P1   |      6     |       0      |
   |   P2   |      8     |       1      |
   |   P3   |      7     |       2      |
   |   P4   |      3     |       3      |
### B. Langkah Eksperimen
   1. Mengurutkan proses sesuai dengan aturan algoritma :
      - FCFS : berdasarkan *arrival time*.
      - SJF : berdasarkan *burst time* terpendek.
   2. Menghitung :
      - Waiting Time (WT) = waktu mulai eksekusi - arrival time
      - Turnaround Time (TAT) = WT + burst time
   3. Menghitung nilai rata-rata WT dan TAT.
   4. Membuat tabel hasil dan Gantt Chart.

---

## Hasil (Results)
### A. Hasil FCFS
![Screenshot hasil](screenshots/tabel%20FCFS%20.png)
   - Rata-rata Waiting Time (WT): **8,75**
   - Rata-rata Turnaround Time (TAT): **14,75**
   - Gantt Chart FCFS :
   ```
    |  P1  |     P2     |    P3    | P4 |
   0       6            14         21   24
   ```
### B. Hasil SJF
![Screenshot hasil](screenshots/tabel%20SJF.png)
   - Rata-rata Waiting Time (WT): **6,25**
   - Rata-rata Turnaround Time (TAT): **12,25**
### C. Perbandingan antara **SJF** dan **FCFS*
![Screenshot hasil](screenshots/tabel%20FCFS%20vs%20SJF.png)
 | **Algoritma** | **Avg Waiting Time** | **Avg Turnaround Time** | **Kelebihan** | **Kekurangan** |
   |---|---|---|---|---|
   | FCFS | 8,75 |14,75| Sederhana dan mudah diterapkan | Tidak efisien untuk proses panjang |
   | SJF | 6,25 | 12,25 | Optimal untuk job pendek | Menyebabkan *starvation* pada job panjang |
=======
# Laporan Praktikum Minggu [14]
Topik: ["Penyusunan Laporan Praktikum Format IMRAD"]

---

## Identitas 
- **Nama**  : [Lutfi Khoerunnisa]  
- **NIM**   : [250202947]  
- **Kelas** : [1IKRB]

---

## 1. Pendahuluan (Introduction)
## 1.1 Latar Belakang
   Manajemen memori merupakan aspek krusial dalam sistem operasi yang berfungsi untuk mengelola memori utama agar dapat digunakan secara optimal oleh berbagai proses yang berjalan. Dalam sistem memori virtual, keterbatasan fisik RAM sering kali menjadi tantangan ketika banyak proses meminta ruang alokasi secara bersamaan, sebagaimana terlihat pada fenomena alokasi memori bertahap dalam pengujian kontainer. Untuk mengatasi hal ini, sistem operasi menggunakan teknik paging dan mekanisme page replacement.

   Algoritma page replacement diperlukan ketika terjadi page fault, yaitu kondisi di mana data yang dibutuhkan tidak ditemukan di RAM sehingga sistem harus memilih satu halaman (page) untuk dikeluarkan dan diganti dengan halaman baru. Tanpa pengelolaan dan batasan yang tepat, konsumsi memori yang tidak terkendali dapat menyebabkan degradasi performa sistem secara keseluruhan. Dua metode yang paling umum digunakan adalah First-In-First-Out (FIFO) yang bekerja berdasarkan urutan waktu kedatangan, dan Least Recently Used (LRU) yang bekerja berdasarkan riwayat penggunaan terakhir halaman tersebut.

## 1.2 Rumusan Masalah
1. Antara algoritma FIFO dan LRU, manakah yang lebih baik dalam mengelola memori agar tidak terjadi banyak kesalahan (fault)?
2. Apa yang akan terjadi pada sistem jika sebuah aplikasi dibiarkan memakai RAM tanpa batasan?
3. Apakah pemberian batas CPU dan RAM pada Docker benar-benar efektif melindungi komputer dari beban berlebih?

### 1.3 Tujuan
1. Mengimplementasikan algoritma page replacement FIFO dalam program.
2. Mengimplementasikan algoritma page replacement LRU dalam program.
3. Menjalankan simulasi page replacement dengan dataset tertentu.
4. Membandingkan performa FIFO dan LRU berdasarkan jumlah page fault.
5. Menyajikan hasil simulasi dalam laporan yang sistematis.

---

## 2. Metode (Methods)
## 2.1 Lingkungan Pengujian

Pengujian dilakukan dengan lingkungan sebagai berikut : 

   - Sistem Operasi : Windows
   - Metode Pengujian : Simulasi Manajemen Memori - Page Replacement (FIFO 7 LRU)
   - Jumlah Frame Memori : 3 Frame
   - Dataset : Isi String Tidak Selalu Tetap Tergantung Algoritma
   - Dokumentasi : Screenshot Hasil Eksekusi

Lingkungan pengujian dibuat seragam untuk memastikan hasil yang diperoleh bersifat objektif dan dapat dibandingkan.

## 2.2 Skenario Pengujian
Tujuannya adalah untuk membandingkan efisiensi dua metode penggantian halaman data dalam memori yang terbatas.

   1. Menyiapkan Dataset Yang Berisi Reference String Berikut :

      ``` 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2```

   2. Menentukan Jumlah Frame Yang Terdiri Dari 3 Frame.
   3. Menjalankan Simulasi Penggantian Halaman Menggunakan Algoritma FIFO Catat Setiap Page Hit Dan Page Fault.
Hitung Total Page Fault.
   4. Menjalankan Simulasi Penggantian Halaman Menggunakan Algoritma LRU Catat Setiap Page Hit Dan Page Fault.
Hitung total page fault.
   5. Menjalankan Program Untuk FIFO dan LRU Secara Konsisten.
   6. Menghitung Hasil FIFO Dan LRU Tersebut.

## 2.3 Variabel Pengukuran
Variabel yang digunakan dalam praktikum ini meliputi:
   - Variabel Bebas (Independent): Jenis algoritma yang digunakan (FIFO dan LRU)
   - Variabel Terikat (Dependent): Jumlah Page Fault (kegagalan memori) dan jumlah Page Hit (keberhasilan memori).
   - Variabel Kontrol: Reference String (Deret data) , Kapasitas Memori

## 2.4 Langkah Eksperimen
1. Menyiapkan reference string dan 3 frame memori.

   ```7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2```

2. Menjalankan simulasi algoritma FIFO kemudian catat dan hitung page fault.
3. Menghitung total page fault FIFO.
4. Menjalankan simulasi algoritma LRU dengan dataset yang sama.
5. Mencatat page hit dan page fault pada algoritma LRU.
6. Membandingkan hasil kedua algoritma.
7. Menyimpan bukti hasil eksekusi dalam bentuk screenshot.
8. Commit & Push
---

## 3. Hasil (Result)
## 3.1 Hasil Eksekusi Program
1. Algoritma Fifo
![Screenshot hasil](./screenshots/FIFO%20Page.png)

2. Algoritma LRU 
![Screenshot hasil](./screenshots/LRU%20Page.png)

## 3.2 Tabel Perbandingan Hasil 
| Algoritma | Jumlah Page Fault | Keterangan |
| :--- | :---: | ---: |
|1. | 10  | Mengganti halaman berdasarkan urutan waktu masuk pertama kali. |
|2.  | 9 |  Mengganti halaman yang paling lama tidak digunakan berdasarkan riwayat akses|

## 3.3 Temuan Hasil Tabel
Berdasarkan hasil simulasi, algoritma LRU terbukti lebih efisien dengan mencatat 9 Page Fault, sedangkan FIFO mencatat 10 Page Fault. Hal ini disebabkan karena FIFO mengganti halaman hanya berdasarkan urutan waktu masuk tanpa melihat riwayat pemakaian. Sebaliknya, LRU mampu menghasilkan 4 Page Hit karena mempertahankan data yang baru saja diakses, unggul satu poin dibandingkan FIFO yang hanya menghasilkan 3 Page Hit. Temuan ini menunjukkan bahwa LRU lebih optimal dalam meminimalkan kesalahan memori pada kapasitas 3 frame.



## 4. Pembahasan (Discussion)
## 4.1 Interpretasi Hasil
Berdasarkan hasil simulasi dengan 3 frame memori, algoritma LRU terbukti lebih efisien daripada FIFO. Algoritma FIFO mencatat 10 page fault karena mengganti halaman hanya berdasarkan urutan waktu masuk tanpa melihat riwayat pemakaian. Sebaliknya, LRU mampu menekan kegagalan menjadi 9 page fault dengan mempertahankan data yang baru saja diakses, sehingga menghasilkan 4 page hit atau satu poin lebih baik daripada FIFO. Selisih ini membuktikan bahwa LRU lebih optimal dalam memanfaatkan kapasitas memori yang terbatas untuk dataset tersebut.

## 4.2 Keterbatasan 
Eksperimen ini memiliki keterbatasan pada jumlah kapasitas memori (frame) yang hanya dipatok sebanyak 3 slot, sehingga efisiensi algoritma belum teruji pada skala memori yang lebih besar. Selain itu, panjang data input hanya terbatas pada 13 angka, yang menyebabkan perbedaan performa antara FIFO dan LRU hanya terpaut 1 angka fault (10 vs 9). Pada sisi pengujian Docker, pembatasan sumber daya masih berada di zona aman karena aplikasi hanya menggunakan 8.00% CPU dari batas 50% yang diberikan, sehingga perilaku sistem saat terjadi lonjakan beban ekstrem belum dapat teramati secara penuh melalui data ini.

## 4.3 Perbandingan Teori
- Prinsip Kerja dan Efisiensi: Secara teori, FIFO hanya mengganti halaman berdasarkan urutan waktu masuk sehingga menghasilkan 10 page fault, sedangkan LRU lebih cerdas dengan memantau riwayat akses yang terbukti lebih efisien dengan hanya 9 page fault.

- Akurasi Data (Hit Rate): FIFO memiliki kelemahan karena sering menghapus data yang sebenarnya masih diperlukan sehingga hanya mendapat 3 hit, sementara LRU mampu mempertahankan data aktif yang menghasilkan 4 hit dan membuktikan bahwa pendekatan berbasis riwayat penggunaan lebih optimal untuk memori terbatas.

---

## 5. Closing (Penutupan)
## 5.1 Kesimpulan 
- Efisiensi Algoritma: Algoritma LRU terbukti lebih unggul dengan mencatatkan 9 Page Fault dan 4 Page Hit, mengalahkan FIFO yang mencatatkan 10 Page Fault dan 3 Page Hit pada dataset yang sama.

- Akurasi Mekanisme: Keunggulan LRU terletak pada kemampuannya mempertahankan data yang sering diakses berdasarkan riwayat penggunaan, sementara FIFO memiliki kelemahan karena membuang data (seperti Page 0) hanya berdasarkan urutan waktu masuk.

- Stabilitas Sistem: Pengujian limitasi sumber daya pada Docker menunjukkan sistem berjalan sangat stabil dengan beban CPU hanya 8.00% dan RAM 32.57 MiB, yang membuktikan bahwa batasan sumber daya berhasil menjaga performa tetap di bawah limit yang ditentukan.

## 5.2 Saran
- Menambah Variasi Parameter
- Melakukan Stress Test
- Eksperimen Algoritma Lain

## 5.3 Quiz
1. [Mengapa format IMRAD membantu membuat laporan praktikum lebih ilmiah dan mudah dievaluasi?]
**Jawaban:** Format IMRAD (Introduction, Methods, Results, and Discussion) membantu membuat laporan praktikum lebih ilmiah dan mudah dievaluasi karena memberikan struktur logis yang konsisten untuk menyampaikan alur pikir penelitian.
2. [Apa perbedaan antara bagian Hasil dan Pembahasan?]
**Jawaban:** Bagian Hasil hanya menyajikan data objektif apa adanya, seperti temuan 9 page fault pada LRU dan 10 page fault pada FIFO. Sementara itu, Pembahasan menjelaskan alasan di balik angka tersebut, yakni mengapa LRU lebih efisien karena mempertimbangkan riwayat akses data dibandingkan FIFO yang hanya berdasarkan urutan waktu masuk. Singkatnya, Hasil menyajikan fakta angka, sedangkan Pembahasan memberikan analisis teoritisnya.
3. [Mengapa sitasi dan daftar pustaka penting, bahkan untuk laporan praktikum?]
**Jawaban:** Sitasi dan daftar pustaka sangat penting karena berfungsi sebagai bukti orisinalitas dan bentuk penghargaan terhadap teori yang digunakan, seperti algoritma FIFO dan LRU yang bukan merupakan temuan pribadi praktikan. Secara teknis, sitasi memperkuat kredibilitas laporan dengan menunjukkan bahwa analisis Anda didasarkan pada landasan ilmiah yang valid, bukan sekadar asumsi. Selain itu, daftar pustaka memudahkan pembaca atau dosen untuk melacak sumber asli jika ingin memverifikasi data atau memperdalam materi manajemen memori yang dibahas.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---
## Pembahasan (Discussion)
   Berdasarkan hasil percobaan, algoritma SJF menghasilkan nilai rata-rata *waiting time* dan *turnaround time* yang lebih kecil dibandingkan FCFS. Hal ini terjadi karena SJF memprioritaskan proses dengan *burst time* pendek sehingga antrean proses dapat diselesaikan lebih cepat.

<<<<<<< HEAD
   Namun, SJF memiliki kelemahan berupa potensi *starvation* pada proses dengan waktu eksekusi panjang, terutama jika sistem terus menerima proses pendek. Sebaliknya, FCFS lebih menjamin keadilan karena setiap proses dijalankan sesuai urutan kedatangan, meskipun efisiensinya lebih rendah.
=======
- **Nama**  : Ani Ngismatul Hawa  
- **NIM**   : 250202914  
- **Kelas** : 1IKRB

---
## Pendahuluan
### A. Latar Belakang
CPU scheduling merupakan mekanisme penting dalam sistem operasi untuk mengatur urutan eksekusi proses yang berjalan pada CPU. Penjadwalan yang tepat berpengaruh langsung terhadap efisiensi sistem, khususnya pada waktu tunggu dan waktu penyelesaian proses. Oleh karena itu, pemilihan algoritma penjadwalan menjadi hal yang krusial.

Algoritma First Come First Served (FCFS) dan Shortest Job First (SJF) merupakan dua algoritma dasar dalam penjadwalan CPU. FCFS mengeksekusi proses berdasarkan urutan kedatangan, sedangkan SJF memprioritaskan proses dengan waktu eksekusi terpendek. Melalui praktikum ini, dilakukan perhitungan dan perbandingan kedua algoritma tersebut untuk memahami perbedaan kinerja serta kelebihan dan kekurangan masing-masing dalam pengelolaan proses CPU.

### B. Tujuan
> Menghitung waiting time dan turnaround time untuk algoritma FCFS dan SJF.

> Menyajikan hasil perhitungan dalam tabel yang rapi dan mudah dibaca.

> Membandingkan performa FCFS dan SJF berdasarkan hasil analisis.

>Menjelaskan kelebihan dan kekurangan masing-masing algoritma.

> Menyimpulkan kapan algoritma FCFS atau SJF lebih sesuai digunakan.

---
## Metode
### A. Data Proses

|Proses|	Burst Time|	Arrival Time|
|----|------|-----|
|P1|	6|	0|
|P2|	8|	1|
|P3|	7|	2|
|P4|	3|	3|

---
### B. Langkah Eksperimen
1. Menyiapkan data proses yang terdiri dari Process ID, Arrival Time, dan Burst Time.

2. Menentukan urutan eksekusi proses menggunakan algoritma FCFS berdasarkan waktu kedatangan.

3. Menghitung waiting time dan turnaround time untuk setiap proses pada algoritma FCFS.

4. Menentukan urutan eksekusi proses menggunakan algoritma SJF berdasarkan burst time terpendek.

5. Menghitung waiting time dan turnaround time untuk setiap proses pada algoritma SJF.

6. Membandingkan hasil perhitungan FCFS dan SJF dalam bentuk tabel untuk menganalisis perbedaan kinerja.
---

## Hasil
### A. Hasil FCFS
![Screenshot hasil](./screenshots/FCFS.png)

### B. Hasil SJF
![Screenshot hasil](./screenshots/SJF.png)

### C. Hasil Perbandingan *FCFS* dan *SJF* 
![Screenshot hasil](./screenshots/Hasil.png)

### D. Tabel Analisis Perbandingan

|Algoritma	|Avg Waiting Time	|Avg Turnaround Time	|Kelebihan	|Kekurangan|
|-----|-----|----|-----|----|
|FCFS|	8,75|	14,75|Sederhana dan mudah diterapkan|Tidak efisien untuk proses panjang|
|SJF|	6,25|	12,25|Optimal untuk job pendek|Menyebabkan starvation pada job panjang|

---

## Pembahasan
Hasil eksperimen menunjukkan bahwa algoritma FCFS mengeksekusi proses berdasarkan urutan kedatangan sehingga proses dengan waktu eksekusi panjang dapat meningkatkan waktu tunggu proses lain. Sebaliknya, algoritma SJF lebih efisien karena memprioritaskan proses dengan burst time terpendek, yang berdampak pada rata-rata waiting time dan turnaround time yang lebih kecil. Namun, SJF berpotensi menyebabkan proses berdurasi panjang harus menunggu lebih lama, sehingga pemilihan algoritma penjadwalan perlu disesuaikan dengan kondisi dan kebutuhan sistem.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Kesimpulan
<<<<<<< HEAD
   1. Algoritma SJF lebih dibandingkan dengan Algoritma FCFS berdasarkan nilai rata-rata WT dan TAT.
   2. FCFS lebih unggul dalam kesederhanaan dan keadilan.
   3. Pemilihan algoritma harus disesuaikan dengan kebutuhan sistem.
=======
1. Penjadwalan CPU berperan penting dalam menentukan efisiensi eksekusi proses pada sistem operasi.

2. FCFS mengutamakan urutan kedatangan proses, namun kurang optimal ketika proses memiliki waktu eksekusi yang bervariasi.

3. SJF lebih efektif dalam menekan waktu tunggu proses, meskipun berisiko menunda proses berdurasi panjang.

---
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Quiz
<<<<<<< HEAD
1. Mengapa format IMRAD membantu membuat laporan praktikum lebih ilmiah dan mudah dievaluasi? 
   **Jawaban:**  Format IMRAD menyusun laporan secara sistematis mulai dari latar belakang, metode, hasil, hingga analisis. Struktur ini memudahkan pembaca dan dosen untuk memahami tujuan praktikum, menilai ketepatan metode, serta mengevaluasi hasil dan pembahasan secara objektif dan konsisten.
2. Apa perbedaan antara bagian **Hasil** dan **Pembahasan**? 
   **Jawaban:**  Bagian Hasil menyajikan data atau temuan praktikum secara objektif dalam bentuk tabel, grafik, atau perhitungan, tanpa interpretasi. Sedangkan Pembahasan berisi analisis dan interpretasi hasil, penjelasan alasan terjadinya hasil tersebut, serta perbandingan dengan teori atau ekspektasi.
3. Mengapa sitasi dan daftar pustaka penting, bahkan untuk laporan praktikum?
   **Jawaban:**  Sitasi dan daftar pustaka penting untuk menunjukkan bahwa laporan didukung oleh sumber ilmiah yang valid, menghindari plagiarisme, serta meningkatkan kredibilitas dan keabsahan laporan praktikum.

---
## Daftar Pustaka
   Silberschatz, A., Galvin, P., Gagne, G. Operating System Concepts, 10th Ed.

   Tanenbaum, A. Modern Operating Systems, 4th Ed.
=======
## Daftar Pustaka
1. Silberschatz, A., Galvin, P. B., & Gagne, G. (2018). Operating System Concepts (10th ed.). Wiley.
2. Merkel, D. (2014). Docker: Lightweight Linux Containers for Consistent Development and Deployment. Linux Journal, 2014(239).
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
1. Mengapa format IMRAD membantu membuat laporan praktikum lebih ilmiah dan mudah dievaluasi?  
   **Jawaban:** 

   Format IMRAD membuat laporan lebih ilmiah karena menyajikan penelitian secara terstruktur dari tujuan, metode, hasil, hingga pembahasan, sehingga mudah dipahami, direplikasi, dan dievaluasi.

2. Apa perbedaan antara bagian Hasil dan Pembahasan? 
   **Jawaban:**  

   Bagian **Hasil** menyajikan data atau temuan eksperimen secara objektif, sedangkan **Pembahasan** menjelaskan, menganalisis, dan menafsirkan hasil tersebut.

3. Mengapa sitasi dan daftar pustaka penting, bahkan untuk laporan praktikum? 
   **Jawaban:**  
   Sitasi dan daftar pustaka penting untuk menghargai sumber asli, menghindari plagiarisme, dan memperkuat keabsahan laporan praktikum dengan dasar teori yang jelas.

>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---
## Daftar Pustaka
1. Silberschatz, A., Galvin, P. B., & Gagne, G. (2018). Operating System Concepts (10th ed.). Wiley.

2. Tanenbaum, A. S., & Bos, H. (2015). Modern Operating Systems (4th ed.). Pearson Education.

3. Arpaci-Dusseau, R. H., & Arpaci-Dusseau, A. C. (2018). Operating Systems: Three Easy Pieces. Arpaci-Dusseau Books.

---
## Refleksi Diri
Tuliskan secara singkat:
- Apa bagian yang paling menantang minggu ini? Membuat Laporan Imrad
- Bagaimana cara Anda mengatasinya?  Mencoba Dan Terus Mencoba

---

**Credit:**  
_Template laporan praktikum Sistem Operasi (SO-202501) – Universitas Putra Bangsa_
=======
- **Nama**  : [Dyah Retno Wulandari]  
- **NIM**   : [250202934]  
- **Kelas** : [1IKRB]

## A. Deskripsi Singkat
Pada pertemuan ini, mahasiswa menyusun **laporan praktikum ilmiah** secara sistematis menggunakan format **IMRAD** (*Introduction, Methods, Results, and Discussion*) yang ditutup dengan **Kesimpulan**.

Laporan IMRAD digunakan untuk merangkum praktikum-praktikum sebelumnya (mis. scheduling, page replacement, deadlock detection, VM/Docker) agar hasil uji dapat dipahami, direplikasi, dan dievaluasi secara akademik.

---

## B. Tujuan
Setelah menyelesaikan tugas ini, mahasiswa mampu:
1. Menyusun laporan praktikum dengan struktur ilmiah (Pendahuluan–Metode–Hasil–Pembahasan–Kesimpulan).
2. Menyajikan hasil uji dalam bentuk tabel dan/atau grafik yang jelas.
3. Menuliskan analisis hasil dengan argumentasi yang logis.
4. Menyusun sitasi dan daftar pustaka dengan format yang konsisten.
5. Mengunggah draft laporan ke repositori dengan rapi dan tepat waktu.

---

## C. Ketentuan Teknis
- Laporan ditulis dalam `Markdown` pada file `laporan.md`.
- Topik laporan boleh memilih salah satu dari praktikum sebelumnya:
  - Scheduling (FCFS/SJF)
  - Page Replacement (FIFO/LRU)
  - Deadlock Detection
  - VM/Docker (resource management)
- Wajib menyertakan minimal:
  - 1 tabel hasil (atau lebih)
  - 1 gambar (screenshot, diagram, atau grafik)
  - sitasi dan daftar pustaka

Struktur folder (sesuaikan dengan template repo):
```
praktikum/week14-laporan-imrad/
├─ code/
│  └─ (opsional) file kode/data pendukung
├─ screenshots/
│  ├─ (wajib) bukti hasil uji
│  └─ (opsional) grafik/diagram
└─ laporan.md
```

---

## D. Langkah Pengerjaan
1. **Menentukan Topik Laporan**

   Pilih 1 topik dari praktikum sebelumnya (mis. Minggu 9/10/11/13) dan tetapkan tujuan eksperimen yang ingin disampaikan.

2. **Menyiapkan Bahan**

   - Kode/program yang digunakan.
   - Dataset/parameter uji (jika ada).
   - Bukti hasil eksekusi (screenshot) dan/atau grafik.

3. **Menulis Laporan dengan Struktur IMRAD**

   Tulis `praktikum/week14-laporan-imrad/laporan.md` dengan struktur minimal berikut:
   - **Pendahuluan (Introduction):** latar belakang, rumusan masalah/tujuan.
   - **Metode (Methods):** lingkungan uji, langkah eksperimen, parameter/dataset, cara pengukuran.
   - **Hasil (Results):** tabel/grafik hasil uji, ringkasan temuan.
   - **Pembahasan (Discussion):** interpretasi hasil, keterbatasan, perbandingan teori/ekspektasi.
   - **Kesimpulan:** 2–4 poin ringkas menjawab tujuan.

4. **Menyajikan Tabel/Grafik**

   - Tabel harus diberi judul/keterangan singkat.
   - Jika menggunakan grafik: jelaskan sumbu dan arti grafik.

5. **Sitasi dan Daftar Pustaka**

   - Cantumkan referensi minimal 2 sumber.
   - Gunakan format konsisten (mis. daftar bernomor).

6. **Commit & Push Draft**

   ```bash
   git add .
   git commit -m "Minggu 14 - Draft Laporan IMRAD"
   git push origin main
   ```
---

# Laporan Praktikum Scheduling CPU (FCFS & SJF)
## 1. Pendahuluan

   Scheduling CPU adalah mekanisme sistem operasi untuk menentukan urutan eksekusi proses yang berada dalam keadaan siap (ready). Penjadwalan yang baik bertujuan untuk meningkatkan efisiensi CPU, memperkecil waktu tunggu, dan meningkatkan throughput sistem.
   
   Pada laporan ini dibahas dua algoritma penjadwalan CPU, yaitu First Come First Serve (FCFS) dan Shortest Job First (SJF), beserta perbandingan hasil kinerjanya.

## 2. Tujuan Praktikum

Tujuan dari praktikum ini adalah:

•	Memahami konsep dasar scheduling CPU.

•	Mengimplementasikan algoritma FCFS dan SJF.

•	Menganalisis perbedaan performa berdasarkan waktu tunggu dan waktu penyelesaian.

## 3. Dasar Teori
**3.1 First Come First Serve (FCFS)**

   FCFS adalah algoritma penjadwalan non-preemptive di mana proses dieksekusi berdasarkan urutan kedatangan. Proses yang datang lebih awal akan dieksekusi terlebih dahulu.

   *Kelebihan:*

   •	Implementasi sederhana

   •	Tidak menyebabkan starvation

   *Kekurangan:*

   •	Rata-rata waktu tunggu bisa besar

**3.2 Shortest Job First (SJF)**

SJF adalah algoritma penjadwalan yang mengeksekusi proses dengan burst time paling pendek terlebih dahulu.

Kelebihan:

•	Rata-rata waktu tunggu minimum

Kekurangan:

•	Berpotensi menyebabkan starvation

•	Sulit memprediksi burst time

# 4. Data dan Metodologi**

**4.1 Dataset Proses**

Contoh data proses yang digunakan dalam praktikum:

 | Proses | Arrival Time | Burst Time | 
   |:--:|:--:|:--:| 
   | P1 | 0 | 8 |
   | P2 | 1 | 4 |
   | P3 | 2 | 9 |
   | P4 | 3 | 5 |

**4.2 Metode Pengujian**

•	Menjalankan algoritma FCFS dan SJF menggunakan dataset di atas

•	Menghitung Waiting Time dan Turnaround Time

•	Membandingkan hasil kedua algoritma

# 5. Hasil dan Pembahasan
**5.1 Hasil Penjadwalan FCFS**

Gantt Chart:

       | P1 | P2 | P3 | P4 |
         0    8    12   21   26

Hasil perhitungan Tabel Manual

| Proses | Waiting Time | Turnaround Time|
   |:--:|:--:|:--:|
   | P1 | 0 | 8 |
   | P2 | 7 | 11 |
   | P3 | 10 | 19 |
   | P4 | 18 | 23 |
   Rata-rata Waiting Time FCFS = 8.75


Hasil perhitungan menggunakan bahasa pemograman Java
   
   ![Hasil Simulasi](screenshots/FCFS.png)

**5.2 Hasil Penjadwalan SJF**

Gantt Chart:

         | P1 | P2 | P4 | P3 |
         0    8    12   17   26

Hasil perhitungan SJF

| Proses | Waiting Time | Turnaround Time|
   |:--:|:--:|:--:|
   | P2 | 0 |4 |
   | P4 | 3 | 8  |
   | P1 | 8 | 16 |
   | P3 | 16 | 25 |

   Rata-rata Waiting Time SJF = 6.75

Hasil perhitungan menggunakan bahasa pemograman Java

   ![Hasil Simulasi](screenshots/SJF.png)

**5.3 Pembahasan**

   Pada algoritma FCFS, proses dieksekusi berdasarkan urutan waktu kedatangan. Proses P1 dieksekusi terlebih dahulu karena memiliki arrival time paling awal. Proses dengan burst time yang besar dapat menyebabkan proses lain menunggu lebih lama, sehingga waiting time pada P4 menjadi yang terbesar.

   Pada algoritma SJF non-preemptive, pemilihan proses dilakukan berdasarkan burst time paling kecil dari proses yang telah tiba. Hal ini menyebabkan rata-rata waiting time lebih kecil dibandingkan FCFS karena proses dengan durasi pendek diprioritaskan.

   Perbandingan hasil menunjukkan bahwa algoritma SJF lebih efisien dalam menurunkan waktu tunggu rata-rata, namun memiliki potensi starvation terhadap proses dengan burst time besar apabila proses pendek terus berdatangan.

## 6. Analisis
   Berdasarkan hasil penjadwalan, algoritma SJF non-preemptive menghasilkan rata-rata waiting time dan turnaround time yang lebih rendah dibandingkan FCFS. Hal ini menunjukkan bahwa SJF lebih efisien dalam meminimalkan waktu tunggu proses, terutama ketika terdapat variasi burst time yang signifikan.

   Namun, algoritma SJF memiliki kelemahan yaitu potensi terjadinya starvation pada proses dengan burst time besar. Proses seperti P3 memiliki waiting time yang cukup tinggi karena selalu kalah prioritas dibandingkan proses dengan burst time yang lebih kecil. Kondisi ini dapat menjadi masalah pada sistem nyata apabila proses pendek terus berdatangan.

   Sebaliknya, algoritma FCFS bersifat adil karena melayani proses berdasarkan urutan kedatangan, namun kurang efisien dalam hal waktu tunggu. Proses dengan burst time besar yang datang lebih awal dapat menyebabkan peningkatan waiting time pada proses berikutnya.
   

## 7. Kesimpulan
   •	FCFS mudah diimplementasikan tetapi kurang efisien dalam waktu tunggu.

   •	SJF lebih optimal dalam performa tetapi memiliki risiko starvation.

   •	Pemilihan algoritma scheduling harus disesuaikan dengan kebutuhan sistem.

## 8. Daftar Pustaka
1.	Silberschatz, A., Galvin, P. B., & Gagne, G. (2018). Operating System Concepts. Wiley.
2.	Tanenbaum, A. S., & Bos, H. (2015). Modern Operating Systems. Pearson.
3.	Stallings, W. (2018). Operating Systems: Internals and Design Principles. Pearson.


## E. Tugas & Quiz
### Tugas
1. Susun laporan praktikum format IMRAD di `praktikum/week14-laporan-imrad/laporan.md`.
2. Sertakan minimal 1 tabel dan 1 gambar (screenshot/grafik).
3. Sertakan sitasi dan daftar pustaka.
4. Pastikan struktur folder rapi sesuai ketentuan.

### Quiz
Jawab pada bagian **Quiz** di laporan:
1. Mengapa format IMRAD membantu membuat laporan praktikum lebih ilmiah dan mudah dievaluasi?
   Jawab: Format IMRAD (Introduction, Methods, Results, and Discussion) membantu karena struktur logis & standar ilmiah. Memisahkan fakta dan analisis, data disajikan apa adanya (Hasil), interpretasi ada di Pembahasan. MMeningkatkan reprodusibilitas, metode dijelaskan rinci sehingga praktikum bisa diulang.

2. Apa perbedaan antara bagian **Hasil** dan **Pembahasan**?

   | Hasil                 | Pembahasan                  |
   | --------------------- | --------------------------- |
   | Menyajikan data       | Menjelaskan makna data      |
   | Objektif (apa adanya) | Analitis & interpretatif    |
   | Tabel, grafik, output | Alasan, perbandingan, teori |
   | Tidak ada opini       | Boleh ada analisis          |

3. Mengapa sitasi dan daftar pustaka penting, bahkan untuk laporan praktikum?

   Jawab: Karena menunjukkan dasar teori yang valid (buku/jurnal, bukan opini pribadi), menghindari plagiarisme, meningkatkan kredibilitas ilmiah laporan, memudahkan verifikasi jika pembaca ingin mengecek sumber asli.

---

## F. Output yang Diharapkan
- File `praktikum/week14-laporan-imrad/laporan.md` berisi laporan format IMRAD.
- Bukti hasil uji (screenshot/grafik) tersimpan di `praktikum/week14-laporan-imrad/screenshots/`.
- (Opsional) kode/data pendukung di `praktikum/week14-laporan-imrad/code/`.
- Semua perubahan telah di-*commit* dan di-*push*.

---

## G. Referensi
1. Silberschatz, A., Galvin, P., Gagne, G. *Operating System Concepts*, 10th Ed.
2. Tanenbaum, A. *Modern Operating Systems*, 4th Ed.
3. OSTEP – referensi sesuai topik praktikum yang dipilih.
>>>>>>> befbaf963505fb5abbac60c1e3be2a0e33e0857a
