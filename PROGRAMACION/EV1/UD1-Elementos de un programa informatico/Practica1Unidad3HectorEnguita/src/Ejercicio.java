import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        //Hago el scanner para leer el numero entero
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un numero");
        int suma = 0;
        do {
            //Pido un numero y si no es se le vuelvo a preguntar
            while (!sc.hasNextInt()) {
                System.out.println("Dime un numero: ");
                sc.nextLine();
            }
            //Lo recogo solo si es un int (entero)
            num = sc.nextInt();
            //Creo una variable i que coge el utlimo digito del numero que en cada iteracion cambia y vuelve a valer el ultimo digito
            //Le digo que num le quite ese ultimo digito que hemos robado
            //le digo que ese ultimo digito lo sume a un acumulador
            //Y lo repito hasta que numero sea 0 o 0,algo
            do {
                int i = num % 10;
                num = num / 10;
                suma = suma + i;
            } while (num != 0);

            // si el numero es negativo se para
        }while (num > 0);
        //Imprimo la suma
        System.out.println("La suma de las cifras de tu numero es: " + suma);
    }
}
