package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex15A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double x1 = read.nextDouble();
        double y1 = read.nextDouble();
        double x2 = read.nextDouble();
        double y2 = read.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println(String.format("%.4f", distancia));

        read.close();
    }
}