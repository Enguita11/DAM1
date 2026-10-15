import java.util.Scanner;

public class Ejercicio9 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime dos numeros: ");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        System.out.println(Math.pow(num1, num2));
    }
}
