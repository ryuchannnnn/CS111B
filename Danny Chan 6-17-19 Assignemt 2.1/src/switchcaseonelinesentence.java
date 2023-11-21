//Name: Danny Chan
//Created: 6-17-19
//Assignment: Exercise 2.1 
//This assignment will as the user for a sentence, and depending on the punctuation at the end of the sentence, will determine the output. 
import java.util.Scanner;
public class switchcaseonelinesentence 
{
	public static void main(String[] args) 
	{
	Scanner Input= new Scanner(System.in);
	int lengthSentence, sentenceLength;
	String userSentence;
	char punctuation;
	System.out.print("Enter a sentence: ");
	userSentence=Input.nextLine();
	sentenceLength=userSentence.length();
	punctuation=userSentence.charAt(sentenceLength-1);
	switch(punctuation)
	{
	case'?': 
		if(sentenceLength%2==0)
				{
					System.out.print("Yes");
					break;
				}
			else; 
					System.out.print("No");
					break;
	case'!':
		if(sentenceLength%2==0)
				{
					System.out.print("Wow");
					break;
				}
	default:
		System.out.print("You always say \"" + userSentence + "\"");
	}
	}
}
	
	
	
	