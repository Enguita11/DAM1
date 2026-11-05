import java.util.Scanner;

public class Ejercicio11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial de: ");
        int num = sc.nextInt();
        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);
    }
    static int factorial(int num) {

        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
