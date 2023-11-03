//Comparing the functionality of lookingAt and matches methods
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex5 {

    public static void main(String[] args) {

        String text    =
                "The text is searched for the occurences of the word text";

        String patternString1 = "The text";

        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(text);

        System.out.println("lookingAt = " + matcher1.lookingAt());
        System.out.println("matches   = " + matcher1.matches());



        String patternString2="The text .*";

        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(text);

        System.out.println("lookingAt = " + matcher2.lookingAt());
        System.out.println("matches   = " + matcher2.matches());


    }
}
