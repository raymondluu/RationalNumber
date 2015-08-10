/**************************
* File Name: RationalNumber
* Coder Name: Raymond Luu
* Assignment: 8
**************************/

public class RationalNumber {
	int numerator;
	int denominator;
	
	public RationalNumber( int numerator, int denominator ) {
		this.numerator = numerator;
		this.denominator = denominator;
		if( denominator == 0 ) {
			throw new IllegalArgumentException( "RationalNumber: Denominator cannot be zero." );
		}
		normalize();
		reduce();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public String toString() {
		if( denominator == 1 ) {
			normalize();
			return "" + numerator;
		}
		else {
			normalize();
			return numerator + "/" + denominator;
		}
	}
	
	public void add( RationalNumber next ) {
		this.numerator = ( next.numerator * this.denominator ) + ( this.numerator * next.denominator );
		this.denominator = this.denominator * next.denominator;
		normalize();
		reduce();
	}
	
	public void subtract( RationalNumber next ) {
		this.numerator = ( this.numerator * next.denominator ) - ( next.numerator * this.denominator );
		this.denominator = this.denominator * next.denominator;
		normalize();
		reduce();
	}
	
	public void multiply( RationalNumber next ) {
		this.numerator = this.numerator * next.numerator;
		this.denominator = this.denominator * next.denominator;
		normalize();
		reduce();
	}
	
	public void divide( RationalNumber next ) {
		this.numerator = this.numerator * next.denominator;
		this.denominator = this.denominator * next.numerator;
		normalize();
		reduce();
		if( this.denominator == 0 ) {
			throw new IllegalArgumentException( "divide: Denominator cannot be zero." );
		}
	}
	
	private void reduce() {
		int x = numerator;
		int y = denominator;
		while( y != 0 ) {
			int reduce = x % y;
			x = y;
			y = reduce;
		}
		denominator = denominator / x;
		numerator = numerator / x;
	}
	
	private void normalize() {
		if( denominator < 0 ) {
			numerator = numerator * -1;
			denominator = denominator * -1;
		}
	}
}