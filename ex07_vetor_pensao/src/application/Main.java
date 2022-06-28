package application;

import java.text.ParseException;
import java.util.Scanner;
import entities.Rent;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10]; //Declaração do vetor
		
		System.out.print("How many rooms will be rented? ");
		int ospedes = sc.nextInt();
		
//Laço de repetição para entrada  e armazenamento dos dados dos ospedes		
		for (int i = 1; i <= ospedes; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Rent(nome, email);
		}
		
		System.out.println("\nBusy rooms: ");
		
//Vetor para colacar em ordem e imprimir a lista de ospedes		
		for (int c = 0; c < 10; c++) {
			if (vect[c] != null) {
				System.out.println(c + ": " + vect[c]);
			}
		}
		
		sc.close();
	}
}