// Name: Danny Chan
// Created: 6-14-19
// Assignment: 1.5
// This program sorts the names of two people that the user enters based on the unicode.
import java.util.Scanner;
public class sort_names 
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	String firstName, secondName;
	System.out.print("Enter two names:");
	firstName=Input.nextLine();
	secondName=Input.nextLine();
	if (firstName.compareTo(secondName)<0) {
		System.out.println(firstName + "," + secondName);
	} else {
		System.out.println(secondName + "," +firstName);
	}
	}
}
