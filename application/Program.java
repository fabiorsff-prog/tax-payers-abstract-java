package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayers> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + ": ");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditure: ");
                double healthExpenditure = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditure));
            }
            else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Company(name, annualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for (TaxPayers p : list) {
            System.out.println(p);
            sum += p.calculateTax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));


        sc.close();
    }
}
