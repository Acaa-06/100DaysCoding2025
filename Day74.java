package rsyy;

import java.util.Scanner;

public class Scannner {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int total = 0;
        int total1 = 0;
        Integer max = null;
        Integer min = null;
        while (true){
            System.out.print("Masukkan Angka (negatif untuk berhenti ) : ");
            int a = in.nextInt();
 
         if ( a > 0 ){
             total += a;
             total1++;
         } 
            
         if (a < 0 ) break ;
         
         if (a == 0) {
             System.out.println("Angka 0 diabaikan");
             continue;
         }
  
         if (max == null || a > max ) max = a;
         
         if (min == null || a < min ){
             min = a;
        }
         }
        double rata = total / total1;
        System.out.println("====HASIL====");
        System.out.println("Total Penjumlahan : "+total);
        System.out.println("Jumlah Angka Valid : "+total1);
        System.out.println("Rata - Rata : "+rata);
        System.out.println("Angka Maksimum : "+max);
        System.out.println("Angka Minimum : "+min);
        
    }
}
