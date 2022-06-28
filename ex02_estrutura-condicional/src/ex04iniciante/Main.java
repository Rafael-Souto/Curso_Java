package ex04iniciante;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h_inicio = sc.nextInt();
		int h_final = sc.nextInt();
		int jogo = h_final - h_inicio;
		
		if (h_inicio < h_final) {
			jogo = h_final - h_inicio;
		}
		else {
			jogo = 24 - h_inicio + h_final;
		}
		
		System.out.println("O jogo durou " + jogo + " hora(s)");
		
		sc.close();
	}
}