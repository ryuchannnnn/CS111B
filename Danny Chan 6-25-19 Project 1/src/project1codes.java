import java.util.Scanner;
//Name: Danny Chan
//Created: 6-23-19
//Assignment: Project 1
// This assignment is for all the codes that needed to be typed out. 
public class project1codes 
{
	public static void main(String[] args)
	{
		//5a
		Scanner input=new Scanner(System.in);
		int enteredNumber;
		System.out.println("Enter a number: ");
		enteredNumber=input.nextInt();
		if(enteredNumber<=1)
			{ 
				System.out.println("Yes");
			}
		       
		else if(enteredNumber>=1)
			{
			System.out.println("No");
			}

		else
			{
			System.out.println("Wrong choice");
			}
		
		//5b. 
		int anotherNumber;
		String userAnswer;
		Boolean goAgain = true;
		while (goAgain)
		{
			System.out.print("Enter a number: ");
			anotherNumber = input.nextInt();
			System.out.println("The square of the number is: " + anotherNumber*anotherNumber);
			System.out.println("Do you want to continue?");
			userAnswer = input.next();
			if(userAnswer.equals("Y"))
			{
				goAgain = true;
			}
			else
			{
				goAgain = false;
			}

		} 
		
		//9a. 
        int userNumberOne,a=1,sum=0,z=1;
        System.out.println("Enter a Number: ");
        userNumberOne=input.nextInt();
        while(z<=userNumberOne)
        {
            System.out.print(a+"+");
            sum+=a;
            a+=2;
            z++;
            
        }
        System.out.print("\b ");
        System.out.println();
        System.out.println("Sum= "+sum); 
		
		//9b. 
        int userNumber,i=2,total=0,startingValue=1,iTimesItself;
        System.out.println("Enter a number: ");
        userNumber=input.nextInt();
        while(startingValue<=userNumber)
        {
            iTimesItself=i*i;
            System.out.print(i+"^2"+"+");
            total+=iTimesItself;
            i+=2;
            startingValue++;
        }
        System.out.print("\b ");
        System.out.println();
        System.out.println("Sum= "+total); 
		
		//9c. Extra Credit Highest Common Factor
        int firstInteger, secondInteger,highestCommonFactor,q;
        highestCommonFactor=1;      
        System.out.println("Enter an integer: ");
        firstInteger=input.nextInt();
        System.out.println("Enter an integer: ");
        secondInteger=input.nextInt();
        for(q = 1; q <= firstInteger && q <= secondInteger; q++)
        {
            if(firstInteger%q==0 && secondInteger%q==0)
            	highestCommonFactor = i;
        }
        System.out.printf("HCF of %d and %d is: %d", firstInteger, secondInteger, highestCommonFactor);        
				
        
				//10. This is the Fibonacci Code 
				int Fibb=6,startValueOne=0,startValueTwo=1,w;
		        for (w=1;w<=Fibb;++w)
		        {
		            System.out.print(startValueOne + " ");
		            total=startValueOne+startValueTwo;
		            startValueOne=startValueTwo;
		            startValueTwo=total;
		        }
	}	
}
