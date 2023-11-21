public class pizza 
{
	private String size;
	private int cheese, pepperoni, ham;
	public pizza(String sizes, int c, int p, int h)
	{
		size = sizes;
		cheese = c;
		pepperoni = p;
		ham = h;
	}
	public pizza()
	{
		size = "medium";
		cheese = pepperoni = ham = 0;
	}
	public void setValues(String sizes, int c, int p, int h)
	{
		size = sizes;
		cheese = c;
		pepperoni = p;
		ham = h;
	}
	public void setsize(String sizes)
	{
		size = sizes;
	}
	public void setcheese(int c)
	{
		cheese = c;
	}
	public void setpepperoni(int p)
	{
		pepperoni = p;
	}
	public void setham(int h)
	{
		ham = h;
	}
	public String getsize()
	{
		return size;
	}
	public int getcheese()
	{
		return cheese;
	}
	public int getpepperoni() 
	{
		return pepperoni;
	}
	public int getham()
	{
		return ham;
	}
	public double calcCost()
	{
		int toppings = cheese + pepperoni + ham;
		double total = 0.00;	
		if (size == "small")
			total += 10;
		else if (size == "medium")
			total += 12;
		else
			total += 14;	
		total += (toppings * 2);
		return total;
	}
	public String toString()
	{
		return ("A " + size + " pizza with "
				+ cheese + " cheese topping(s), "
				+ pepperoni + " pepperoni topping(s), and "
				+ ham + " ham topping(s).");
		
	}

}
