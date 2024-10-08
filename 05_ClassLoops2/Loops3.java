//      March 14th, 2009
//      Class Assignment
//       by Leonard Pak

import java.util.Scanner; // import scanner

public class Loops3 // class Loops3 declaration
{
   public static void main( String x[] ) // method main declaration
   {
      Scanner input = new Scanner(System.in); // create scanner named 'input'
      int N; // integer for number

      // prompt user for number
      System.out.print( "Enter a POSITIVE number which will be used for every algorithm: " );
      N = input.nextInt();

      while ( N <= 0 )
      {
         System.out.print( "Enter a POSITIVE number! POSITIVE!: " );
         N = input.nextInt();
      }

      // invokation of various methods
      reverseNumber(N);
      skip7();
      primeNumber(N);

      if ( primeNumber2(N) )
         System.out.println( N + " IS a prime number." );
      else
         System.out.println( N + " is NOT a prime number." );

      pairedPrimes();
      perfectNumber(N);

      if ( perfectNumber2(N) )
	     System.out.println( N + " IS a perfect number." );
	  else
         System.out.println( N + " is NOT a perfect number." );

      firstPerfectNumbers();
      printTree(N);
   }





   // Allow user to enter a positive number (ignore non-positive numbers).
   // Print the number and its digits REVERSED, separated by ':'.
   // For e.g. if the number entered is 1234 then the output should be: 4:3:2:1.
   // The number could be any size (from 1 digit to 8 digits)
   public static void reverseNumber(int num) // method reverseNumber declaration
   {
      System.out.println( "(a): Reversing an inputted number and separating digits with ':'.");

      // make calculations and print numbers
      int digit; // integer for individual digits

      while ( num > 0 )
      {
	     digit = num % 10;
	     System.out.print( digit + ":" );
	     num = num / 10;
      }

      System.out.print( "\n\n" );
   } // end method reverseNumber





   // Develop a method 'Skip 7', which will print numbers from 1 to 99,
   // skipping any number that has a 7 in it. Must use appropriate loops.
   public static void skip7() // method skip7 declaration
   {
      System.out.println( "(b): Writing numbers without 7s from 1 to 99.");

      int num = 1;

      // calculate which numbers don't have 7s
      while ( num <= 99 )
      {
         if ( ( num % 10 == 7 ) || ( num / 10 == 7 ) )
            System.out.print( "" );
         else
            System.out.print( num + " " );
         num = num + 1;
      }

      System.out.print( "\n\n" );
   } // end method skip7





   // Create a method 'Prime', which accepts an integer N, it should print should
   // print out whether the number is Prime or not.
   public static void primeNumber(int num) // method primeNumber declaration
   {
      System.out.println( "(c1): Accept inputted number and determine if prime number or not." );

      int factor = 2; // start checking factors at 2

      // calculate whether number is a prime number by checking every number/factor of number
      while( factor < num )
      {
         if ( num % factor == 0 )
         {
            System.out.println( "The entered number is NOT a prime number." );
            return;
         }
         factor = factor + 1; // or 'factor++'
	  }
      System.out.print( "The entered number IS a prime number." );

      System.out.print( "\n\n" );
   } // end method primeNumber





   // Create prime2 using boolean.
   public static boolean primeNumber2(int num) // method primeNumber2 declaration
   {

      int factor = 2; // start checking factors at 2

      while( factor < num )
      {
         if ( num % factor == 0 )
         {
            return false;
         }
         factor = factor + 1; // or 'factor++'
      }
      return true;
   } // end method primeNumber2





   // Determine any 'paired primes' below 100 using primeNumber and primeNumber2.
   public static void pairedPrimes() // method pairedPrimes declaration
   {
      System.out.println( "(c2): Find paired primes below 100." );

      int num = 1;

      while( num < 100 )
      {
         if ( primeNumber2(num) && primeNumber2(num+2) )
           System.out.println( "Paired primes: " + num + " " + (num+2) );
         num = num + 1; // or 'num++;'
      }
   }





   // Create a method 'PerfectNumber', which accepts an integer N, it should print
   // out whether the number is PerfectNumber or not.
   public static void perfectNumber(int num) // method perfectNumber declaration
   {
      System.out.println( "(d1): Accept inputted number and determine if perfect number or not." );

      int factor = 1; // start checking factors at 1
      int perfect = 0;

      // calculate whether number is a perfect number
      while( factor < num )
      {
         if ( num % factor == 0 )
         {
            perfect = perfect + factor;
         }
         factor = factor + 1; // or 'factor++'
	  }

	  if ( perfect == num )
	     System.out.print( "The entered number IS a perfect number." );
	  else
	     System.out.print( "The entered number is NOT a perfect number." );

      System.out.print( "\n\n" );
   } // end method perfectNumber





   // Create perfectnumber2 using boolean.
   public static boolean perfectNumber2(int num) // method perfectNumber2 declaration
   {

      int factor = 1; // start checking factors at 1
      int perfect = 0;

      // calculate whether number is a perfect number
      while( factor < num )
      {
         if ( num % factor == 0 )
         {
            perfect = perfect + factor;
         }
         factor = factor + 1; // or 'factor++'
	  }

	  if ( perfect == num )
	     return true;
	  else
	     return false;

   } // end method perfectNumber2





   // Determine the perfect numbers below 10,000.
   public static void firstPerfectNumbers() // method firstPerfectNumbers declaration
   {
      System.out.println( "(d2): Find the perfect numbers below 10,000." );

      int num = 1;

      while( num < 10000 )
      {
         if ( perfectNumber2(num) )
            System.out.println( "Perfect # is: " + num );
         num = num + 1; // or 'num++;'
      }
   }





   // Create a method 'PrintTree', which accepts an integer N, and it should print
   // out a triangle of stars, of height N.
   public static void printTree(int num) // method primeNumber declaration
   {
      System.out.println( "(e): Accept inputted number and print a triangle of stars the height of the inputted number." );

      int row = 1;
      int block = 0;

      while( row <= num )
         {
            while( block < row )
            {
               System.out.print( "x " );
               block = block + 1; // or 'block++;'
            }
            row = row + 1; // or 'row++;'
            block = 0;
            System.out.println( "" );
		 }
   } // end method printTree





} // end class Loops3