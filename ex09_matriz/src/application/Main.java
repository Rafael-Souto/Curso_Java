package application;

import java.util.Scanner;

//Programa para criar uma matriz e localizar um número e imprimir os números que estão a direita a esquerda a baixo e a cima
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); //Quantidade de linhas escolhidas pelo usuário
		int n = sc.nextInt(); //Quantidade de colunas escolhidas pelo usuário
		int [][] mat = new int [m][n]; //Declaração da Matriz
		
//Laço de repetição for duplo para percorrer as linhas e colunas vazias e permitir que o usuário insira valores	
		for (int l = 0; l < mat.length; l++) { //Percorre as linhas
			for (int c = 0; c < mat[l].length; c++) { //Percorre as colunas
				mat[l][c] = sc.nextInt(); //Entrada dos valores pelo usuário
			}
		}
		
		int x = sc.nextInt(); //Entrada do número a ser buscado na matriz feita pelo usuário
		
//Laço de repetição for duplo para percorrer as linhas e colunas buscando o némero x digitado pelo usuário		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {

//Condição if para identificar a posição do número x inserido pelo usuário				
				if (x == mat[l][c]) {
					System.out.println("Position " + l + "," + c + ":");
					
//Condição if para imprimir na tela os números a direita, a esquerda, a cima e abaixo da posição do número x inserido pelo usuário
					if (c > 0) {
						System.out.println("Left: " + mat[l][c - 1]); //Imprime o número a esquerda do número x inserido pelo usuário
					}
					if (c < mat[l].length - 1) {
						System.out.println("Right: " + mat[l][c + 1]); //Imprime o número a direita do número x inserido pelo usuário
					}
					if (l > 0) {
						System.out.println("UP: " + mat[l - 1][c]); //Imprime o número a cima do número x inserido pelo usuário
					}
					if (l < mat.length - 1) {
						System.out.println("Down: " + mat[l + 1][c]); //Imprime o número a a baixo do número x inserido pelo usuário
					}
				}
			}
		}
				
		sc.close();
	}
}