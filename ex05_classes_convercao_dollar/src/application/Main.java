package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cot_dollar = sc.nextDouble();
		System.out.print("Hou many dollars will be bought? ");
		double qtd = sc.nextDouble();
		
		double res = CurrencyConverter.conversaoReais(qtd, cot_dollar);
		System.out.printf("Amount to be paid in reais = %.2f\n", res);		
		
		sc.close();
	}
}