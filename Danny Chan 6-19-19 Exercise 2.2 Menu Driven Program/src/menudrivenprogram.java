//Name: Danny Chan
//Created: 6-19-19
//Assignment: 2.2
// This assignment takes the number that the user enters and runs a program depending on the number.
import java.util.Scanner;
public class menudrivenprogram
{
	public static void main(String[] args) 
	{		
		Scanner Input=new Scanner(System.in);
		int userChoice;
		System.out.println("1. Sum of digits");
		System.out.println("2. Armstrong Number");
		System.out.println("3. Prime/Composite");
		System.out.println("4. Multiple of 10");
		System.out.println("5. Sum of Even/Odd and Total Value");
		System.out.println("6. Palindrone Number");
		System.out.println("7. Factorial");
		System.out.println("8. Exit");
		System.out.println("Enter your task:");
		userChoice=Input.nextInt();
		switch(userChoice)
		{
			case 1: 
				if(userChoice==1)
					{
					int firstUserNumber, digits;
					System.out.print("Enter number: ");
					firstUserNumber = Input.nextInt();
					digits = sumOfSeriesUserNumber(firstUserNumber);
					System.out.println("Sum: " + digits);
					break;
					}
				
			case 2:
				if(userChoice==2)
				{
					int secondUserNumber, arm; 
					System.out.print("Enter number: ");
					secondUserNumber = Input.nextInt();
					arm = armstrong(secondUserNumber);
					if (arm == secondUserNumber)
					{
						System.out.println(arm + " is an armstrong number.");
					}
					else
					{
						System.out.println(arm+ " is not an armstrong number.");
					}
					break;
					
				}
			case 3:
				if(userChoice==3)
				{
					int thirdUserNumber;
					System.out.println("Enter a number:");
					thirdUserNumber=Input.nextInt();
					if(Prime(thirdUserNumber))
						System.out.println("This is a prime number.");
					else
						System.out.println("This is a composite number.");
					break;
				}
			
			case 4:
				if(userChoice==4)
				{	
					int fourthUserNumber;
					System.out.println("Enter a number: ");
					fourthUserNumber = Input.nextInt();
					multipleOfTen(fourthUserNumber);
					break;
				}
			
			case 5:
				if(userChoice==5)
				{
					int fifthUserNumber;
					System.out.print("Enter number: ");
					fifthUserNumber = Input.nextInt();
					sum_total(fifthUserNumber);
					break;				
				}

			case 6:
				if(userChoice==6)
				{
					int sixthUserNumber; 
					System.out.print("Enter number: ");
					sixthUserNumber = Input.nextInt();
					palindrome(sixthUserNumber);
					break;
				}
		
			case 7:
				if(userChoice==7)
				{
					int seventhUserNumber;
					System.out.print("Enter number: ");
					seventhUserNumber = Input.nextInt();
					factorial(seventhUserNumber);
					System.out.println();
					break;
				}
				
			while(userChoice !=8);			
		}
	}

	private static int sumOfSeriesUserNumber(int firstUserNumber) 
	{
		int i=2, j=1, sum=0, power;
		while (j <= firstUserNumber)
		{
			power = i*i;
			System.out.print(i + "^" + 2 + "+");
			sum += power;
			i+=2;
			j++;
		}
		System.out.print("\b " );
		System.out.println();

		return sum;
	}

	private static int armstrong(int secondUserNumber) 
	{
		int total=0,armstrongDigit;

		while(secondUserNumber>0)
		{
			armstrongDigit=secondUserNumber%10;
			total+=(armstrongDigit*armstrongDigit*armstrongDigit);
			secondUserNumber/=10;
			System.out.print(armstrongDigit + "^" + 3 + "+");
		}
		System.out.print("\b " + "= ");
		return total;
	}
	
	private static boolean Prime(int thirdUserNumber) 
	{
		boolean prime=true;
		for(int divide=2;divide<=thirdUserNumber/2 && prime;divide++)
		{
			if ((thirdUserNumber%divide)==0)
				prime=false;
		}

		return prime;
	}

	private static void multipleOfTen(int fourthUserNumber) 
	{
		int k=2,l;
	 	while(k<11)
		{
			for (l=1;l<11;l++)
			{
				System.out.println(fourthUserNumber + " X " + l + " = " +(fourthUserNumber*l));

			}
			break;
		}
	}
	
	private static void sum_total(int fifthUserNumber) 
	{
		int evenSum =0,oddSum = 0,m=0,n=0,o=0, remain;
		String len;
		len = fifthUserNumber + "";
		while(m<len.length())
		{
			remain = fifthUserNumber%10;
			if (remain % 2 == 0)
			{
				evenSum+=remain;
				fifthUserNumber/=10;
				n+=1;
			}
			else
			{
				oddSum+=(remain);
				fifthUserNumber/=10;
				o+=1;
			}
			m++;
		}
			System.out.println("Sum of even digits: " + evenSum );
			System.out.println("Sum of odd digits: " + oddSum );
			System.out.println("Number of even digits: " + n);
			System.out.println("Number of odd digits: " + o);
	}
	private static void palindrome(int sixthUserNumber) 
	{
		int p=0,remainder;
		String palindromeNumber, lengthOfNumber;
		palindromeNumber="";
		lengthOfNumber = sixthUserNumber + "";
		while(p<lengthOfNumber.length())
		{
			remainder = (sixthUserNumber%10);
			String remain = remainder+"";
			palindromeNumber+=remain;
			sixthUserNumber/=10;
			p++;
		}
		if (palindromeNumber.equalsIgnoreCase(lengthOfNumber))
		{
			System.out.println(palindromeNumber + " is a palindrome number.");
		}
		else
		{
			System.out.println(palindromeNumber + " is not a palidrome number.");
		}
	}
	private static void factorial(int seventhUserNumber) 
	{
		int q;
		System.out.print(seventhUserNumber+"!= ");
		for(q=1;q<=seventhUserNumber;q++)
		{
			System.out.print(q + "X");
		}
		System.out.print("\b ");
	}

}

