package rasyy;

import java.util.Scanner;

public class Aca {
    public static void kataKata(String kata ) {
        System.out.println(kata);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Masukan kata : ");
        String a = in.nextLine();
        kataKata(a);
      
    }
}
