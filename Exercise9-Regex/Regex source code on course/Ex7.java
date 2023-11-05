
//Using capture group numbers and names in pattern matching
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex7 {

    public static void main(String[] args) {

        String text = "02.11.2000" +
                "14.05.1998" +
                "06.08.2017";
        // Group number
        String patternString1 = "(\\d\\d)\\.\\d\\d\\.(\\d\\d\\d\\d)";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);
        System.out.println(text);
        while (matcher.find()) {
            System.out.println("found: " + matcher.group(1));
        }
        System.out.println("...");
        matcher.reset();
        while (matcher.find()) {
            System.out.println("found: " + matcher.group(2));
        }

        // Group names
        String patternString2 = "(?<day>\\d\\d)\\.\\d\\d\\.(?<year>\\d\\d\\d\\d)";

        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(text);

        while (matcher2.find()) {
            System.out.println("found by group name: " + matcher2.group("day"));
        }
    }
}
