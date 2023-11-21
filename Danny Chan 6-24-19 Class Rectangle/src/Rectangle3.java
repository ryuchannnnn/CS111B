
public class Rectangle3
	{
		private int length,breadth; // Private Instance Variable
		
		// Constructors 
		public Rectangle3()// No Argument/ default constructor
		{
			length=breadth=5;
		}
		
		public Rectangle3(int l) // Constructor Overload
		{
			length=breadth=l;
		}
		
		public Rectangle3(int l, int b) // Constructor Overload
		{
			length=l;
			breadth=b;
		}
		
		public void Rectangle3(int i) 
		{
				
		}
		
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

