package classes; 
import classes.Rectangle; 
import classes.Employee; 
import classes.Student;
import java.util.Scanner;
import classes.CurrencyConvert;

public class main {

	public static void main(String[] args) {
		
		//Exercicio 1   
		
		double width = 3; 
		double height = 4; 
		
		Rectangle rectangle = new Rectangle(width, height);
		
		System.out.print(rectangle + "\n");
		
		//Exercicio 2 
		System.out.print("Digite o nome: "); 
		String name = "Euler";
		
		
		double grossSalary = 6000;  
		
	
		double tax = 1000; 
		
		Employee employee = new Employee(name, grossSalary, tax);   
		
		System.out.print(employee + "\n");
		
		
		double percentagem = 10;
		
		System.out.println(String.format("%.2f",employee.IncreaseSalary(percentagem))); 
		
		
		//Exercicio 3 
		String nome = "Euler"; 
		double nota1 = 27;  
		double nota2 = 31;  
		double nota3 = 32;  
		Student student = new Student(nome,nota1, nota2, nota3); 
		
		System.out.println(student);
		
		
		//Exercicio 4
		
		double dollar = 3.10; 
		double real = 200; 
		CurrencyConvert currency = new CurrencyConvert(dollar, real); 
		
		System.out.println(currency);
		 
	}

}
