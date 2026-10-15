import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner s = new Scanner(System.in);
        //Parte a
        int randomnum = (int) (Math.random()*100);
        System.out.println(randomnum);

        //Parte b
        System.out.println("Numero para el final del intérvalo: ");
        int num = s.nextInt();

        System.out.println((int)(Math.random()*num));
        System.out.println((int)(Math.random()*num));
        System.out.println((int)(Math.random()*num));

        //Parte c
        System.out.println("Numero para el principio del intérvalo: ");
        int numprincipio = s.nextInt();
        System.out.println("Numero para el final del intérvalo: ");
        int numfinal = s.nextInt();
        int aleatorio1 = (int)(Math.random()*(numfinal - numprincipio +1)) + numprincipio;
        int aleatorio2 = (int)(Math.random()*(numfinal - numprincipio +1)) + numprincipio;
        int aleatorio3 = (int)(Math.random()*(numfinal - numprincipio +1)) + numprincipio;
        System.out.println(aleatorio1);
        System.out.println(aleatorio2);
        System.out.println(aleatorio3);
    }
}
