package ex04iniciante;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais
public class Main {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fun = sc.nextInt();
		int horas = sc.nextInt();
		double valor_hora = sc.nextDouble();
		
		double salario = horas * valor_hora;
		
		System.out.printf("Funcion�rio: " + fun + "\nSal�rio: U$ %.2f\n ", salario);
		
		sc.close();
	}
}