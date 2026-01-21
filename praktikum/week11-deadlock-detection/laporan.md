
<<<<<<< HEAD
# Laporan Praktikum Minggu 11
Topik:  Simulasi dan Deteksi Deadlock
=======
# Laporan Praktikum Minggu [11]
Topik: ["Simulasi dan Deteksi Deadlock"]
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Identitas
<<<<<<< HEAD
- **Nama**  : Aster Rifani
- **NIM**   : 290202915  
- **Kelas** : 1ikrb
=======
- **Nama**  : [Lutfi Khoerunnisa]  
- **NIM**   : [250202947]  
- **Kelas** : [1IKRB]
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Tujuan
<<<<<<< HEAD
> Membuat program sederhana untuk mendeteksi deadlock.

> Menjalankan simulasi deteksi deadlock dengan dataset uji.

> Menyajikan hasil analisis deadlock dalam bentuk tabel.

> Memberikan interpretasi hasil uji secara logis dan sistematis.

> Menyusun laporan praktikum sesuai format yang ditentukan.
=======
1. Membuat program sederhana untuk mendeteksi deadlock.
2. Menjalankan simulasi deteksi deadlock dengan dataset uji.
3. Menyajikan hasil analisis deadlock dalam bentuk tabel.
4. Memberikan interpretasi hasil uji secara logis dan sistematis.
5. Menyusun laporan praktikum sesuai format yang ditentukan.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Dasar Teori
<<<<<<< HEAD
Deadlock merupakan sebuah kondisi pada sistem operasi yang terjadi akibat dua atau lebih proses saling menunggu sumber daya yang sedang digunakan oleh proses lain,sehingga tidak ada satu pun proses yang dapat melanjutkan eksekusinya. Kondisi ini umumnya terjadi karena terpenuhinya empat syarat deadlock, yaitu mutual exclusion, hold and wait, no preemption, dan circular wait.

Deteksi deadlock dilakukan dengan memantau keadaan sistem untuk mengidentifikasi adanya siklus ketergantungan antara pross dan sumber daya. Pendekatan ini menggunakan algoritma deeksi yang menganalisis alokasi dan permintaan sumber daya untuk menentukan apakah sistem berada dalam kondisi deadlock. Setelah terdeteksi, sistem dapat mengambi tindakan pemulihan,seperti menghentikan proses tertentu atau mlepaskan sumber daya,agar sistem dapat kembali berjalan normal.
=======
1. Definisi Deadlock: Kondisi di mana sekumpulan proses saling menunggu sumber daya secara permanen sehingga eksekusi terhenti total.

2. Kondisi Coffman: Deadlock hanya terjadi jika empat syarat terpenuhi serentak: Mutual Exclusion, Hold and Wait, No Preemption, dan Circular Wait.

3. Deteksi & RAG: Identifikasi dilakukan menggunakan Resource Allocation Graph (RAG); jika terdapat siklus (cycle) dalam graf alokasi tersebut, maka sistem terdeteksi mengalami deadlock.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Langkah Praktikum
<<<<<<< HEAD
1. **Menyiapkan Dataset**

   Gunakan dataset sederhana yang berisi:
   - Daftar proses  
   - Resource Allocation  
   - Resource Request / Need

   Contoh tabel:

   | Proses | Allocation | Request |
   |:--:|:--:|:--:|
   | P1 | R1 | R2 |
   | P2 | R2 | R3 |
   | P3 | R3 | R1 |

2. **Implementasi Algoritma Deteksi Deadlock**

   Program minimal harus:
   - Membaca data proses dan resource.  
   - Menentukan apakah sistem berada dalam kondisi deadlock.  
   - Menampilkan proses mana saja yang terlibat deadlock.

3. **Eksekusi & Validasi**

   - Jalankan program dengan dataset uji.  
   - Validasi hasil deteksi dengan analisis manual/logis.  
   - Simpan hasil eksekusi dalam bentuk screenshot.

4. **Analisis Hasil**

   - Sajikan hasil deteksi dalam tabel (proses deadlock / tidak).  
   - Jelaskan mengapa deadlock terjadi atau tidak terjadi.  
   - Kaitkan hasil dengan teori deadlock (empat kondisi).

5. **Commit & Push**

   ```bash
   git add .
   git commit -m "Minggu 11 - Deadlock Detection"
   git push origin main
   ```
=======
1. Menyiapkan Dataset Gunakan dataset sederhana yang berisi:
Daftar proses
Resource Allocation
Resource Request / Need
2. Implementasi Algoritma Deteksi Deadlock
Program minimal harus:
Membaca data proses dan resource.
Menentukan apakah sistem berada dalam kondisi deadlock.
Menampilkan proses mana saja yang terlibat deadlock.
3. Eksekusi & Validasi
Jalankan program dengan dataset uji.
Validasi hasil deteksi dengan analisis manual/logis.
Simpan hasil eksekusi dalam bentuk screenshot.
4. Analisis Hasil
Sajikan hasil deteksi dalam tabel (proses deadlock / tidak).
Jelaskan mengapa deadlock terjadi atau tidak terjadi.
Kaitkan hasil dengan teori deadlock (empat kondisi).
5. Commit & Push
git add .
git commit -m "Minggu 11 - Deadlock Detection"
git push origin main

