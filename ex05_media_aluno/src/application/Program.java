package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Aluno aluno = new Aluno();
			
		System.out.print("Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("1° Trimestre: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("2° Trimestre: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("3° Trimestre: ");
		aluno.n3 = sc.nextDouble();
		
		aluno.calculoMedia();
		System.out.printf("\nStudent: " + aluno.nome + "\nFinal Grade = %.2f\n", aluno.calculoMedia());
		aluno.getsituacaoAluno();
		System.out.println("The Student: " + aluno.getsituacaoAluno());
		
		sc.close();
	}
}