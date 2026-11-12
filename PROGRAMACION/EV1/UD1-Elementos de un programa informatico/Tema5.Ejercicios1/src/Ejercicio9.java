public class Ejercicio9 {
    static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random()*21)-10;
        }
        for (int n : num){
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
            if (!repetido){
                for (int j = i+1; j < num.length; j++) {
                    if (num[i] == num[j]){
                        System.out.print(num[i] + " ");;
                        break;
                    }
                }
            }

        }
    }
}
