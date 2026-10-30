import java.util.Scanner;

public class Ejercicio28 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Caracteres de alto?: ");
        int alto = s.nextInt();
        for (int i = alto; i >=1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
