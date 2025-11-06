package rasyy;

import java.util.Scanner;



public class ForWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int n =in.nextInt();
        System.out.print("Masukkan angka M : ");
        int m =in.nextInt();
        
        for (int i = 1; i <= n; i++) {
           if(i % m == 0){
               System.out.print(i+" ");
           }
        }
        System.out.println("\n");
