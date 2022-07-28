package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxesPaid;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxesPaid> list = new ArrayList<>();
		
		Individual individual = new Individual();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Individual(name, income, health));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				list.add(new Company(name, income, numberOfEmployee));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		for (TaxesPaid taxp : list) {
			System.out.printf(taxp.getName() + String.format(": $ %.2f\n", taxp.tax()));
		}
		
		double sum = 0;
		
		for (TaxesPaid taxp : list) {
			sum += taxp.tax();
		}
		
		System.out.printf("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
				
		sc.close();
	}
}