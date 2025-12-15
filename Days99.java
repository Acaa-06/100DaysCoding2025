package rasyy;

import java.util.Scanner;

public class Acaa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Batasan : ");
        int a = in.nextInt();
        
        System.out.print("========================\n");
        System.out.print("Deretan bilangan prima: ");

        for (int i = 2; i <=a; i++) {
            int pembagi = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }

            if (pembagi == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
