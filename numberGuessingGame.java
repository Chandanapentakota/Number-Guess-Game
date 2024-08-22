import java.util.*;
public class  numberGuessingGame
{
    public static void main (String[] args)
    {
      Scanner Reader=new Scanner(System.in);
      String play="yes";
      
      while(play.equals("yes"))
      {
          Random rand= new Random();
          int newrand=rand.nextInt(100);
          int guess=-1;
          int tries=0;
          
          while(guess!=newrand)
          {
              System.out.println("Guess a number between 1 and 100");
              guess=Reader.nextInt();
              tries++;
              if(guess==newrand)
              {
                  System.out.println("Awesome!You guessed the number.");
                  System.out.println("It only took "+tries+" Guesses!");
                  System.out.println("Would you like to play the game again? yes or no ");
                  play=Reader.next().toLowerCase();
              }
              else if(guess<newrand)
              {
                  System.out.println("Your guess is too low,Try again.");
              }
              else
              {
                 System.out.println("Your guess is too high,Try again."); 
              }
         }
      }
      
      Reader.close();
    }
}