// Name: Danny Chan
// Created: 6/10/19
// Assignment: In Class Exercise 1.1

import java.util.Scanner;

public class SumDifferenceProductQuotientRemainder
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	int num1;
	int num2;
	System.out.print("Enter first number:");
	num1 = Input.nextInt();
	System.out.print("Enter second number:");
	num2 = Input.nextInt();
	int sum=num1+num2;
	int difference=num1-num2;
	int product= num1*num2;
	int quotient= num1/num2;
	int remainder= num1%(int)num2;
	System.out.println("Sum=" + sum);
	System.out.println("Difference=" + difference);
	System.out.println("Product=" + product);
	System.out.println("Quotient= " + quotient);
	System.out.println("Remainder= " + remainder);
	}
}