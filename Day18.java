package day18;

public class AcaBesarKecil {
    public static void main(String[] args) {
        byte aca = 6;
        short aca1 = aca;
        System.out.println(aca1);
        
        short aca2 = 10;
        int aca3 = aca2;
        System.out.println(aca3);
        
        int aca4 = 2006;
        long aca5 = aca4;
        System.out.println(aca5);
        
        float aca6 = 169f;
        double aca7 = aca6;
        System.out.println(aca7);
        
        System.out.println("saya lahir pada tanggal "+aca1+" bulan "+aca3+" tahun "+aca5+" dan tinggi badan saya "+aca7);
    }
}
