package rasyy;

import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b,c,d,e;
        System.out.print("Nama Kryawan   : ");
        String a = in.nextLine();
        System.out.print("Gaji Pokok     : ");
        b = in.nextInt();
        System.out.print("Potongan pajak : ");
        c = in.nextInt();
        System.out.print("Potongan Bank  : ");
        d = in.nextInt();
        
        e = b -(c + d);
        System.out.println("=======================");
        System.out.printf("%s Menerima gaji sebesar Rp%d tetapi dapat"
                + " potongan pajak sebesar Rp%d dan potongan dari bank Rp%d"
                + " jadi gaji bersih yang diterima tersisa Rp%d",a,b,c,d,e);
        System.out.println(" ");
    }
    
}
