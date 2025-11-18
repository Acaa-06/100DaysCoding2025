package rasyy;

import java.util.Scanner;

public class ForWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        for (;;) {
            System.out.print("Masukkan Angka Positif: ");
            int a =in.nextInt();
            if (a < 0) {
                System.out.println("===========================");
                System.out.println("Negatif Tidak Diperbolehkan");
                return;
            }   
        }
    }
}
