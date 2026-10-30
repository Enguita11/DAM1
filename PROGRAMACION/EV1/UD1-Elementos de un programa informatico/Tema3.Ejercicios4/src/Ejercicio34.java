import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un numero y te dire los divisores");
        int num = s.nextInt();
        int numdividido= num;
        int divisoraux = 2;

        for (int i = 0; divisoraux <= num ; i++) {
            if (numdividido % divisoraux == 0) {
                System.out.println(divisoraux);
                numdividido /= divisoraux;
            } else {
                divisoraux++;
            }
        }
    }
}
