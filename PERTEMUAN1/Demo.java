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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cSound cs1 = new cSound();
        cBass cb1 = new cBass();
        cTreble ct1 = new cTreble();
        cKaos ck1 = new cKaos();
        cTas ctas = new cTas();
        
        cs1.setMerk("Simbadda");
        cs1.setStatus("On");
        cs1.setVolumeUp(80);
        cs1.setVolumeDown(2);
        cs1.cetakStatus();
        
        cb1.setMerk("Simbadda");
        cb1.setStatus("On");
        cb1.setVolumeUp(80);
        cb1.setVolumeDown(2);
        cb1.SetVolumeBassUp(70);
        cb1.SetVolumeBassDown(10);
        cb1.cetakStatus();
        
        ct1.setMerk("Simbadda");
        ct1.setStatus("On");
        ct1.setVolumeUp(80);
        ct1.setVolumeDown(2);
        ct1.SetVolumeTrebleUp(50);
        ct1.SetVolumeTrebleDown(5);
        ct1.cetakStatus();
        
        ck1.setMerk("Eiger");
        ck1.setWarna("Kuning Camo");
        ck1.setUkuran("30 Liter");
        ck1.cetakStatus();
        
        ctas.setMerk("Faith");
        ctas.setWarna("Hitam");
        ctas.setUkuran("XL");
        ctas.cetakStatus();
        
    }

}
