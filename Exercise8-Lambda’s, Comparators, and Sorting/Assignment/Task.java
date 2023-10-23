public class Task {
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

}