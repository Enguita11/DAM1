import java.util.Random;

public class Ejercicio11 {
    static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(-10, 10);
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
        for (int i = 0; i < num.length; i++) {
            boolean repetido = false;


            for (int j = 0; j < i; j++) {
                if (num[j] == num[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        System.out.print(num[i] + " ");
                        break;
                    }
                }
            }
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    repetido = true;
                }
            }
            System.out.println();
            if (!repetido) {
                System.out.print(num[i]+ " ");
            }

        }

    }
}
