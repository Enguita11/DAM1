import java.util.Scanner;

public class ConversorPesetasEuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesetas = sc.nextDouble();
        double euros = pesetas / 166.386;
        System.out.println(pesetas + " Pesetas a euros " + euros);
    }
}


