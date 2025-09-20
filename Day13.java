package day13;

public class Day13 {
    public static void main(String[] args) {
        char a,b,c;
        a = '&';
        b = '$';
        c = '@';
        
        System.out.println("sebelum update :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
        
        a += b;
        b = (char)(a - b);
        a -= b;
        
        System.out.println("\nsetelah update :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
    }
    
}
