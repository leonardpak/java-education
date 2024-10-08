// A company asks you to write a program that will encrypt data sent across a telephone line.
// All the data must be transmitted as four-digit integers.  The application should read a
// four-digit integer entered by the user and encrypt it as follows:
//     Replace each digit with the result of adding 7 to the digit and getting the remainder
//     after dividing the new value by 10. Then swap the first digit with the third, and
//     swap the second digit with the fourth. Then print the encrypted integer.
// Also, write a separate application that inputs an encrypted four-digit integer and
// decrypts it to form the original number.
//                     by Leonard Pak
import java.util.Scanner; // program gets user input

public class DataEncrypter // class declaration
{
   public static void main( String x[] ) // program execution
   {
      Scanner input = new Scanner( System.in ); // scanner for user input

      int number; // integer for user input
      int thousands, hundreds, tens, ones; // integers for amount of each digit

      System.out.print( "Enter a 4-digit number to be encrypted: " ); // prompt
      number = input.nextInt(); // user input

      // checks to see if proper digits, if it isn't, reprompts
      while ( number < 1000 )
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
            while ( number < 1000 )
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
      thousands = ( thousands + 7 ) % 10;
      hundreds = ( hundreds + 7 ) % 10;
      tens = ( tens + 7 ) % 10;
      ones = ( ones + 7 ) % 10;

      // print encrypted number (while swapping digits)
      System.out.printf( "The newly encrypted number is: %d%d%d%d\n", tens, ones, thousands, hundreds );
   }
}