import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        System.out.println("Introduce el numero de veces que quieras sumarlo");
        int num2 = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= num2; i++) {
            suma = suma + num;
        }
        System.out.println(suma);

    }
}
