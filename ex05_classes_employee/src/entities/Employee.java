package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double almento;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void addNetSalary(double almento) {
		this.grossSalary =  grossSalary + grossSalary / 100 * almento;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}