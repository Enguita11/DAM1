import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el valor de a");
        int a = s.nextInt();
        System.out.println("Dime el valor de b");
        int b = s.nextInt();
        int c = 0 ;

        c = a;
        a = b;
        b = c;
        System.out.println("a: " + a + " , b: " + b);

    }
}
