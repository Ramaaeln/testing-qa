# Test Case 

Repository ini berisi implementasi unit testing menggunakan Java, JUnit 4, dan Apache Maven untuk menguji logika penentuan nilai mahasiswa.

---

## 📌 Deskripsi Program

Program `PenilaianMahasiswa` berfungsi untuk mengevaluasi nilai angka (skor) mahasiswa dan mengonversinya menjadi nilai huruf (`A`, `B`, `C`, `D`) atau memberikan keterangan `"Nilai tidak valid"` untuk input di luar domain rentang $0 - 100$.

### Aturan Konversi Nilai:
* **Nilai tidak valid:** `< 0` atau `> 100`
* **Kategori E:** `0 - 39`
* **Kategori D:** `40 - 54`
* **Kategori C:** `55 - 69`
* **Kategori B:** `70 - 84`
* **Kategori A:** `85 - 100`

---

## 🛠️ Prasyarat & Teknologi

* **Java Development Kit (JDK):** Version 11 atau lebih baru
* **Build Tool:** Apache Maven
* **Testing Framework:** JUnit 4.13.2

---

## 🚀 Cara Menjalankan Pengujian

1. Clone repository ini:
   ```bash
   git clone [https://github.com/Ramaaeln/testing-qa.git](https://github.com/Ramaaeln/testing-qa.git)
   mvn test
