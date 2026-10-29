import java.util.Scanner;

public class ConversorPesetasEuros {
<<<<<<< HEAD
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         final double PESETAS = 166.386;
        System.out.println("Dime la cantidad de pesetas que quieres pasar a euros: ");
        double cambioPesetas = s.nextDouble();
        if ( cambioPesetas <= 0 ){
            return;
        }
        System.out.println(cambioPesetas + " pesetas a euros es: " + cambioPesetas / PESETAS + " euros.");
=======
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesetas = sc.nextDouble();
        double euros = pesetas / 166.386;
        System.out.println(pesetas + " Pesetas a euros " + euros);
>>>>>>> efe6f0a07a2df99f883fba9415212bfaa216eb50
    }
}


