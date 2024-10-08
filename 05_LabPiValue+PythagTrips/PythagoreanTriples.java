// Calculate all Pythagorean right triangles with sides under 500.
// When discovering all possibilities, print the lengths of the sides.
// Use a triple-nest for the loop that tries all possibilities.

public class PythagoreanTriples // class declaration
{
   public static void main ( String args[] )
   {
      System.out.println( "Calculating Pythagorean Triples under 25." );

      // initialization of variables
      int side1 = 1, side2 = 1, hypotenuse = 1;

      // calculate possibilities
      while ( side1 < 25 )
      {
         side2 = 1;
         while ( side2 < 25 )
         {
            hypotenuse = 1;
            while ( hypotenuse < 25 )
               {
                  if ( (side1 * side1   +   side2 * side2)   ==   hypotenuse * hypotenuse )
                  System.out.printf( "Sides %d, %d, %d, form a Pythagorean Triple.\n",
                                       side1, side2, hypotenuse);
                  hypotenuse++;
               }
            side2++;
         }
         side1++;
      }
   }
}

// optional: no duplicates, no scaled versions