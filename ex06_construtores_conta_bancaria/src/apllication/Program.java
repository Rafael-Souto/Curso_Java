package apllication;

import java.util.Locale;
import java.util.Scanner;
import util.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta; //istancia a classe conta
		
//Entradas do usuário		
		System.out.print("Enter account number: ");
		int num = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n? ");
		char resposta = sc.next().charAt(0);
		
//Teste a resposta do usuário e para cada uma insere um comando
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(num, titular, depositoInicial);
		}
		else {
			conta = new Conta (num, titular);
		}
//Imprime na tela de acordo com a escolha do usuário (y, ou n)		
		System.out.println("\nAccount data: ");
		System.out.println(conta);
		
//Entrada de valor na conta		
		System.out.print("\nEnter a deposit value: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
//Saída de valor da conta		
		System.out.print("\nEnter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}
}