package bilangandesimal;

public class BilanganDesimal {

    public static void main(String[] args) {
        //untuk type data bilangan desimal ada dua yaitu float dan double
        
        float aca1 = 169.12345677f; 
        float aca11 = (float)169.123456;
        // ukurannya 4 byte ,6 digit dibelakang koma
        
        double aca2 = 50.123456789101112;
        // ukuranya 8 byte, 15 digit dibealakang koma 
        
        System.out.println("tinggi badan \t:" + aca1);
        System.out.println("tinggi badan \t:" +aca11);
        /* pengunaan float ada 2 cara yaitu:
          1. memberikan f didepan isi variabel,dibelakang titik koma
          2. memberikan (float) dibelakang nama variabel
        */
        
        System.out.println("berat badan \t:" + aca2);
        // memberikan lebih banyak koma dibanding float
        
        /* output:
           tinggi badan     :169.3
           tinggi badan     :169.3
           berat badan      :50.24
        */
        }
    
}
