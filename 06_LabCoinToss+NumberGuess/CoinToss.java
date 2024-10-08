// by Leonard Pak

import java.util.*;

public class CoinToss
{
	private Random randomBoolean = new Random(); // field for random boolean generator
	private int heads, tails, menu; // fields for sides and menu



	public static void main(String x[])
	{
		CoinToss cointoss = new CoinToss();
		cointoss.userInput();
	} // end method main



	public void userInput() // prompts user input
	{
		Scanner input = new Scanner(System.in);

		System.out.printf("Choose from the following options:\n1. Toss Coin\n2. Exit\n");
		while( input.hasNext() )
			{
				menu = input.nextInt();
				menuSelection(menu);
			}
	} // end method userInput



	public void menuSelection(int menu) // processes menu selection
	{
		switch (menu)
		{
			case 1:
				flip();
				System.out.printf(" Total Heads: %s\n Total Tails: %s\nChoose from the following options:\n1. Toss Coin\n2. Exit\n", heads, tails);
				break;
			case 2:
				System.out.println("Program exited.");
				System.exit(0);
				break;
			default:
				System.out.printf("Invalid entry!\nChoose from the following options:\n1. Toss Coin\n2. Exit\n");
		} // end switch
	} // end method menuSelection



	public boolean flip() // simulates coin flip
	{
		boolean coinflip = randomBoolean.nextBoolean();

			if ( coinflip == true )
				{
					System.out.println("Coin landed on heads.");
					heads++;
				}
			else
				{
					System.out.println("Coin landed on tails.");
					tails++;
				}

		return coinflip;
	} // end method flip
} // end class CoinToss