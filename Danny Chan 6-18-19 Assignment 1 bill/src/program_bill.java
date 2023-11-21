// Name: Danny Chan
// Created: 6-18-19
// Assignment: 1
// This program determines the total cost of three items the user inputs, as well as adding a tax to the item to find the final cost of three items. 
import java.util.Scanner;
public class program_bill 
{	
	public static void main(String[] args) 
	{
	Scanner Input= new Scanner(System.in);
	String itemNameOne, itemNameTwo, itemNameThree;
	int quantityItemOne, quantityItemTwo, quantityItemThree;
	float priceItemOne, priceItemTwo, priceItemThree, totalItemOne, totalItemTwo, totalItemThree, allThreeTotal; 
	System.out.println("Input name of item 1: ");
	itemNameOne= Input.nextLine();
	System.out.println("Input quantity of item 1: ");
	quantityItemOne = Input.nextInt();
	System.out.println("Input price of item 1: ");
	priceItemOne= Input.nextFloat();
	totalItemOne= quantityItemOne*priceItemOne;
	System.out.println("Input name of item 2: ");
	itemNameTwo= Input.next();
	System.out.println("Input quantity of item 2: ");
	quantityItemTwo = Input.nextInt();
	System.out.println("Input price of item 2: ");
	priceItemTwo= Input.nextFloat();
	totalItemTwo= quantityItemTwo*priceItemTwo;
	System.out.println("Input name of item 3: ");
	itemNameThree= Input.next();
	System.out.println("Input quantity of item 3: ");
	quantityItemThree = Input.nextInt();
	System.out.println("Input price of item 3: ");
	priceItemThree= Input.nextFloat();
	totalItemThree= quantityItemThree*priceItemThree;
	allThreeTotal= totalItemOne+totalItemTwo+totalItemThree;
	double tax = allThreeTotal*0.0625;
	double total = tax+allThreeTotal;
	System.out.println("Your bill:");
	System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", "Price", "Total");
	System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemNameOne, quantityItemOne, priceItemOne, totalItemOne);
	System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemNameTwo, quantityItemTwo, priceItemTwo, totalItemTwo);
	System.out.printf("%-30s %-10d %-10.2f %-10.2f%n%n", itemNameThree, quantityItemTwo, priceItemThree, totalItemThree);
	System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Subtotal", "", "", allThreeTotal);
	System.out.printf("%-30s %-10s %-10s %-10.2f%n", "6.25% sales tax", "", "", tax);
	System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Total", "", "", total);		
	}
}
