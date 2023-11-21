
public class Entries 
{
	public static void main(String[] args) 
	{
	    Competition competition1 = new Competition("Eat","Animals","Plants",2018);
	    Competition competition2 = new Competition("Speak","Animals","Plants",2019);

	    Team team1 = new Team("Animals","Dog","Cat","Bird","Fish",competition1,competition2);
	    Team team2 = new Team("Plants","Seeds","Tree","Flower","Roots",competition1,competition2);

	    team2.setCompetition1(new Competition("Sleep","Plants","Animals",2018));
	    team2.setCompetition2(new Competition("Run","Animals","Plants",2019));
	    	    
	    System.out.println(team1);
	    System.out.println(" ");
	    System.out.println(team2);
	  }
}

