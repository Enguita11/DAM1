public class Ejercicio6 {
    static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = (int) (Math.random()*21)-10;
        }
        int i = 0;
        for (int num : array){
            System.out.print(num + " ");
            if (num < 0){
                i++;
            }
        }
        System.out.println();
        System.out.println("Hay " + i + " numeros negativos");
    }
}
