import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Numero: ");
        double num = s.nextDouble();
        int resultado = (int) signo(num);
        System.out.println(resultado);
    }
    public static double signo(double numero){
        if (numero > 0){
            return numero = 1;
        } else if (numero < 0) {
            return numero = -1;
        } else {
            return numero = 0;
        }
    }
}
