public class Loops2
{
	public static int factorial (int N)
	{
		int I = 1;
		int P = 1;

		while (I <= N)
		{
			P = P * I;
			I = I + 1;
		}
		return P;
	}

	public static int sum (int N)
	{
		int I = 1;
		int S = 0;

		while (I <= N)
		{
			S = S + I;
			I = I + 1;
		}
		return S;
	}

	public static void main( String x[] )
	{
		int num;

		java.util.Scanner input = new java.util.Scanner( System.in );
		System.out.print( "enter a number: " );
		num = input.nextInt();

		System.out.println( "factorial " + num + " is " + factorial(num) );
		System.out.println( "sum " + num + " is " + sum(num) );

		skip7(); // invoke skip7
	}

	public static void skip7()
	{
		int I = 1;
		while ( I <= 99 )
		{
			if ( ( I % 10 == 7 ) || ( I / 10 == 7 ) )
				System.out.print( "" );
			else
				System.out.print( I + " " );
			I = I + 1;
		}
		System.out.println( "" );
	}
}