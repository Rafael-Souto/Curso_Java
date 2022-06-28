package ex05iniciante;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
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