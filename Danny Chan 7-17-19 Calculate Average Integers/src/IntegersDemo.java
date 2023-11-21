//Name:Danny Chan
//Assignment: 7-17-19
//Created: 7-17-19 
// This assignment takes the avg of numbers inputted by the user. 
import java.util.Scanner;

public class IntegersDemo 
{
	public static void main(String[] args) 
	{
		int total=0;
		int avgNum;
		Scanner input=new Scanner(System.in);
		boolean ok= false;
		boolean Try=false;
		while(!ok)
		{
			System.out.println("How many numbers do you want to calculate average?");
			avgNum=input.nextInt();
			try{
				if (avgNum<0)
					throw new IntegersPositiveException(avgNum);
				ok=true;
			}
			catch(IntegersPositiveException e)
			{
				System.out.println(e.getNumber() + " is not positive. "+
						e.getMessage());
				System.out.println("I cannot calculate average for you!");
			}
			for (int i=0;i<avgNum;i++)
			{
				while(!Try)
				{
					System.out.print("Enter a number: ");
					try
					{
						int N2=input.nextInt();
						total+=N2;
						break;
					}
					catch(Exception e)
					{
						String N3= input.nextLine();
						System.out.println(N3+" is not a Integer.");
					}
				}
			}
			System.out.println("Average is "+ total/avgNum);    
		}    
	}
}