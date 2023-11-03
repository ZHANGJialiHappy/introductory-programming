
//The find method can be used to find all the occurences of a pattern in a string
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex6 {

    public static void main(String[] args) {

        String text = "Searching the text for the occurences of word text";

        String patternString = "text";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int matchNum = 0;

        while (matcher.find() && matchNum < 5) {
            matchNum++;
            System.out.println("Occurence#: " + matchNum + " : "
                    + matcher.start() + " - " + matcher.end());
            // matcher.reset();

        }
    }
}
