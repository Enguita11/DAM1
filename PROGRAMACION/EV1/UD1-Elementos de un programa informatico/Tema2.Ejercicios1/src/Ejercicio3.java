import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un numero del 65/122");
        int num = s.nextInt();

        char letra = (char) num;
        System.out.println(letra);
    }
}
