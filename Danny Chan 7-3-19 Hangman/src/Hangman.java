
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Name: Brandon Tran, Danny Chan, Mary Lynn Tom
 * Assignment: Hangman (Project 2)
 * Date: 7/3/2019
 */

public class Hangman {
    public static String word;
    public static void main(String[] args) 
    {
        // accept input from user
        Scanner input = new Scanner(System.in);
        
        // define possible word choices
        String[] words = {"apple", "banana", "orange", "pear", 
        "corgi", "peach", "glass", "dragon", "pokemon", "java"};
        
        // arrayList
        ArrayList<Character> oldWord = new ArrayList<Character>();
        
        // boolean for continuing game
        boolean play = true;
        
        // begin play
        do {
            
            // rules of the game
            System.out.println("\nWelcome to Hangman!");
            System.out.println("Here are the rules for this game.");
            System.out.println("1. You can guess 8 times.");
            System.out.println("2. You can only enter one character at one time.");
            System.out.println("3. You cannot use Symbols, e.g. (%).");
            
            // start game
            int wordNum = (int)(Math.random() * (10 - 1) + 1);
            String word = words[wordNum];
            
            // define hidden word
            String hiddenWord = word.replaceAll(".", "*");
            
            // number of attempts by user
            int tries = 8;
            
            // has the word been guessed yet?
            boolean wordIsTrue = true;
            // continue game until word guessed or max attempts
            while (wordIsTrue && (tries >= 0)) {
                
                // prompt user to enter a letter
                System.out.println("\nEnter a letter:");
                System.out.println(hiddenWord);
                
                System.out.println("\nLetters you have previously guessed: "
                        + oldWord);
                
                System.out.print("\nEnter a letter to guess: ");
                String guess = input.nextLine();
                
                // check that guess is valid (only one char)
                if (guess.length() > 1) {
                    System.out.println("Your guess is more than one character!");
                    continue;
                }
                
                // check valid (cannot be symbol)
                if(guess.matches("[^A-Za-z0-9]")) {
                    System.out.println("Symbols are not allowed!");
                    continue;
                }
                
// convert guess to lowercase
                guess.toLowerCase();
                
                
                // check valid (not previously guessed)
                if (oldWord.contains(guess.charAt(0))) {
                    System.out.println("This letter is already guessed!");
                    continue;
                }
                
                // 
                oldWord.add(guess.charAt(0));

                // if word does contain the user's guess
                if(word.contains(guess)) {
                    
                    for(int i = 0; i < word.length(); i++) {
                        
                        if (guess.charAt(0) == word.charAt(i)) {
                            
                            String newHiddenWord = hiddenWord.substring(0,i).concat(guess);
                            hiddenWord = newHiddenWord.concat(hiddenWord.substring(i + 1));
                        }
                    }
                    
                    System.out.println("Nice!");
                }
                // if letter is incorrect
                else {
                    System.out.println("You have lost one attempt!");
                    System.out.println("You have " + tries + " tries" + " left.");
                    tries--;
                }
                
                // if all the letters of the word have been guessed
                if (!hiddenWord.contains("*")) {
                    System.out.println("You win the game!!!");
                    break;
                }
                else if(tries < 0) {
                    System.out.println("You have no more chances. You lose!");
                }
            }
            
            // prompt user to continue playing
            System.out.print("Do you want to continue playing? (yes/no): ");
            String playOneMore = input.nextLine();
            
            // end game
            if (playOneMore.equalsIgnoreCase("no")) 
            {    
                play = false;
                System.out.println("Goodbye :D");
            }
            // keep playing
            else if (playOneMore.equalsIgnoreCase("yes"))
            {
              oldWord.clear();
              continue;
            }
            // if anything else is entered
            else {
                break;
            }
            
        } while (play);
    }
}