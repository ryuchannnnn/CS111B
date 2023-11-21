//Name: Danny Chan
// Assignment: Exercise 5.1
// Created: 7/8/19
//This array asks the user for numbers and tells how many prime numbers are there and how many there are.
import java.util.Scanner;
import java.util.Arrays;

public class ArrayPrime 
{
	 public static boolean prime(int num)
	    {
	        int count = 0;  
	        for(int i=2;i<=9;i++)
	        {
	            if((num%i)==0)
	                count++;
	        }
	        if (count >= 2)
	            return false;
	        else
	            return true;
	    }
	    public static void main(String [] args)
	    {
	        Scanner input = new Scanner(System.in);
	        int arrayNums[]=new int[10];
	        for (int i = 0; i <arrayNums.length; i++)
	        {
	            System.out.print("Enter number: ");
	            arrayNums[i] = input.nextInt();
	        }
	        Arrays.sort(arrayNums);
	        System.out.print("\nPrimes in this array are ");
	        int primeNumbers=0;
	        for (int i = 0;i <10;i++)
	        {
	            if (prime(arrayNums[i]))
	            {
	                System.out.print(arrayNums[i] + " ");
	                primeNumbers++;
	            }
	        }
	        System.out.println("\nThere are "+primeNumbers+" prime numbers in the array");
	    }
	}
