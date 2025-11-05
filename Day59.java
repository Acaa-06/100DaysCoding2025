package rasyy;

import java.util.Scanner;



public class ForWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        
        System.out.print("Masukkan N(Angka) : ");
        int a = in.nextInt();
        
        for (int i = 1; i <a; i++) {
            if (i % 2 == 0) System.out.print(i+" ");
        }
        System.out.print("| ");
        for (int i = 1; i <a; i++) {
            if (i % 2 == 1) System.out.print(i+" ");
        }
    }
}
