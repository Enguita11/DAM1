import java.util.Scanner;

public class Ejercicio33 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un numero y te dire los divisores");
        int num = s.nextInt();
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                System.out.println(j);
            }
        }

    }
}
