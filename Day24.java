package rasyy;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        final double phi =3.14;
        System.out.print("masukkan jari\" : ");
         int r = in.nextInt();
         
        System.out.println("langkah\"\n l = "+phi+(" x ")+r+(" x "+r)); 
        
        double l = phi * r * r;
        System.out.println("Luas Lingkaran = "+l);
        
        
        
        
    }
   
}
