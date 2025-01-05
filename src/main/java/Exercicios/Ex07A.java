package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex07A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();
        int D = read.nextInt();

        int DIFERENCA = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + DIFERENCA);

        read.close();
    }
}
