import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks;
    private int totalProcessed;

    public Employee(String name, int departmentId, int salary) {
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
        totalProcessed = 0;
        assignedTasks = new ArrayList<>();
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public int getTotalProcessed() {
        return totalProcessed;
    }

    public int getAssignedTasksNum() {
        return assignedTasks.size();
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public void processTask() {
        if (assignedTasks.size() == 0) {
            System.out.println("no tasks to process");
        } else {
            System.out.println(String.format("processing task %s", assignedTasks.remove(0)));
            totalProcessed++;
        }
    }

    public String toString() {
        return String.format("name: %s, department Id: %d, salary: %d", name, departmentId, salary);
    }

    public void addTask(String newTask) {
        assignedTasks.add(newTask);
    }

}