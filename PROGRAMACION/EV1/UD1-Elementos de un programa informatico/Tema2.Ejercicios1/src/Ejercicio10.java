public class Ejercicio10 {
    static void main() {
        char letra = (char) (Math.random()*26 + 65);
        System.out.println("Tu letra: " + letra);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
