// Name: Danny Chan
// Created: 6/10/19
// Assignment: In Class Exercise 1.1

import java.util.Scanner;

public class CelsiustoFahrenheit
{
	public static void main(String []args)
	{
		Scanner Input=new Scanner(System.in);
		float celsius;
		float fahrenheit;
		System.out.print("Enter Celsius:");
		celsius=Input.nextInt();
		fahrenheit=((celsius * 9/5)+32);
		System.out.println("The fahrenheit is:" + fahrenheit);	
	}
}