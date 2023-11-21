// this class makes the pizza order
public class pizzaorder 
	{
	// instance variable
	private int numOfPizzas;
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
public pizzaorder()
	{
	// above is a constructor where you have to apply the this method (this.Variable) calling/reference it
	// this is for a new "object"
	  this.numOfPizzas = 0;
	  this.pizza1 = null;
	  this.pizza2 = null;
	  this.pizza3 = null;
	}
public pizzaorder(int numOfPizzas,Pizza pizza1,Pizza pizza2,Pizza pizza3)
	{
	// set and then get everything (variable type and variable inside here)
	  setnumOfPizzas(numOfPizzas);
	  setpizza1(pizza1);
	  setpizza2(pizza2);
	  setpizza3(pizza3);
	}
public void setnumOfPizzas(int numOfPizzas) 
	{
	  if (numOfPizzas<1)
		  this.numOfPizzas= 1;
		  else if (numOfPizzas>3)
		  this.numOfPizzas = 3;
		  else
		  this.numOfPizzas = numOfPizzas;
	}
public void setpizza1(Pizza pizza1)
	{
	// sets the first pizza  
	if(numOfPizzas>=1)
	  this.pizza1 = pizza1;
	  else
	  this.pizza1 = null;
	}
	// sets the second pizza
public void setpizza2(Pizza pizza2)
	{
	  if (numOfPizzas>=2)
	  this.pizza2 = pizza2;
	  else
	  this.pizza2 = null;
	}
	// sets the third pizza
public void setpizza3(Pizza pizza3)
	{
	  if (numOfPizzas>= 3)
	  this.pizza3 = pizza3;
	  else
	  this.pizza3 = null;
	}
public Pizza getpizza1()
	{
		return pizza1;
	}
public Pizza getpizza2()
	{
		return pizza2;
	}
public Pizza getpizza3()
	{
		return pizza3;
	}
public double calcTotal()
{
	double cost = 0.0;
	
	if(pizza1 != null)
		cost += pizza1.calcCost();
	
	if(pizza2 != null)
		cost  += pizza2.calcCost();
	
	if(pizza3 != null)
		cost += pizza3.calcCost();
	
	return calcTotal();
}
}

