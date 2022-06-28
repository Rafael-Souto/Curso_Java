package ex12_for;

import java.util.Scanner;

/*Achando o maior n�mero
Escreva um programa em Java que solicita 10 n�meros ao usu�rio, atrav�s de um la�o for, e ao final
mostre qual destes n�meros � o maior.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int maior = 0;
		
		for (int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			
			if (n > maior) {
				maior = n;
			}
		}
		
		System.out.println("O maior N� digitado foi: " + maior);

		sc.close();
	}
}