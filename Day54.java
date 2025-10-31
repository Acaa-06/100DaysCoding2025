package rasyy;

import java.util.Scanner;


public class ForWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a,b=0;
        System.out.print("Masukkan Angka : ");
        a = in.nextInt();
        
        for ( b = 1; b <=a; b++) {
            if ( b == 2 || b == 4) continue;
            System.out.print( b + " ");
                
        }
        System.out.println("");
    }
}
