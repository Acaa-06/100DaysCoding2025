package rasyy;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("==== Menu Makanan====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bakso");
        System.out.println("3. Coto");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = in.nextInt();
        System.out.print("Jumlah Porsi: ");
        int porsi = in.nextInt();

        int harga,total;

        switch (pilihan) {
            case 1 -> {
                harga = 15000;
                total = harga * porsi;
                System.out.printf("Harga Nasi Goreng %d porsi Sebesar Rp%d",porsi,total);
            }
            case 2 -> {
                harga = 12000;
                total = harga * porsi;
                System.out.printf("Harga Bakso %d porsi Sebesar Rp%d",porsi,total);
            }
            case 3 -> {
                harga = 18000;
                total = harga * porsi;
                System.out.printf("Harga Coto %d porsi Sebesar Rp%d",porsi,total);
            }
            default ->
                System.out.println("Makanan belum tersedia!");
        }
        System.out.println(" ");
    }
}
