
public class Date 
{
	{
		private int day, year;
	}
	private String mon;
	public Date()
	{
		mon=" ";day=0;year=0;
	}
	public String toString()
	{
		return (mon+"/"+day+"/"+year);
	}
	public set_date(String m, int d, int y)
	{
		mon=m;day=d;year=y;
	}
}

