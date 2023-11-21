//Name: Danny Chan
//Assignment: Exercise 6.2
//Created: 7-16-19
// This assignment takes in the day from the user and converts it into two formats. 
import java.util.Scanner;
public class fullDate 
{
	static int year,date,month;
	public static int DateInMonth(int M)
		{
		if (M==2&&year%4==0)
			return 29;
		else if(M==2&&year%4!=0)
			return 28;
		else if(M==4||M==6||M==9||M==11)
			return 30;
		else
			return 31;                    
	}
	public static int checkMonth (int month) throws MonthException
	{
		fullDate.month=month;
		try
		{
			if(month<=0||month>12)
			{
				throw new MonthException();
			}
		}
		catch(MonthException e)
		{
			throw new MonthException();
		}
		return month;
	}
	public static int checkYear(int year) throws YearException
	{
		fullDate.year=year;
		try
		{
			if(year<=1000||year>3000)
				throw new YearException();
		}
		catch(YearException e)
		{
			throw new YearException();
		}
		return year;
	}
	public static int checkDate(int date) throws DayException
	{
		fullDate.date=date;
		try
		{
			if(date<=0||date>DateInMonth(month))
				throw new DayException();
		}
		catch(DayException e)
		{
			throw new DayException();
		}
		return date;
	}

	public static String MonthCoversion(int month)
	{
		switch(month)
		{
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "System error";
		}
	}

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		boolean IsYear=false;
		boolean IsMonth=false;
		boolean IsDay=false;
		while(!IsYear)
		{
			System.out.print("Enter year: ");
			int year=input.nextInt();
			try
			{
				year=checkYear(year);
				IsYear=true;
			}
			catch(YearException e)
			{
				System.out.println(e.getMessage());
			}
		}
		while(!IsMonth)
		{
			System.out.print("Enter month(In Number): ");
			int month=input.nextInt();

			try
			{
				month=checkMonth(month);
				IsMonth=true;
			}
			catch(MonthException e)
			{
				System.out.println(e.getMessage());
			}
		}
		while(!IsDay)
		{
			System.out.print("Enter day: ");
			int day=input.nextInt();

			try
			{
				day=checkDate(day);
				IsDay=true;
			}
			catch(DayException e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("The date in numerical format = "+month+"/"+date+"/"+year);
		System.out.println("The date in normal format "+MonthCoversion(month)+" "+date
				+","+year);
	}
}