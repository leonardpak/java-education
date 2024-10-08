// Fig. 3.13: Account.java
// Account class with a constructor to
// initialize instance variable balance.
//    modified by Leonard Pak

public class Account
{
   private double balance; // instance variable that stores the balance

   public Account( double initialBalance) // constructor
   {
      if ( initialBalance > 0.0) // validate that initialBalance is greater than 0;
         balance = initialBalance; // if not, balance initialized to default 0
   } // end Account constructor
   
   public void credit( double amount ) // credit an amount to the account
   {
      balance = balance + amount; // add amount to balance
   } // end method credit

   public void debit( double amount ) // debit an amount to the account
   {
      if ( amount > balance )
         System.out.println( "Debit amount exceeded account balance." );
      if ( amount <= balance )
         balance = balance - amount; // subtract amount to balance
   }

   public double getBalance() // return the account balanace
   {
      return balance; // gives the value of balance to the calling method
   } // end method getBalance

} // end class Account