package printer;

// Exercise 3.33

public class Main {

    public static void main(String[] args) {
        Printer p1 = new Printer("book1", false);
        p1.print();
        System.out.println(p1.getStatus(5));
    }

}
