// Name:Danny Chan
// Created: 6-12-19
// Assignemnt:Extra Credit 1.2

import java.util.Scanner;
public class ExtraCreditMoneyConversion 
{
	public static void main(String[] args) 
	{
	Scanner Input=new Scanner(System.in);
	double amount;
	int tenDollars, fiveDollars, oneDollar, fiftyCents, quarters, dimes, pennies;
	System.out.print("Enter Dollars Amount:");
	amount=Input.nextDouble();
	tenDollars=(int)(amount/10);
	fiveDollars=(int)((amount%10)/5);
	oneDollar=(int)(((amount%10)%5)/1);
	fiftyCents=(int)((((amount%10)%5)%1)/0.5);
	quarters=(int)(((((amount%10)%5)%1)%0.5)/0.25);
	dimes=(int)((((((amount%10)%5)%1)%0.5)%0.25)/0.10);
	pennies=(int)(((((((amount%10)%5)%1)%0.5)%0.25)%0.10)/0.01);
	System.out.println("$10 = " + tenDollars);
	System.out.println("$5 = " + fiveDollars);
	System.out.println("$1 = " + oneDollar);
	System.out.println("50 cents = " + fiftyCents);
	System.out.println("quarters = " + quarters);
	System.out.println("dimes = " + dimes);
	System.out.println("pennies = " + pennies);
	}
}
