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
public class cTas {

    private String merk;
    private String warna;
    private String ukuran;

    public void setMerk(String newVolume) {
        merk = newVolume;
    }

    public void setWarna(String newVolume) {
        warna = newVolume;
    }

    public void setUkuran(String newVolume) {
        ukuran = newVolume;
    }

    public void cetakStatus() {
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Ukuran : " + ukuran);
    }

}
