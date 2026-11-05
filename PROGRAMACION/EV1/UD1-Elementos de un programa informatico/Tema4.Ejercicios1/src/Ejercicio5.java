import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una anchura");
        int num = sc.nextInt();
        System.out.println("Ingrese un caracter");
        char caracter = sc.next().charAt(0);
        escribirTriandulo(num, caracter);
    }
    public static void escribirTriandulo (int ancho, char car){
        for (int i = ancho; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(car);
            }
            System.out.print("\n");
        }
    };
}
