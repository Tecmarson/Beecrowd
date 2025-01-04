package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int A = read.nextInt();
        int B = read.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        read.close();
    }
}
