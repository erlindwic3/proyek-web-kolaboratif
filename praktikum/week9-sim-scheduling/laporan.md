
<<<<<<< HEAD
<<<<<<< HEAD
# Laporan Praktikum Minggu 9
Topik: Simulasi Algoritma Penjadwalan CPU
=======
# Laporan Praktikum Minggu [9]
Topik: ["Simulasi Algoritma Penjadwalan CPU"]
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
# Laporan Praktikum Minggu [9]
Topik: Simulasi Algoritma Penjadwalan CPU

>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Identitas
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
- **Nama**  : Ani Ngismatul Hawa
- **NIM**   : 250202914
- **Kelas** : 1IKRB
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Tujuan
<<<<<<< HEAD
<<<<<<< HEAD
> Membuat program simulasi algoritma penjadwalan FCFS dan/atau SJF.  

> Menjalankan program dengan dataset uji yang 
diberikan atau dibuat sendiri.  

> Menyajikan output simulasi dalam bentuk tabel atau grafik.  

> Menjelaskan hasil simulasi secara tertulis.  
=======
Tuliskan tujuan praktikum minggu ini.  
1. Membuat program simulasi algoritma penjadwalan FCFS dan/atau SJF.
2. Menjalankan program dengan dataset uji yang diberikan atau dibuat sendiri.
3. Menyajikan output simulasi dalam bentuk tabel atau grafik.
4. Menjelaskan hasil simulasi secara tertulis.
5. Mengunggah kode dan laporan ke Git repository dengan rapi dan tepat waktu.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
> - Membuat program simulasi algoritma penjadwalan FCFS dan/atau SJF.
> - Menjalankan program dengan dataset uji yang diberikan atau dibuat sendiri.
> - Menyajikan output simulasi dalam bentuk tabel atau grafik.
> - Menjelaskan hasil simulasi secara tertulis.
> - Mengunggah kode dan laporan ke Git repository dengan rapi dan tepat waktu.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae


## Dasar Teori
<<<<<<< HEAD
<<<<<<< HEAD
Simulasi CPU scheduling merupakan metode untuk memodelkan proses penjadwalan CPU dalam sistem operasi menggunakan program komputer. Simulasi ini bertujuan untuk membantu memahami bagaimana sistem operasi mengatur penggunaan CPU oleh berbagai proses serta mempermudah analisis kinerja penjadwalan melalui perhitungan waktu eksekusi proses.

Algoritma First Come First Served (FCFS) adalah salah satu algoritma penjadwalan CPU yang paling sederhana. Pada algoritma ini, proses akan dieksekusi berdasarkan urutan kedatangan ke dalam sistem. Proses yang datang lebih awal akan memperoleh jatah CPU terlebih dahulu dan dijalankan hingga selesai tanpa adanya interupsi.

Dalam simulasi CPU scheduling FCFS, parameter yang digunakan meliputi arrival time dan burst time. Berdasarkan parameter tersebut, sistem menghitung waiting time dan turnaround time untuk setiap proses. Simulasi ini mudah diimplementasikan dan sesuai untuk pembelajaran, namun memiliki keterbatasan seperti kemungkinan terjadinya convoy effect dan waktu tunggu rata-rata yang tinggi. 
=======
- Penjadwalan CPU adalah mekanisme dalam sistem operasi yang menentukan proses mana yang akan dieksekusi oleh CPU dan kapan proses tersebut dijalankan.
- Simulasi Algoritma Penjadwalan CPU adalah proses pemodelan dan pengujian berbagai algoritma penjadwalan dengan menggunakan data proses (seperti waktu kedatangan dan waktu eksekusi) untuk menganilisis kinerja algoritma tanpa harus menerapkannya langsung pada sistem nyata.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Langkah Praktikum
<<<<<<< HEAD
1. **Menyiapkan Dataset**
=======
1. Konsep Dasar Penjadwalan CPU: Merupakan mekanisme utama dalam sistem operasi multiprogramming untuk memaksimalkan utilitas CPU. Tujuannya adalah memastikan CPU selalu sibuk dengan cara beralih di antara berbagai proses yang berada dalam antrean (ready queue).
2. Kriteria Penjadwalan: Digunakan sebagai parameter untuk mengukur efisiensi algoritma. Kriteria utama meliputi Waiting Time (total waktu tunggu proses di ready queue), Turnaround Time (waktu total dari saat proses masuk hingga selesai), dan Response Time (waktu sejak permintaan masuk hingga respons pertama diberikan).
3. Gantt Chart sebagai Alat Simulasi: Dalam percobaan, Gantt Chart digunakan untuk memvisualisasikan urutan eksekusi proses secara kronologis. Diagram ini memudahkan penghitungan statistik performa algoritma seperti rata-rata waktu tunggu (Average Waiting Time).
---
=======
1. Menyiapkan Dataset

