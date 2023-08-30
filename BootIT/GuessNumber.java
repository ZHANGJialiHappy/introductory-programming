import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number from 0 to 10: ");
            int guess = scanner.nextInt();
            int secret = random.nextInt(11);
            int tries = 1;
            String times;
            while (guess != secret) {
                if (guess < secret) {
                    System.out.println("too low");
                }
                if (guess > secret) {
                    System.out.println("too high");
                }
                tries++;
                System.out.print("Enter a number: ");
                guess = scanner.nextInt();
            }
            if (tries == 1)
                times = "time";
            else
                times = "times";
            System.out.println("Congratulations, you're right, and you used " + tries + " " + times);
        } catch (Exception e) {
            System.out.print("There is something wrong when you new a scanner");
        }
    }
}

// class Guess {
// public static void main(String[] args) {
// Random random = new Random();
// Scanner scanner = new Scanner(System.in);
// int secret = random.nextInt(10);
// int tries = 0;
// int guess = -1;
// while (guess != secret) {
// System.out.print("Guess a number between 0 and 10:");
// guess = scanner.nextInt();
// tries++;
// if (guess < secret) {
// System.out.println("Too low");
// } else if (guess > secret) {
// System.out.println("Too high");
// }
// }
// System.out.println("YOU WIN!");
// System.out.println("You used " + tries + " guesses.");
// }
// }
