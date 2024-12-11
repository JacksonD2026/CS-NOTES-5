/* EXAMPLE CLASS
Class names like Student are always capitalized
Object=oriented classes are like blueprints
(in another Java class, you create instances from this blueprint)
Attribute = instance variable
*/
public class Student {
    //1. INSTANCE VARIABLES (attributes/data/fields)
    //think of what this object NEEDS to know
    // must be PRIVATE ("encapsulation")
   private String firstName; //"a Student has a name"
   private String lastName;
   private int gradYear; //"the year a Student graduates"
   private String email;
 
    //2. CONSTRUCTOR 

    // DEFAULT CONSTRUCTOR: it's job is to initialize instance variables to default values
   public Student() {
        
    firstName = "First";
    lastName = "Last";
    gradYear = 2037;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";

   }

   // Constrctor with PARAMETERS
   //Job: initialize instanec variables to provided values
   // ORDER OF PARAMETERS IS IMPORTANT
   public Student(String initFirstName, String initLastName, int initGradYear) {

    firstName = initFirstName;
    lastName = initLastName;
    gradYear = initGradYear;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";

   }

   


    //3. METHODS (behaviors associated with that object)

   // toString method provides a "String Representation" of an object instant with all of its data

   public String toString() {
        return("Student[" + firstName + ", " + lastName + ", " + gradYear + ", " + email + "]" );
   }


}