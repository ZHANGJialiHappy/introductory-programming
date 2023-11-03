import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Company {
    private Set<Employee> allEmployees;

    public Company() {
        allEmployees = new HashSet<>();
    }

    public void addEmployee(Employee emp, int salary) {
        emp.setSalary(salary);
        allEmployees.add(emp);
    }

    public Employee findLeastBusy(int depId) {
        ArrayList<Employee> empwithDepId = new ArrayList<>();
        for (Employee emp : allEmployees) {
            if (emp.getDepartmentId() == depId) {
                empwithDepId.add(emp);
            }
        }
        Employee emp = empwithDepId.get(0);
        for (int i = 0; i < allEmployees.size() - 1; i++) {
            if (empwithDepId.get(i).getAssignedTasksNum() > empwithDepId.get(i + 1).getAssignedTasksNum()) {
                emp = empwithDepId.get(i + 1);
            }
        }
        return emp;
    }

    public void assignTask(String task, int depId) {
        findLeastBusy(depId).addTask(task);
    }

    public void raiseSalary(int percentage) {
        ArrayList<Employee> emp = new ArrayList<>();
        for (Employee e : allEmployees) {
            emp.add(e);
        }
        Employee eMaxSalary = emp.get(0);
        for (int i = 0; i < allEmployees.size() - 1; i++) {
            if (emp.get(i).getSalary() < emp.get(i + 1).getSalary()) {
                eMaxSalary = emp.get(i + 1);
            }
        }
        ArrayList<Employee> eMaxSalarys = new ArrayList<>();
        for (Employee e : emp) {
            if (e.getSalary() == eMaxSalary.getSalary()) {
                eMaxSalarys.add(e);
            }
        }
        for (Employee e : eMaxSalarys) {
            e.setSalary(Math.round(e.getSalary() * (1 + percentage / 100)));
            System.out.println(e);
        }

    }
}
