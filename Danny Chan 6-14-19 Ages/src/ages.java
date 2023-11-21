// Name: Danny Chan
// Created: 6-14-19
// Assignment: 1.5
// This program determines if the user is older or the friend is older. 
import java.util.Scanner;
public class ages 
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	int userAge, friendAge;
	System.out.print("Enter your age:");
	userAge=Input.nextInt();
	System.out.print("Enter your friends age:");
	friendAge=Input.nextInt();
	if (userAge>=friendAge) {
		System.out.println("You are older or the same age as your friend.");
	} else {
		System.out.println("You friend is older or the same age as you.");
	}
}
}