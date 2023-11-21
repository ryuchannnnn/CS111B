
public class Pizza 
{ // put instance variables under class
	private String PizzaSize;
	private int numOfCheese,numOfHam,numOfPepperoni;
	public Pizza()
	// initialize variables under the public class 
	{
		PizzaSize= " ";
		numOfCheese=0;
		numOfHam=0;
		numOfPepperoni=0;
	}
	public Pizza(String PizzaSize, int numOfCheese,int numOfHam,int numOfPepperoni) 
	// above is a constructor where you have to apply the this method (this.Variable) calling/reference it
	// this is for a new "object"
	{
		this.PizzaSize=PizzaSize;
		this.numOfCheese=numOfCheese;
		this.numOfHam=numOfHam;
		this.numOfPepperoni=numOfPepperoni;
		
	}
	// After this, you have to set and then get everything (variable type and variable inside here)
	// This refers to the method that is above 
	public void setPizzaSize(String PizzaSize)
	{
		this.PizzaSize=PizzaSize;
	}
	public void setnumOfCheese(int numOfCheese)
	{
		this.numOfCheese=numOfCheese;
	}
	public void setnumOfHam(int numOfHam)
	{
		this.numOfHam=numOfHam;
	}
	public void setnumOfPepperoni(int numOfPepperoni)
	{
		this.numOfPepperoni=numOfPepperoni;
	}
	//Now you have to get everything 
	public String getPizzaSize() 
	{
		return PizzaSize;
	}	
	public int getnumOfCheese() 
	{
		return numOfCheese;
	}	
	public int getnumOfPepperoni() 
	{
		return numOfPepperoni;
	}	
	public int getnumOfHam() 
	{
		return numOfHam;
	}
	public double calcCost()
	{
		if (PizzaSize.equalsIgnoreCase("Small"))
			return (10.00 + (2*(numOfCheese+numOfPepperoni+numOfHam)));
		else if (PizzaSize.equalsIgnoreCase("Medium"))
			return (12.00 + (2*(numOfCheese+numOfPepperoni+numOfHam)));
		else if (PizzaSize.equalsIgnoreCase("Large"))
			return (14.00 + (2*(numOfCheese+numOfPepperoni+numOfHam)));
		return calcCost();
	}
	public String getDescription()
	{
		return ("The pizza size is " + PizzaSize + " with " + numOfCheese + " Cheese toppings " + numOfPepperoni + " Pepperoni toppings " + 
	numOfHam + " Ham toppings" + " and the cost is " + calcCost());
	}
}
	