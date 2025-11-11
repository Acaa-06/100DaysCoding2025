package rasyy;

import java.util.Scanner;

public class ForWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka Faktorial : ");
        int n =in.nextInt();
        
        int total =1;
        for (int i = n; i >=1; i--) {
            total *= i;
           }
               System.out.print(total+" ");
        
    }
}
