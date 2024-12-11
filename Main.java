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
      

     }
   }

