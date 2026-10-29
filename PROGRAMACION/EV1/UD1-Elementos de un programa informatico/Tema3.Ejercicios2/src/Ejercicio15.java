import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();
        int aux = num;
        for (int j = num-1; j >= 1; j--) {
            aux = aux * j;
        }
        System.out.println(aux);
    }
}
