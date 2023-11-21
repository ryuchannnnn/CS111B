//Name:Danny Chan, Joey Chen
//Assignment:Exercise 5.2 
//Created: 7-10-19
// This assignment checks if the seat on the plane is taken and 
//makes an x on the seat if it is able to be taken by the user. 
import java.util.Scanner;
import java.util.Arrays;
public class planeseatingchart 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String[][] A={{"1","A","B","C","D"},{"2","A","B","C","D"},{"3","A","B","C","D"},{"4","A","B","C","D"},{"5","A","B","C","D"},{"6","A","B","C","D"},{"7","A","B","C","D"}};
		boolean pr = true;
		String start;
		System.out.println("Would you like to book a flight?(yes/no)");
		start = input.nextLine();
		if (start.equalsIgnoreCase("no"))
		{
			pr = false;
		}
		else
		{
			Display(A);
		}
		while(pr)
		{	
	 		String rownum,colnum;
			int col=0,row=0;
			System.out.print("Enter row number: ");
			rownum = input.nextLine();
			System.out.print("Enter column: ");
			colnum = input.nextLine();
			if (rownum.charAt(0) > '7' || rownum.charAt(0) < '1' || colnum.charAt(0) < 'A' || colnum.charAt(0) > 'D') 
			{
				System.out.println("You have entered an invalid seat.");
				continue;
			}
			else
			{
			switch(colnum)
			{
				case"A":
					col=1;
					break;

				case"B":
					col=2;
					break;

				case"C":
					col=3;
					break;

				case"D":
					col=4;
					break;
			}
			switch(rownum)
			{
				case"1":
				row=0;
				break;
				case"2":
				row=1;
				break;
				case"3":
				row=2;
				break;
				case"4":
				row=3;
				break;
				case"5":
				row=4;
				break;
				case"6":
				row=5;
				break;
				case"7":
				row=6;
				break;
			}
		}
		if(A[row][col] == "X")
				{
					System.out.println("Occupied");
					continue;
				}
				else
				{
					A[row][col] = "X";
					Display(A);
				}
		boolean isfull = true;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<5;j++)
			{
				if (Character.isAlphabetic(A[i][j].charAt(0)) && A[i][j] != "X") {
					isfull = false;
				}
		}
		}
		if (isfull) 
		{
			System.exit(0);
		}
		String exit;
		System.out.println("Are you finished booking?(yes/no)");
		exit = input.nextLine();
		if(exit.equalsIgnoreCase("yes"))
		{
			pr = false;
			System.out.println("Good bye!");
		}
		else
		{
			Display(A);
		}
	}
}

	public static void Display(String [][] Arr)
	{
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}