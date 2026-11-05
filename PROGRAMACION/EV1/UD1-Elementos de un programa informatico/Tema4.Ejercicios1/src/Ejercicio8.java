import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int num2 = 9;
        double numdouble = 5.6;
        double num2double = 5.56;
        System.out.println(mayor(num, num2));
        System.out.println(mayor(numdouble, num2double));

    }
    static int mayor(int num, int num2){
        if (num > num2){
            return num;
        } else {
            return num2;
        }
    }
    static double mayor(double num, double num2){
        if (num > num2){
            return num;
        } else {
            return num2;
        }
    }
}
