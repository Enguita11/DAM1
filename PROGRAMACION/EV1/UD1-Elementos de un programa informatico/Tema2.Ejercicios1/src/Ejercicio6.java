import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int num1 = s.nextInt();
        System.out.println("Numero 2: ");
        int num2 = s.nextInt();
        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("Es multiplo? " + (mayor % menor == 0));
    }
}
