package com.example; 
 
public class PenilaianMahasiswa { 
 
    // Fungsi untuk menentukan nilai berdasarkan angka 
    public String hitungNilai(int nilai) { 
        if (nilai >= 85 && nilai <= 100) { 
            return "A"; 
        } else if (nilai >= 70 && nilai < 85) { 
            return "B"; 
        } else if (nilai >= 55 && nilai < 70) { 
            return "C"; 
        } else if (nilai >= 40 && nilai < 55) { 
            return "D"; 
        } else { 
            return "Nilai tidak valid"; 
        } 
    } 
}