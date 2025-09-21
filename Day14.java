package stringtoprimitif;

public class StringToPrimitif {

    public static void main(String[] args) {
    
        System.out.println("====String to Primitif====");
         /*mengubah string menjadi tipe data primitif 
        yaitu dengan menggunakan
        tipedata.parseTipedataygdigunakan(nama variabl estring yang akan diubah);
        */
        String aku,aku1,aku2,aku3,aku4,aku5,aku6;
        
        aku = "19";
        byte kau = Byte.parseByte(aku);
        System.out.println("Umur \t\t: "+aku);
        
        aku1 = "39";
        short kau1 = Short.parseShort(aku1);
        System.out.println("Ukuran sepatu\t: "+ aku1);
        
        aku2 = "20";
        int kau2 = Integer.parseInt(aku2);  
        System.out.println("Jumlah Jari \t: "+aku2);
        
        aku3 = "089517107477";
        long kau3 = Long.parseLong(aku3); 
        System.out.println("no WA \t\t: "+aku3);
        
        aku4 = "169.2";
        float kau4 = Float.parseFloat(aku4);
        System.out.println("TB \t\t: "+aku4);

        aku5 = "50.4";
        double kau5 = Double.parseDouble(aku5); 
        System.out.println("BB \t\t: "+aku5);

        aku6 = "true";
        boolean kau6 = Boolean.parseBoolean(aku6);
        System.out.println("ULTRAMEN?\t: "+aku6);
     
        System.out.println("===Yaareeeeee===");
    }
    
}
