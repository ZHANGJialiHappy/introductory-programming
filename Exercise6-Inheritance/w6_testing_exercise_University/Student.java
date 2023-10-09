public class Student extends Person {

   // Fields
   protected String studyProgramme;

   // Constructor
   public Student(String name, int age, String university) {
      super(name, age, university);
   }

   public void introduceYourself() {
      System.out.println(
            "Hi! My name is " + name + ", I am " + age + " years old and I am currently following the "
                  + studyProgramme + " programme at " + university + "! Yay!");
   }

}