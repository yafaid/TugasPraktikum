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
public class cBass extends cSound {

    private int VolumeBass;

    public void SetVolumeBassUp(int increment) {
        VolumeBass = VolumeBass + increment;
    }
    public void SetVolumeBassDown(int increment) {
        VolumeBass = VolumeBass - increment;
    }
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Volume Bass : " + VolumeBass);
    }
}
