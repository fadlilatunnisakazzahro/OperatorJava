/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datavariabel;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KasirMakanan {
    public static void main(String[] args) {
        System.out.println("Menu Makanan : ");
        System.out.println("1. Soto Ayam (15000)");
        System.out.println("2. Mawon Daging (17000)");
        System.out.println("3. Mie Goreng (5000)");
        System.out.println("4. Tahu Telor (8000)");
        System.out.println("5.Sate Kambing (20000)");
        
        int soto,rawon,mie,tahu,sate;
        soto = 15000;
        rawon = 17000;
        mie = 5000;
        tahu = 8000;
        sate = 20000;
        
        int Jumlahbeli,Total,Bayar,Kembali;
        
        Scanner input = new Scanner ( System.in);
        System.out.println("Jumlah Beli : ");
        Jumlahbeli = input.nextInt();
        Total = Jumlahbeli*soto;
        Total += Jumlahbeli*rawon;
        Total += Jumlahbeli*mie;
        Total += Jumlahbeli*tahu;
        Total += Jumlahbeli*sate;
        System.out.println("Total Pembelian : " +Total);
        System.out.println("Masukkan Pembayaran:");
        Bayar = input.nextInt();
        Kembali = Bayar-Total;
        System.out.println("Jumlah Kembalian = " + Kembali);       
                
                
          
    }
    
}
