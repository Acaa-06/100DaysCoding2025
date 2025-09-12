package bilanganbulat;

public class BilanganBulat {

    public static void main(String[] args) {
        // type data bilangan bulat ada 4 yaitu,(byte,short, int, long.) tipe data ini dibedakan dari ukuran atau kapasitas
        
    byte aca1 = 06;
    short aca2 = 10;
    int aca3 = 2006;
    long aca4 = 3;
    
        System.out.println("tanggal : " + aca1);
        //(byte) untuk menghemat memori data yang kecil,untuk ukurannya 8bit
        
        System.out.println("bulan \t: " + aca2);
        //(short) sama saja untuk menghemat tetapi lebih besar dari byte, ukurannya 16bit
        
        System.out.println("tahun \t: " + aca3);
        //(int) yang sering digunakan dan lebih besar dari byte dan short, ukurannya 32bit
        
        System.out.println("Anak ke : " + aca4);
        //(long) paling besar dari tipe data bilangan bulat,untuk ukurannya 64bit
    }
    
}
