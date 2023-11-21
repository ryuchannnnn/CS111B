import java.util.Scanner;
public class keyword 
{
	public static void main(String[] args) 
	{
		Scanner Input=new Scanner(System.in);
		int a,b,c,d,e,f;
		student r= new student();
		System.out.println("Enter quiz 1 score, quiz 2 score, midterm score, and final test score: ");
		a=Input.nextInt();
		b=Input.nextInt();
		c=Input.nextInt();
		d=Input.nextInt();
		switch(r.calculateaverage())
		{
		case 1: 
			if (r.calculateaverage()>=90)
				System.out.println("A");
				break;
		case 2: 
			if (r.calculateaverage()>=80)
				System.out.println("B");
				break;
		case 3: 
			if (r.calculateaverage()>=70)
				System.out.println("C");
				break;
		case 4: 
			if (r.calculateaverage()>=60)
				System.out.println("D");
				break;
		case 5: 
			if (r.calculateaverage()<60)
				System.out.println("F");
				break;	
		default:
				break;
		}
	}
	
}
