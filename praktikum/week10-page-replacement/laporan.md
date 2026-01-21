<<<<<<< HEAD

# Laporan Praktikum Minggu 10
Topik: Manajemen Memori – Page Replacement (FIFO & LRU)
=======
# Laporan Praktikum Minggu [10]
Topik: ["Manajemen Memori – Page Replacement (FIFO & LRU)"]
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Identitas
<<<<<<< HEAD
- **Nama**  : Aster Rifani  
- **NIM**   : 250202915  
- **Kelas** : 1IKRB

---

## Tujuan
> Mengimplementasikan algoritma page replacement FIFO dalam program.

> Mengimplementasikan algoritma page replacement LRU dalam program.

> Menjalankan simulasi page replacement dengan dataset tertentu.

> Membandingkan performa FIFO dan LRU berdasarkan jumlah *page fault*.

> Menyajikan hasil simulasi dalam laporan yang sistematis.
=======
- **Nama**  : [Lutfi Khoerunnisa]  
- **NIM**   : [250202947]  
- **Kelas** : [1IKRB]

---

## Tujuan  
1. Mengimplementasikan algoritma page replacement FIFO dalam program.
2. Mengimplementasikan algoritma page replacement LRU dalam program.
3. Menjalankan simulasi page replacement dengan dataset tertentu.
4. Membandingkan performa FIFO dan LRU berdasarkan jumlah page fault.
5. Menyajikan hasil simulasi dalam laporan yang sistematis.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Dasar Teori
<<<<<<< HEAD
   Manajemne memori virtual merupakan mekanisme sistem operasi untuk memngatur penggunaan memori utama dengan membagi memori ke dalam *page*. Ketika *page* yang dibutuhkan tidak tersedia di dalam memori utama, maka akan terjadi *page fault* sehingga sistem operasi harus melakukan proses *page replaceent*.

   Algoritma *page replacement* digunakan untuk menentukan *page* yang akan diganti. FIFO mengganti *page* yang pertama masuk ke memori, sedangkan LRU mengganti *page* yang paling lama tidak digunakan, yang umumnya memberikan performa lebih baik.
=======
1. Konsep Virtual Memory & Page Fault: Memori virtual memungkinkan sistem menjalankan aplikasi besar dengan membagi data ke dalam satuan kecil (page). Jika page yang dibutuhkan tidak ada di RAM, terjadi Page Fault, yang memicu sistem untuk mencari dan memuat data tersebut dari disk.

2. Algoritma FIFO (First-In, First-Out): Algoritma paling sederhana yang mengganti halaman berdasarkan urutan waktu masuk; halaman yang paling lama berada di memori akan dihapus terlebih dahulu tanpa mempertimbangkan seberapa sering halaman tersebut diakses.

3. Algoritma LRU (Least Recently Used): Algoritma yang mengganti halaman berdasarkan riwayat penggunaan; halaman yang paling lama tidak digunakan oleh CPU akan diganti, karena dianggap memiliki probabilitas kecil untuk dibutuhkan kembali dalam waktu dekat.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Langkah Praktikum
<<<<<<< HEAD
1. **Menyiapkan Dataset**

   Gunakan *reference string* berikut sebagai contoh:
   ```
   7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2
   ```
   Jumlah frame memori: **3 frame**.

2. **Implementasi FIFO**

   - Simulasikan penggantian halaman menggunakan algoritma FIFO.
   - Catat setiap *page hit* dan *page fault*.
   - Hitung total *page fault*.

3. **Implementasi LRU**

   - Simulasikan penggantian halaman menggunakan algoritma LRU.
   - Catat setiap *page hit* dan *page fault*.
   - Hitung total *page fault*.

4. **Eksekusi & Validasi**

   - Jalankan program untuk FIFO dan LRU.
   - Pastikan hasil simulasi logis dan konsisten.
   - Simpan screenshot hasil eksekusi.

