/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author hp
 */
public class Anggota {

    private String nomorKTP;
    private String nama;
    private long limitPinjaman;
    private long jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, long limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public long getlimitPinjaman() {
        return limitPinjaman;
    }

    public void setJumlahPinjaman(long jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
        if (this.jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            this.jumlahPinjaman -= jumlahPinjaman;
        } else {
            this.jumlahPinjaman = jumlahPinjaman;
        }
    }

    public long getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void angsur(long angsuran) {
        if (angsuran >= 0.1 * this.jumlahPinjaman) {
            this.jumlahPinjaman -= angsuran;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
