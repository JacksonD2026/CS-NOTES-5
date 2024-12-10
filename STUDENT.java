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
   private String fname; //"a Student has a name"
   private String lname;
   private int gradYear; //"the year a Student graduates"
   private String email;
 
    //2. CONSTRUCTOR 

    // DEFAULT CONSTRUCTOR: it's job is to initialize instance variables to default values
   public Student() {
        
    fname = "First";
    lname = "Last";
    gradYear = 2037;
    email = fname + "." + lname + gradYear + "gbwl.org";

   }

   // Constrctor with PARAMETERS
   //Job: initialize instanec variables to provided values
   public Student(String initFName, String initLName, int initGradYear);

    fname = initFName;
    lname = initLName;
    gradYear = initGradYear;
    email = fname + "." + lname + gradYear + "gbwl.org";


    //3. METHODS (behaviors associated with that object)

}