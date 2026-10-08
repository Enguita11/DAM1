import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el valor de a: ");
        int a = s.nextInt();
        System.out.println("Dime el valor de b: ");
        int b = s.nextInt();
        a = a + b;
        System.out.println( "a: " + a);
        b = a - b;
        System.out.println("b: " + b);
        a = a - b;
        System.out.println("a: " + a);


    }
}
