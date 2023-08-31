import java.util.Scanner;

public class TakeTwoStones {
    static boolean even(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            boolean isEven = even(number);
            if (number < 1 || number > 10000000) {
                return;
            } else {
                if (isEven) {
                    System.out.println("Bob");
                } else
                    System.out.println("Alice");
            }

        } catch (Exception e) {
            System.out.println("There is something wrong when you new a scanner");
        }
    }
}
