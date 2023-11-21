//Name: Danny Chan
//Assignment:Assignment 3 
//Created: 7/14/19
// This assignment takes in integers and prints their rational numbers.
public class rationalTest 
{
	public static void main(String[] args)
	{
		Rational rational1 = new Rational(3, 4);
		Rational rational2 = new Rational(20);
		Rational rational3 = new Rational();
		System.out.println("Inputs: " + rational1 + ", " + rational2 + ", " + rational3);
		System.out.println();
		System.out.println("Addition: " + rational1 + " + " + rational2 + " = " 
				+ Rational.add(rational1, rational2));
		System.out.println("Subtraction: " + rational2 + " - " + rational3 + " = " 
				+ Rational.subtract(rational2, rational3));
		System.out.println("Multiply: " + rational1 + " * " + rational3 + " = " 
				+ Rational.multiply(rational1, rational3));
		System.out.println("Divide: " + rational1 + " / " + rational2 + " = " 
				+ Rational.divide(rational1, rational2));
		System.out.println();
		System.out.println("Alt. Part 2: \n");
		System.out.print("Add: " + rational1 + " + " + rational2 + " = ");
		rational1.add(rational2);
		System.out.print(rational1);
		System.out.print("\nSubtract: " + rational3 + " - " + rational1 + " = ");
		rational3.subtract(rational1);
		System.out.print(rational3);
		System.out.print("\nMultiply: " + rational1 + " * " + rational3 + " = ");
		rational1.multiply(rational3);
		System.out.print(rational1);
		System.out.print("\nDivide: " + rational1 + " / " + rational2 + " = ");
		rational1.divide(rational2);
		System.out.print(rational1);
	}
}