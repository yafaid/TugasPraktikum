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
public class cTreble extends cSound{
    private int VolumeTreble;

    public void SetVolumeTrebleUp(int increment) {
        VolumeTreble = VolumeTreble + increment;
    }
    public void SetVolumeTrebleDown(int increment) {
        VolumeTreble = VolumeTreble - increment;
    }
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Volume Treble : " + VolumeTreble);
    }
}
