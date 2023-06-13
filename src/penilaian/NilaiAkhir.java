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
public class NilaiAkhir extends Mahasiswa {
    private int uts;
    private int uas;
    private int tugas;
    
    public NilaiAkhir(String nama, String prodi, String nim, int uts, int uas, int tugas) {
        super(nama, prodi, nim);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    public double hitungNilaiAkhir() {
        double nilaiAkhir = 0.3 * uts + 0.3 * uas + 0.4 * tugas;
        return nilaiAkhir;
    }
}
