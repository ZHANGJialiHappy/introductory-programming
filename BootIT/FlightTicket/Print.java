package FlightTicket;

public class Print {
    public static void main(String[] args) {
        FlightTicket fromChinaToUSA = new FlightTicket("China", "USA", 500, false);
        fromChinaToUSA.show();
        fromChinaToUSA.discount();

        fromChinaToUSA.show();

    }

}
