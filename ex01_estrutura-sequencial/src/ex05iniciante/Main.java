package ex05iniciante;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double unit1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double unit2 = sc.nextDouble();
		
		double pagar = qtd1 * unit1 + qtd2 * unit2;
		
		System.out.printf("Valor a pagar: %.2f\n ", pagar);
		
		sc.close();
	}
}