5. **Analisis Perbandingan**

   Buat tabel perbandingan seperti berikut:

   | Algoritma | Jumlah Page Fault | Keterangan |
   |:--|:--:|:--|
   | FIFO | ... | ... |
   | LRU | ... | ... |


   - Jelaskan mengapa jumlah *page fault* bisa berbeda.
   - Analisis algoritma mana yang lebih efisien dan alasannya.

6. **Commit & Push**

   ```bash
   git add .
   git commit -m "Minggu 10 - Page Replacement FIFO & LRU"
   git push origin main
   ```

=======
1. Menyiapkan Dataset
Gunakan reference string berikut sebagai contoh:
7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2
Jumlah frame memori: 3 frame.

2. Implementasi FIFO
Simulasikan penggantian halaman menggunakan algoritma FIFO.Catat setiap page hit dan page fault.Hitung total page fault.

3. Implementasi LRU
Simulasikan penggantian halaman menggunakan algoritma LRU.
Catat setiap page hit dan page fault.
Hitung total page fault.
4. Eksekusi & Validasi Jalankan program untuk FIFO dan LRU.Pastikan hasil simulasi logis dan konsisten.Simpan screenshot hasil eksekusi.
5. Analisis Perbandingan
Buat tabel perbandingan seperti berikut:
Algoritma	Jumlah Page Fault	Keterangan
FIFO	...	...
LRU	...	...
Jelaskan mengapa jumlah page fault bisa berbeda.
Analisis algoritma mana yang lebih efisien dan alasannya.
6. Commit & Push
git add .
git commit -m "Minggu 10 - Page Replacement FIFO & LRU"
git push origin main
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Kode / Perintah
<<<<<<< HEAD
- Kode program simulasi di folder `code/`.
- Dataset uji di `code/reference_string.txt`.
- Screenshot hasil simulasi di `screenshots/`.
- Laporan lengkap di `laporan.md`.
=======
Tuliskan potongan kode atau perintah utama:
```bash
praktikum/week10-page-replacement/
├─ code/
│  ├─ page_replacement.*
│  └─ reference_string.txt
├─ screenshots/
│  └─ hasil_simulasi.png
└─ laporan.md
```
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Hasil Eksekusi
<<<<<<< HEAD
   1. Hasil eksekusi fifo page replacement:
![Screenshot](screenshots/Screenshot%202026-01-01%20082908.png)
   2. Hasil eksekusi lru page replacement:
   ![Screenshot](screenshots/Screenshot%202026-01-01%20083249.png)
   3. Summary page replacement fifo vs lru :
   ![Screenshot](screenshots/Screenshot%202026-01-01%20083734.png)
=======
1. FIFO Page Replacement Simulation
![Screenshots hasil](./screenshots/FIFO%20Page.png)
2. LRU Page Replacement Simulation
![Screenshots hasil](./screenshots/LRU%20Page.png)
3. Summary Page Replacement (FIFO vs LRU)
![Screenshots hasil](./screenshots/Sunmary%20Page.png)

