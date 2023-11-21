/*Name: Joey Chen, Danny Chan

Created: July 17,2019

Assignment: Project

This program contains:
This program allows the user to play Sudoku.
The user will be given a menu and be allowed to:
1) Enter a value on the grid
2) Check what values are allowed in a particular spot on the grid
3) Quit game

The game will stop when the board is finished or if the user quits (Q).
 */

import java.util.Scanner;

public class SudokuTest 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Sudoku!");
		boolean stgame=false;
		while(!stgame)
		{
			System.out.println("Do you want to start a game of sudoku?[Yes/No]");
			String p1=input.next();

			if (p1.equalsIgnoreCase("No"))
			{
				System.out.println("Have a wonderful day!");
				stgame = true;
			}

			else
			{
				System.out.println();
				String help = "Options:\n" + "(Restart a new game[R])" + " (To put the number in the Sudoku[N]) " + " (To get an allowed value[P]) "+"(End Game[Q])";
				SudokuPuzzle game = new SudokuPuzzle();
				game.addValue();

				System.out.println("Starting Sudoku. Enjoy!\n");
				System.out.println(game);

				boolean stgame2=false;

				while(!stgame2)
				{
					System.out.println("What would you like to do?\n" + "(To show the menu[H])");
					String op1=input.next();


					if (op1.equalsIgnoreCase("H"))
						System.out.println(help);

					else if(op1.equalsIgnoreCase("R"))
					{
						game.reset();
						System.out.println(game);
					}

					else if(op1.equalsIgnoreCase("N"))
					{
						System.out.println("Which one do you want to add value?");

						System.out.println("Row (1-9): ");
						int g1=input.nextInt()-1;

						System.out.println("Column (1-9): ");
						int g2=input.nextInt()-1;

						System.out.println("Value (1-9): ");
						int g3=input.nextInt();

						game.addGuess(g1,g2,g3);
						System.out.println(game);
					}

					else if(op1.equalsIgnoreCase("Q"))
					{
						System.out.println("Good bye!");
						stgame2 = true;
						stgame = true;
					}


					else if(op1.equalsIgnoreCase("P"))
					{
						System.out.println("Where do you want to find allowed values?");
						System.out.println("Row(1-9): ");
						int r=input.nextInt()-1;
						System.out.println("Column(1-9): ");
						int r2=input.nextInt()-1;
						if(r >= 0 && r <= 9 && r2 <= 9 && r2 >= 0)
						{
							boolean value1[]=game.getAllowedValues(r, r2);
							System.out.println("Allowed values are: ");

							for(int i=0;i<9;i++)
							{
								if(value1[i])
									System.out.print((i+1)+" ");
							}
						}
						else
							System.out.print("Invalid Input");
						System.out.println();
					}
					else
						System.out.println("Invalid input. Try Again!");

					if(!game.checkPuzzle())
						System.out.println("Wrong number!");

					else if(game.isFull())
						System.out.println("Congratulations!");
				}
			}
		}
	}
}