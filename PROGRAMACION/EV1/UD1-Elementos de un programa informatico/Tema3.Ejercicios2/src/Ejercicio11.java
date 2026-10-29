import java.util.Scanner;

public class Ejercicio11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        System.out.println("Introduce el divisor");
        int div = sc.nextInt();
        int division= num;
        int i;
        for ( i = 0; division >= div; i++) {
            division = division - div;
        }
        System.out.println(i);
    }
}