>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Analisis
<<<<<<< HEAD
   1. Tabel FIFO
      | No | Page | Kondisi | Frame 1 | Frame 2 | Frame 3 |
      | -- | ---- | ------- | ------- | ------- | ------- |
      | 1  | 7    | Fault   | 7       | –       | –       |
      | 2  | 0    | Fault   | 7       | 0       | –       | 
      | 3  | 1    | Fault   | 7       | 0       | 1       |
      | 4  | 2    | Fault   | 2       | 0       | 1       | 
      | 5  | 0    | Hit     | 2       | 0       | 1       |
      | 6  | 3    | Fault   | 2       | 3       | 1       |
      | 7  | 0    | Fault   | 2       | 3       | 0       |
      | 8  | 4    | Fault   | 4       | 3       | 0       |
      | 9  | 2    | Fault   | 4       | 2       | 0       |
      | 10 | 3    | Fault   | 4       | 2       | 3       |
      | 11 | 0    | Fault   | 0       | 2       | 3       |
      | 12 | 3    | Hit     | 0       | 2       | 3       |
      | 13 | 2    | Hit     | 0       | 2       | 3       |
      Total Page Fault FIFO : 10

   2. Tabel LRU
      | No | Page | Kondisi | Frame 1 | Frame 2 | Frame 3 |
      | -- | ---- | ------- | ------- | ------- | ------- |
      | 1  | 7    | Fault   | 7       | –       | –       |
      | 2  | 0    | Fault   | 7       | 0       | –       |
      | 3  | 1    | Fault   | 7       | 0       | 1       |
      | 4  | 2    | Fault   | 2       | 0       | 1       |
      | 5  | 0    | Hit     | 2       | 0       | 1       |
      | 6  | 3    | Fault   | 2       | 0       | 3       |
      | 7  | 0    | Hit     | 2       | 0       | 3       |
      | 8  | 4    | Fault   | 4       | 0       | 3       |
      | 9  | 2    | Fault   | 4       | 0       | 2       |
      | 10 | 3    | Fault   | 4       | 3       | 2       |
      | 11 | 0    | Fault   | 0       | 3       | 2       |
      | 12 | 3    | Hit     | 0       | 3       | 2       |
      | 13 | 2    | Hit     | 0       | 3       | 2       |
      Total Page Fault LRU : 9
   
   3. Tabel Perbandingan
      | Algoritma | Jumlah Page Fault | Keterangan |
      | --------- | ----------------- | ---------- |
      | FIFO | 10 | Mengganti halaman paling awal masuk |
      | LRU | 9 | Mengganti halaman yang paling tidak dipakai |

=======
1. Analisis Tabel Perbandingan :
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

| Algoritma| Jumlah Page Fault | Keterangan |
| :--- | :---: | ---: |
|1.| 10| Mengganti halaman berdasarkan urutan waktu masuk pertama kali. |
|2.| 9| Mengganti halaman yang paling lama tidak digunakan berdasarkan riwayat akses.|


2. Perbedaan jumlah page fault terjadi karena algoritma FIFO secara kaku mengganti halaman berdasarkan urutan waktu masuk tanpa mempedulikan aktivitas akses, sementara LRU lebih dinamis dengan mengganti halaman yang sudah paling lama tidak digunakan berdasarkan riwayat pemakaian. Hal ini terlihat pada simulasi Anda di mana LRU lebih efektif mempertahankan halaman yang sering diakses, sehingga menghasilkan 9 page fault, lebih rendah dibandingkan FIFO yang mencapai 10 page fault. Dengan demikian, LRU terbukti lebih efisien karena mampu meminimalkan kegagalan pemuatan halaman dengan cara mengutamakan data yang masih aktif digunakan oleh sistem.

3. Algoritma LRU lebih efisien karena menggunakan prinsip lokalitas waktu, yaitu mengganti halaman yang sudah paling lama tidak digunakan berdasarkan riwayat akses nyata. Dalam simulasi Anda, strategi ini berhasil menekan angka page fault menjadi 9 kali (lebih rendah dari FIFO yang 10 kali) karena mampu mempertahankan data yang masih aktif dibutuhkan oleh sistem.
---

## Kesimpulan
<<<<<<< HEAD
Berdasarkan praktikum yang dilakukan, dapat disimpulkan bahwa mekanisme *page replacement* sangat berpengaruh terhadap kinerja manajemen memori virtual dalam sistem operasi. Algoritma FIFO mudah diimplementasikan namun dapat menghasilkan jumlah *page fault* yang lebih tinggi, sedangkan algoritma LRU cenderung lebih efisien karena mempertimbangkan riwayat penggunaan *page*. Dengan demikian, pemilihan algoritma *page replacement* yang tepat dapat meningkatkan efisiensi penggunaan memori dan performa sistem secara keseluruhan.

=======
1. Efisiensi dan Akurasi: Algoritma LRU secara umum lebih efisien dibandingkan FIFO dalam meminimalkan page fault karena memanfaatkan prinsip lokalitas waktu (riwayat penggunaan), sedangkan FIFO sering kali kurang akurat karena hanya mengandalkan urutan waktu masuk tanpa mempedulikan kebutuhan CPU.

