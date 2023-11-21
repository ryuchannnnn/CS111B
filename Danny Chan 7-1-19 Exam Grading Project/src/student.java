
public class student 
{	
	public int quiz1,quiz2,midterm,finalTestScore,total_score,grade;
	public void set_quiz1 (int a)
	{
		quiz1=a;
	}
	public void set_quiz2 (int b)
	{
		quiz2=b;
	}
	public void set_midterm (int c)
	{
		midterm=c;
	}
	public void set_finalTestScore (int d)
	{
		finalTestScore=d;
	}
	public String toString()
	{
		return "Quiz 1 + " + quiz1 + "Quiz 2 + " + quiz2  + "Midterm + " + midterm  + "Final + " + finalTestScore;
	}
	public int calculatequiz1()
	{
		return (int) (quiz1*0.125);
	}
	public int calculatequiz2()
	{
		return (int) (quiz2*0.125);
	}
	public int calculatemidterm()
	{
		return (int) (midterm*0.25);
	}
	public int calculatefinalTestScore()
	{
		return (int) (finalTestScore*0.50);
	}
	public int calculateaverage()
	{
		return total_score= (int) (quiz1+quiz2+midterm+finalTestScore);
	}
	
}

