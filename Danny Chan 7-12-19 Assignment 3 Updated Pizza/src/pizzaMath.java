public class pizzaMath 
{
	private int numOfPizzas = 0;
	private pizza pizzaNum1 = new pizza();
	private pizza pizzaNum2 = new pizza();
	private pizza pizzaNum3 = new pizza();
	public pizzaMath()
	{
		numOfPizzas = 0;
	}
	public void setnumOfPizzas(int numPizzas)
	{
		numOfPizzas = numPizzas;
	}
	public void setPizza1(pizza pizza1)
	{
		pizzaNum1.setValues(pizza1.getsize(), pizza1.getcheese(),
				pizza1.getpepperoni(), pizza1.getham());
	}
	public void setPizza2(pizza pizza2)
	{	
		pizzaNum2.setValues(pizza2.getsize(), pizza2.getcheese(),
				pizza2.getpepperoni(), pizza2.getham());
	}
	public void setPizza3(pizza pizza3)
	{
		pizzaNum3.setValues(pizza3.getsize(), pizza3.getcheese(),
				pizza3.getpepperoni(), pizza3.getham());
	}
	public double calcTotal()
	{
		double total = 0.00;
		pizzaNum1.calcCost();
		switch (numOfPizzas)
		{
			case 3:
				total  = total + pizzaNum3.calcCost();
			case 2:
				total  = total + pizzaNum2.calcCost();
			case 1:
				total  = total + pizzaNum1.calcCost();
		}
		return total;
	}
	public int getNumPizzas()
	{
		return numOfPizzas;
	}
	public pizza getPizza1()
	{
		return pizzaNum1;
	}
	public pizza getPizza2()
	{
		if (numOfPizzas > 1)
			return pizzaNum2;
		return null;
	}
	public pizza getPizza3()
	{
		if (numOfPizzas > 2)
			return pizzaNum3;
		return null;
	}
	public pizzaMath(pizzaMath otherOrders)
	{
		numOfPizzas = otherOrders.numOfPizzas;
		String size;
		int cheese, pepperoni, ham;
		switch (numOfPizzas)
		{
			case 3:
				size = otherOrders.pizzaNum3.getsize();
				cheese = otherOrders.pizzaNum3.getcheese();
				pepperoni = otherOrders.pizzaNum3.getpepperoni();
				ham = otherOrders.pizzaNum3.getham();
				pizzaNum3.setValues(size, cheese, pepperoni, ham);
			case 2:
				size = otherOrders.pizzaNum2.getsize();
				cheese = otherOrders.pizzaNum2.getcheese();
				pepperoni = otherOrders.pizzaNum2.getpepperoni();
				ham = otherOrders.pizzaNum2.getham();	
				pizzaNum2.setValues(size, cheese, pepperoni, ham);
			case 1:
				size = otherOrders.pizzaNum1.getsize();
				cheese = otherOrders.pizzaNum1.getcheese();
				pepperoni = otherOrders.pizzaNum1.getpepperoni();
				ham = otherOrders.pizzaNum1.getham();
				pizzaNum1.setValues(size, cheese, pepperoni, ham);
		}
	}
}