/*
    Nama        : Muhammad Raihan Wardhana
    NIM         : 24060122140166
    Nama File   : bukuFiksi.java
    Deskripsi   : File Main dari proyek buku
*/
package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel bukuNaruto = new bukuNovel("Hero of Olympus", "Rick Riordan", "2014", "Fantasy", 525, 100000);
        bukuNaruto.view();
        bukuAkademik caraCoding = new bukuAkademik("Pengantar Algoritma dan Pemrogrman", "Suryadi H.S", "1991", "Coding", 559, 50000);
        caraCoding.view();
    }
}