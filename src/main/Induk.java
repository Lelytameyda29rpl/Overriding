/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
//Class Induk Yang Mewariskan
public class Induk {
    //Mendeklarasikan Variabel
    int pilihan,jumlah_makanan,harga;
    //Untuk mengambil inputan dari keyboard
    Scanner input = new Scanner(System.in);
    
    //Method pertama 
    public void Sapaan(){
        System.out.println("RESTORAN MATJEO");
        System.out.println("===============");
    }
    //Method Kedua
    public void menumakanan(){
        //Menyebutkan daftar menu dan harga makanan yang ada
        System.out.println("DAFTAR MENU DAN HARGA MAKANAN");
        System.out.println("1.Nasi Goreng Rp.23.000");
        System.out.println("2.Soto Betawi Rp.38.000");
        System.out.println("3.Sate Meranggi Rp.29.000");
        System.out.println("=============================");
    }
    //Method Ketiga
    public void pemesanan(){
        System.out.println("Pembeli Melakukan Pemesanan Makanan");
        //User memasukkan nilai variabel pilihan nomor dari daftar menu dan harga makanan yang di pesan
        System.out.print("Masukkan No.Menu Makanan Yang Ingin Di Pesan:");
        pilihan = input.nextInt();
        //Menerapkan percabangan Switch Case untuk menentukan pesanan makanan yang di pilih
        switch(pilihan){
            //Pilihan Pertama
            case 1:
                System.out.println("Menu Dan Harga Makanan Nasi Goreng Rp.23.000");
                //User memasukkan nilai variabel jumlah makanan yang di pesan
                System.out.print("Masukkan Jumlah Makanan Yang Ingin Di Pesan:");
                jumlah_makanan = input.nextInt();
                //Rumus untuk menentukan total akhir pembayaran 
                harga = 23000*jumlah_makanan;
                System.out.println("Total Pembayaran: "+harga);
            break;
            //Pilihan Kedua
            case 2:
                System.out.println("Menu Dan Harga Makanan Soto Betawi Rp.38.000");
                //User memasukkan nilai variabel jumlah makanan yang di pesan
                System.out.print("Masukkan Jumlah Makanan Yang Ingin Di Pesan:");
                jumlah_makanan = input.nextInt();
                //Rumus untuk menentukan total akhir pembayaran
                harga = 38000*jumlah_makanan;
                System.out.println("Total Pembayaran: "+harga);
            break;
            //Pilihan Ketiga
            case 3:
                System.out.println("Menu Dan Harga Makanan Sate Meranggi Rp.29.000");
                //User memasukkan nilai variabel jumlah makanan yang di pesan
                System.out.print("Masukkan Jumlah Makanan Yang Ingin Di Pesan:");
                jumlah_makanan = input.nextInt();
                //Rumus untuk menentukan total akhir pembayaran
                harga = 29000*jumlah_makanan;
                System.out.println("Total Pembayaran: "+harga);
            break;
        }
    }
    
    
    
    
}
