package ex04iniciante;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais
public class Main {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fun = sc.nextInt();
		int horas = sc.nextInt();
		double valor_hora = sc.nextDouble();
		
		double salario = horas * valor_hora;
		
		System.out.printf("Funcionário: " + fun + "\nSalário: U$ %.2f\n ", salario);
		
		sc.close();
	}
}