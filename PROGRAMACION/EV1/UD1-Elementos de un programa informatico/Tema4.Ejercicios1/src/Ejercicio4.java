import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();
        escribirTablaMultiplicar(num);
    }
    public static void escribirTablaMultiplicar(int num){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
