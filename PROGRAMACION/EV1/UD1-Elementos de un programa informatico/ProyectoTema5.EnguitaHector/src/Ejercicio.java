import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase: ");
        String frase = sc.nextLine().toLowerCase();
        //Creo un array que coja palabra por palabra separado por espacios
        String[] palabras = frase.toLowerCase().split(" ");
        //La ordeno alfabeticamente
        Arrays.sort(palabras);
        for (int i = 0; i < palabras.length; i++) {
            String p = palabras[i];
            System.out.println(p);
        }
        sc.close();
    }
}
