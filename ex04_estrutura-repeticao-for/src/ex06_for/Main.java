package ex06_for;

import java.util.Scanner;

/*Ler um número inteiro N e calcular todos os seus divisores.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}