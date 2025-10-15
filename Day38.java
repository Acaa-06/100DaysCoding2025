package Rasyyy;

import java.util.Scanner;

public class AcaaMo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan a : ");
        int a = in.nextInt();

        if ( a > 0 ) {
           System.out.println(a + " Positif")
        }else if ( a < 0 ) {
           System.out.println(a + " Negatif")
        }else {
           System.out.println(a + " Nol")

    }

    }

}
