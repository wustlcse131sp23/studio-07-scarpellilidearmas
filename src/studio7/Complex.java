package studio7;

public class Complex {
	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complex addition(Complex other) {
		double newA = this.a + other.a;
		double newB = this.b + other.b;
		return new Complex(newA, newB);
	}
	
	public Complex multiplication(Complex other) {
		double newA = this.a*other.a - this.b*other.b;
		double newB = this.a*other.b + this.b*other.a;
		return new Complex(newA, newB);
	}
	
	public String toString() {
		if (b>0) {
			return a + " + " + b + "i";
		}
		else if (b<0) {
			return a + "  " + b + "i";
		} else 
			return "" + a;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b) {
		this.b = a;
	}
}
