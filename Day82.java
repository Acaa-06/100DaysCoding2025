package rasyy;

import java.util.Scanner;

public class ArrayLatihan {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int jumlah = in.nextInt();
        
        int[] elemen = new int [jumlah];
        
        int total = 0;
        for (int i = 0; i <jumlah; i++) {
            System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
            elemen[i] = in.nextInt();
            in.nextLine();
        }
        int nol = 0;
        for (int i = 0; i <elemen.length; i++) {
            if(elemen[i] <= 0){
                elemen[i] = 0;
                nol++;
            }
           total += elemen[i];
        }
        
        System.out.println("");
        for (int i = 0; i <elemen.length; i++) {
            System.out.println("indeks "+i+" : "+elemen[i]);
        }
        System.out.println("");
        double rata = (double)total / elemen.length;
        System.out.println("Total nilai array : "+total);
        System.out.println("Rata-rata   array : "+rata);
        System.out.println("Jumlah Nilai Nol  : "+nol);
        
        
    }
    
}
