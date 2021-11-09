/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ktp, nama;
        long limit, pinjam, angsur;

        System.out.print("Masukkan KTP : ");
        ktp = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
//        System.out.print("Masukkan limit Pinjaman : ");
//        limit = sc.nextLong();

        Anggota donny = new Anggota(ktp, nama, 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getlimitPinjaman());

        System.out.print("Masukkan jumlah Pinjaman : ");
        pinjam = sc.nextLong();
        donny.setJumlahPinjaman(pinjam);

//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.setJumlahPinjaman(10000000);
//
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.setJumlahPinjaman(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran ");
        System.out.print("Masukkan jumlah Angsuran : ");
        angsur = sc.nextLong();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(200000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 300.000");
//        donny.angsur(300000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }

}
