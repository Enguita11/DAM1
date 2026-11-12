public class Ejercicio8 {
    static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = (int) (Math.random()*21)-10;
        }
        int[] array2 = new int[10];
        for (int i = 0; i <= array2.length-1; i++) {
            array2[i] = (int) (Math.random()*21)-10;
        }
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array2){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arraySuma = new int[10];
        for (int i = 0; i < arraySuma.length ; i++) {
            arraySuma[i] = array[i] + array2[i];
        }
        for (int i : arraySuma){
            System.out.print(i + " ");
        }
    }
}
