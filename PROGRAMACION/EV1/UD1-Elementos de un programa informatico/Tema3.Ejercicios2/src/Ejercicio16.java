import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        final double VALORPESETAS= 166.386;
        Scanner s = new Scanner(System.in);

        double pesetas;
        do {
            System.out.println("Dime las pesetas que quieras cambiar a euros: ");
            pesetas = s.nextDouble();
            if (pesetas > 0){
                System.out.println(pesetas + " pesetas en euros: " + pesetas / VALORPESETAS);
            } else if (pesetas < 0) {
                System.out.println("El valor no puede ser negativo");
            }
        } while (pesetas != 0);



    }
}
