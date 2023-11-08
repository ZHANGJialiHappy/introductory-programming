import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;

public class PepTalk {
    private String vowels;
    private String consonants;

    public PepTalk() {
        vowels = "[aeiouAEIOU]";
        consonants = "[^aeiouAEIOU]";

    }

    public String translate(String input) {
        String finalOutput = "";
        String[] words = splitWords(input);
        for (String word : words) {
            finalOutput += repeateSyllableWithP(word) + " ";
        }

        return finalOutput.trim();
    }

    private String[] splitWords(String input) {
        String[] splitByWords = input.split(" ");
        return splitByWords;
    }

    public String[] splitVowels(String input) {
        String noConsanants = input.replaceAll(consonants, "");
        String[] vowelList = noConsanants.split("");
        return vowelList;
    }

    private ArrayList<String> splitSyllables(String input) {

        ArrayList<String> syllableList = new ArrayList<>();
        String[] consonantList = input.split(vowels);
        String[] vowelList = splitVowels(input);

        if (vowelList.length == 1) {
            syllableList.add(input);
            return syllableList;
        }
        String usedConsonants = "";
        String remainderConsonants = consonantList[0];
        for (int i = 0; i < vowelList.length - 1; i++) {
            try {
                int divider = consonantList[i + 1].length() / 2;
                usedConsonants = consonantList[i + 1].substring(0, divider);
                syllableList.add(remainderConsonants + vowelList[i] + usedConsonants);
                remainderConsonants = consonantList[i + 1].substring(divider);
            } catch (IndexOutOfBoundsException e) {
                syllableList.add(remainderConsonants + vowelList[i]);
                remainderConsonants = "";
            }

        }
        String finalSyllable = remainderConsonants + vowelList[vowelList.length-1];
        if (input.matches(".*["+consonants+"]$")){
            finalSyllable += consonantList[consonantList.length - 1];
        }
        syllableList.add(finalSyllable);
        return syllableList;
    }

    private String repeateSyllableWithP(String input) {
        ArrayList<String> syllableList = splitSyllables(input);
        String output = "";
        for (String word : syllableList) {
            output += word;
            if (Pattern.matches(consonants + ".*", word)) {
                output += word.replaceFirst(consonants + "*", "p");
            } else {
                output += "p" + word.toLowerCase();
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        PepTalk p = new PepTalk();
        System.out.println(p.translate(input));
    }
}
