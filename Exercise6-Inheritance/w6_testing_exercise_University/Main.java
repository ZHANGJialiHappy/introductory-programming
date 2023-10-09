public class Main {
   public static void main(String[] args) {
      Person p1 = new Student("Jiali", 18, "ITU");
      // Person p2 = new PhDStudent("jiali", 18, "ITU");

      // PhDStudent ph1 = new PhDStudent("jiali", 18, "ITU");
      // Person p3 = ph1;
      // ph1 = (PhDStudent) p3;

      // Teacher t1 = new Teacher("jiali", 18, "ITU");
      // Person p4 = t1;
      // t1 = (Teacher) p4;

      Student s1 = new PhDStudent("jiali", 18, "ITU");

      // s1 = (PhDStudent) p1;
      // s1 = (PhDStudent) p2;
      // p1 = s1;
      // // t1=s1;
      // s1 = ph1;
      // ph1 = (PhDStudent) s1;
      new Student("Jiali", 18, "ITU").introduceYourself();
   }
}
