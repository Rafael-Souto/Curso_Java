package application;

import java.util.Scanner;

//Programa para criar uma matriz e localizar um n�mero e imprimir os n�meros que est�o a direita a esquerda a baixo e a cima
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); //Quantidade de linhas escolhidas pelo usu�rio
		int n = sc.nextInt(); //Quantidade de colunas escolhidas pelo usu�rio
		int [][] mat = new int [m][n]; //Declara��o da Matriz
		
//La�o de repeti��o for duplo para percorrer as linhas e colunas vazias e permitir que o usu�rio insira valores	
		for (int l = 0; l < mat.length; l++) { //Percorre as linhas
			for (int c = 0; c < mat[l].length; c++) { //Percorre as colunas
				mat[l][c] = sc.nextInt(); //Entrada dos valores pelo usu�rio
			}
		}
		
		int x = sc.nextInt(); //Entrada do n�mero a ser buscado na matriz feita pelo usu�rio
		
//La�o de repeti��o for duplo para percorrer as linhas e colunas buscando o n�mero x digitado pelo usu�rio		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {

//Condi��o if para identificar a posi��o do n�mero x inserido pelo usu�rio				
				if (x == mat[l][c]) {
					System.out.println("Position " + l + "," + c + ":");
					
//Condi��o if para imprimir na tela os n�meros a direita, a esquerda, a cima e abaixo da posi��o do n�mero x inserido pelo usu�rio
					if (c > 0) {
						System.out.println("Left: " + mat[l][c - 1]); //Imprime o n�mero a esquerda do n�mero x inserido pelo usu�rio
					}
					if (c < mat[l].length - 1) {
						System.out.println("Right: " + mat[l][c + 1]); //Imprime o n�mero a direita do n�mero x inserido pelo usu�rio
					}
					if (l > 0) {
						System.out.println("UP: " + mat[l - 1][c]); //Imprime o n�mero a cima do n�mero x inserido pelo usu�rio
					}
					if (l < mat.length - 1) {
						System.out.println("Down: " + mat[l + 1][c]); //Imprime o n�mero a a baixo do n�mero x inserido pelo usu�rio
					}
				}
			}
		}
				
		sc.close();
	}
}