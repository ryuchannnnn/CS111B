//Name: Danny Chan
//Assignment: 3.1
//Created 6-26-19
import java.util.Scanner;

public class OperationsDemo 
{
	public static void main(String[] args) 
	{
		Scanner Input=new Scanner(System.in);
	    {
	        int num, result, pow, option;
	        num = pow = option = 0;
	        
	        Operations opUser = new Operations();
	        
	        do {
	            System.out.println("OPERATIONS:\n");
	            System.out.println("1: Composite");
	            System.out.println("2: Count");
	            System.out.println("3: Power");
	            System.out.println("\n0: Exit\n");
	            System.out.print("What would you like to do? ");
	            option = Input.nextInt();
	            System.out.println();
	            switch (option)
	            {
	                case 1: 
	                    System.out.println("COMPOSITE:");
	                    
	                    System.out.print("\nEnter a number: ");
	                    num = Input.nextInt();
	                    
	                    result = opUser.composite(num);
	                    System.out.print("The number you've entered is ");
	                    if (result == 0)
	                        System.out.print("not ");
	                    System.out.print("a composite number.");
	                    System.out.println("\n");
	                    
	                    break; 
	                    
	                case 2:
	                    System.out.println("COUNT:");
	                    
	                    System.out.print("\nEnter a number: ");
	                    num = Input.nextInt();
	                    
	                    result = opUser.count(num);
	                    System.out.print("The number you entered has "
	                            + result + " digit(s).");
	                    System.out.println("\n");
	                    
	                    break;
	                    
	                case 3: 
	                    System.out.println("POWER:");

	                    System.out.print("\nEnter a number (base): ");
	                    num = Input.nextInt();
	                    System.out.print("Enter a number (power): ");
	                    pow = Input.nextInt();
	                    
	                    result = opUser.power(num, pow);
	                    System.out.print("\n" + num + " raised to the power of "
	                            + pow + " is " + result);
	                    System.out.println("\n");
	                    
	                    break; // end of case 3
	                    
	                case 0:
	                    System.out.println("Exiting program...");
	                    break;
	                    
	                default:
	                    System.out.print("Invalid input.");
	                    System.out.println("\n\n\n");
	            }
	            
	        } while (option!= 0);
	    }
	}
}
