import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PepTalk {

    private static String[] wordToSyllables(String word) {
        String[] syllables;

        // Find the consonant clusters and mark with []
        Pattern consonantCluster = Pattern.compile("([aeiouAEIOU])([^aeiouAEIOU\\[\\]]+)([aeiouAEIOU])");
        Matcher clusterMarker = consonantCluster.matcher(word);
        String markedCluster = word;
        while(clusterMarker.find()) {
            markedCluster = clusterMarker.replaceFirst("$1\\[$2\\]$3");
            clusterMarker = consonantCluster.matcher(markedCluster);
        }
        //System.out.println(markedCluster);

        Pattern cluster = Pattern.compile("\\[([^aeiouAEIOU]*)\\]");
        Matcher clusterMatcher = cluster.matcher(markedCluster);

        // Determine middle of each cluster and mark middle with *, remove []
        while(clusterMatcher.find()) {
            int startIndex = clusterMatcher.start() + 1;
            int endIndex = clusterMatcher.end() - 1;
            int firstHalfLength  = (endIndex - startIndex) / 2;
            //System.out.println(startIndex + " " + endIndex + " " + firstHalfLength);

            Pattern clusterMiddle = Pattern.compile("\\[([^aeiouAEIOU]{" + firstHalfLength + "})([^aeiouAEIOU]+)\\]");
            Matcher clusterMiddleMatcher = clusterMiddle.matcher(markedCluster);
            markedCluster = clusterMiddleMatcher.replaceFirst("$1\\*$2");
        }

        // Find double vowels and mark with *
        Pattern vowelCluster = Pattern.compile("([aeiouAEIOU])([aeiouAEIOU])");
        Matcher vowelMatcher = vowelCluster.matcher(markedCluster);
        String markedSyllables = markedCluster;
        while(vowelMatcher.find()) {
            markedSyllables = vowelMatcher.replaceFirst("$1\\*$2");
            vowelMatcher = vowelCluster.matcher(markedSyllables);
        }
        //System.out.println(markedSyllables);

        // Split everything that has been marked with *
        syllables = markedSyllables.split("\\*");
        return syllables;
    }

    private static String syllablesToPepTalk(String[] syllables) {
        String peptalk = "";
        for(String syllable : syllables) {
            Pattern pattern = Pattern.compile("[^aeiouAEIOU]*([aeiouAEIOU][^aeiouAEIOU]*)");
            Matcher matcher = pattern.matcher(syllable);
            String peptalkSyllable = matcher.replaceFirst("p$1").toLowerCase();
            peptalk += (syllable + peptalkSyllable);
        }
        return peptalk;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String output = "";

        for(String word : words) {
            String[] syllables = wordToSyllables(word);
            String peptalk = syllablesToPepTalk(syllables);
            output += peptalk + " ";
        }

        output = output.strip();
        System.out.println(output);
        sc.close();
    }
}