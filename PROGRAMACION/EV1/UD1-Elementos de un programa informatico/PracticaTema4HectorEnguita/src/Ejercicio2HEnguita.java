import java.util.Scanner;

public class Ejercicio2HEnguita {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el numero (debe ser un entero): ");
            sc.nextLine();
        } while (!sc.hasNextInt());
        int num1 = sc.nextInt();

        do {
            System.out.println("Introduce el numero (debe ser un entero): ");
            sc.nextLine();
        } while (!sc.hasNextInt());
        int num2 = sc.nextInt();
        int numactual = 0;
        int suma = 0;
        while (true) {
            //Sumo los 2 ultimos numeros
            suma = num1 + num2;
            do {
                System.out.println("Introduce el numero");
                sc.nextLine();
            } while (!sc.hasNextInt());
            numactual = sc.nextInt();
            //Si el numero que acabo de meter es menor que la suma de los dos anteriores paro el programa
            if (numactual < suma) {
                return;
            }
            //El antepenultimo numero va a pasar a ser el penultimo
            num1 = num2;
            //El penultimo numero va a pasar a ser el actual
            num2 = numactual;
            //Cambio esto despues de evaluar
        }
    }


}

