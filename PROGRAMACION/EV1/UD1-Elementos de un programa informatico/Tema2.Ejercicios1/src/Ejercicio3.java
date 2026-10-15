import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un numero del 65/122");
        int num = s.nextInt();

        char letra = (char) num;

        System.out.println("La letra es: " + letra);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
