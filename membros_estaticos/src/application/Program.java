package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius); //Calcula a circunferência de acordo com (radius) "class Calculater"
		double v = Calculator.volume(radius); //Calcula o volume de acordo com (radius) "class Calculater"
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI); // valor de PI está na "class Calculater"
		
		sc.close();
	}
}