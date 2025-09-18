package scanneraca;
import java.util.Scanner;
//untuk menggunkan Scanner kita haru memanggil atau mengimportnya yang sudah di sediakan di librarya

public class ScannerAca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           /*Sesudah kita memanggil Scanner dari Library kita harus memasukkan kode seperti diatas
//        kode itu berfungsi agar kita bisa menggunakan Scanner yang sudah kita pannggil tadi dari Library
          kegunaanya,agar kita bisa mengetik langsung di tampilan output 
//        sehinggah itu memudahkan kita
//        */
//       
       String nama; 
       int Umur;
       double TB;
       boolean aca;
       
        System.out.print("Masukkan nama \t\t\t: ");
        nama = input.nextLine();
        /*Untuk pengunaan tipe data String kita menggunakan nextLine,kita juga sebenarnya menggunakan nxt saja
         tapi bedanya jika kita menggunakan next saja teks yang kita input hanya satu kata         sedangkan nextLine bisa lebih dari satu kata*/
        
        System.out.print("masukkan umur \t\t\t: ");
        Umur = input.nextInt();
        //untuk penggunaan bilngan bulat kita menggunakan nextInt
        
        System.out.print("Masukkan TB \t\t\t: ");
        TB = input.nextDouble();
        //untuk penggunaan bilangan desimal kitaa bisa menggunakan nextDouble
        
        System.out.print("Bp kamu jokowi? true/false \t: ");
        aca = input.nextBoolean();
        // untuk penggunaan true/false kita menggunakan nextBoolean
        
   /* untuk setiap penggunaan next kita sesuaikan dengan isi atau tipe data yang kita pakai
      dan setiap menggunakan next dan tipedata apa yang dipake kita harus menggunakan huruf kapital
      */

        
    }
    
}
