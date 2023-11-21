
public class Rectangle2 
{
	private int length,breadth; // Private Instance Variable
	//Public Method
	public void set_length(int l) //Mutator Method
	{
		length=l;
	}
	
	public void set_breadth(int b) //Mutator Method
	{
		breadth=b;
	}
	
	public int get_breadth()
	{
		return breadth;
	}
	
	public int get_length()
	{
		return length;
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
