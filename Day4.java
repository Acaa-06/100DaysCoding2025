package escapesequence;


public class EscapeSequence {


    public static void main(String[] args) {
    /*Escape Sequence memiliki beberapa kode yaitu: 
(\n ,\t,\b,\r, \\, \', \", \ ), 
kode tersebut memiliki fungsi yang berbeda beda contohnya sbb:*/

    // (\n)berfungsi untuk memindahkan teks dibaris didepan kode atau sama dengan enter
        System.out.println("instagram \n_mhmdrsyaaa_");
        
    // ((\t) berfungsi ini sama seperti tab, bisa untuk merapikan teks     
        System.out.println("ig\t: _mhmdrsyaaa_");
    
    //( \b) berfungsi untuk menghilangkan 1 karakter di belakang kode   
        System.out.println("acar\b aja");
    
    // (\r) berfungsi untuk menghilangkan teks dibelakang kode
        System.out.println("mohammad rasya \raca ");
        
    // (\\) berfungsi untuk menampilkan 1 backslash di teks
        System.out.println("rasya\\asya\\aca ");
        
    // (\') berfungsi untuk menampilkan 1 tanda (') di kata
        System.out.println("always love \'mother\'");
        
    // (\") berfungsi untuk menampilkan 2 tanda (") di kata    
        System.out.println("always love \"father\"");
        
    /* (\) berfungsi jika kita menggunakan kode unicode  
        untuk mengetahui kode unicode kita bisa lihat di goggle dll.
        cara penggunaannya yaitu: \kode unicode.
        */ 
        System.out.println("\u0061\u0063\u0061");
    }
    
}
