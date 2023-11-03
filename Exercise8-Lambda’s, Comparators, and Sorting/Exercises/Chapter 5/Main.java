import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AnimalMonitor jiali = new AnimalMonitor();
        jiali.addSightings("sightings.csv");
        jiali.printList();
        // System.out.println(jiali.getCount("Buffalo"));

        // ArrayList<String> a = new ArrayList<>();
        // a.add("Buffalo");
        // a.add("Topi");
        // a.add("Mountain Gorilla");
        System.out.println("...");
        // jiali.printEndangered(a, 30);
        // jiali.printSightingsOf("Topi");
        // jiali.printSightingsBy(1);
        // jiali.getCount("Topi");
        // jiali.getSightingsInArea("Topi", 1);
        // jiali.getSightingsOf("Topi");
        // jiali.printSightingsIn(1);
        // jiali.printCounts("Elephant");
        // System.out.println(jiali.getCountBySpotterwithDayId("Mountain Gorilla", 1,
        // 2));
        jiali.removeSpotter(0);
        jiali.printList();
    }
}
