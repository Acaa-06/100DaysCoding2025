package aca16;

import java.util.Scanner;

public class Aca16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int a,b,c;
      
        System.out.print("masukkan a = ");
        a = input.nextInt();
        System.out.print("masukkan b = ");
        b = input.nextInt();
        
         c = a * b;
        System.out.println(a + " x " + b + " = " + c);
        c = b / a;
        System.out.println(b + " : " + a + " = " + c);
    }
    
}
