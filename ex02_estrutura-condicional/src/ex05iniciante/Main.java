package ex05iniciante;

import java.util.Locale;
import java.util.Scanner;

// Com base na tabela, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double total = qtd * cod;
		
		if (cod == 1) {
			total = qtd * 4.00;
		}
		else if (cod == 2) {
			total = qtd * 4.50;
		}
		else if (cod == 3) {
			total = qtd * 5.00;
		}
		else if (cod == 4) {
			total = qtd * 2.00;
		}
		else if (cod == 5) {
			total = qtd * 1.50;
		}
		else {
			System.out.println("Escolha uma das opções do cardápio!");
		}
		
		System.out.printf("Total a pagar R$ %.2f\n", total);
		sc.close();
	}
}