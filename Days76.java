package rasyy;

import java.util.Scanner;

public class Aca {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan teks ke-1 : ");
        String a = in.nextLine();

        System.out.print("Masukkan teks ke-2 : ");
        String b = in.nextLine();

        System.out.println("\n=== Hasil Pengecekan ===");
        System.out.println("equals()            : " + a.equals(b));
        System.out.println("equalsIgnoreCase()  : " + a.equalsIgnoreCase(b));
        System.out.println("contains()          : " + a.contains(b));
        System.out.println("isEmpty() teks ke-1 : " + a.isEmpty());
        System.out.println("isEmpty() teks ke-2 : " + b.isEmpty());
    }
}
