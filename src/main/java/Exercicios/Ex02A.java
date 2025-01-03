package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02A {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        final double pi = 3.14159;
        double r = read.nextDouble();
        double a;

        a = pi * (r * r);

        System.out.printf(String.format("A = %.4f", a));

        read.close();
    }
}
