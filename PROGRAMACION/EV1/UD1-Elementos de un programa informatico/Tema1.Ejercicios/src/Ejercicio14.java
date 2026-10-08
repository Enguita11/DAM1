import java.util.Scanner;

public class Ejercicio14 {
    static void main() {
        int t = 7384;
        int h = t / 3600;
        int m = (t % 3600) / 60;
        int s = t % 60;

        System.out.println(h + ":" + m + ":" + s);

    }
}
