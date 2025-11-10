package rasyy;
import java.util.Scanner;

public class ForWhile {
public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

        System.out.print(" M: ");
        int m = in.nextInt();
        System.out.print("N: ");
        int n = in.nextInt();
        
        int pangkat = 1;
        
        for (int i = 1; i <= n; i++) {
            pangkat *= m;
        }
        
        System.out.println(m + " pangkat " + n + " = " + pangkat);
        
        
    }
}
    
