// Fig. 3.14: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects
//    modified by Leonard Pak

import java.util.Scanner;

public class AccountTest
{
   public static void main( String args[] ) // main method begins application execution
   {
      // create Account objects
      Account account1 = new Account( 50.00 ); //
      Account account2 = new Account( -7.53);

      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n",
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n",
         account2.getBalance() );

      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double depositAmount; // deposit amount read from user
      double debitAmount; // debit amount read from user

      // prompt for and obtain user input for account 1 credit
      System.out.print( "Enter deposit amount for account1: " );
      depositAmount = input.nextDouble();
      System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
         account1.credit( depositAmount );

      // display balances
      System.out.printf( "account1 balance: $%.2f\n",
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n",
         account2.getBalance() );

      // prompt for and obtain user input for account 2 credit
      System.out.print( "Enter deposit amount for account2: " );
      depositAmount = input.nextDouble();
      System.out.printf( "\nadding %.2f to account2 balance\n\n", depositAmount );
         account2.credit( depositAmount );

      // display balances
      System.out.printf( "account1 balance: $%.2f\n",
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n",
         account2.getBalance() );

      // prompt for and obtain user input for account 1 debit
      System.out.print( "Enter withdrawal amount for account1: " );
      debitAmount = input.nextDouble();
      System.out.printf( "\nsubtracting %.2f to account1 balance\n\n", depositAmount );
         account1.debit( debitAmount );

      // display balances
      System.out.printf( "account1 balance: $%.2f\n",
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n",
         account2.getBalance() );

      // prompt for and obtain user input for account 2 debit
      System.out.print( "Enter withdrawal amount for account2: " );
      debitAmount = input.nextDouble();
      System.out.printf( "\nsubtracting %.2f to account2 balance\n\n", depositAmount );
         account2.debit( debitAmount );

      // display balances
      System.out.printf( "account1 balance: $%.2f\n",
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n",
         account2.getBalance() );

   } // end main
} // end class AccountTest


/*
account1 balance: $50.00
account2 balance: $0.00
Enter deposit amount for account1: 1000

adding 1000.00 to account1 balance

account1 balance: $1050.00
account2 balance: $0.00
Enter deposit amount for account2: 500

adding 500.00 to account2 balance

account1 balance: $1050.00
account2 balance: $500.00
Enter withdrawal amount for account1: 600

subtracting 500.00 to account1 balance

account1 balance: $450.00
account2 balance: $500.00
Enter withdrawal amount for account2: 600

subtracting 500.00 to account2 balance

Debit amount exceeded account balance.
account1 balance: $450.00
account2 balance: $500.00
*/