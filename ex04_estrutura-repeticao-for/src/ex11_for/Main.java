package ex11_for;

import java.util.Scanner;

/*Programa em Java que calcula a média das notas de uma turma
Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço for, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

Por fim, o programa mostra a média, aritmética, da turma.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na sala? ");
		int alunos = sc.nextInt();
		double soma = 0;
		
		for (int i = 1; i <= alunos; i++) {
			double nota = sc.nextDouble();
			soma = soma + nota;
		}
		
		double media = soma / alunos;
		System.out.printf("Média da turma: %.1f\n", media);
		
		sc.close();
	}
}