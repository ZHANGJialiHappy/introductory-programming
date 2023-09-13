package person;

public class Main {
    public static void main(String[] args) {
        Person jiali = new Person("jiali", 18);
        System.out.println(jiali.getName());
        System.out.println(jiali.getAge());
        jiali.setAge(21);
        System.out.println(jiali.getAge());
    }
}
