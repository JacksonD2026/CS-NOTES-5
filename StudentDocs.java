
/**
 * 
 * 
 * @author Jackson Dobson
 * @since 6Jan2025
 * @version 1.0
 * This class defines a Student object, and includes formal documentation comments
 * 
 */

public class StudentDocs {

   private String firstName; 
   private String lastName;
   private int gradYear; 
   private String email;

/** 
 * Constructor that sets defualt values fpr each of the instance variables defined above
*/
 
   public StudentDocs() {
        
    firstName = "First";
    lastName = "Last";
    gradYear = 2037;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";

   }

   /**
    * Constructor that sets provided values
    * @param initFirstName
    * @param initLastName
    * @param initGradYear
    */
   public StudentDocs(String initFirstName, String initLastName, int initGradYear) {

    firstName = initFirstName;
    lastName = initLastName;
    gradYear = initGradYear;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";

   }


   public String toString() {
    return("Student[" + firstName + ", " + lastName + ", " + gradYear + ", " + email + "]");
   }



   public String getFirstName() {
     return firstName;
   }
   public String getLastName() {
    return lastName;
  }
  public int getGradYear() {
    return gradYear;
  }
  public String getEmail() {
    return email;
  }

  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }
  public void setGradYear(int newGradYear) {
    gradYear = newGradYear;
  }
  public void setEmail(String newEmail) {
    email = newEmail;
  }

  public void complain() {
    System.out.println("I'm tired.");
  }

  public void doHomework(int numAssignments) {
    for (int i = numAssignments; i>0; i--) {
      System.out.println("Working working working...");
    }
    System.out.println("All done!");
  }



}