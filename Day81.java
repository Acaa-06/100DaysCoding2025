package rasyy;

import java.util.Scanner;

public class Acaa {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] nilai = {99, 90, 80, 88, 77};
      
        System.out.print("Masukkan indeks : ");
        int i = in.nextInt();
        System.out.println("Nilai pada indeks " + i + " = " + nilai[i]);
    }
}
