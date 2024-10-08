// Chapter 02 Class Assignment
// A change making program for a vending machine that has no dimes.
//    by Leonard Pak

import java.util.Scanner; // program uses scanner

public class Vend // class declaration
{
   public static void main( String args[] ) // method
   {
      Scanner input = new Scanner( System.in ); // create Scanner to obtain input from command window

      int cost, amount, change; // create integers for cost, amount, and change
      int Q, D=0, N, P; // create integers for quarters, dimes, nickels, and pennies
      int numOfDimes; // create integers for number of dimes

      numOfDimes = 0; // define the amount of dimes

      System.out.print( "Enter the cost of the item (in cents): " ); // prompt for input
      cost = input.nextInt(); // read the cost of the item (from user)

      System.out.print( "Enter the amount give (in cents): " ); // prompt for input (from user)
      amount = input.nextInt(); // read amount given

      change = amount - cost; // calculate change
      System.out.println( "Total amount of change (in cents): " + change); // show total change

      Q = change / 25; // calculate quarters
      change = change % 25; // calculate remaining change

      if ( numOfDimes > 0 ) // do check if machine has dimes
         {
         D = change / 10; // calculate dimes
         change = change % 10; // calculate remaining change
         }

      N = change / 5; // calculate nickels
      change = change % 5; // calculate remaining change

      P = change; // leftovers are pennies

      System.out.println( "The amount of quarters is: " + Q ); // display amount of quarters

      if ( numOfDimes > 0 ) // do check if machine has dimes
         System.out.println( "The amount of dimes is: " + D ); // display amount of dimes
      if ( numOfDimes == 0 ) // do check if machine has NO dimes
         System.out.println( "Sorry, there are no more dimes. :(" ); // message to user about no dimes

      System.out.println( "The amount of nickels is " + N ); // display amount of nickels

      System.out.println( "The amount of pennies is " + P ); // display amount of pennies
      if ( P > 0 )
         System.out.println( "What kind of vending machines gives pennies?!" ); // smartass comment
   } // end method main
} // end class Ch02ClassVend


/*
RUN #1:
Enter the cost of the item (in cents): 90
Enter the amount give (in cents): 100
Total amount of change (in cents): 10
The amount of quarters is: 0
Sorry, there are no more dimes. :(
The amount of nickels is 2
The amount of pennies is 0
Press any key to continue . . .

RUN #2:
Enter the cost of the item (in cents): 51
Enter the amount give (in cents): 75
Total amount of change (in cents): 24
The amount of quarters is: 0
Sorry, there are no more dimes. :(
The amount of nickels is 4
The amount of pennies is 4
What kind of vending machines gives pennies?!
Press any key to continue . . .

RUN #3:
Enter the cost of the item (in cents): 125
Enter the amount give (in cents): 200
Total amount of change (in cents): 75
The amount of quarters is: 3
Sorry, there are no more dimes. :(
The amount of nickels is 0
The amount of pennies is 0
Press any key to continue . . .
*/