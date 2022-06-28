package ex15_for;

import java.util.Scanner;

/*Quadrado de asteriscos e espaços em branco
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos e espaços em branco. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
Para lado igual a 5:
*****
*   *
*   *
*   *
*****
*/
public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho: ");
		int tam = sc.nextInt();
		System.out.println("");
	
		if (tam < 1 || tam > 20) {
			System.out.println("Valor inválido!");
		}
		else {
			for (int i = 1; i <= tam ; i++){ //linha superior
				System.out.print("*");
			}
			System.out.println("");

			for (int c = 1; c <= tam - 2; c++){ //linhas do meio
				System.out.print("*");
			
				for(int x = 1; x <= tam - 2; x++){
					System.out.print(" ");
				}
				System.out.println("*");
			}

			for (int y = 1; y <= tam; y++){ //linha inferior
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}