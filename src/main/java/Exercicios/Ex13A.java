package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex13A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();


        int MAIORAB = (A+B+(Math.abs(A-B))) / 2;
        int MAIOFINAL = (MAIORAB+C+(Math.abs(MAIORAB-C))) / 2;

        System.out.println(MAIOFINAL + "eh o maior");

        read.close();
    }
}