import java.util.ArrayList;

/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class LogAnalyzer {
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    private ArrayList<Person> people;
    private ArrayList<Boolean> vacant;
    private double[] readings;
    private String[] urls;
    private TicketMachine[] machines;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer() {
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
        people = new ArrayList<>();
        vacant = new ArrayList<>();
        readings = new double[60];
        urls = new String[90];
        machines = new TicketMachine[5];
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData() {
        while (reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts() {
        System.out.println("Hr: Count");
        for (int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }

    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData() {
        reader.printData();
    }
}
