//Name:Danny Chan
//Assignment: Exercise 2.2 Extra Credit 
// Created: 6-19-19
//This assignment takes a base which is entered by the user and multiplies it by the exponenet which is 
//also entered by the user. 
import java.util.Scanner;

public class baseandexponent 
{
	public static void main(String[] args) 
	{
		Scanner Input=new Scanner(System.in);
		int base,exponent,i=0,j=1;
		System.out.print("Enter a base: ");
		base = Input.nextInt();
		System.out.print("Enter an exponent: ");
		exponent = Input.nextInt();
		while(i<exponent)
		{
			j*= base;
			i++;
		}
		System.out.println(base + " To the power of " + exponent + " = " + j);
	}
}
