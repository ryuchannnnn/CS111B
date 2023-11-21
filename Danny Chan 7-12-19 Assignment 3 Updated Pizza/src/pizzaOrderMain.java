//Name:Danny Chan
//Assignment: Assignment 3
//Created: 7-14-19
//This assignment is an add on from the pizza code.
public class pizzaOrderMain
{
	public static void main(String[] args)
	{
		pizza pizza1 = new pizza("large", 1, 0, 1);
		pizza pizza2 = new pizza("medium", 2, 2, 0);
		pizzaMath order1 = new pizzaMath();
		order1.setnumOfPizzas(2);
		order1.setPizza1(pizza1);
		order1.setPizza2(pizza2);
		System.out.println("Pizza #1: " + order1.getPizza1());
		System.out.println("\nPizza #2: " + order1.getPizza2());
		System.out.println("\nPizza #3: " + order1.getPizza3());
		double total = order1.calcTotal();
		System.out.printf("\nOrder one total: $%.2f", total);
		pizzaMath order2 = new pizzaMath(order1);
		order2.getPizza1().setcheese(3);
		System.out.println("\n\nPizza one details: " + order1.getPizza1());
		total = order2.calcTotal();
		System.out.printf("\nOrder two total: $%.2f", total);		
		double originalTotal = order1.calcTotal();
		System.out.printf("\nOriginal total is: $%.2f", originalTotal);
	}
}