>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29


---

## Kode / Perintah
<<<<<<< HEAD
- Kode program deteksi deadlock di folder `code/`.  
- Dataset uji di `code/dataset_deadlock.csv`.  
- Screenshot hasil eksekusi di folder `screenshots/`. 

---

## Hasil Eksekusi
![Screenshot](screenshots/Screenshot%202026-01-01%20134334.png)
=======
Tuliskan potongan kode atau perintah utama:
```bash
praktikum/week11-deadlock-detection/
├─ code/
│  ├─ deadlock_detection.*
│  └─ dataset_deadlock.csv
├─ screenshots/
│  └─ hasil_deteksi.png
└─ laporan.md
```

---

## Hasil Eksekusi Def Detect_Deadlock
![Screenshot hasil](./screenshots/def%20detect.png)
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Analisis
<<<<<<< HEAD
Tabel hasil deteksi deadlock :
| Proses | Status   |
| ------ | -------- |
| P1     | Deadlock |
| P2     | Deadlock |
| P3     | Deadlock |

Berdasarkan hasil simulasi, seluruh proses berada dalam kondisi deadlock karena setiap proses memegang satu resource dan menunggu resource lain yang sedang digunakan oleh proses lain, sehingga tidak ada proses yang dapat melanjutkan eksekusi. Proses P1 memegang R1 dan menunggu R2, P2 memegang R2 dan menunggu R3, serta P3 memegang R3 dan menunggu R1, yang membentuk circular wait P1 → P2 → P3 → P1. Kondisi ini memenuhi keempat syarat deadlock, yaitu mutual exclusion, hold and wait, no preemption, dan circular wait, sehingga sistem dinyatakan berada dalam kondisi deadlock.
=======
1. Analisis Hasil Deteksi

| Proses | Status| Keterangan|
| :--- | :---: | ---: |
|P1| Deadlock|Terlibat dalam siklus karena memegang R2 dan meminta R1. |
|P2| Deadlock| Terlibat dalam siklus karena memegang R3 dan meminta R2. |
|P3 | Deadlock| Terlibat dalam siklus karena memegang R1 dan meminta R3.|

2. Analisis Penyebab Deadlock
Deadlock terjadi karena sistem berada dalam kondisi di mana setiap proses menunggu sumber daya yang sedang dipegang oleh proses lain dalam sebuah rantai yang tidak terputus. Berdasarkan output terminal, program mendeteksi adanya jalur siklus: R1 -> P1 -> R2 -> P2 -> R3 -> P3 -> R1. Karena setiap sumber daya dalam simulasi ini bersifat tunggal dan tidak dapat digunakan bersama, maka tidak ada satu pun proses yang dapat menyelesaikan tugasnya, menyebabkan sistem berhenti total (stagnan).

3. Hasil simulasi pada file def detect.png membuktikan teori deadlock melalui terbentuknya siklus R1 -> P1 -> R2 -> P2 -> R3 -> P3 -> R1, yang memenuhi syarat Circular Wait. Kondisi ini terjadi karena setiap proses memegang satu sumber daya sambil menunggu sumber daya lain (Hold and Wait) yang bersifat eksklusif (Mutual Exclusion) dan tidak dapat diambil paksa (No Preemption). Akibat terpenuhinya keempat syarat Coffman tersebut secara simultan, sistem mengalami kebuntuan permanen karena tidak ada proses yang dapat menyelesaikan eksekusinya.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Kesimpulan
<<<<<<< HEAD
Berdasarkan hasil simulasi deteksi deadlock, sistem teridentifikasi berada dalam kondisi deadlock karena adanya ketergantungan melingkar antar proses dalam penggunaan resource.

Algoritma deteksi deadlock berhasil mengidentifikasi proses-proses yang terlibat deadlock sesuai dengan teori deadlock, sehingga dapat disimpulkan bahwa simulasi berjalan dengan benar dan efektif dalam mendeteksi kondisi deadlock pada sistem operasi.
=======
1. Validasi Teori Circular Wait: Praktikum membuktikan bahwa deadlock terjadi ketika terbentuk siklus alokasi sumber daya yang tertutup (P1 → R2 → P2 → R3 → P3 → R1), yang memenuhi kondisi Circular Wait dari syarat Coffman.

2. Efektivitas Deteksi Graf: Penggunaan Resource Allocation Graph (RAG) terbukti efektif untuk mendeteksi kebuntuan sistem secara otomatis dengan cara mengidentifikasi adanya siklus antar proses dan sumber daya yang saling menunggu.

