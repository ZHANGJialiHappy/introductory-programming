//The pattern method returns the original pattern from a string
import java.util.regex.Pattern;

public class Ex4 {

    public static void main(String[] args) {

        String patternString = "\\s";
        Pattern pattern = Pattern.compile(patternString);

        String pattern2 = pattern.pattern();




        System.out.println(pattern2);
    }
}
