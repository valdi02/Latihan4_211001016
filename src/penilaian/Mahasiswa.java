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
public class Mahasiswa {
        private String nama;
    private String prodi;
    private String nim;
    
    public Mahasiswa(String nama, String prodi, String nim) {
        this.nama = nama;
        this.prodi = prodi;
        this.nim = nim;
}
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
     public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
}
