package rasyy;

import java.util.Scanner;


public class Acaa {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a;
        System.out.print("Masukkan Angka : ");
        a = in.nextInt();
        
        for ( int i = 1; i <=a; i++) {
            System.out.print( i + " ");
                
        }
        System.out.print("| ");
        for (int i = a; i >= 1; i--) {
            System.out.print( i + " ");
            
        }
        System.out.println("");
    }
}
