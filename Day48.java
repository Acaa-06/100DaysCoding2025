
package pkgaca;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka: ");
        double angka1 = input.nextInt();
        System.out.print("Operator \"=, -, *, / \": ");
        char pilih = input.next().charAt(0);
      
        double angka2;
        
        switch (pilih){
            case '+':
                System.out.print("Masukkan Angka: ");
                angka2 = input.nextDouble();
                System.out.println(angka1+" + "+angka2+" = "+(angka1+angka2));
                break;
            case '-':
                System.out.print("Masukkan Angka: ");
                angka2 = input.nextDouble();
                System.out.println(angka1+" + "+angka2+" = "+(angka1-angka2));
                break;
            case '*':
                System.out.print("Masukkan Angka: ");
                angka2 = input.nextDouble();
                System.out.println(angka1+" + "+angka2+" = "+(angka1*angka2));
                break;
            case '/':
                System.out.print("Masukkan Angka: ");
                angka2 = input.nextDouble();
                System.out.println(angka1+" + "+angka2+" = "+(angka1/angka2));
                break;
            default:
                System.out.println("Operator tidak terdaftar");
                break;
        }
    }
}
