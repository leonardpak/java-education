// Chapter 02 Lab Assignment
// A program that lets user input five numbers and determines (and 
// prints) the amount of negative, positive, or zero numbers input.
//      by Leonard Pak

import java.util.Scanner; // program uses scanner

public class PNZ // class declaration standing for Positive Negative Zero
{
   public static void main( String args[] ) // main method declaration
   {
      Scanner input = new Scanner( System.in ); // create 'input' as Scanner to obtain input

      int number1, number2, number3, number4, number5; // five numbers for input
      int positive = 0, negative = 0, zero = 0; // amount of type of numbers (starting at zero)

      System.out.println( "This program will ask you for FIVE numbers and determine how many positive numbers, negative numbers, and zeros have been entered.\n" ); // display explanation to user

      // The following prompts a user for a number and then records the input.

      System.out.print( "Please enter the first number: " );
      number1 = input.nextInt();

      System.out.print( "Please enter the second number: ");
      number2 = input.nextInt();

      System.out.print( "Please enter the third number: ");
      number3 = input.nextInt();

      System.out.print( "Please enter the fourth number: ");
      number4 = input.nextInt();

      System.out.print( "Please enter the fifth number: ");
      number5 = input.nextInt();

      // The following assigns user inputted numbers as a positive, a negative, or a zero.

      if ( number1 > 0 )
         positive = positive + 1;
      if ( number1 < 0 )
         negative = negative + 1;
      if ( number1 == 0 )
         zero = zero + 1;

      if ( number2 > 0 )
         positive = positive + 1;
      if ( number2 < 0 )
         negative = negative + 1;
      if ( number2 == 0 )
         zero = zero + 1;

      if ( number3 > 0 )
         positive = positive + 1;
      if ( number3 < 0 )
         negative = negative + 1;
      if ( number3 == 0 )
         zero = zero + 1;

      if ( number4 > 0 )
         positive = positive + 1;
      if ( number4 < 0 )
         negative = negative + 1;
      if ( number4 == 0 )
         zero = zero + 1;

      if ( number5 > 0 )
         positive = positive + 1;
      if ( number5 < 0 )
         negative = negative + 1;
      if ( number5 == 0 )
         zero = zero + 1;

      // The following prints the amount of positives, negatives, and zeros with grammatical accuracy.

      if ( positive == 0 )
         System.out.println( "\nThere are no positive numbers." );
      if ( positive == 1 )
         System.out.printf( "\nThere is %d positive number.\n", positive );
      if ( positive >= 2 )
         System.out.printf( "\nThere are %d positive numbers.\n", positive );

      if ( negative == 0 )
         System.out.println( "There are no negative numbers." );
      if ( negative == 1 )
         System.out.printf( "There is %d negative number.\n", negative );
      if ( negative >= 2 )
         System.out.printf( "There are %d negative numbers.\n", negative );

      if ( zero == 0 )
         System.out.println( "There are no zeroes." );
      if ( zero == 1 )
         System.out.printf( "There is %d zero.\n", zero );
      if ( zero >= 2 )
         System.out.printf( "There are %d zeroes.\n", zero );

   } // end method main
} // end class Ch02PNZ





/*
RUN #1:
This program will ask you for FIVE numbers and determine how many positive numbe
rs, negative numbers, and zeros have been entered.

Please enter the first number: 0
Please enter the second number: 5
Please enter the third number: 2
Please enter the fourth number: -1
Please enter the fifth number: -4

There are 2 positive numbers.
There are 2 negative numbers.
There is 1 zero.

RUN #2:
This program will ask you for FIVE numbers and determine how many positive numbe
rs, negative numbers, and zeros have been entered.

Please enter the first number: 9
Please enter the second number: 0
Please enter the third number: 0
Please enter the fourth number: 0
Please enter the fifth number: 0

There is 1 positive number.
There are no negative numbers.
There are 4 zeroes.

RUN #3:
This program will ask you for FIVE numbers and determine how many positive numbe
rs, negative numbers, and zeros have been entered.

Please enter the first number: 8
Please enter the second number: 0
Please enter the third number: 31337
Please enter the fourth number: -58
Please enter the fifth number: 39593028

There are 3 positive numbers.
There is 1 negative number.
There is 1 zero.
*/