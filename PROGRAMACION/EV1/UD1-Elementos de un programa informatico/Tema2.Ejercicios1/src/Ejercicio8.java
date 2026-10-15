import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();

        double cociente = num1 / num2;
        System.out.printf("%.3f%n", cociente);
    }
}
