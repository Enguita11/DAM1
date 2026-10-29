import java.util.Scanner;

public class ActividadesExtraescolares {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de la opcion: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Música");
                break;
            case 2:
                System.out.println("Natacion");
                break;
            case 3:
                System.out.println("Inglés");
                break;
            case 4:
                System.out.println("Natacion");
                break;
            case 5:
                System.out.println("-");
                break;
            case 6:
                System.out.println("Deporte escolar");
                break;
            case 7:
                System.out.println("-");
                break;
            default:
                System.out.println("Valor incorrecto");
                break;

        }
    }
}
