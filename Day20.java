package pkg1_tipedata.variable;

public class PrimitifToNonPrimitif {
    public static void main(String[] args) {
        int bulat = 10;
        char aca = '@';
        boolean benar = true;
        float koma = 66f;
        
        String Inte = String.valueOf(bulat);
        String Car = String.valueOf(aca);
        String Bnar = String.valueOf(benar);
        String Kma = String.valueOf(koma);
        
        System.out.println(Inte);
        System.out.println(Car);
        System.out.println(Bnar);
        System.out.println(Kma);
        
        byte bulat1 = 11;
        char aca1 = 'L';
        boolean salah = false;
        double koma1 = 99;
        
        String byte1 = bulat1 + "";
        String char1 = aca1 + "";
        String bool = salah + "";
        String dobel = koma1 + "";
        
        System.out.println(byte1);
        System.out.println(char1);
        System.out.println(bool);
        System.out.println(dobel);
        
        
    }
}
