/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan45_cetaknama;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Cetak Nama
 */
public class Printer {

    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        System.out.println("Nama Anda : " + nama);
    }

    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak :");
        for (int no = 1; no <= jmlCetak; no++) {
            System.out.println(no + ". " + nama);
        }
    }

}
