package util;

public class Conta {

//Atributos	
	private int num;
	private String titular;
	private double saldo;
	
//Construtores	
	public Conta(int num, String titular) {
		this.num = num;
		this.titular = titular;
	}
	
	public Conta(int num, String titular, double depositoInicial) {
		this.num = num;
		this.titular = titular;
		deposito(depositoInicial);
	}

//M�todos
	public int getNum() {
		return num;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
//Opera��es de entrata e sa�da	
	public void deposito(double valor) { //Entrada de saldo na conta
		saldo += valor;
	}

	public void saque(double valor) { //Sa�da de saldo da conta
		saldo -= valor + 5.0;
	}
	
//Formata��o de impreess�o na tela	
	public String toString() {
		return "Account " + num + ", Houder: " + titular + ", Balance: $ " + String.format("%.2f", saldo);
	}
}