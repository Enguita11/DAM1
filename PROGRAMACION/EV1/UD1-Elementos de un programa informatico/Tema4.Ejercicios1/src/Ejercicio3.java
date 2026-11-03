import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();
        System.out.println("Introduce la potencia: ");
        int potencia = sc.nextInt();
        numeroElevado(num, potencia);
    }
    public static void numeroElevado(int num, int potencia) {
        int resultado = num;
        for (int i = 0; i <= potencia ; i++) {
            resultado = resultado * num;
        }
        System.out.println(resultado);
    }
}
