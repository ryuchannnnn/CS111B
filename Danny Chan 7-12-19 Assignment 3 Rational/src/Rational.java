public class Rational 
{
	private int numerator, denominator;
	private static Rational result = new Rational();
	public Rational(int num, int denom)
	{
		numerator = num;
		denominator = denom;
	}
	public Rational(int wholeNumber)
	{
		numerator = wholeNumber;
		denominator = 1;
	}
	public Rational()
	{
		numerator = 0;
		denominator = 1;
	}
	public void setnumarator(int num)
	{
		numerator = num;
	}
	public void setdenominator(int denom)
	{
		denominator = denom;
	}
	public int getnumerator()
	{
		return numerator;
	}
	public int getdenominator()
	{
		return denominator;
	}
	public static Rational add(Rational num1, Rational num2)
	{
		result.numerator = ((num1.numerator * num2.denominator) + (num2.numerator * num1.denominator));
		result.denominator = num1.denominator * num2.denominator;
		return result;
	}
	public static Rational subtract(Rational num1, Rational num2)
	{
		result.numerator = ((num1.numerator * num2.denominator) - (num2.numerator * num1.denominator));
		result.denominator = num1.denominator * num2.denominator;
		return result;
	}
	public static Rational multiply(Rational num1, Rational num2)
	{
		result.numerator = num1.numerator * num2.numerator;
		result.denominator = num1.denominator * num2.denominator;
		return result;
	}
	public static Rational divide(Rational num1, Rational num2)
	{
		result.numerator = num1.numerator * num2.denominator;
		result.denominator = num1.denominator * num2.numerator;
		return result;
	}
	// Alt. Part 2: 
	public void add(Rational num)
	{
		this.numerator = ((this.numerator * num.denominator) + (num.numerator * this.denominator));
		this.denominator = this.denominator * num.denominator;
	}
	public void subtract(Rational num)
	{
		this.numerator = ((this.numerator * num.denominator) - (num.numerator * this.denominator));
		this.denominator = this.denominator * num.denominator;
	}
	public void multiply(Rational num)
	{
		this.numerator = this.numerator * num.numerator;
		this.denominator = this.denominator * num.denominator;
	}
	public void divide(Rational num)
	{
		this.numerator = this.numerator * num.denominator;
		this.denominator = this.denominator * num.numerator;
	}
	public boolean equals(Rational num1, Rational num2)
	{
		boolean equals = true;
		if ((num1.numerator * num2.denominator) != (num2.numerator * num1.denominator))
			equals = false;
		return equals;
	}
	public void normalize(Rational num)
	{
		if (num.denominator < 0)
		{
			num.numerator /= (-1);
			Math.abs(num.denominator);
		}
	}
	public String toString()
	{
		normalize(this);
		return(this.numerator + "/" + this.denominator);
	}
}
