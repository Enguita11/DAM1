import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAl = new int[10];
        for (int i = 0; i <= numAl.length-1; i++) {
            numAl[i] = (int) (Math.random()*100);
        }
        for (int num : numAl){
            System.out.print(num + " ");
        }

        int num;
        boolean encontrado = false;
        do {
            System.out.println("Busqueda de un numero");
            System.out.println("Dime un numero entero: ");
            num = sc.nextInt();
            sc.nextLine();
            for ( int i : numAl){
                if (i == num){
                    encontrado = true;
                    break;
                }
            }

        } while (num >= 0);
        System.out.println(encontrado);

    }
}
