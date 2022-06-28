package ex13_for;

import java.util.Scanner;

/*Achando os dois maiores números
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre os dois maiores números digitados pelo usuário.*/
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
		
		System.out.println("O maior n° digitado foi: " + maior1 + "\nO segundo maior n° digitado foi: " + maior2);
		
		sc.close();
	}
}