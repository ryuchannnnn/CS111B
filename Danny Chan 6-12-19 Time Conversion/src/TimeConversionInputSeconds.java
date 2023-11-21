// Name: Danny Chan
// Created: 6/12/19
// Assignment: In Class Exercise 1.2

import java.util.Scanner;

public class TimeConversionInputSeconds 
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	int seconds,numberOfhours,numberOfminutes,numberOfseconds;
	System.out.print("Enter seconds:");
	seconds= Input.nextInt();
	numberOfhours=(seconds/3600);
	numberOfminutes=(seconds%3600)/60;
	numberOfseconds=(seconds%60);
	System.out.println("Hours:" + numberOfhours);
	System.out.println("Minutes:" + numberOfminutes);
	System.out.println("Seconds:" + numberOfseconds);
	}
}
