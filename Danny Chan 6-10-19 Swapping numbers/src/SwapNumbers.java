// Name: Danny Chan
// Created: 6/10/19
// Assignment: In Class Exercise 1.1

import java.util.Scanner;

public class SwapNumbers 
{
	public static void main(String[] args) 
	{
		Scanner Input=new Scanner(System.in);
		int num1;
		int num2;
		int temp;
		System.out.print("Enter first number:");
		num1=Input.nextInt();
		System.out.print("Enter second number:");
		num2=Input.nextInt();
		System.out.println("Original first number= " + num1);
		System.out.println("Original second number= " + num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("New first number= " + num1);
		System.out.println("New second number= " + num2);
	}

}
