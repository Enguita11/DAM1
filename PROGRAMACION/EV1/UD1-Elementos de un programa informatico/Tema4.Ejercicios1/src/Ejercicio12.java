import java.util.Scanner;

public class Ejercicio12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int num = fibonacci(pos);
        System.out.println(num);
    }
    static int fibonacci(int pos){
        if (pos <= 0){
            return 0;
        } else if (pos <= 1) {
            return 1;
        } else {
            return fibonacci( pos -1) + fibonacci(pos-2);
        }

    }
}
