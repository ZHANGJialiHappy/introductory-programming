import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Todo {
    private List<Task> todoList;
    private int runningTotal;
    private int amountCompleteWork;

    public Todo() {
        todoList = new ArrayList<>();
        runningTotal = 0;
        amountCompleteWork = 0;
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
        if (amountCompleteWork > 0) {
            System.out.println(runningTotal + " minutes of work done!");
        }
    }

    public void completeTask(int index) {
        if (index > todoList.size() - 1 || index < 0) {
            System.out.println("Invalid index");
        } else {
            runningTotal += todoList.get(index).getWorkload();
            amountCompleteWork++;
            todoList.remove(index);
            // List<Task> a = todoList.stream()
            // .filter(t -> todoList.indexOf(t) !=(index))
            // .toList();
            // System.out.println(a);
        }
    }

    public void printPriority(int limit) {
        System.out.println("Filtered todo:\n--------------");
        List<Task> a = todoList.stream()
                .filter(t -> t.getPriority() <= limit)
                .toList();
        if (a.size() == 0) {
            System.out.println("No tasks with given priority");
        } else {
            a.forEach(t -> System.out.println(t));
        }
    }

    public void printPrioritized() {
        System.out.println("Prioritized todo:\n-----------------");
        todoList.sort(Comparator
                .comparing(Task::getPriority)
                .thenComparing(Task::getWorkload));
        // todoList.sort((t1, t2) -> t1.priority - t2.priority);
        // todoList.sort((t1, t2) -> t1.workload - t2.workload);
        // todoList.sort((t1, t2) ->
        // t1.getDescription().compareTo(t2.getDescription()));
        // todoList.sort(Comparator.comparing(Task::getDescription));

        todoList.forEach(t -> System.out.println(t));
    }
}
