public class Competition
{
  private String nameOfCompetition;
  private String winningTeam;
  private String runnerUpTeam;
  private int yearofCompetition;

public Competition()
{
  nameOfCompetition = " ";
  winningTeam = " ";
  runnerUpTeam = " ";
  yearofCompetition = 0;
}
public Competition(String nameOfCompetition, String winningTeam, String runnerUpTeam, int yearOfCompetition)
{
  this.nameOfCompetition = nameOfCompetition;
  this.winningTeam = winningTeam;
  this.runnerUpTeam = runnerUpTeam;
  this.yearofCompetition = yearOfCompetition;
}
public void setNameOfCompetition(String nameOfCompetition)
{
  this.nameOfCompetition = nameOfCompetition;
}
public String getNameOfCompetition()
{
  return nameOfCompetition;
}
public void setWinteam(String winningTeam)
{
  this.winningTeam = winningTeam;
}
public String getwinningTeam()
{
  return winningTeam;
}
public void setRunnerup(String runnerUpTeam)
{
  this.runnerUpTeam = runnerUpTeam;
}
public String getrunnerUpTeam()
{
  return runnerUpTeam;
}
public void setYear(int yearOfCompetition)
{
  this.yearofCompetition = yearOfCompetition;
}
public int getYearofCompetition()
{
  return yearofCompetition;
}
public String toString()
{
  return "\nName of the competition: " + nameOfCompetition +"\nWinteam: " + winningTeam + "\nRunnerup: " + runnerUpTeam + "\nYear: " + yearofCompetition;
}
}