// Determine whether a 5-digit inputted number is a palindrome or not
//    by Leonard Pak
import java.util.Scanner; // program gets user input

public class Palindrome // class declaration
{
   public static void main( String args[]) // program execution
   {
      Scanner input = new Scanner( System.in ); // scanner for user input

      int number; // integer for user input
      int tenthousands, thousands, hundreds, tens, ones; // integers for amount of each digit

      System.out.print( "Enter a 5-digit number to determine whether it is a palindrome or not: " ); // prompt
      number = input.nextInt(); // user input

      // checks to see if proper digits, if it isn't, reprompts
      while ( number < 10000 )
         {
            System.out.print( "Entered number not a 5-digit number, please retry: " );
            number = input.nextInt();
            while ( number > 99999 )
			   {
			      System.out.print( "Entered number not a 5-digit number, please retry: " );
			      number = input.nextInt();
		       }
         }
      while ( number > 99999 )
         {
            System.out.print( "Entered number not a 5-digit number, please retry: " );
            number = input.nextInt();
            while ( number < 10000 )
			   {
			      System.out.print( "Entered number not a 5-digit number, please retry: " );
			      number = input.nextInt();
		       }
         }

      // calculate digits
      tenthousands = number / 10000;
      number = number % 10000;

      thousands = number / 1000;
      number = number % 1000;

      hundreds = number / 100;
      number = number % 100;

      tens = number / 10;
      number = number % 10;

      ones = number;

      // determine whether number is palindrome or not

      if ( tenthousands != ones )
         System.out.println( "Entered number is NOT a palindrome.");
      else if ( thousands != tens )
         System.out.println( "Entered number is NOT a palindrome.");
      else
         System.out.println( "Entered number IS a palindrome.");
   } // end method main
} // end class Palindrome