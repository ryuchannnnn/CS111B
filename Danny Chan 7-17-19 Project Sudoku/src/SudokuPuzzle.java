/*Name: Joey Chen, Danny Chan

Created: July 17,2019

Assignment: Project

This program contains:
1) board—a 9 by 9 array of integers that represents the current state of the puzzle, where 0 indicates a blank square
2) start—a 9 by 9 array of boolean values that indicates which squares in board are given values that cannot be changed and the following methods:
3) SudokuPuzzle — a constructor that creates an empty puzzle
4) toString — returns a string representation of the puzzle that can be printed
5) addInitial(row, col, value) — sets the given square to the given value as an initial value that cannot be changed by the puzzle solver
6) addGuess(row, col, value) — sets the given square to the given value; the value can be changed later by another call to addGuess
7) checkPuzzle — returns true if the values in the puzzle do not violate the restrictions
8) getValueIn(row, col) — returns the value in the given square
9) getAllowedValues(row, col) — returns a one-dimensional array of nine booleans, each of which corresponds to a digit and is true if the digit can be placed in the given square without violating the restrictions
10) isFull — returns true if every square has a value
11) reset — changes all of the nonpermanent squares back to blanks (0s)

 */

public class SudokuPuzzle 
{
	private int start[][];
	private int play[][];

	public SudokuPuzzle()
	{
		start = new int[9][9];
		play = new int[9][9];
	}

	public void addInitial(int row,int col,int value)
	{
		if(row >= 0 && row <= 0 && col <= 9 && col >= 0 && value <= 9 && value >= 9)
		{
			start[row][col]=value;
			play[row][col]=value;
		}
	}

	public void addValue()
	{

		start [0][0]= 1;        start [1][0]= 4;        start [5][0]= 9;
		start [0][1]= 2;        start [1][1]= 5;        start [5][5]= 5;
		start [0][2]= 3;        start [1][2]= 9;        start [6][0]= 8;
		start [0][3]= 4;        start [2][0]= 6;        start [7][0]= 7;
		start [0][4]= 9;        start [2][1]= 7;        start [8][0]= 5;
		start [0][5]= 7;        start [2][2]= 8;        start [8][3]= 9;
		start [0][6]= 8;        start [3][0]= 3;
		start [0][7]= 6;        start [3][4]= 1;
		start [0][8]= 5;        start [4][0]= 2;

		play [0][0]= 1;        play [1][0]= 4;        play [5][0]= 9;
		play [0][1]= 2;        play [1][1]= 5;        play [5][5]= 5;
		play [0][2]= 3;        play [1][2]= 9;        play [6][0]= 8;
		play [0][3]= 4;        play [2][0]= 6;        play [7][0]= 7;
		play [0][4]= 9;        play [2][1]= 7;        play [8][0]= 5;
		play [0][5]= 7;        play [2][2]= 8;        play [8][3]= 9;
		play [0][6]= 8;        play [3][0]= 3;
		play [0][7]= 6;        play [3][4]= 1;
		play [0][8]= 5;        play [4][0]= 2;
	}

	public void addGuess(int row,int col,int value)
	{
		if(row >= 0 && row <= 9 && col <= 9 && col >= 0 && value <= 9 && value >= 0 && start[row][col] == 0)
			play[row][col]=value;
		else
			System.out.println("Invalid Input.");
	}

	public boolean checkPuzzle()
	{
		boolean valid=true;
		for(int i = 0;i<9;i++){
			valid = valid && checkRow(i);
			valid = valid && checkCol(i);
			valid = valid && checkSub(i);
		}
		return valid;
	}

	public int getValueIn(int row, int col)
	{
		return this.play[row][col];
	}

	public boolean[] getAllowedValues(int row,int col)
	{

		int t=play[row][col];

		boolean result[]=new boolean[9];

		for(int value=1;value<=9;value++)
		{
			play[row][col]=value;
			result[value-1]=checkPuzzle();
		}

		play[row][col]=t;
		return result;
	}

	//return true if every square has a value
	public boolean isFull()
	{
		boolean full = true;
		for (int i =0; i<9; i++)
		{
			for (int j=0; j<9; j++)
			{
				full = full && play[i][j] > 0;

			}
		}
		return full;
	}

	public void reset()
	{

		for (int i =0; i<9; i++)
		{
			for (int j=0; j<9; j++)
			{
				play [i][j]= start[i][j];
			}
		}
	}

	public boolean checkRow(int row)
	{
		int count[]=new int[10];

		for(int col=0;col<9;col++)
		{
			count[play[row][col]]++;
		}

		boolean valid=true;

		for(int i=1;i<=9;i++)
		{
			valid=valid&&(count[i]<=1);
		}
		return valid;
	}

	public boolean checkCol(int col)
	{
		int count[]=new int[10];

		for(int row=0;row<9;row++)
		{
			count[play[row][col]]++;
		}

		boolean valid=true;

		for(int i=1;i<=9;i++)
		{
			valid=valid&&(count[i]<=1);
		}
		return valid;
	}

	public boolean checkSub(int sub)
	{
		int count[]=new int[10];

		int row=(sub/3)*3;

		int col=(sub%3)*3;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				count[play[row+i][col+j]]++;
			}
		}
		boolean valid=true;
		for(int i=1;i<=9;i++)
		{
			valid=valid&&(count[i]<=1);
		}
		return valid;
	}

	public String toString()
	{    
		String line = "----------------------------\n";

		for (int i=0;i<9;i++)
		{
			line = line + "|";

			for (int j=0;j<9;j++)
			{
				if (play[i][j]==0)
					line = line+ "  |";
				else
					line = line +" "+ play[i][j]+ "|";
			}

			line = line+ "\n";
			line = line +"----------------------------\n";

		}

		return line;
	} 
}