// Name: Danny Chan
// Created: 6/12/19
// Assignment: Exercise 1.2

import java.util.Scanner;
public class InterestInMoney 
{
    public static final double INTERESTRATE=0.0299;
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        double presentMoney,numberOfYears,futureMoneyGoal;
        System.out.println("Enter amount you desire: ");
        futureMoneyGoal=input.nextDouble();
        System.out.println("Enter Number of years:");
        numberOfYears=input.nextDouble();
        presentMoney=futureMoneyGoal/(Math.pow((1+INTERESTRATE),numberOfYears));
        System.out.println("You need to deposit "+presentMoney+" dollars.");
    }
}