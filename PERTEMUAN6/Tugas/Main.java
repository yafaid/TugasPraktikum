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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen(50000, "2041720251", "Pak Mourinho", "Malang");
        dosen.setSKS();
        Pegawai pegawai = new Pegawai("179366789", "Ole Solksjaer", "Jakarta");
        DaftarGaji daftarGaji = new DaftarGaji(25000);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);
        daftarGaji.printSemuaGaji();
    }
    
}
