package rasyy;

import java.util.Scanner;

public class SoalMentor {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("1. Persegi");
        System.out.println("2. Luas Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.print("pilih no : ");
        int a =in.nextInt();
        System.out.println("====Mengitung====");
        switch (a){
            case (1) ->{
                System.out.print("Sisi : ");
                int b =in.nextInt();
                int total = b*b;
                System.out.printf("luas persegi adalah %d",total);
            }
            case (2) ->{
                System.out.print("jari - jari : ");
                int b =in.nextInt();
                final double phi = 22.0 / 7.0;
                double total = phi * b * b;
                System.out.printf("luas Lingkaran adalah %.2f",total);
            }
            case (3) ->{
                System.out.print("Panjang : ");
                int b =in.nextInt();
                System.out.print("Lebar : ");
                int c =in.nextInt();
                int total = b * c;
                System.out.printf("luas persegi panjang adalah %d",total);
        }
        
    }
    
    }
}
