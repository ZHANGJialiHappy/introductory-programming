import java.util.ArrayList;
import java.util.Comparator;
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
        // Employee empwithMinTask = null;
        // int leastTaskNum = Integer.MAX_VALUE;
        // for (Employee e : allEmployees) {
        // if (e.getDepartmentId() == depId) {
        // if (e.getAssignedTasksNum() < leastTaskNum) {
        // empwithMinTask = e;
        // leastTaskNum = e.getAssignedTasksNum();
        // }
        // }
        // }

        // ArrayList<Employee> empwithDepId = new ArrayList<>();
        // for (Employee e : allEmployees) {
        // if (e.getDepartmentId() == depId) {
        // empwithDepId.add(e);
        // }
        // }
        // int leastTask = empwithDepId.get(0).getAssignedTasksNum();
        // Employee empwithMinTask = null;
        // for (Employee e : allEmployees) {
        // if (e.getAssignedTasksNum() < leastTask) {
        // empwithMinTask = e;
        // }
        // }

        // ArrayList<Employee> empwithDepId = new ArrayList<>();
        // for (Employee e : allEmployees) {
        // if (e.getDepartmentId() == depId) {
        // empwithDepId.add(e);
        // }
        // }
        // Employee empwithMinTask = empwithDepId.get(0);
        // for (Employee e : allEmployees) {
        // if (e.getAssignedTasksNum() < empwithMinTask.getAssignedTasksNum()) {
        // empwithMinTask = e;
        // }
        // }
        Employee empwithMinTask = allEmployees.stream()
                .filter(e -> e.getDepartmentId() == depId)
                .min(Comparator.comparing(Employee::getAssignedTasksNum))
                .get();
        // ???
        return empwithMinTask;
    }

}
