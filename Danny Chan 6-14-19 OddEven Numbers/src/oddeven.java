// Name: Danny Chan
// Created: 6-14-19
// Assignment: 1.5
// This program determines whether the user entered an even number or an odd number. 
import java.util.Scanner;
public class oddeven 
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	int userNumber;
	System.out.print("Enter a number: ");
	userNumber=Input.nextInt();
	if (userNumber%2 == 1) {
		System.out.println("You entered an odd number.");
	} else {
		System.out.println("You entered an even number.");
	}
}
}