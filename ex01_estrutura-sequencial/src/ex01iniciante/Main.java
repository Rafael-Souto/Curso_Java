package ex01iniciante;

import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
	}
}