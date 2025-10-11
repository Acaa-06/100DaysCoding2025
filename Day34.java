import java.util.Scanner;
public class Acaa {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.print("masukan nilai a : ");
        int a = in.nextInt();
        System.out.print("masukan nilai b : ");
        int b = in.nextInt();
        System.out.print("masukan nilai c : ");
        int c = in.nextInt();
      
        //operator penugasan
        a += 2;
        System.out.println("nilai operator penugasan : "+ a);
      
        //operator aritmatika
        int d = (a * b + c);
        System.out.println("hasil penjumlahan : "+ d);
      
        //operator perbandingan dan logika
        boolean e = (d > 10) && (a < b);
        System.out.println("hasil perbandingan dan logika : "+ d);
        
    }
    
}
