package com.example; 

import static org.junit.Assert.assertEquals;
import org.junit.Test; 

public class PenilaianMahasiswaTest { 

    PenilaianMahasiswa penilaian = new PenilaianMahasiswa(); 

    // Memeriksa nilai -1 di bawah domain skor yang diasumsikan
    @Test 
    public void testNilaiDiBawahDomain() { 
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(-1)); 
    } 

    // Memeriksa input 0
    @Test 
    public void testNilaiNol() { 
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(0)); 
    } 

    // Memeriksa skor satu angka di bawah batas minimum kategori D
    @Test 
    public void testDiBawahBatasMinD() { 
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(39)); 
    } 

    // Memeriksa skor satu angka di atas batas bawah kategori D
    @Test 
    public void testDiAtasBatasBawahD() { 
        assertEquals("D", penilaian.hitungNilai(41)); 
    } 

    // Memeriksa skor satu angka di bawah batas transisi D/C
    @Test 
    public void testDiBawahTransisiDC() { 
        assertEquals("D", penilaian.hitungNilai(54)); 
    } 

    // Memeriksa skor satu angka di atas batas bawah kategori C
    @Test 
    public void testDiAtasBatasBawahC() { 
        assertEquals("C", penilaian.hitungNilai(56)); 
    } 

    // Memeriksa skor satu angka di bawah batas transisi C/B
    @Test 
    public void testDiBawahTransisiCB() { 
        assertEquals("C", penilaian.hitungNilai(69)); 
    } 

    // Memeriksa skor satu angka di atas batas bawah kategori B
    @Test 
    public void testDiAtasBatasBawahB() { 
        assertEquals("B", penilaian.hitungNilai(71)); 
    } 

    // Memeriksa skor satu angka di bawah batas transisi B/A
    @Test 
    public void testDiBawahTransisiBA() { 
        assertEquals("B", penilaian.hitungNilai(84)); 
    } 

    // Memeriksa skor satu angka di atas batas bawah kategori A
    @Test 
    public void testDiAtasBatasBawahA() { 
        assertEquals("A", penilaian.hitungNilai(86)); 
    } 

    // Memeriksa skor satu angka di bawah batas maksimum kategori A
    @Test 
    public void testDiBawahBatasMaksA() { 
        assertEquals("A", penilaian.hitungNilai(99)); 
    } 

    // Memeriksa skor tepat pada batas maksimum kategori A
    @Test 
    public void testBatasMaksA() { 
        assertEquals("A", penilaian.hitungNilai(100)); 
    } 

    // Memeriksa skor satu angka di atas batas maksimum kategori A
    @Test 
    public void testDiAtasBatasMaksA() { 
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(101)); 
    } 
}