package ex02iniciante;

import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " � par");
		}
		else {
			System.out.println(num + " � impar");
		}
		sc.close();
	}
}