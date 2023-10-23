import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AnimalMonitor jiali = new AnimalMonitor();
        jiali.addSightings("sightings.csv");
        jiali.printList();
        // System.out.println(".....");
        // jiali.printSightingsOf("Buffalo");
        // System.out.println(".....");
        // jiali.printSightingsBy(0);
        // System.out.println(".....");
        // ArrayList<String> animalNames = new ArrayList<>();
        // animalNames.add("Elephant");
        // animalNames.add("Mountain Gorilla");
        // jiali.printEndangered(animalNames, 100);
        // jiali.removeZeroCounts();
        // System.out.println(".....");
        // jiali.printList();
        // System.out.println(".....");
        // ArrayList<Sighting> a = jiali.getSightingsInArea("Topi", 2);
        // for (Sighting sighting : a) {
        // System.out.println(sighting.getDetails());
        // }
        // System.out.println("..");
        // ArrayList<Sighting> c = jiali.getSightingsInArea2("Topi", 2);
        // for (Sighting sighting : c) {
        // System.out.println(sighting.getDetails());
        // }

        // System.out.println("..");

        // ArrayList<Sighting> b = jiali.getSightingsOf("Topi");
        // for (Sighting sighting : b) {
        // System.out.println(sighting.getDetails());
        // }

    }

}
