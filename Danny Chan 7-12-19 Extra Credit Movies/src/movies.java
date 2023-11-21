
public class movies 
{
		String Rating,movieTitle,movieType;
		double IDNumber;
		float calcLateFees;
		int daysLate;
		public movies()
		{
			Rating=null;
			movieType=null;
			IDNumber=0000;
			movieTitle=null;
			calcLateFees=0;
			daysLate=0;		
		}
		public movies (String Rating, double IDNumber, String movieTitle, float calcLateFees, int daysLAte, String movieType, int daysLate)
		{
			this.Rating=Rating;
			this.movieType=movieType;
			this.IDNumber=IDNumber;
			this.movieTitle=movieTitle;	
			this.calcLateFees=calcLateFees;
			this.daysLate=daysLate;
		}
		public void setRating (String Rating)
		{
			this.Rating=Rating;
		}
		public void setRating (double IDNumber)
		{
			this.IDNumber=IDNumber;
		}
		public void setmovieType (String movieType)
		{
			this.movieType=movieType;
		}
		public void setmovieTitle (String movieTitle)
		{
			this.movieTitle=movieTitle;
		}
		public void setCalcLateFees (int calcLateFees)
		{
			this.calcLateFees=calcLateFees;
		}
		public void setdaysLate (int daysLate)
		{
			this.daysLate=daysLate;
		}
		public String getRating()
		{
			return Rating;
		}
		public double getIDNumber()
		{
			return IDNumber;
		}
		public String getmovieTitle()
		{
			return movieTitle;
		}
		public String movieType()
		{
			return movieType; 
		}
		public int daysLate()
		{
			return daysLate;
		}
		public float getcalcLateFees()
		{
			if (movieType.equalsIgnoreCase("Action"))
				return (3*daysLate);
			else if (movieType.equalsIgnoreCase("Comedy"))
				return (float) (2.5*daysLate);
			else if (movieType.equalsIgnoreCase("Drama"))
				return (2*daysLate);
			
			return calcLateFees;
		}
}

