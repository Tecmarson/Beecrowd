package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int fatorA = read.nextInt();
        int fatorB = read.nextInt();

        int PROD = fatorA * fatorB;

        System.out.println("PROD = " + PROD);

        read.close();
    }
}
