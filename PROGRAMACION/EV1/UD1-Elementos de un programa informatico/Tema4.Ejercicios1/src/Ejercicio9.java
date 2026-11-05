import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero para la cuenta atras: ");
        int num = sc.nextInt();
        cuentaAtras(num);
    }
    static void cuentaAtras(int n){
        if (n <= 0){
            System.out.println("0");
           return;
        }
        System.out.println(n);
        cuentaAtras(n-1);
    }
}
