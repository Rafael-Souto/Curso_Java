package ex08_for;

import java.util.Scanner;

/*Programa em Java que mostra os n�meros �mpares
Escreva um programa que leia um n�mero N e mostra todos os n�meros �mpares de 1 at� N.*/
public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}