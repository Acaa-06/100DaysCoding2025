package soallatihan1;

import java.util.Scanner;

public class Aca {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        int a = in.nextInt();
        String yes = ( a % 2 == 0) ? "genap" : "ganjil";
        
        System.out.println("================");
        System.out.printf("Angka %d adalah bilangan %s",a,yes);
        System.out.println("");
    }
   
}
