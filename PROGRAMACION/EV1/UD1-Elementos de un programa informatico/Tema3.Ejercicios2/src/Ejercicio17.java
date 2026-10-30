import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double facturacionanual = 0;
        double mejorMes = 0;
        double peorMes = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Dime lo que has facturado el mes: " + i);
            double facturacion = s.nextDouble();
            if (i == 1){
                peorMes = facturacion;
            }
            facturacionanual = facturacionanual + facturacion;
            if (mejorMes < facturacion){
                mejorMes = facturacion;
            }
            if (peorMes > facturacion){
                peorMes = facturacion;
            }

        }
        System.out.println("Este año has facturado: " + facturacionanual);
        System.out.println("La media es: " + facturacionanual / 12);
        System.out.println("El mejor mes has facturado: " + mejorMes);
        System.out.println("El peor mes has facturado: " + peorMes);
        s.close();
    }
}
