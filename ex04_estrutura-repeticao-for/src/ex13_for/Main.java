package ex13_for;

import java.util.Scanner;

/*Achando os dois maiores n�meros
Escreva um programa em Java que solicita 10 n�meros ao usu�rio, atrav�s de um la�o for, e ao final
mostre os dois maiores n�meros digitados pelo usu�rio.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int maior1 = 0;
		int maior2 = 0;
		
		for (int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			
			if (num > maior1) {
				maior2 = maior1;
				maior1 = num;			
			}
		}
		
		System.out.println("O maior n� digitado foi: " + maior1 + "\nO segundo maior n� digitado foi: " + maior2);
		
		sc.close();
	}
}