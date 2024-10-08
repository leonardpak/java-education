// Demonstrates class Employee's capabilities.  Create two
// Employee objects and display each object's yearly salary.
// Then give each Employee a 10% raise and display each
// Employee's salary again.

public class EmployeeTest
{
   public static void main( String args[] ) // main method
   {
      // create Employee objects
      Employee employee1 = new Employee( "Ben", "Dover", 50000.00 );
      Employee employee2 = new Employee( "Hugh", "Jass", 35000.00 );

      // display employee's *YEARLY* salaries
      System.out.printf( "%s %s's annual salary: $%.2f\n",
         employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12 );
      System.out.printf( "%s %s's annual salary: $%.2f\n",
         employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12 );

      // increase employee salaries by 10%
      employee1.setMonthlySalary( employee1.getMonthlySalary() * 1.1 );
      employee2.setMonthlySalary( employee2.getMonthlySalary() * 1.1 );

      // display smartass message and updated salaries
      System.out.println( "What kind of people get salary raises in this economy?" );
      System.out.println( "Oh... you must be the executives using our tax dollars to \"bail\" you out." );
      System.out.printf( "%s %s, you lucky bastard, your new annual salary is $%.2f!\n",
         employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12 );
      System.out.printf( "%s %s, you lucky bastard, your new annual salary is $%.2f!\n",
         employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12 );
   } // end main
} // end class EmployeeTest

/*

Ben Dover's annual salary: $600000.00
Hugh Jass's annual salary: $420000.00
What kind of people get salary raises in this economy?
Oh... you must be the executives using our tax dollars to "bail" you out.
Ben Dover, you lucky bastard, your new annual salary is $660000.00!
Hugh Jass, you lucky bastard, your new annual salary is $462000.00!
*/