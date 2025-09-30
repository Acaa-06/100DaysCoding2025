package rasyy;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner aca = new Scanner(System.in);
        System.out.print("Panjang = ");
        int P = aca.nextInt();
        
        System.out.print("Lebar = ");
        int L = aca.nextInt();
        
        /* rumus persegi panjang 
        l(luas) = panjang x lebar
        */
        
        int l = P * L;
        System.out.println("Panjang persegi "+P+"cm Lebar "+L+"cm dan luasnya adalah "+l+"cm");
    }
  
}
