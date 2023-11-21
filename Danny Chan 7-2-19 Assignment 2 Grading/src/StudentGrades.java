//Name: Danny Chan
// Assignment: Assignment 2.2
// Created: 7-1-19
// This takes the score that the user got and calculates their grade. 
import java.util.Scanner;
public class StudentGrades 
{
  public static void main(String[] args) 
  { 
    Scanner input = new Scanner(System.in);
    int quizOneScore,quizTwoScore,quizThreeScore,midtermScore,finalScore;
    System.out.println("Enter the score for first quiz:");
    quizOneScore = input.nextInt();
    System.out.println("Enter the score for the second quiz:");
    quizTwoScore = input.nextInt();
    System.out.println("Enter the score for the third quiz:");
    quizThreeScore = input.nextInt();
    System.out.println("Enter score of midterm:");
    midtermScore = input.nextInt();
    System.out.println("Enter score of final:");
    finalScore = input.nextInt();
    StudentRecord grade = new StudentRecord(quizOneScore,quizTwoScore,quizThreeScore,midtermScore,finalScore);
    System.out.println(grade.getQuizScores());
    System.out.println(grade.getfinalGrade());
  }
}