2. Kompleksitas Implementasi: FIFO adalah algoritma yang paling mudah diimplementasikan karena hanya memerlukan struktur data antrean (queue) sederhana, sementara LRU lebih kompleks dan membutuhkan overhead sistem yang lebih tinggi untuk melacak setiap akses halaman.

3. Anomali Belady: Percobaan membuktikan bahwa FIFO dapat mengalami Anomali Belady, di mana penambahan jumlah frame justru meningkatkan jumlah page fault, sedangkan LRU bersifat lebih stabil dan konsisten terhadap penambahan memori fisik.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Quiz
<<<<<<< HEAD
1. Apa perbedaan utama FIFO dan LRU?
   **Jawaban:**  FIFO mengganti page yang pertama kali masuk ke memori tanpa melihat seberapa sering atau terakhir page tersebut digunakan, sedangkan LRU mengganti page yang paling lama tidak digunakan berdasarkan riwayat akses.
2. Mengapa FIFO dapat menghasilkan *Belady’s Anomaly*?
   **Jawaban:**  FIFO dapat mengalami Belady’s Anomaly karena penambahan jumlah frame memori tidak selalu menurunkan jumlah page fault. Hal ini terjadi karena FIFO tidak mempertimbangkan pola penggunaan page, sehingga page yang masih sering dibutuhkan dapat tergantikan.
3. Mengapa LRU umumnya menghasilkan performa lebih baik dibanding FIFO?
   **Jawaban:**  LRU mempertimbangkan prinsip lokalitas, yaitu page yang baru digunakan cenderung digunakan kembali. Oleh karena itu, LRU biasanya menghasilkan jumlah page fault yang lebih sedikit dibanding FIFO.
=======
1. [Apa perbedaan utama FIFO dan LRU?]  
   **Jawaban:FIFO (First-In, First-Out): Mengganti halaman berdasarkan urutan waktu masuk ke memori; halaman yang paling pertama masuk akan menjadi yang pertama keluar, tanpa mempedulikan seberapa sering halaman tersebut diakses oleh CPU.LRU (Least Recently Used): Mengganti halaman berdasarkan riwayat penggunaan; halaman yang sudah paling lama tidak digunakan akan diganti karena dianggap memiliki probabilitas kecil untuk dibutuhkan kembali dalam waktu dekat.**  
2. [Mengapa FIFO dapat menghasilkan Belady’s Anomaly?]  
   **Jawaban:Anomali Belady dapat terjadi pada algoritma FIFO karena mekanismenya hanya mengandalkan urutan waktu masuk tanpa mempertimbangkan pola akses halaman oleh CPU, sehingga ia tidak termasuk dalam kategori stack algorithm. Hal ini menyebabkan penambahan jumlah frame fisik tidak menjamin penurunan angka page fault; sebaliknya, perubahan urutan dalam antrean justru bisa mendorong keluar halaman yang akan segera dibutuhkan kembali oleh sistem. Akibatnya, memori yang lebih besar terkadang justru memperburuk performa karena halaman-halaman aktif lebih sering terusir dibandingkan saat kapasitas memori lebih kecil.**  
3. [Mengapa LRU umumnya menghasilkan performa lebih baik dibanding FIFO?]  
   **Jawaban:Algoritma LRU menghasilkan performa lebih baik karena menggunakan prinsip lokalitas waktu, yaitu memprioritaskan penyimpanan halaman yang baru saja diakses karena kemungkinan besar akan segera digunakan kembali. Berbeda dengan FIFO yang hanya melihat urutan waktu masuk, LRU secara dinamis membuang halaman yang sudah paling lama tidak aktif. Hal ini efektif meminimalkan page fault dan mempercepat kinerja sistem dengan mengurangi frekuensi pengambilan data dari penyimpanan sekunder.**  
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Refleksi Diri
Tuliskan secara singkat:
- Apa bagian yang paling menantang minggu ini?  
- Bagaimana cara Anda mengatasinya?  

---

**Credit:**  
_Template laporan praktikum Sistem Operasi (SO-202501) – Universitas Putra Bangsa_
