import java.util.*;

public class MatchstickGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfMatchsticks = random.nextInt(10) + 10;
        System.out.println("numberOfMatchsticks is" + numberOfMatchsticks);
        try (Scanner scanner = new Scanner(System.in)) {

            while (numberOfMatchsticks > 0) {
                System.out.print("How many matchsticks you wanna take(1-3): ");
                int numberOfMatchsticksTaken = scanner.nextInt();
                numberOfMatchsticks = numberOfMatchsticks - numberOfMatchsticksTaken;
                System.out.println("Test, matches left:" + numberOfMatchsticks);
            }
            System.out.println("You win.");
        } catch (Exception e) {
            System.out.print("There is something wrong when you new a scanner");
        }
    }
}
