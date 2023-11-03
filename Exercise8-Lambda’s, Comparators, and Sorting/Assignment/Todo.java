import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Todo {
    private List<Task> todoList;
    private int runningTotal;

    public Todo() {
        todoList = new ArrayList<>();
        runningTotal = 0;
    }

    public void addTask(String description, int priority, int minutes) {
        if (priority > 4 || priority < 1) {
            System.out.println(description + " has invalid priority");
        }
        if (minutes < 0) {
            System.out.println(description + " has invalid workload");
        }
        if (priority <= 4 && priority >= 1 && minutes >= 0) {
            Task task = new Task(description, priority, minutes);
            todoList.add(task);
        }
    }

    public void print() {
        System.out.println("Todo:\n-----");
        if (todoList.size() == 0) {
            System.out.println("You're all done for today! #TodoZero");
        } else {
            todoList.forEach(t -> System.out.println(t));
        }
        if (runningTotal > 0) {
            System.out.println(runningTotal + " minutes of work done!");
        }
    }

    public void completeTask(int index) {
        if (index > todoList.size() - 1 || index < 0) {
            System.out.println("Invalid index");
        } else {
            runningTotal += todoList.get(index).getWorkload();
            todoList.remove(index);
        }
    }

    public void printPriority(int limit) {
        System.out.println("Filtered todo:\n--------------");
        List<Task> a = todoList.stream()
                .filter(t -> t.getPriority() <= limit)
                .collect(Collectors.toList());
        if (a.size() == 0) {
            System.out.println("No tasks with given priority");
        } else {
            a.forEach(t -> System.out.println(t));
        }
    }

    public void printPrioritized() {
        System.out.println("Prioritized todo:\n-----------------");
        Collections.sort(todoList);
        // todoList.sort(Comparator
        // .comparing(Task::getPriority)
        // .thenComparing(Task::getWorkload));

        todoList.forEach(t -> System.out.println(t));
    }
}
