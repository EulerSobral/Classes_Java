package classes;

public class Employee {
	String name; 
	double grossSalary; 
	double Tax; 
	
	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		Tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return Tax;
	}
	public void setTax(double tax) {
		Tax = tax;
	} 
	
	public double NetSalary() {  
		return getGrossSalary() - getTax();
	} 
	
	public double IncreaseSalary(double percentage) { 
		double increase = getGrossSalary() / percentage; 
		return (increase + getGrossSalary()) - getTax();
	}
	@Override
	public String toString() {
		return "Nome do empregado: " + name + ", Salário líquido: " + String.format("%.2f", NetSalary());
	}

	
}
