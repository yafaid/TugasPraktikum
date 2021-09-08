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
public class cSound {

    private String merk;
    private String status;
    private int volume;

    public void setMerk(String newValue) {
        merk = newValue;
    }
    public void setStatus(String newValue) {
        status = newValue;
    }

    public void setVolumeUp(int increment) {
        volume = volume + increment;
    }
    public void setVolumeDown(int decrement) {
        volume = volume - decrement;
    }
    

    public void cetakStatus() {
        System.out.println("Merk : " + merk);
        System.out.println("Status : " + status);
        System.out.println("Volume : " + volume);
    }
}
