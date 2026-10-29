import java.util.Scanner;

public class ConversorPesetasEuros {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //AAAAAAAAAAAAAAAAAAAAAAAAAAA
        System.out.println("Dime las pesetas que quieras cambiar a euros: ");
        double pesetas = s.nextDouble();
        double convertir = pesetas / 166.386;
        System.out.println("Pesetas convertidas: " + convertir);
        //BBBBBBBBBBYCCCCCCCCCCCCCCCC
        System.out.println("Dime las pesetas que quieras cambiar a euros: ");
        double pesetasB = s.nextDouble();
        if (pesetasB > 0){
            double convertirB = pesetas / 166.386;
            System.out.println("Pesetas convertidas: " + convertir);
        } else {
            System.out.println("Pesetas negativas");
        }

    }
}


