package person;

public class Person {
    private String myName;
    private int myAge;

    public Person(String name, int age) {
        myName = name;
        myAge = age;
    }

    public int getAge() {
        return myAge;
    }

    public String getName() {
        return myName;
    }

    public void setAge(int age) {
        myAge = age;
    }
}
