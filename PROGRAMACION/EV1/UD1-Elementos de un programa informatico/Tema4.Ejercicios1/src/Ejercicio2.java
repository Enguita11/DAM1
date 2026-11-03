import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te dire cual es el menor de tus dos numeros");
        do {
            System.out.println("Introduce el numero (debe ser un entero: ");
        }while (!sc.hasNextInt());
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el numero: ");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce el numero (debe ser un entero: ");
            sc.nextLine();
        }
        int num2 = sc.nextInt();
        sc.nextLine();
        int numeroMenor = menor(num, num2);
        System.out.println("El numero menor es: " + numeroMenor);
    }
    static int menor(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else if (num1 < num2) {
            return num1;
        }
        return num1;
    }
}
