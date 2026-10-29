import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y te dire cuantas cifras tiene");
        long num = sc.nextLong();
        int i;
        for (i = 0; num >= 1; i++) {
            num = num / 10;
        }
        System.out.println("El numero tiene " + i + " cifras.");
    }
}
