package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex10A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int codigoP1 = read.nextInt();
        int numeroP1 = read.nextInt();
        double valorUnit1 = read.nextDouble();

        int codigoP2 = read.nextInt();
        int numeroP2 = read.nextInt();
        double valorUnit2 = read.nextDouble();

        double valorFinal = (numeroP1 * valorUnit1) + (numeroP2 * valorUnit2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorFinal));

        read.close();
    }
}
