package ex01iniciante;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println(num + " é negativo");
		}
		else if (num > 0) {
			System.out.println(num + " é positivo");
		}
		else {
			System.out.println(num + " é neutro");
		}
		sc.close();
	}
}