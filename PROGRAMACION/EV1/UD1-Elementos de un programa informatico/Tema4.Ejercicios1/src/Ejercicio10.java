import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial de: ");
        int num = sc.nextInt();
        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);
    }
    static int factorial(int num){

        for (int i = num-1; i >= 1 ; i--) {
            num = num * i;
        }
        return num;
    }
}
