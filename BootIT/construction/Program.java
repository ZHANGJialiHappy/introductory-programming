package construction;

public class Program {
    public static void main(String[] args) {
        Person Teacher = new Person("Nieck", 25, "haha");
        Person Teacher2 = new Person("jiali", 14, "ho");
        Teacher.star();
        Teacher.display();
        int a = Teacher.ageNextYear();
        System.out.println("in the next year, you are" + a);

        Teacher2.star();
        Teacher2.display();
        Teacher2.ageNextYear();
        System.out.println(Teacher2.ageNextYear());

    }
}
