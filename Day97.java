package rasyy;

import java.util.Scanner;

public class Acaa {
  public static int hitungLuas(int s) {
    int Luas = s * s;
    System.out.println("Luas Persegi = " + Luas);
    return Luas;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);

    System.out.print("Masukkan Sisi : ");
    int a = in.nextInt();

    hitungLuas(a);

  }
}
      
      
