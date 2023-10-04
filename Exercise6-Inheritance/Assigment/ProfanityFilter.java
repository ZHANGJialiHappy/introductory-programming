import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProfanityFilter {
    private String[] swearWords;
    private List<String> text;

    public ProfanityFilter() {
        text = new ArrayList<>();
    }

    public void read() {
        try (Scanner sc = new Scanner(System.in)) {
            swearWords = sc.nextLine().toLowerCase().split(" ");
            while (sc.hasNextLine()) {
                String input = sc.nextLine();
                text.add(input);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    private String convert(String s) {
        String[] marks = { " ", ",", ".", "!", "?" };
        String word = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!Arrays.asList(marks).contains(String.valueOf(s.charAt(i)))) {
                word = word + s.charAt(i);
            } else {
                if (Arrays.asList(swearWords).contains(word.toLowerCase())) {
                    word = replace(word);
                }
                result = result + word + s.charAt(i);
                word = "";
            }
        }
        if (word != "") {
            if (Arrays.asList(swearWords).contains(word.toLowerCase())) {
                word = replace(word);
            }
            result = result + word;
        }
        return result;
    }

    private String replace(String s) {
        String substituionDomain = "*&#$%";
        String substitution = "";
        for (int i = 0; i < s.length(); i++) {
            substitution = substitution + substituionDomain.charAt(i % 5);
        }
        return substitution;
    }

    public void print() {
        for (String s : text) {
            System.out.println(convert(s));
        }
    }

    public static void main(String[] args) {
        ProfanityFilter jiali = new ProfanityFilter();
        jiali.read();
        jiali.print();

    }

}
