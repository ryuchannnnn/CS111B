// Name: Danny Chan
// Created: 6-18-19
// Assignment: 1
// This program determines how far the user has to travel in miles, and then lets the user choose between first class, 
// second class, or third class(economy), and then calculates their amount due depending on their choices. 
import java.util.Scanner;
public class calculate_fare 
{
	public static void main(String[] args) 
	  {
	    double choiceOfClass,costOfTrip,miles;
	    Scanner Input = new Scanner(System.in);
	    System.out.println("Enter number of miles:");
	    miles = Input.nextDouble();
	    costOfTrip = 0 ;
	    System.out.println("Select your class as a number:");
	    choiceOfClass = Input.nextInt();
	    switch((int)choiceOfClass)
	    {
	      case 1: System.out.println("First class:");
	              if (miles<=100)
	              costOfTrip = (3*miles);
	              else if (miles>100 && miles<=250)
	              {
	              miles -= 100;
	              costOfTrip = (3*100)+(2.50*miles);
	              }
	              else if (miles>250)
	              {
	              miles -= 250;
	              costOfTrip =(3*100)+(2.50*150)+(2*miles);
	              }
	              break;
	      case 2: System.out.println("Second class:");
	              if (miles<= 100)
	              costOfTrip = (2*miles);
	              else if (miles>100 && miles<=250)
	              {
	              miles -= 100;
	              costOfTrip = (2*100)+(1.50*miles);
	              }
	              else if (miles>250)
	              {
	              miles -= 250;
	              costOfTrip = (2*100)+(1.50*150)+(1*miles);
	              }
	              break;
	      case 3: System.out.println("Third class:");
	              if (miles<=100)
	              costOfTrip = (1.50*miles);
	              else if (miles>100 && miles<=250)
	              {
	              miles -= 100;
	              costOfTrip = (1.50*100)+(1*miles);
	              }
	              else if (miles>250)
	              {
	              miles -= 250;
	              costOfTrip = (1.50*100)+(1*150)+(0.50*miles);
	              }
	              break;
	      default:System.out.println("Invalid input.");
	    }
	   
	    System.out.print("$");
	    System.out.printf("%4.2f",(costOfTrip)); 
	  }
	}
