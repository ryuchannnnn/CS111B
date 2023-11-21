//Name: Danny Chan
// Assignment: Exercise 5.1
// Created: 7/8/19
// This assignment asks the user to enter 10 numbers and prints the highest and the lowest.
import java.util.Scanner;
import java.util.Arrays;
public class GreatestToLeast
{
	public static void main(String[] args)
	{
        int[] arrayNumbers;
        arrayNumbers = new int[10];
        int least = arrayNumbers[0], greatest = arrayNumbers[0];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: \n");
        for (int round = 0; round < arrayNumbers.length; round++)
        {
            arrayNumbers[round] = input.nextInt();
        }
        Arrays.sort(arrayNumbers);
        System.out.printf("Smallest number entered: %d\nLargest number entered: %d\n", arrayNumbers[0], arrayNumbers[9]);
    }
}