Buat dataset proses minimal berisi:

|Proses|	Arrival Time|	Burst Time|
|------|------------|------------|
|P1	|0|	6|
|P2	|1|	8|
|P3	|2|	7|
|P4	|3|	3|
2. Implementasi Algoritma

Program harus:

- Menghitung waiting time dan turnaround time.
- Mendukung minimal 1 algoritma (FCFS atau SJF non-preemptive).
- Menampilkan hasil dalam tabel.
- Eksekusi & Validasi

- Jalankan program menggunakan dataset uji.
- Pastikan hasil sesuai dengan perhitungan manual minggu sebelumnya.
- Simpan hasil eksekusi (screenshot).
3. Analisis

- Jelaskan alur program.
- Bandingkan hasil simulasi dengan perhitungan manual.
- Jelaskan kelebihan dan keterbatasan simulasi.

5. Output yang Diharapkan
- Kode program simulasi di folder code/.
- Dataset uji di code/dataset.csv.
- Screenshot hasil eksekusi di screenshots/.
- Laporan lengkap di laporan.md.
- Semua hasil telah di-commit ke GitHub.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

## Langkah Praktikum
1. Menyiapkan Dataset Buat dataset proses minimal berisi data yang telah disajikan.
2. Implementasi Algoritma
Program harus: Menghitung waiting time dan turnaround time.
               Mendukung minimal 1 algoritma (FCFS atau SJF non-preemptive).
               Menampilkan hasil dalam tabel.
3. Eksekusi & Validasi : Jalankan program menggunakan dataset uji. Pastikan hasil sesuai dengan perhitungan manual minggu sebelumnya.Simpan Hasil Screenshot.
4. Analisis :  Jelaskan alur program.
               Bandingkan hasil simulasi dengan perhitungan manual.
               Jelaskan kelebihan dan keterbatasan simulasi.
5. Commit & Push
git add .
git commit -m "Minggu 9 - Simulasi Scheduling CPU"
git push origin main

>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

   Membuat dataset proses minimal berisi:

   | Proses | Arrival Time | Burst Time |
   |:--:|:--:|:--:|
   | P1 | 0 | 6 |
   | P2 | 1 | 8 |
   | P3 | 2 | 7 |
   | P4 | 3 | 3 |

2. **Implementasi Algoritma**

   Program harus:
   - Menghitung *waiting time* dan *turnaround time*.  
   - Mendukung minimal **1 algoritma (FCFS atau SJF non-preemptive)**.  
   - Menampilkan hasil dalam tabel.

3. **Eksekusi & Validasi**

   - Menjalankan program menggunakan dataset uji.  
   - Memastikan hasil sesuai dengan perhitungan manual minggu sebelumnya.  
   - Menyimpan hasil eksekusi (screenshot).

4. **Analisis**

   - Menjelaskan alur program.  
   - Membandingkan hasil simulasi dengan perhitungan manual.  
   - Menjelaskan kelebihan dan keterbatasan simulasi.

5. **Commit & Push**

   ```bash
   git add .
   git commit -m "Minggu 9 - Simulasi Scheduling CPU"
   git push origin main
   ```
---

