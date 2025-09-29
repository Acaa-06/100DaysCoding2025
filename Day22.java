import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = inp.nextInt();

        // Rumus -> sisi×sisi
        int luas = sisi * sisi;
        System.out.println("Sisi persegi adalah "+sisi+"cm dengan luas persegi "+luas+"cm");
    }
}
