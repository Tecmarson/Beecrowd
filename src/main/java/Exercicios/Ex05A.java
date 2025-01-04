package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double notaA = read.nextDouble();
        double notaB = read.nextDouble();

        double MEDIA = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.printf(String.format("MEDIA = %.5f%n", MEDIA));

        read.close();
    }
}
