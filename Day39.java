package rasyy;

import java.util.Scanner;

public class MenuAca {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("====Menu====");
        System.out.println("1. Makanan ");
        System.out.println("2. Minumam ");
        System.out.println("3. Paket Makanan & Minumam ");
        System.out.print("Masukkan Pilihan : ");
        int a = in.nextInt();
        
        int b =0, c =0,d = 0;
        if (a == 1){
            System.out.println("\n1. Nasi goreng gila (Rp.15000)");
            System.out.println("2. Bakso (Rp.15000)");
            d = 15000;
            System.out.print("Masukkan Pilihan : ");
            b = in.nextInt();
            System.out.print("jumlah : ");
            c = in.nextInt();
        }else if ( a == 2 ){
            System.out.println("\n1. Es Teh (Rp.5000)");
            System.out.println("2. Es Jeruk (Rp.5000)");
            d = 5000;
            System.out.print("Masukkan Pilihan : ");
            b = in.nextInt();
            System.out.print("jumlah : ");
            c = in.nextInt();
        }else if ( a == 3 ){
            System.out.println("\n1. Nasi goreng gila + Es teh (Rp.18000)");
            System.out.println("2. Bakso + Es jeruk (Rp.18000)");
            d = 18000;
            System.out.print("Masukkan Pilihan : ");
            b = in.nextInt();
            System.out.print("jumlah : ");
            c = in.nextInt();   
        }else{
            System.out.println("\nBelum Tersedia");
        }
        
        int total = d * c ;
        System.out.println("Total Pebayaran = Rp."+total);
        System.out.println("Makasih Sudah Memesan Jangan Datang Kembali:)");
    }
    
}
