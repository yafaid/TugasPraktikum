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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Takemichi tk = new Takemichi("Takamichi", "1 SMP");
        Touman tm = new Touman("Tokyo Manji","Divisi 1", "Keisuke Baji");
        Naoto nt = new Naoto ();
        Ability ab = new Ability();

        nt.setName("Naoto");
        nt.setKelas("1 SD");
        tm.setAnggota(tk);

        System.out.println("Nama Organisasi :" + tm.getNama());
        System.out.println("Nama Ketua :" + tm.getName());
        System.out.println("Nama Divisi :" + tm.getDiv());
        System.out.println("Nama Anggota :" + tm.getAnggota().getNama());

        
        System.out.println("Takemichi bergantung dengan " + nt.getNama());
        ab.salaman();
        System.out.println();
        ab.kemampuan();
    }

}
