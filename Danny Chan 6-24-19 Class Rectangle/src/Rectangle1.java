
public class Rectangle1 
{
	public int length,breadth; // Instance Variable
	
	public void set_length(int l) //Mutator Method
	{
		//l-=2;
		length=l;
	}
	
	public void set_breadth(int b) //Mutator Method
	{
		breadth=b;
	}
	
	public int area()
	{
		return length*breadth;
	}
	
	public int perimeter()
	{
		return (2*(length+breadth));
	}
}
