// Name: Danny Chan
// Created: 6/10/19
// Assignment: In Class Exercise 1.1

import java.util.Scanner;

public class AreaandCircumference
{

	public static void main(String[] args) 
	{
		Scanner Input=new Scanner(System.in);
		float radius;
		System.out.print("Enter radius:");
		radius=Input.nextFloat();
		double area = (3.14*radius*radius);
		double circumference = (2*3.14*radius);
		System.out.println("The area is " + area);
		System.out.println("The circumference is" + circumference);
		
	}
}
