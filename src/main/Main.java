/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //objek
        Induk objek = new Induk();
        Anak object1 = new Anak();
        Induk object2 = new Anak();
        
        //Karena class Induk telah mewariskan kepada class Anak maka -
        //menggunakan object => object2
        object2.Sapaan();
        object2.menumakanan();
        object2.pemesanan();
    }
    
}
