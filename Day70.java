package Rsyy;
import java.util.Scanner;
public class Aca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan kolom   : ");
        int k = in.nextInt();
        System.out.print("Masukan baris : ");
        int b = in.nextInt();
        
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("* ");
            }
        System.out.println("");
        }
    }
}
