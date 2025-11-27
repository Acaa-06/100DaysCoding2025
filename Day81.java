package rasyy;

import java.util.Scanner;

public class Acaa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nilai = {95, 90, 80, 88, 97};     

        System.out.print("Masukkan indeks : ");
        int i = in.nextInt();
        
        if (i >= 0 && i < nilai.length) {
            System.out.println("Nilai pada indeks "+ i +" = "+ nilai[i]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
