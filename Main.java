public class Main {

   public static void main(String []args) {
      System.out.println("Constructing Student Objects...");

      //call DEFAULT CONSTRUCTOR

      Student kinder = new Student();

      //call CONSTRUCTOR with PARAMETERS (String, string, int)

      Student junior = new Student("Paige" , "Nunez" , 2026);

      //Look at our constructed Student objects
      System.out.println(kinder); // Will print the location of the object

      // Construct two more Studetn objects & print them out

      Student senior = new Student("Senior", "Senior" , 2025);
      System.out.println(senior); 

      Student sophomore = new Student("Sophomore", "Sophomore" , 2027);
      System.out.println(sophomore);

      // test ACCESSOR/GETTER methods
     String juniorEmail = junior.getEmail();
     System.out.println(juniorEmail);
     //or 
     System.out.println(junior.getEmail());

     // Test Mutator/Setter methods 
     // void methods 
     // but they need an argument (input)
      kinder.setFirstName("James");
      kinder.setLastName("Walter");
      kinder.setEmail("James.Walter2037@gbwl.org");
      System.out.println(kinder);
      // we didn't have to set a new gradYear because we already have an appropriate value

      // use the objects class equals() method
      boolean isEqual = junior.equals(kinder);
      System.out.println(isEqual);

     junior.complain();

     junior.doHomework(8);


     //Testing the Student class documentation
     StudentDocs test = new StudentDocs();
     }
   }

