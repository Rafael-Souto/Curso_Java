package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double [n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int c = 0; c < n; c++) {
			soma += vect[c];
		}
		
		double avg = soma / n;
		System.out.printf("average Heigth: %.2f", avg);
		
		sc.close();
	}
}