package rasyy;

public class Acaa {
    public static void main(String[] args) {
        int [] angka = {10,30,20,100,80,50};
        int max = angka[0];
      
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Nilai maxsimal : " + max);
    }
}
