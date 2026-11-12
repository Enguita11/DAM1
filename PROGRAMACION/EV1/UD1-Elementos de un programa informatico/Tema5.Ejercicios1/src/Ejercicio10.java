import java.util.Random;

public class Ejercicio10 {
    static void main(String[] args) {
        int[] num = new int[10];
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(-10, 10);
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < num.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]){
                    repetido = true;
                    break;
                }
            }
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                System.out.print(num[i]+ " ");
            }
        }
    }
}
