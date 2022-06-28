package ex10_for;

import java.util.Scanner;

/*Programa em Java que mostra os números pares e ímpares
Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				System.out.print(i);
			}
			else {
				System.out.println("   " + i);
			}
		}
		
		sc.close();
	}
}