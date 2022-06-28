package ex02iniciante;

import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro casas decimais conforme exemplos.
public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double area = (raio * raio) * pi;
		
		System.out.printf("Area total do circulo %.4f\n ", area);
		
		sc.close();
	}
}