//Name: Danny Chan
// Assignment: Exercise 5.1
// Created: 7/8/19
// This assignemnt takes it numbers by the user and replaces numbers if they are a multiple of something.
import java.util.Scanner;
import java.util.Arrays;
public class ArrayReplacement 
{

	public static void main(String[] args) 
	    {
	        Scanner Input=new Scanner(System.in);
	        int firstArray[]=new int[10];
	        int copyArray[]=new int[10];
	        for(int i=0;i<firstArray.length;i++)
	        {
	            System.out.println("Enter Number in array: ");
	            firstArray[i]=Input.nextInt();
	            copyArray[i]=firstArray[i];
	        }
	        System.out.println("Enter Original: ");
	        int original=Input.nextInt();
	        System.out.println("Enter Replacement: ");
	        int modified=Input.nextInt();
	        for(int i=0;i<firstArray.length;i++)
	        {
	            if(copyArray[i]==original)
	            {
	                copyArray[i]=modified;
	            }
	            else
	                continue;
	        }
	        System.out.print("\n Original Array: ");

	        for (int i = 0; i < 10; i++)
	            System.out.print(firstArray[i] + " ");

	        System.out.print("\n Modified array: ");

	        for (int i = 0; i < 10; i++)
	            System.out.print(copyArray[i] + " ");
	    }
	}