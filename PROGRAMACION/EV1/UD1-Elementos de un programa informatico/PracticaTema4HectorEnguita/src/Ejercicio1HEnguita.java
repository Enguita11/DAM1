public class Ejercicio1HEnguita {
    public static void main(String[] args) {
        //Contador decreciente del 1000 al 1
        for (int i = 1000; i >= 1; i--) {
            int sumaaux = 0;

            for (int j = 1; j < i; j++) {
                //Evaluo los divisores
                if (i % j == 0) {
                    //Sumo los divisores
                    sumaaux = sumaaux + j;

                }
            }
            //Si la suma de los divisores es igual al numero lo imprimo
            if (sumaaux == i) {
                System.out.println(i);
            }
        }

    }
}
