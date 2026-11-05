import java.util.Scanner;

public class Ejercicio13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hasta que posicion: ");
        int pos = sc.nextInt();
        mostrarFibonacci(pos);

    }

    static int fibonacci(int pos) {
        if (pos <= 0) {
            return 0;
        } else if (pos <= 1) {
            return 1;
        } else {
            return fibonacci(pos - 1) + fibonacci(pos - 2);
        }

    }

    static void mostrarFibonacci(int pos) {
        for (int i = 0; i <= pos; i++) {
            System.out.println(fibonacci(i));
        }
        return;
    }
}
