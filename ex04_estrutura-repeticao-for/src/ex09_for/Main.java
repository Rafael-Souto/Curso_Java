package ex09_for;

import java.util.Scanner;

/*Programa em Java que mostra os números pares
 *Escreva um programa que leia um número N e mostre todos os números pares de 1 até N.*/
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		for (int i = 1; i <= y; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
				
		sc.close();
	}
}