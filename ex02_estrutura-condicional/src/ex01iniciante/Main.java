package ex01iniciante;

import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println(num + " � negativo");
		}
		else if (num > 0) {
			System.out.println(num + " � positivo");
		}
		else {
			System.out.println(num + " � neutro");
		}
		sc.close();
	}
}