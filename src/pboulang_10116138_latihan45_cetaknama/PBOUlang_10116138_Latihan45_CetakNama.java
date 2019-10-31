/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan45_cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Cetak Nama
 */
public class PBOUlang_10116138_Latihan45_CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Aplikasi Pencetak Nama===");

        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();

        System.out.print("Masukkan nama anda : ");
        printer.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scn.nextInt());

        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());

    }

}
