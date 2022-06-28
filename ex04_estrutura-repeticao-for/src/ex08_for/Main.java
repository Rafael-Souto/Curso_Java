package ex08_for;

import java.util.Scanner;

/*Programa em Java que mostra os números ímpares
Escreva um programa que leia um número N e mostra todos os números ímpares de 1 até N.*/
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