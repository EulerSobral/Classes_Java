package classes;

public class CurrencyConvert {
	double dollar; 
	double real;
	
	public CurrencyConvert(double dollar, double real) {
		super();
		this.dollar = dollar; 
		this.real = real; 
	}


	public double getDollar() {
		return dollar;
	}
	
	public double getReal() { 
		return real;
	}

	public void setDollar(double dollar) {
		this.dollar = dollar;
	}  
	
	public void setReal(double real) { 
		this.real = real;
	}


	private double AmountInReal() { 
		double amount = getDollar() * getReal(); 
		return amount + (0.06 * amount);
	}


	@Override
	public String toString() {
		return "Valor a ser pago em reais: " + String.format("%.2f", AmountInReal()) ;
	}  
	
	
}
