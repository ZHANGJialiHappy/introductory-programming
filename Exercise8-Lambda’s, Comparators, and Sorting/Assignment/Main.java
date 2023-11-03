public class Main {
    public static void main(String[] args) {
        Todo a = new Todo();
        a.addTask("apiano1", 1, 0);
        a.addTask("apiano3", 1, 5);

        a.addTask("bpiano2", 4, 10);
        a.printPrioritized();

        // a.addTask("dpiano3", 2, 6);
        // a.addTask("cpiano4", 2, 5);

        // // a.print();
        // // System.out.println("...");
        // a.completeTask(0);
        // // a.completeTask(0);
        // // a.completeTask(0);
        // a.print();
        // System.out.println("...");
        // // a.printPriority(2);
        // // a.printPrioritized();

    }
}
