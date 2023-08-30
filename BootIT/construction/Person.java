package construction;

public class Person {
    String name;
    int age;
    String occupation;

    Person(String n, int a, String o) {
        name = n;
        age = a;
        occupation = o;
    }

    void display() {
        System.out.println(name + "(" + age + " years old)" + "(" + occupation + ")");
    }

    void showOccupation() {
        System.out.println(occupation);
    }

    int ageNextYear() {
        age += 1;
        // System.out.println("You're " + age + " years old in the next year.");
        return age;
    }

    void star() {
        System.out.println("............");
    }

}
