import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks;
    private int totalProcessed;

    public Employee(String name, int salary, int departmentId) {
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
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
            System.out.println("processing task " + assignedTasks.get(0));
            assignedTasks.remove(0);
            totalProcessed++;
        }
    }

    public String toString() {
        return "name: " + this.name + ", department Id: " + this.departmentId + ", salary: " + this.salary;
    }

    public void addTask(String newTask) {
        assignedTasks.add(newTask);
    }

}
