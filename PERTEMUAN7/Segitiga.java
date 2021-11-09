/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    private int sudut;

    void totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Total Sudut: " + sudut);
    }

    void totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total Sudut: " + sudut);
    }

    void keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
    }

    void keliling(int sisiA, int sisiB) {
        double keliling = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        System.out.println("Keliling: " + keliling);
    }

    public static void main(String[] args) {
        Segitiga ht = new Segitiga();

        ht.totalSudut(35);
        ht.totalSudut(15, 35);
        ht.keliling(15, 17, 19);
        ht.keliling(20, 30);
    }

}