## Kode / Perintah
<<<<<<< HEAD
<<<<<<< HEAD
- Kode program simulasi di folder `code/`.
- Dataset uji di `code/reference_string.txt`.
- Screenshot hasil simulasi di `screenshots/`.
- Laporan lengkap di `laporan.md`.
=======
Tuliskan potongan kode atau perintah utama:
```bash
praktikum/week9-sim-scheduling/
=======

- Struktur folder

```praktikum/week9-sim-scheduling/
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
├─ code/
│  ├─ scheduling_simulation.*
│  └─ dataset.csv
├─ screenshots/
│  └─ hasil_simulasi.png
└─ laporan.md
```
<<<<<<< HEAD
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
- Push Github

> git add .

> git commit -m "Minggu 9 - Simulasi Scheduling CPU"

> git push origin main
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Hasil Eksekusi
<<<<<<< HEAD
![Screenshot](screenshots/Screenshot%202025-12-26%20121827.png)
=======
Sertakan screenshot hasil percobaan atau diagram:
<<<<<<< HEAD
![Screenshots hasil](./screenshots/Hasil%20eksekusi.png)
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

![Screenshot hasil](./screenshots/Hasil%20Eksekusi.png)
---

## Analisis
<<<<<<< HEAD
<<<<<<< HEAD
Berdasarkan hasil percobaan algoritma *First Come First Served (FCFS)*, proses dieksekusi sesuai urutan waktu kedatangan sehingga proses yang datang lebih awal akan diproses terlebih dahulu tanpa memperhatikan lama waktu eksekusinya. Akibatnya, proses dengan *burst time* besar dapat menyebabkan proses lain menunggu lebih lama, sehingga nilai *waiting time* dan *turnaround time* meningkat pada proses yang datang belakangan. Hal ini menunjukkan bahwa meskipun FCFS mudah diimplementasikan, algoritma ini kurang efisien untuk sistem dengan variasi waktu proses yang besar karena dapat menimbulkan efek *convoy*.
=======
1. Hasil di terminal menunjukkan simulasi bagaimana CPU mengelola empat proses (P1 hingga P4). Algoritma FCFS bekerja dengan prinsip antrean: siapa yang datang lebih dulu, dia yang dilayani.
Urutan Kedatangan (Arrival Time): P1 datang pertama pada detik ke-0, disusul P2 (detik 1), P3 (detik 2), dan P4 (detik 3).
Waktu Tunggu (Waiting Time):P1 langsung dikerjakan (tunggu = 0).P4 memiliki waktu tunggu tertinggi (18) karena harus menunggu P1, P2, dan P3 selesai diproses.
Waktu Penyelesaian (Turnaround Time): Ini adalah total waktu sejak proses datang hingga selesai. Misalnya, P4 datang pada detik ke-3 dan selesai pada detik ke-21 (total 18 detik menunggu + 3 detik pengerjaan = 21).

2. Fungsi Kernel (Penjadwal/Scheduler): Kernel bertindak sebagai "polisi lalu lintas". Bagian kernel yang disebut Short-Term Scheduler adalah yang memutuskan proses mana dari antrean ready yang akan diberikan akses ke CPU berdasarkan algoritma (dalam hal ini FCFS).
System Call: Saat program simulasi ini berjalan dan menampilkan teks ke layar (print), ia melakukan System Call (seperti write pada Linux atau WriteFile pada Windows). Ini adalah jembatan bagi program pengguna untuk meminta bantuan kernel mencetak data ke perangkat output (terminal).
Arsitektur OS (Context Switching): Meskipun simulasi ini terlihat sederhana, dalam arsitektur OS asli, perpindahan dari P1 ke P2 melibatkan Context Switching. Kernel harus menyimpan status (register, PC) proses yang lama ke dalam Process Control Block (PCB) dan memuat status proses baru agar eksekusi bisa dilanjutkan tanpa kehilanga
3. Path File: Windows menggunakan backslash (contoh: C:\Users\ASUS), sedangkan Linux menggunakan forward slash (contoh: /home/user).Manajemen Memori: Linux umumnya lebih efisien dalam membuat proses baru (process forking) dibandingkan Windows yang memiliki overhead lebih besar.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

=======
Analisis Singkat Hasil Eksekusi FCFS

- Algoritma yang digunakan adalah FCFS (First Come First Serve) → proses dieksekusi sesuai urutan kedatangan: P1 → P2 → P3 → P4.

- P1 benar: datang paling awal, waiting time = 0, turnaround = 6.

- P2 dan P3: waiting time ditampilkan 0, seharusnya tidak 0 karena mereka menunggu proses sebelumnya selesai → ada kesalahan perhitungan waiting time.

- P4: waiting time dan turnaround sudah sesuai konsep FCFS.

Muncul SyntaxWarning invalid escape sequence '\t', karena penulisan string \t tidak aman.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Kesimpulan
<<<<<<< HEAD
<<<<<<< HEAD
Berdasarkan hasil praktikum simulasi CPU scheduling menggunakan algoritma First Come First Served (FCFS), dapat disimpulkan bahwa simulasi berhasil menggambarkan cara kerja penjadwalan CPU berdasarkan urutan kedatangan proses. Hasil perhitungan waiting time dan turnaround time yang diperoleh dari simulasi sesuai dengan perhitungan manual, sehingga implementasi algoritma dapat dinyatakan benar. Algoritma FCFS mudah diimplementasikan dan cocok untuk pembelajaran konsep dasar penjadwalan CPU, namun memiliki keterbatasan seperti waktu tunggu rata-rata yang tinggi dan potensi terjadinya convoy effect.
=======
1. Efektivitas Algoritma FCFS: Hasil percobaan menunjukkan bahwa algoritma First-Come, First-Served sangat bergantung pada urutan kedatangan; proses yang datang terakhir (P4) mengalami waktu tunggu yang sangat tinggi (18 satuan waktu) karena harus menunggu selesainya proses-proses sebelumnya, yang dalam teori dikenal sebagai Convoy Effect.

2. Peran Kernel dan Sistem: Secara teoretis, eksekusi ini mencerminkan fungsi Short-Term Scheduler pada kernel dalam mengelola antrean proses, di mana setiap output yang muncul di terminal merupakan hasil dari System Call untuk berinteraksi dengan perangkat keras melalui arsitektur sistem operasi.

3. Pengaruh Lingkungan OS: Terdapat perbedaan teknis yang terlihat dari penggunaan Windows (seperti pada gambar) yang menggunakan backslash (\) dalam jalur file dan manajemen process creation yang lebih berat, dibandingkan dengan Linux yang menggunakan forward slash (/) dan mekanisme forking yang lebih ringan untuk menangani proses serupa.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
- Algoritma penjadwalan CPU berfungsi untuk mengatur urutan proses agar CPU bekerja lebih efisien. 
- Melalui simulasi, kita bisa melihat perbedaan waktu tunggu dan waktu penyelesaian setiap proses tergantung algoritma yang digunakan. 
- Setiap algoritma punya kelebihan dan kekurangan, sehingga pemilihan algoritma sangat memengaruhi kinerja sistem.
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

---

## Quiz
<<<<<<< HEAD
<<<<<<< HEAD
1. Mengapa simulasi diperlukan untuk menguji algoritma scheduling?
   **Jawaban:** Simulasi diperlukan untuk memodelkan cara kerja algoritma scheduling secara nyata tanpa harus menjalankannya pada sistem operasi sebenarnya. Melalui simulasi, proses perhitungan waktu eksekusi, waiting time, dan turnaround time dapat diuji secara otomatis sehingga mengurangi kesalahan perhitungan manual serta mempermudah analisis kinerja algoritma.
2. Apa perbedaan hasil simulasi dengan perhitungan manual jika dataset besar?
   **Jawaban:** Pada dataset kecil, hasil simulasi dan perhitungan manual biasanya sama. Namun, pada dataset yang besar, perhitungan manual berisiko tinggi terjadi kesalahan dan membutuhkan waktu lama, sedangkan simulasi tetap akurat, konsisten, dan cepat. Simulasi juga memudahkan pengolahan data dalam jumlah besar tanpa meningkatkan kompleksitas pengerjaan.
3. Algoritma mana yang lebih mudah diimplementasikan? Jelaskan. 
   **Jawaban:** Algoritma First Come First Served (FCFS) lebih mudah diimplementasikan dibandingkan algoritma lain seperti SJF. FCFS hanya memerlukan pengurutan proses berdasarkan waktu kedatangan tanpa perhitungan tambahan, sedangkan SJF membutuhkan proses seleksi burst time terpendek yang lebih kompleks.
=======
1. [Mengapa simulasi diperlukan untuk menguji algoritma scheduling?]  
   **Jawaban:Simulasi sangat penting untuk menguji algoritma penjadwalan karena memungkinkan pengembang untuk menganalisis perilaku algoritma secara aman tanpa risiko merusak sistem operasi yang sedang berjalan (live system). Melalui simulasi, variabel kompleks seperti waktu kedatangan dan durasi proses dapat dimanipulasi dengan mudah untuk mengamati fenomena seperti convoy effect atau starvation secara berulang dalam lingkungan yang terkontrol. Selain itu, simulasi jauh lebih efisien dari segi biaya dan waktu dibandingkan melakukan pengujian pada perangkat keras nyata, sehingga memudahkan perbandingan performa antar algoritma secara objektif sebelum diimplementasikan ke dalam kernel yang sesungguhnya.**  
2. [Apa perbedaan hasil simulasi dengan perhitungan manual jika dataset besar?]  
   **Jawaban:Perhitungan manual sangat berisiko terhadap kesalahan manusia (human error) dan menjadi tidak praktis karena membutuhkan waktu yang sangat lama untuk memproses ribuan data secara beruntun. Sebaliknya, simulasi komputer mampu mengolah dataset besar dalam hitungan milidetik dengan akurasi yang presisi, serta memudahkan pembaruan data secara otomatis tanpa harus mengulang perhitungan dari awal. Selain itu, simulasi memungkinkan pembuatan visualisasi statistik dan Gantt Chart yang rumit secara instan, sehingga memudahkan analisis performa algoritma yang sulit dicapai melalui cara manual.**  
3. [Algoritma mana yang lebih mudah diimplementasikan? Jelaskan.]  
   **Jawaban:Algoritma yang paling mudah diimplementasikan adalah First-Come, First-Served (FCFS) karena logikanya hanya menggunakan prinsip antrean sederhana atau FIFO (First-In, First-Out). Dalam implementasi kodenya, pengembang tidak perlu membuat fungsi pengurutan ulang yang rumit seperti pada Shortest Job First (SJF) atau mengatur interupsi kuantum waktu seperti pada Round Robin, melainkan cukup mengeksekusi proses berdasarkan urutan kedatangannya saja. Algoritma ini juga memiliki beban sistem (overhead) yang sangat rendah karena tidak memerlukan prediksi waktu pengerjaan di masa depan, sehingga struktur datanya sangat ringkas dan mudah dipahami bagi pemula dalam pemrograman sistem operasi.**  
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29
=======
1. Mengapa simulasi diperlukan untuk menguji algoritma scheduling? 

   **Jawaban:** 

Simulasi diperlukan supaya kita bisa menguji dan membandingkan algoritma schedulling dengan aman dan terkontrol, tanpa harus langsung menerpkannya di sistem nyata.

2. Apa perbedaan hasil simulasi dengan perhitungan manual jika dataset besar?

   **Jawaban:**  
- Perhitungan manual: Rentan salah hitung, memakan waktu lama, dan sulit dilacak kalau prosesnya banyak.
- Simulasi (program): Lebih cepat, akurat, dan kosisten meskipun datanya sangat besar. 

3. Algoritma mana yang lebih mudah diimplementasikan? Jelaskan.

   **Jawaban:**  
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae

Algoritma yang paling mudah diimplementasikan adalah FCFS (First Come First Serve). FCFS sederhana karena proses dijalankan sesuai urutan kedatangan. Tidsk perlu perhitungan rumit atau pengurutan berdasarkan burst time, cukup pakai antrian. Karena itu, FCFS paling mudah dipahami dan dibuat kodenya, terutama untuk pemula.

---

## Refleksi Diri
Tuliskan secara singkat:
<<<<<<< HEAD
<<<<<<< HEAD
- Apa bagian yang paling menantang minggu ini?  kurang semangat dalam mengerjakan tugas.
- Bagaimana cara Anda mengatasinya?  butuh penyemangat.
=======
- Apa bagian yang paling menantang minggu ini? 
- Bagaimana cara Anda mengatasinya?  
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

=======
- Apa bagian yang paling menantang minggu ini? 
menentukan code dalam pyhton agar tidak error saat dicoba
- Bagaimana cara Anda mengatasinya?  
membenarkan dan meneliti dengan jelas 
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
---

**Credit:**  
_Template laporan praktikum Sistem Operasi (SO-202501) – Universitas Putra Bangsa_
