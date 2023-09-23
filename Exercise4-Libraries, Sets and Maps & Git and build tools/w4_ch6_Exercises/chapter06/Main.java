public class Main {
   public static void main(String[] args) {

      // write you code here
      // SupportSystem jiali = new SupportSystem();
      // jiali.start();

      // RandomTester jiali2 = new RandomTester();
      // System.out.println(jiali2.throwDie(2, 6));
      MapTester classroom1 = new MapTester();
      classroom1.enterNumber("jiali", "28");
      classroom1.enterNumber("jiali2", "27");
      classroom1.enterNumber(null, "27");

      classroom1.getStudent();
      classroom1.printStudentsName();
      System.out.println(classroom1.hasStudent(null));

      System.out.println(classroom1.lookupNumber("jiali2"));

   }
}
