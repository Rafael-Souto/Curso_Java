package ex05_for;

import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= x; i++) {
			fat = fat * i;
		}
		
		System.out.println("fatorial " + fat);

		sc.close();
	}
}