import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Alto: ");
        int alto = s.nextInt();
        for (int i = 1; i <= alto ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
