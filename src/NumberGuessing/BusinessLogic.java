
package NumberGuessing;

        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.Random;
        import java.util.Scanner;

public class BusinessLogic implements GuessTheNumber
{
    Random rand = new Random();
    int numTogGuess = rand.nextInt(5);
    int numOfTries = 0;
    Scanner input = new Scanner(System.in);
    int user_guess;
    public void GameLogic()
    {
        boolean win = false;

        while (win == false)
        {
            System.out.println("Guess the number between 1-5:");

            user_guess = input.nextInt();
            numOfTries++;

            if (user_guess == numTogGuess)
            {
                win = true;
            }
            else if (user_guess < numTogGuess)
            {
                System.out.println("your guess is LOW go with large number");
            }
            else if (user_guess > numTogGuess)
            {
                System.out.println("your guess is HIGH go with smaller number");
            }
        }
        System.out.println("you win");
        System.out.println("the number you want to guess :" +" "+ numTogGuess);
        System.out.println("you take" +" "+ numOfTries + " tries to guess");
    }
    public void StoringResult() {
        try {
            FileWriter GameResult = new FileWriter("C:\\Users\\HP\\Desktop\\ATMECS\\GameResult.txt");
            if (user_guess == numTogGuess) {
                GameResult.write("you win");
                GameResult.write("Number to guess:"+" "+numTogGuess );
                GameResult.write("you take" + " " + numOfTries + " " + " tries to guess the number");

            }
            GameResult.close();
        } catch (IOException e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}
