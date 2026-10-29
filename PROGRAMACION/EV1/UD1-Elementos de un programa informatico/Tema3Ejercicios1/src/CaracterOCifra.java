import java.util.Scanner;

public class CaracterOCifra {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una letra y te dire que es: ");
        char letra = sc.nextLine().charAt(0);

        if ((letra >= 'a' && letra <= 'z') || ( letra >= 'A' && letra <= 'Z')) {
            System.out.println("Es una letra");
        } else if (letra >= '0' && letra <='9') {
            System.out.println("Es un numero");
        } else {
            System.out.println("Es otro caracter");
        }
    }
}
