public class Ejercicio7 {
    static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = (int) (Math.random()*21)-10;
        }
        for (int num : array){
            System.out.print(num + " ");

        }
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] < 0){
                array[i] = -array[i];
            }
        }
        System.out.println();
        for (int num : array){
            System.out.print(num + " ");

        }
    }
}
