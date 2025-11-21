package rasyy;

import java.util.Scanner;

public class Aca {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
      
        System.out.print("Masukkan teks : ");
        String k = in.nextLine();
      
        System.out.println("Jumlah Karakter : " + k.length());
        System.out.println("Huruf Kapital   : " + k.toUpperCase());
        System.out.println("Huruf kecil     : " + k.toLowerCase());

    }
}
