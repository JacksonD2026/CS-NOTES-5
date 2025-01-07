
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

   /**
    * @return String representing the object's instance variables
    */
   public String toString() {
    return("Student[" + firstName + ", " + lastName + ", " + gradYear + ", " + email + "]");
   }


  /**
    * @return String representing the object's first name
    */
   public String getFirstName() {
     return firstName;
   }
     /**
    * @return String representing the object's last name
    */
   public String getLastName() {
    return lastName;
  }
    /**
    * @return int representing the object's graduting year
    */
  public int getGradYear() {
    return gradYear;
  }
    /**
    * @return String representing the object's email
    */
  public String getEmail() {
    return email;
  }

  /**
    * @param String to change a value 
    */
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }
   /**
    * @param String to change a value 
    */
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }
   /**
    * @param int to change a value 
    */
  public void setGradYear(int newGradYear) {
    gradYear = newGradYear;
  }
   /**
    * @param String to change a value 
    */
  public void setEmail(String newEmail) {
    email = newEmail;
  }
  
  /**
   * When called upon a student object it prints a complain message
   */
  public void complain() {
    System.out.println("I'm tired.");
  }

   /**
    * Loops until numAssigments reaches 0 
    * @param numAssignments - an int repersnting the amount of homework assingment to be completed by the Student
    */

  public void doHomework(int numAssignments) {
    for (int i = numAssignments; i>0; i--) {
      System.out.println("Working working working...");
    }
    System.out.println("All done!");
  }



}