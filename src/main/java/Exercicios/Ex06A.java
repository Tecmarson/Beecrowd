package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex06A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double notaA = read.nextDouble();
        double notaB = read.nextDouble();
        double notaC = read.nextDouble();

        double MEDIA = ((notaA * 2.0) + (notaB * 3.0) + (notaC * 5.0) / 10);

        System.out.printf(String.format("MEDIA = %.1f%n", MEDIA));

        read.close();
    }
}
