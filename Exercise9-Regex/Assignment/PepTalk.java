import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PepTalk {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] words = sc.nextLine().split(" ");
            ArrayList<String> translatedWords = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                translatedWords.add(translate(words[i]));
            }
            String result = "";
            String separator = "";
            for (String w : translatedWords) {
                result += separator + w;
                separator = " ";
            }
            System.out.println(result);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String translate(String word) {
        ArrayList<String> dividedWords = divideWords(word);
        return doRepetition(dividedWords);
    }

    private static ArrayList<String> divideWords(String words) {
        ArrayList<Integer> vowelsIndex = getVowelsIndex(words);
        ArrayList<String> dividedWords = new ArrayList<>();
        Integer startIndex = 0;
        Integer endIndex = 0;
        for (int i = 0; i < vowelsIndex.size() - 1; i++) {
            endIndex = (vowelsIndex.get(i + 1) - 1 - vowelsIndex.get(i)) / 2 +
                    vowelsIndex.get(i);
            dividedWords.add(words.substring(startIndex, (endIndex + 1)));
            startIndex = endIndex + 1;
        }
        dividedWords.add(words.substring(startIndex, words.length()));
        // System.out.println(vowelsIndex);
        // System.out.println(dividedWords);
        return dividedWords;
    }

    private static ArrayList<Integer> getVowelsIndex(String words) {
        String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
        ArrayList<Integer> vowelsIndex = new ArrayList<>();
        for (int i = 0; i < words.length(); i++) {
            if (Arrays.asList(vowels).contains(String.valueOf(words.charAt(i)))) {
                vowelsIndex.add(i);
            }
        }
        return vowelsIndex;
    }

    private static String doRepetition(ArrayList<String> dividedWords) {
        ArrayList<String> wordswithRepetition = new ArrayList<>();
        for (String dividedWord : dividedWords) {
            if ("aeiouAEIOU".indexOf(dividedWord.charAt(0)) >= 0) {
                dividedWord = dividedWord + "p" + dividedWord.toLowerCase();
            } else {
                dividedWord = dividedWord + "p"
                        + dividedWord.substring(getVowelsIndex(dividedWord).get(0)).toLowerCase();
            }
            wordswithRepetition.add(dividedWord);
        }
        String newWord = "";
        for (String dividedWord : wordswithRepetition) {
            newWord = newWord + dividedWord;
        }

        return newWord;
    }

}
