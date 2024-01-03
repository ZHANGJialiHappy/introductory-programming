
//replaceAll and replaceFirst can be used for replacing fragments of text
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex8 {

    public static void main(String[] args) {

        String text1 = "The textex is searched for the occurences of the word texttex";

        String patternString1 = "text";
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(text1);

        String replaceAll = matcher1.replaceAll("document");
        System.out.println("replaceAll   = " + replaceAll);

        String replaceFirst = matcher1.replaceFirst("document");
        System.out.println("replaceFirst = " + replaceFirst);

        String text2 = "https://www.google.com  " +
                "https://itu.com " +
                "https://youtube.com  " +
                "https://www.learnit.dk  ";

        String patternString2 = "https://(\\w*\\.(\\w*)?)";

        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(text2);
        System.out.println("...");
        replaceAll = matcher2.replaceAll("$2");
        System.out.println("replaceAll   = " + replaceAll);

        replaceFirst = matcher2.replaceFirst("$1");
        System.out.println("replaceFirst = " + replaceFirst);
    }
}
