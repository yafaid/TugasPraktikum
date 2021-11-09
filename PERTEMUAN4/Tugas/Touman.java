/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author hp
 */
public class Touman {

    private String nama;
    private String divisi;
    private String ketua;
    private Takemichi anggota;

    public Touman(String nama, String divisi, String ketua) {
        this.nama = nama;
        this.divisi = divisi;
        this.ketua = ketua;
    }
    public String getNama() {
        return nama;
    }

    public String getName() {
        return ketua;
    }

    public void setName(String newName) {
        ketua = newName;
    }

    public void setAnggota(Takemichi anggota) {
        this.anggota = anggota;
    }

    public Takemichi getAnggota() {
        return anggota;
    }

    public String getDiv() {
        return divisi;
    }

    public void setDiv(String newDiv) {
        divisi = newDiv;
    }
}
