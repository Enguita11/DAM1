import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ancho");
        int ancho = s.nextInt();
        System.out.println("Largo");
        int largo = s.nextInt();
        for (int i = largo; i >= 1 ; i--) {
            for (int j = 1; j <= ancho ; j++) {
                if ( i == 1 || j == 1 || j == ancho || i == largo  ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}
// j == 1 || j == ancho || i == largo