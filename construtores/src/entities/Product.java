package entities;

public class Product {
	
//Atributos	
	String name; 
	private double price;
	private int quantity;

//Construtor padr�o	
	public Product() {
	}
	
//Construtores	
	public Product(String name, double price, int quantity) {
		this.name = name; 
		this.price = price; 
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name; 
		this.price = price;
	}
	
//M�todos
	public String getName() { //Retorna o que foi armazenado
		return name;
	}
	
	public void setName(String name) { //Permite alterar o nome do produto
		this.name = name;
	}
	
	public double getPrice() { //Retorna o que foi armazenado
		return price;
	}
	
	public void setPrice(double price) { //Permite alterar o pre�o do produto
		this.price = price;
	}
	
	public int getQuantity() { //Retorna o que foi armazenado
		return quantity;
	}
	
//Opera��es de entrata e sa�da	
	public double totalValueInStock() { //Valor total dos produtos no estoque
		return price * quantity;
	}

	public void addProducts(int quantity) { //Entrada de produto no estoque
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) { //Sa�da de produto do estoque
		this.quantity -= quantity;
	}

//Formata��o de impreess�o na tela	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}