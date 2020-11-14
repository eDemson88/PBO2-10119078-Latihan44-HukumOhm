/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan44.hukumohm;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai batere = new Baterai();
        Baterai batere2 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + batere2.getKuatArus());
        System.out.println("Hambatan : " +batere2.getHambatan());
        System.out.println("Hasil tegangan: " + batere2.hitungTegangan());
    }
    
}
