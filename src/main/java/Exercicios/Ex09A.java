package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex09A {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        final double commission = 0.15;


        String name = read.nextLine();
        double salary = read.nextDouble();
        double totalSales = read.nextDouble();

        double finalSalary = (totalSales * commission) + salary;

        System.out.println(String.format("TOTAL = R$ %.2f", finalSalary));

        read.close();
    }
}
