//Danny Chan
//Assignment 3.3
// Created 7/1/19
public class pizzamain 
{
	
	public static void main(String[] args) 
	{
	       Pizza pizza1 = new Pizza("Small",1,1,1); //Code to create a small pizza
	       Pizza pizza2 = new Pizza("Medium",1,2,3);//Code to create a medium pizza
	       Pizza pizza3 = new Pizza("Large",1,1,2);//Code to create a large pizza
	       pizzaorder order = new pizzaorder();//Code to create an order
	       order.setnumOfPizzas(3);// 3 pizzas in the order
	       order.setpizza1(pizza1);// Sets the first pizza
	       order.setpizza2(pizza2);// Sets the second pizza
	       order.setpizza3(pizza3);// Sets the third pizza
	       order.getpizza1();// Gets the first pizza
	       order.getpizza2();// Gets the second pizza
	       order.getpizza3();// Gets the third pizza
	       System.out.println(pizza1.getDescription());
	       // prints description of the first pizza
	       System.out.println(pizza2.getDescription());
	       // prints description of the second pizza
	       System.out.println(pizza3.getDescription());
	       // prints description of the third pizza
	       System.out.println(pizza1.calcCost()+ pizza2.calcCost()+pizza3.calcCost());
	  }
}

