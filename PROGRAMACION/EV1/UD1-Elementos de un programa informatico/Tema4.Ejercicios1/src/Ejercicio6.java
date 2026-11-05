import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        System.out.println("Dime el segundo numero y te hare una media: ");
        int num2 = sc.nextInt();
        System.out.println(mediaAritmetica(num,num2));


    }
    public static double mediaAritmetica(int num1, int num2){
        return (double) (num1 + num2) /2;
    }
}
