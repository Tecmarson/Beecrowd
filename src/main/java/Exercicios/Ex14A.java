package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex14A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double Xdistancia = read.nextDouble();
        double Ycombustivel = read.nextDouble();

        double consumo = Xdistancia / Ycombustivel;

        System.out.println(String.format("%.3f km/l", consumo));

        read.close();
    }
}