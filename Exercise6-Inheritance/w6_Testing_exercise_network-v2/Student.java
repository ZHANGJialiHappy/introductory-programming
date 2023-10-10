public class Student {
    private String name;
    private int age;

    public Student(String a, int b) {
        name = a;
        age = b;
    }

    public String toString() {
        return name + ": " + age;
    }

}
