import java.util.Comparator;

public class Task implements Comparable<Task>, Comparator<Task> {
    private String description;
    private int priority;
    private int workload;

    public Task(String description, int priority, int workload) {
        this.description = description;
        this.priority = priority;
        this.workload = workload;

    }

    public String toString() {
        String prio = "";
        switch (priority) {
            case 1:
                prio = "very important";
                break;
            case 2:
                prio = "important";
                break;
            case 3:
                prio = "unimportant";
                break;
            case 4:
                prio = "after learn Portuguese";
                break;
        }
        return description + " takes " + workload + " minutes and has priority " + prio;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public int getWorkload() {
        return workload;
    }

    @Override
    public int compareTo(Task that) {
        if (this.getPriority() < that.getPriority()) {
            return -1;
        } else if (this.getPriority() == that.getPriority()) {
            if (this.getWorkload() < that.getWorkload()) {
                return -1;
            } else if (this.getWorkload() == that.getWorkload()) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }

    }

    @Override
    public int compare(Task t1, Task t2) {
        int priorityCompare = Integer.valueOf(t2.getDescription()) - (Integer.valueOf(t1.getDescription()));
        if (priorityCompare != 0) {
            return priorityCompare;
        }
        return Integer.valueOf(t2.getDescription()) - (Integer.valueOf(t1.getDescription()));

    }

}