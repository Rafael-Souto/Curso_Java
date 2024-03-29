package entities;

public class Employee {

//Atributos
	private Integer id;
	private String name;
	private Double salary;
	
//Construtor padr�o	
	public Employee() {
	}	
	
//Construtores	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//M�todos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
//C�lculo do almento
	public void increaseSalary(double almento) { 
		salary = salary + salary * 0.10;
	}
	
//Formata��o de impreess�o na tela	
	public String toString() {
		return id + ", " + name + ", $ " + String.format("%.2f", salary);
	}
}