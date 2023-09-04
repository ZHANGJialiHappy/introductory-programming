import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int i = scanner.nextInt();
            int c = (i - 1) * a + 1;
            if (a > 100 || a < 1 || i > 100 || i < 1)
                return;
            if (a <= 100 && a >= 1 && i <= 100 && i >= 1) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println("you entered some numbers with wrong type");
        }

    }

}
