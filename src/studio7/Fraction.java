package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	private String fraction;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.fraction = numerator + " / " + denominator;
	}
	
	public Fraction addFraction(Fraction otherFraction) {
		int numeratorNew = this.numerator + otherFraction.numerator;
		int denominatorNew = this.denominator + otherFraction.denominator;
		return new Fraction(numeratorNew, denominatorNew);
	}
	
	public Fraction multiplyFractions(Fraction otherFraction) {
		int numeratorNew = this.numerator*otherFraction.numerator;
		int denominatorNew = this.denominator*otherFraction.denominator;
		return new Fraction(numeratorNew, denominatorNew);
	}
	
	public Fraction reciprocal(Fraction fraction) {
		return new Fraction(this.denominator, this.numerator);
	}
	
	public Fraction simplify(Fraction fraction) {
		int gcd = gcd(this.numerator, this.denominator);
		int numeratorNew = this.numerator/gcd;
		int denominatorNew = this.denominator/gcd;
		return new Fraction(numeratorNew, denominatorNew);
		
	}
	
	public String toString() {
		return this.fraction;
	}
	
	public int gcd(int n1, int n2) {
		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

}
