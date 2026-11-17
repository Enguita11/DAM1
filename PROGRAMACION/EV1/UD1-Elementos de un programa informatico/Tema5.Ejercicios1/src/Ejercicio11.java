import java.util.Random;
public class Ejercicio11 {
    static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            boolean repetido;
             do {
                 num[i] = r.nextInt(-10, 11);
                 repetido = false;
                 for (int j = 0; j < i; j++) {
                     if (num[i] == num[j]){
                         repetido = true;
                         break;
                     }
                 }
             } while (repetido);
        }


        for (int n : num) {
            System.out.print(n + " ");
        }



    }
}
