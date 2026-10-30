public class Ejercicio31 {
    static void main(String[] args) {
        int numMax = 0;
        int numMin = 0;
        for (int i = 1; i <= 10; i++) {
            int numaleatorio = (int) (Math.random()*100 + 1);
            System.out.println(numaleatorio);
            if (i==1){
                numMax = numaleatorio;
                numMin = numaleatorio;
            }
            if (numMax < numaleatorio){
                numMax = numaleatorio;
            }
            if (numMin > numaleatorio){
                numMin = numaleatorio;
            }
        }
        System.out.println("Numero mas grande: " + numMax);
        System.out.println("Numero mas pequeño: " + numMin);
    }
}
