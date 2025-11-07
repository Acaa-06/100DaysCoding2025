package rasyy;

import java.util.Scanner;



public class ForWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int n =in.nextInt();
        
        int total =0;
        for (int i = 1; i <= n; i++) {
            total += i;
           }
               System.out.print(total+" ");
        
        System.out.println("");
    }
}
