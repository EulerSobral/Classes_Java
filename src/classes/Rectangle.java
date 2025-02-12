package classes;

public class Rectangle {
   
	double Width; 
	double Height; 
	
	public Rectangle(double width, double height) {
		super();
		Width = width;
		Height = height;
	}
	
	
	public double getWidth() {
		return Width;
	}



	public void setWidth(double width) {
		Width = width;
	}



	public double getHeight() {
		return Height;
	}



	public void setHeight(double height) {
		Height = height;
	}



	public double Area(){ 
		return getWidth() * getHeight();
	} 
	
	public double Perimeter() { 
		return 2 * (getWidth() + getHeight());
	}    
	
	public double Diagonal(){ 
		return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2)); 
	}  
	
	public String toString() { 
		return "Area: " + Area() + "; Perimetro: " + Perimeter() + "; Diagonal: " + Diagonal(); 
		
	} 
	

}
