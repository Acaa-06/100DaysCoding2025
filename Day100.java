package pkg100daycodingisc;

import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String teks = sc.nextLine();
        
        boolean tamp1 = false;
        boolean tamp2 = false;
        boolean tamp3 = false;
        
        for (int i = 0; i < teks.length(); i++) {
            char a = teks.charAt(i);
            if (!tamp1) {
                if (a == 'I') {
                    tamp1 = true;
                }  
            }else if(!tamp2){
                if (a == 'S') {
                    tamp2 = true;
            }
            }else if (!tamp3) {
                if (a == 'C') {
                    tamp3 = true;
                }
            } 
            }
        if (tamp1 && tamp2 && tamp3) {
            System.out.println("CANTIK");
            
        }else{
            System.out.println("TIDAK CANTIK");
        }
    }
    
}
