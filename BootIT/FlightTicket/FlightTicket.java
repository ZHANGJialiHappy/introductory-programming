package FlightTicket;

public class FlightTicket {
    String from;
    String to;
    double price;
    boolean usedDiscount;

    FlightTicket(String f, String t, double p, boolean u) {
        from = f;
        to = t;
        price = p;
        usedDiscount = u;
    }

    void show() {
        System.out.println(from + " --> " + to + "(" + price + " DKK)");
    }

    void discount() {
        if (usedDiscount) {
            return;
        }
        if (price > 1000) {
            price = price - 500;
        }
    }
}
