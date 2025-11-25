package rasyy;

import java.util.Scanner;

public class Aca{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String Username = "Acaa";
        String Password = "2006";
        
        for (;;) {  
            System.out.print("Masukkan username: ");
            String userr = in.nextLine();
            System.out.print("Masukkan password: ");
            String pass = in.nextLine();
            if (userr.equals(Username) && pass.equals(Password)) {
                System.out.println("Login berhasil!");
                break;  
            } else {
                System.out.println("Username atau password salah, coba lagi.\n");
            }
        }
        System.out.println();
    }
}
