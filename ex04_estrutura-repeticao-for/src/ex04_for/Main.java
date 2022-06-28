package ex04_for;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divis�o imposs�vel!");
			}
			else {
				double res = (double) a / b;
				System.out.printf("%.1f\n", res);
			}
		}		
		
		sc.close();
	}
}