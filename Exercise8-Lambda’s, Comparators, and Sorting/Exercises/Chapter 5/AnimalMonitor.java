import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Monitor counts of different types of animal.
 * Sightings are recorded by spotters.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29 (imperative)
 */
public class AnimalMonitor {
    // Records of all the sightings of animals.
    private ArrayList<Sighting> sightings;

    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor() {
        this.sightings = new ArrayList<>();
    }

    /**
     * Add the sightings recorded in the given filename to the current list.
     * 
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename) {
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
    }

    /**
     * Print details of all the sightings.
     */
    public void printList() {
        for (Sighting record : sightings) {
            System.out.println(record.getDetails());
        }
        // System.out.println("....");
        // sightings.forEach(s -> System.out.println(s.getDetails()));
    }

    /**
     * Print the details of all the sightings of the given animal.
     * 
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal) {
        for (Sighting record : sightings) {
            if (animal.equals(record.getAnimal())) {
                System.out.println(record.getDetails());
            }
        }
        // System.out.println("....");
        // sightings.stream()
        // .filter(s -> s.getAnimal().equals(animal))
        // .forEach(s -> System.out.println(s.getDetails()));
    }

    /**
     * Print all the sightings by the given spotter.
     * 
     * @param spotter The ID of the spotter.
     */
    public void printSightingsBy(int spotter) {
        for (Sighting record : sightings) {
            if (record.getSpotter() == spotter) {
                System.out.println(record.getDetails());
            }
        }
        System.out.println("...");
        sightings.stream()
                .filter(s -> s.getSpotter() == spotter)
                .forEach(s -> System.out.println(s.getDetails()));
    }

    /**
     * Print a list of the types of animal considered to be endangered.
     * 
     * @param animalNames     A list of animals names.
     * @param dangerThreshold Counts less-than or equal-to to this level
     *                        are considered to be dangerous.
     */
    public void printEndangered(ArrayList<String> animalNames,
            int dangerThreshold) {
        for (String animal : animalNames) {
            if (getCount(animal) <= dangerThreshold) {
                System.out.println(animal + " is endangered.");
            }
        }
        // Iterator<String> it = animalNames.iterator();
        // while (it.hasNext()) {
        // String animal = it.next();
        // if (getCount(animal) <= dangerThreshold) {
        // System.out.println(animal + " is endangered.");
        // }
        // }

        System.out.println("...");
        animalNames.stream()
                .filter(a -> getCount(a) <= dangerThreshold)
                .forEach(a -> System.out.println(a + " is endangered."));
    }

    /**
     * Return a count of the number of sightings of the given animal.
     * 
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCount(String animal) {
        int total = 0;
        for (Sighting sighting : sightings) {
            if (animal.equals(sighting.getAnimal())) {
                total = total + sighting.getCount();
            }
        }
        // int total2 = 0;
        // Iterator<Sighting> it = sightings.iterator();
        // while (it.hasNext()) {
        // Sighting record = it.next();
        // if (record.getAnimal().equals(animal)) {
        // total2 += record.getCount();
        // }
        // }
        // int total2 = sightings.stream()
        // .filter(s -> s.getAnimal().equals(animal))
        // .map(s -> s.getCount())
        // .reduce(0, (subTotal, count) -> subTotal += count);
        // System.out.println(total);
        // System.out.println(total2);

        return total;
    }

    /**
     * Remove from the sightings list all of those records with
     * a count of zero.
     */
    public void removeZeroCounts() {
        Iterator<Sighting> it = sightings.iterator();
        while (it.hasNext()) {
            Sighting record = it.next();
            if (record.getCount() == 0) {
                it.remove();
            }
        }
    }

    /**
     * Return a list of all sightings of the given type of animal
     * in a particular area.
     * 
     * @param animal The type of animal.
     * @param area   The ID of the area.
     * @return A list of sightings.
     */
    public ArrayList<Sighting> getSightingsInArea(String animal, int area) {
        ArrayList<Sighting> records = new ArrayList<>();
        for (Sighting record : sightings) {
            if (animal.equals(record.getAnimal())) {
                if (record.getArea() == area) {
                    records.add(record);
                }
            }
        }
        // for (Sighting s : records) {
        // System.out.println(s.getDetails());
        // }
        // System.out.println(".....");
        // List<Sighting> records2 = sightings.stream()
        // .filter(s -> s.getAnimal().equals(animal))
        // .filter(s -> s.getArea() == area)
        // .toList();

        // records2.forEach(r -> System.out.println(r.getDetails()));
        // var arraylist= (ArrayList<Sighting>)records2;

        return records;
    }

    /**
     * Return a list of all the sightings of the given animal.
     * 
     * @param animal The type of animal.
     * @return A list of all sightings of the given animal.
     */
    public ArrayList<Sighting> getSightingsOf(String animal) {
        ArrayList<Sighting> filtered = new ArrayList<>();
        for (Sighting record : sightings) {
            if (animal.equals(record.getAnimal())) {
                filtered.add(record);
            }
        }
        // filtered.forEach(s -> System.out.println(s.getDetails()));
        // System.out.println("....");
        // List<Sighting> filtered2 = sightings.stream()
        // .filter(s -> s.getAnimal().equals(animal))
        // .toList();
        // filtered2.forEach(s -> System.out.println(s.getDetails()));

        return filtered;
    }

    public void printSightingsIn(int dayID) {
        sightings.stream()
                .filter(s -> s.getPeriod() == dayID)
                .forEach(s -> System.out.println(s.getDetails()));

    }

    public void printCounts(String animal) {
        sightings.stream()
                .filter(s -> s.getAnimal().equals(animal))
                .map(s -> s.getCount())
                .forEach(count -> System.out.println(count));
        // .forEach(s -> System.out.println(s.getCount()));

    }

    public int getCountBySpotterwithDayId(String animal, int spotterID, int dayID) {
        int totalCount = sightings.stream()
                .filter(s -> s.getAnimal().equals(animal))
                .filter(s -> s.getSpotter() == spotterID)
                .filter(s -> s.getPeriod() == dayID)
                .map(s -> s.getCount())
                .reduce(0, (subTotal, c) -> subTotal += c);
        return totalCount;
    }

    public void removeSpotter(int spotter) {
        Iterator<Sighting> it = sightings.iterator();
        while (it.hasNext()) {
            Sighting s = it.next();
            if (s.getSpotter() == spotter) {
                it.remove();
            }
        }

    }

}
