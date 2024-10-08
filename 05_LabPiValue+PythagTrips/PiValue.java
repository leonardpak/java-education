// Print a table showing the value of Pi approximated by computing
// one term of this series, by two terms, by three terms, etc.

public class PiValue // class declaration
{
   public static void main ( String x[] )
   {
      System.out.println( "Print table showing value of Pi by varying number of terms." );

      // initialization of variables
      double pi = 0; // starting point of pi
      int term = 1; // which term
      double divisor = 1; // number to divide by

      // calculate possibilities
      System.out.printf ( "%s%15s\n", " Term", "Calculated Pi" );

      while ( term <= 250)
      {
         if ( term % 2 == 1 )
            pi = ( pi + (4 / divisor) );
         else
            pi = ( pi - (4 / divisor) );
         System.out.printf("%5d%15.8f\n", term, pi);
         divisor = divisor + 2;
         term++;
      }

      System.out.println();
   } // end method main
} // end class PiValue