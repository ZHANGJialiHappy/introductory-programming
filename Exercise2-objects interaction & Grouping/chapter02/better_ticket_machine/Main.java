package better_ticket_machine;

public class Main {
    public static void main(String[] args) {
        // Exercise 2.48
        TicketMachine jiali = new TicketMachine(500);
        jiali.insertMoney(-100);
        jiali.insertMoney(700);
        jiali.printTicket();

        // Exercise 2.60

        // Exercise 2.61
        System.out.println(jiali.getTotal());
        System.out.println(jiali.emptyMachine());
        System.err.println(jiali.getTotal());
    }
}