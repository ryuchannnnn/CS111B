// Name: Danny Chan
// Created: 6-14-19
// Assignment: 1.5
// This program compares which food the user likes more. 
import java.util.Scanner;
public class preference 
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	int loveForPizzas,loveForTacos;
	System.out.print("How much do you like pizza on a scale of 1 (hate) to 5 (love)?");
	loveForPizzas= Input.nextInt();
	System.out.print("How much do you like tacos on a scale of 1 (hate) to 5 (love)?");
	loveForTacos= Input.nextInt();
	if(loveForPizzas>loveForTacos);
		System.out.println("You like pizzas more than tacos.");
	}
}
