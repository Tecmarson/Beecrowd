package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex11A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        final double pi = 3.14159;

        int r = read.nextInt();

        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);

        System.out.println(String.format("VOLUME = %.3f", volume));

        read.close();
    }
}
