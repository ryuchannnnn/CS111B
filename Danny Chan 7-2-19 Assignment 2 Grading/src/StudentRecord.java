
public class StudentRecord

{
private int quizOneScore,quizTwoScore,quizThreeScore,quizScores,midtermScore,finalScore,finalGrade;

public StudentRecord()
{
	quizOneScore=0;
	quizTwoScore=0;
	quizThreeScore=0;
	quizScores=0;
	midtermScore=0;
	finalScore=0;
	finalGrade=0;
}
  	
public StudentRecord(int quizOneScore,int quizTwoScore,int quizThreeScore,int midtermScore,int finalScore)
{
 this.quizOneScore = quizOneScore;
 this.quizTwoScore = quizTwoScore;
 this.quizThreeScore = quizThreeScore;
 this.quizScores= quizOneScore+quizTwoScore+quizThreeScore;
 this.finalGrade = ((int)(((quizScores*0.25)+(int)(midtermScore*0.35)+(int)(finalScore*0.4))));
 this.midtermScore = midtermScore;
 this.finalScore= finalScore;

 if (finalGrade >= 90)
     System.out.println("You have an A.");
 else if ((finalGrade<90)&&(finalGrade >=80))   
     System.out.println("You have a B.");
 else if ((finalGrade<80)&&(finalGrade >=70))   
     System.out.println("You have a C.");
 else if ((finalGrade<70)&&(finalGrade >=60))
     System.out.println("You have a  D.");
 else if (finalGrade<60)
     System.out.println("You have a F.");
 else 
     System.out.println("Invalid input.");
}
public int getQuizScores()
    {
        return quizScores;
    }
public int getfinalGrade()
    {
        return (this.finalGrade); 
    }  
}
