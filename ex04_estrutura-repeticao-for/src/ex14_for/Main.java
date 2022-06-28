package ex14_for;

import java.util.Scanner;

/*Quadrado de asteriscos
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
Para lado igual a 5:
*****
*****
*****
*****
*****
*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho: ");
		int lado = sc.nextInt();
		System.out.println("");
		
		if (lado > 20 || lado < 1) {
			System.out.println("Valor inválido!");
		}
		else {
			for (int i = 1; i <= lado; i++) {
				for(int c = 1; c <= lado; c++){	
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
		sc.close();
	}
}