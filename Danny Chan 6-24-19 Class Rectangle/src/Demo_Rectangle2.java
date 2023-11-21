import java.util.Scanner;

public class Demo_Rectangle2 
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		int x,y;
		Rectangle2 r  =new Rectangle2();
		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();
		r.set_length(x); //Invoking method of Rectangle1 Class
		r.set_breadth(y);
		// System.out.println("With length = " + r.get_length + " breadth = " + r.get_breadth);
		// will result in an error 
		System.out.println("With length = " + r.get_length() + " breadth = " + r.get_breadth());
		System.out.println("Area " + r.area() + " Perimeter = " + r.perimeter());
	}

}
