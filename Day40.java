package latihan;

import java.util.Scanner;

public class Aca40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       double a,b,d=0;
        System.out.println("====Kalkulator====");
        System.out.println("Masukkan nilai a,symbol operator dan perkalian ");
        System.out.print(": ");
        a = in.nextDouble();
        
        char c = in.next().charAt(0);
        
        b = in.nextDouble();
        
        double total = 0;
        System.out.println("===Hasil==");
        
        if (c == '+'){
            total = a + b;
            System.out.println(a+" + "+b+" = " + (int)total);
        }else if (c == '-'){
            total = a - b;
            System.out.println(a+" - "+b+" = " + (int)total);
        }else if (c == '*'){
            total = a * b;
            System.out.println(a+" x "+b+" = " + (int)total);
        }else if (c == '/'){
            total = a / b;
            System.out.println(a+" : "+b+" = " + total);
        }else if (c == '%'){
            total = a % b;
            System.out.println(a+" % "+b+" = " + total); 
        }else {
            System.out.println("Operator yang anda masukkan salah");
        }
        
        
    }
        
}
