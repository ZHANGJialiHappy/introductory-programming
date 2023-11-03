public class Main {
    public static void main(String[] args) {
        Company a = new Company();
        a.addEmployee(new Employee("jiali", 20, 1), 0);
        a.addEmployee(new Employee("jiali2", 10, 1), 0);
        System.out.println(a.findLeastBusy(1));
        a.findLeastBusy(1);
        a.assignTask("hi", 1);
        a.raiseSalary(20);

    }
}
