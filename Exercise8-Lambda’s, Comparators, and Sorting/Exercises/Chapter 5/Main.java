import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static boolean myMethod(boolean a, boolean b) {

        return (a || b) && (!a || !b);

    }

    public static void main(String[] args) {
        System.out.println(myMethod(true, true));
        AnimalMonitor jiali = new AnimalMonitor();
        jiali.addSightings("sightings.csv");
        // jiali.printList();
        // System.out.println(jiali.getCount("Buffalo"));

        // ArrayList<String> a = new ArrayList<>();
        // a.add("Buffalo");
        // a.add("Topi");
        // a.add("Mountain Gorilla");
        System.out.println("...");
        // jiali.printEndangered(a, 30);
        // jiali.printSightingsOf("Topi");
        // jiali.printSightingsBy(1);
        System.out.println(jiali.getCount("Mountain Gorilla"));
        jiali.getSightingsInArea("Topi", 1);
        // jiali.getSightingsOf("Topi");
        // jiali.printSightingsIn(1);
        // jiali.printCounts("Mountain Gorilla");
        // System.out.println(jiali.getCountBySpotterwithDayId("Mountain Gorilla", 1,
        // 2));
        // jiali.removeSpotter(0);
        // jiali.printList();
    }
}
