package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex08A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int number = read.nextInt();
        int hour = read.nextInt();
        double salaryHour = read.nextDouble();

        double salary = hour * salaryHour;

        System.out.println(String.format("NUMBER = %s", number));
        System.out.println(String.format("SALARY = U$ %.2f", salary));

        read.close();
    }
}
