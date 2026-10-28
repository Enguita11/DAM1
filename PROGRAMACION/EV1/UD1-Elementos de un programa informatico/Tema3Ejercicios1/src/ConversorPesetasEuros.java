import java.util.Scanner;

public class ConversorPesetasEuros {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         final double PESETAS = 166.386;
        System.out.println("Dime la cantidad de pesetas que quieres pasar a euros: ");
        double cambioPesetas = s.nextDouble();
        if ( cambioPesetas <= 0 ){
            return;
        }
        System.out.println(cambioPesetas + " pesetas a euros es: " + cambioPesetas / PESETAS + " euros.");
    }
}
