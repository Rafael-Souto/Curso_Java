package ex07iniciante;

import java.util.Locale;
import java.util.Scanner;

/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. */
public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.printf("Origem  x = %.1f  y = %.1f\n", x, y);
		}
		else if (x == 0) {
			System.out.printf("Eixo Y  %.1f\n", y);
		}
		else if (y == 0) {
			System.out.printf("Eixo X  %.1f\n", x);
		}
		else if (x > 0 && y > 0) {
			System.out.printf("Q1  x = %.1f  y = %.1f\n", x, y);
		}
		else if (x < 0 && y > 0) {
			System.out.printf("Q2  x = %.1f  y = %.1f\n", x, y);
		}
		else if (x < 0 && y < 0) {
			System.out.printf("Q3  x = %.1f  y = %.1f\n", x, y);
		}
		else {
			System.out.printf("Q4  x = %.1f  y = %.1f\n", x, y);
		}
		sc.close();
	}
}