
import java.util.Scanner;

public class Demo_Rectangle1 
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		int x,y;
		Rectangle1 r  =new Rectangle1();
		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();
		r.set_length(x); //Invoking method of Rectangle1 Class
		r.set_breadth(y);
		// System.out.println(x);
		System.out.println("With length = " + r.length + " breadth = " + r.breadth);
		System.out.println("Area " + r.area() + " Perimeter = " + r.perimeter());
	}

}
