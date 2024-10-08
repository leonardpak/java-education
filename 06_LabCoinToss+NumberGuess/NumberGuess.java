// by Leonard Pak

import java.util.*;

public class NumberGuess
{
	Scanner input = new Scanner(System.in);
	private Random randomNumber = new Random(); // field for random number generator
	private int num, guess; // fields for generated number and inputted guess number

	public static void main(String x[])
	{
		NumberGuess numberguess = new NumberGuess();
		numberguess.userInput();
	} // end method main



	public void userInput() // prompts user input
	{
		generateNumber(); // generates number to be guessed

		System.out.print("Guess a number between 1 and 1000: ");
		while( input.hasNext() )
			{
				guess = input.nextInt();
				guessCheck(guess);
			}
	} // end method userInput



	public int generateNumber() // generates number to be guessed
	{
		num = 1 + randomNumber.nextInt(1000);
		return num;
	} // end method generateNumber



	public void guessCheck(int guess) // processes inputted guess
	{
		if ( (guess < 1) || (guess > 1000) )
			System.out.print("Invalid entry! Guess a number between 1 and 1000: ");
		else
			{
				if ( guess > num )
					System.out.print("Wrong! You were too high! Guess again: ");
				if ( guess < num )
					System.out.print("Wrong! You were too low! Guess again: ");
				if ( guess == num )
					{
						System.out.printf("%s\n%s\n%s\n%s\n",
									"Congratulations! You guessed correctly!",
									"Would you like to play again?",
									"1. Yes",
									"2. No");
						while ( input.hasNext() )
							{
								int choice = input.nextInt();
								playAgain(choice);
							}
					}
			}
	} // end method guessCheck



	public void playAgain(int choice) // processes player's choice
	{
		switch (choice)
		{
			case 1:
				userInput();
				break;
			case 2:
				System.out.println("Program exited.");
				System.exit(0);
				break;
			default:
				System.out.printf("Invalid entry! Please enter '1' to play again, or '2' to exit: ");
		} // end switch
	} // end method playAgain
} // end class NumberGuess