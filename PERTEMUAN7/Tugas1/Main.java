/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Dosen dos = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        man.bernafas();
        man.makan();
        dos.makan();
        dos.lembur();
        mhs.makan();
        mhs.tidur();
    }
}
