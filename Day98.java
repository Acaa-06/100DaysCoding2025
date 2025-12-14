package rasyy;

import java.util.Scanner;

public class acaa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah fibonacci : ");
        int d = in.nextInt();
        
        int a = 1;
        int b = 1;
        int c;
        
        System.out.print("Angka fibonacci : ");
        for (int i = 1; i <= d; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
