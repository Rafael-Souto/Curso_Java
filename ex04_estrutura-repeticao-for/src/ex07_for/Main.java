package ex07_for;

import java.util.Scanner;

/*Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas, 
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme 
exemplo*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
	}
}