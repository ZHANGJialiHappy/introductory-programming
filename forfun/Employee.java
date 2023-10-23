public class Employee {
    private String name;

    public Employee() {
        this.name = "none";
    }

    public Employee(String name) {
        this.name = name;
    }

    public String myMethod() {
        return "Happy new year " + name;
    }
}
