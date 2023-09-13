package naive_ticket_machine;

public class Main {
    public static void main(String[] args) {
        /*
         * The first thing you need to do is create a TicketMachine object (recall like
         * Circle circle = new Circle();).
         * Remember to check whether the Constructor takes any argument. If it does, for
         * example for the Circle class,
         * it could look something like this: Circle circle = new Circle(50);
         */

        // Which methods are available in the TicketMachine class? Try to play around
        // with these and see what you get.
        // You can use System.out.println() to print and test this.
        TicketMachine jiali = new TicketMachine(500);
        // System.out.println(jiali.getPrice());
        // jiali.insertMoney(100);
        // jiali.printTicket();

        // Exercise 2.2
        // int balance = jiali.getBalance();
        // System.out.println(balance);
        // int total = jiali.getTotal();
        // System.out.println(total);

        // Exercise 2.3
        // jiali.insertMoney(2147483647);
        // System.out.println(jiali.getBalance());
        jiali.insertMoney(100);
        jiali.printTicket();
        jiali.printTicket();

        System.out.println(jiali.getTotal());

        // Exercise 2.8

        // Exercise 2.9

        // Exercise 2.11

        // Exercise 2.37

        // Exercise 2.38
        jiali.printTicket();

        // Exercise 2.41
        jiali.showPrice();

        // Exercise 2.42
        TicketMachine jiali2 = new TicketMachine(700);
        jiali2.showPrice();

    }
}
