// Employee class that includes three pieces of information as
// instance variables: first name, last name, and monthly salary.
// Class should have a constructor that initializes the three
// instance variables.  Provide a set and get method for each instance
// variable.  If monthly salary is not positive, set it to 0.0.
//    created by Leonard Pak

public class Employee
{
   // declaring instance variables for name and salary
   private String firstName;
   private String lastName;
   private double monthlySalary;

   // creating constructor to initialize instance variables
   public Employee( String first, String last, double salary )
   {
      firstName = first;
      lastName = last;

      if ( salary > 0 )
         monthlySalary = salary;
   } // end Employee constructor

   // create set and get for first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // create set and get for last name
   public void setLastName( String last )
   {
      lastName = last;
   }  // end method setLastName

   public String getLastName()
   {
      return lastName;
   }  // end method getLastName

   // create set and get for monthly salary
   public void setMonthlySalary( double salary )
   {
      if ( salary > 0 )
         monthlySalary = salary;
   }  // end method setMonthlySalary

   public double getMonthlySalary()
   {
      return monthlySalary;
   }  // end method getMonthlySalary
} // end class Employee