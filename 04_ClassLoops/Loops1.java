public class Loops1
{
	public static void main( String x[] )
	{
		// write a loop that prints 1 -2 3 -4 5 -6 7 -8 9 -10
		int I = 1;
		while ( I <= 10 )
		{
			if (I % 2 == 1)
			   System.out.print( I + " ");
			else
			   System.out.print(-I + " ");
			I = I + 1;
		} // end loop 1
		System.out.println(); // blank line


		// write a loop that prints -1 2 -3 4 -5 6 -7 8 -9 10
        int J = 1;
		while ( J <= 10 )
		{
			if ( J % 2 == 1 )
			   System.out.print( -J + " ");
			else
			   System.out.print( J + " ");
			J = J + 1;
		} // end loop 2
		System.out.println(); // blank line


		knockOut(); // invoke knockOut from main
		launch(); // invoke launch from main
	}


	// create a method "knockOut" which prints:
	//"1 2 3 4 5 6 7 8 9 10 KnockOut" using a loop
	public static void knockOut()
	{
		int K = 1;
		while ( K <= 10 )
		{
			System.out.print( K + " " );
			K = K + 1;
		}
		System.out.println( "KO!" );
	} // end method knockOut


	// create a method "launch" which prints:
	//"10 9 8 7 6 5 4 3 2 1 Launch" using a loop
	public static void launch()
	{
		int L = 10;

		while ( L >= 1 )
		{
			System.out.print( L + " " );
			L = L - 1;
		}
		System.out.println( "Launch!" );
	} // end method launch
}