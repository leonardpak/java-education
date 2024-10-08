import java.util.Scanner; // program gets user input

public class DataDecrypter // class declaration
{
   public static void main( String x[] ) // program execution
   {
      Scanner input = new Scanner( System.in ); // scanner for user input

      int number; // integer for user input
      int thousands, hundreds, tens, ones; // integers for amount of each digit

      System.out.print( "Enter a 4-digit number to be decrypted: " ); // prompt
      number = input.nextInt(); // user input

      // checks to see if proper digits, if it isn't, reprompts
      while ( number < 0 )
         {
            System.out.print( "Entered number not a 4-digit number, please retry: " );
            number = input.nextInt();
            while ( number > 9999 )
			   {
			      System.out.print( "Entered number not a 4-digit number, please retry: " );
			      number = input.nextInt();
		       }
         }
      while ( number > 9999 )
         {
            System.out.print( "Entered number not a 4-digit number, please retry: " );
            number = input.nextInt();
            while ( number < 0 )
			   {
			      System.out.print( "Entered number not a 4-digit number, please retry: " );
			      number = input.nextInt();
		       }
         }

      // calculate digits
      thousands = number / 1000;
      number = number % 1000;

      hundreds = number / 100;
      number = number % 100;

      tens = number / 10;
      number = number % 10;

      ones = number;

      // convert to new digits
      thousands = ( thousands + 3 ) % 10;
      hundreds = ( hundreds + 3 ) % 10;
      tens = ( tens + 3 ) % 10;
      ones = ( ones + 3 ) % 10;

      // print decrypted number (while swapping digits)
      System.out.printf( "The newly decrypted number is: %d%d%d%d\n", tens, ones, thousands, hundreds );
   }
}