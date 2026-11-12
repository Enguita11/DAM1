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

        do {
            System.out.println("Busqueda de un numero");
            System.out.println("Dime un numero entero: ");
            num = sc.nextInt();
            if (num < 0){
                return;
            }
            boolean encontrado = false;
            for ( int i : numAl){
                if (i == num){
                    encontrado = true;
                    break;
                }
            }
            if (encontrado){
                System.out.println(num + " Se encuentra en la lista");
            } else {
                System.out.println(num + " No se encuentra en la lista");
            }

        } while (num >= 0);

    }
}
