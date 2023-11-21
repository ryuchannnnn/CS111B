//Name: Danny Chan
//Assignment: Assigment 2 
//Created: 7-1-19 
//This program asks the users how far they drove and how much miles the car consumes for gas. 
import java.util.Scanner;
public class Odometer 
{
	  public static void main(String[] args)
	  {
		    double milesDriven,mpg,gasoline;
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter the miles driven:");
		    milesDriven = input.nextDouble();
		    System.out.println("Enter miles per gallon:");
		    mpg = input.nextDouble();
		    OdometerTest test = new OdometerTest(milesDriven,mpg);
		    test.setOdometer();
		    test.setMiles(milesDriven);
		    test.setMPG(mpg);
		    System.out.println(test.getGasoline());
	  }
}