3. Kondisi Stagnasi Sistem: Hasil deteksi menunjukkan bahwa ketika deadlock terjadi, semua proses yang terlibat (P1, P2, P3) akan berhenti secara permanen karena tidak ada sumber daya yang dapat dilepaskan untuk memutus rantai ketergantungan tersebut.
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

---

## Quiz
<<<<<<< HEAD
1. Apa perbedaan antara *deadlock prevention*, *avoidance*, dan *detection*?  
   **Jawaban:**  
   - *Deadlock prevention* mencegah deadlock dengan menghilangkan salah satu syarat deadlock sejak awal.
   - *Deadlock avoidance* menghindari deadlock dengan memastikan sistem selalu berada dalam kondisi aman sebelum resource dialokasikan.
   - *Deadlock detection* membiarkan deadlock terjadi lalu mendeteksinya dan melakukan pemulihan.
2. Mengapa deteksi deadlock tetap diperlukan dalam sistem operasi?  
   **Jawaban:**  karena tidak semua deadlock dapat dicegah atau dihindari sebelumnya, sehingga sistem perlu mengenali deadlock yang telah terjadi agar dapat melakukan tindakan pemulihan dan menjaga sistem tetap berjalan.
3. Apa kelebihan dan kekurangan pendekatan deteksi deadlock?  
   **Jawaban:**  
   - Kelebihan:
      Pendekatan deteksi deadlock lebih fleksibel karena sistem tidak perlu mencegah atau menghindari deadlock sejak awal, sehingga penggunaan resource dapat lebih efisien.
=======
1. [Apa perbedaan antara deadlock prevention, avoidance, dan detection?]  
   **Jawaban:a. Deadlock Prevention (Pencegahan): Strategi ini bekerja sangat dini dengan cara memastikan bahwa setidaknya satu dari empat kondisi Coffman (seperti Hold and Wait atau Circular Wait) tidak akan pernah terpenuhi. Metodenya sangat restriktif, misalnya mewajibkan proses meminta semua sumber daya sekaligus di awal.
   b. Deadlock Avoidance (Penghindaran): Strategi ini lebih dinamis dibandingkan pencegahan karena sistem memeriksa setiap permintaan sumber daya secara real-time. Sistem akan menghitung apakah pemberian sumber daya akan membawa sistem ke dalam "State Tidak Aman" (Unsafe State) yang berisiko deadlock; jika ya, permintaan tersebut ditunda (contohnya menggunakan Algoritma Banker).
   c.Deadlock Detection (Deteksi): Strategi ini bersifat reaktif, di mana sistem membiarkan deadlock terjadi, lalu secara periodik menjalankan algoritma untuk memeriksa apakah ada siklus pada graf alokasi sumber daya (Resource Allocation Graph). Seperti yang terlihat pada simulasi Anda (def detect.png), deteksi berfungsi mengidentifikasi proses mana yang sudah terjebak agar bisa dilakukan tindakan pemulihan (recovery).**  
2. [Mengapa deteksi deadlock tetap diperlukan dalam sistem operasi?]  
   **Jawaban:Deteksi deadlock diperlukan karena memberikan keseimbangan antara efisiensi penggunaan sumber daya dan fleksibilitas sistem dibandingkan metode pencegahan yang terlalu kaku. Strategi ini membiarkan sistem bekerja maksimal dan hanya melakukan intervensi saat kebuntuan benar-benar terjadi, sehingga utilisasi sumber daya tetap tinggi. Selain itu,deteksi sangat penting untuk mengidentifikasi proses dan sumber daya spesifik yang terlibat dalam siklus agar tindakan pemulihan dapat dilakukan tanpa menghentikan seluruh sistem.**  
3. [Apa kelebihan dan kekurangan pendekatan deteksi deadlock?]  
   **Jawaban:a.Kelebihan Meningkatkan utilisasi sumber daya karena sistem tidak dibatasi aturan pencegahan yang kaku, sehingga proses berjalan lebih fleksibel. Intervensi hanya dilakukan saat masalah benar-benar terjadi, memungkinkan identifikasi proses spesifik yang terjebak untuk pemulihan yang tepat sasaran.
   b.Kekurangan Menimbulkan beban komputasi (overhead) karena algoritma deteksi harus berjalan rutin. Selain itu, pemulihan sering kali menyebabkan hilangnya data akibat penghentian proses paksa, serta berisiko menimbulkan starvation pada proses tertentu yang terus-menerus dikorbankan.**  
>>>>>>> fbd8316ebf0b48cd8652bea179300f780e5f8a29

   - Kekurangan:
      Pendekatan ini memerlukan mekanisme tambahan untuk mendeteksi dan memulihkan deadlock, serta berisiko mengganggu proses yang sedang berjalan saat dilakukan pemulihan.
---

## Refleksi Diri
Tuliskan secara singkat:
- Apa bagian yang paling menantang minggu ini?  
- Bagaimana cara Anda mengatasinya?  

---

**Credit:**  
_Template laporan praktikum Sistem Operasi (SO-202501) – Universitas Putra Bangsa_
