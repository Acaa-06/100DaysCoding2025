package rasyy;

public class Aca {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};  
        int total = 0;
        
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Total angka array = " + total);
    }
}
