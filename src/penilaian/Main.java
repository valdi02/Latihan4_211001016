/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author valdi
 */
public class Main {
    public static void main(String[] args) {
        NilaiAkhir mhs = new NilaiAkhir("Muhammad Valdi Erlangga", "Informatika", "2110010163", 85, 90, 80);
        
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Prodi: " + mhs.getProdi());
        System.out.println("Nim: " + mhs.getNim());
        
        double nilaiAkhir = mhs.hitungNilaiAkhir();
        System.out.println("Nilai Akhir: " + nilaiAkhir);
}
}
