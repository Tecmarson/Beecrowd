package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex12A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        final double pi = 3.14159;

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * Math.pow(C, 2);
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));

        read.close();
    }
}
