import javax.swing.*;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = sc.nextInt();
        int resultado = sumaCifras(num);
        System.out.println(resultado);
    }
    public static int sumaCifras(int num){

        if (num <= 0){
            return 0;
        } else {
            return num%10 + sumaCifras(num/10);
        }

    }
}
