import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int newH = h;
            int newM = m;
            if (h > 23 || h < 0 || m > 59 || m < 0) {
                return;
            }

            if (m >= 45) {
                newM = m - 45;
            } else {
                newM = 15 + m;
                if (h == 0) {
                    newH = 23;
                } else {
                    newH = h - 1;
                }
            }
            System.out.println(newH + " " + newM);
        } catch (Exception e) {
            System.out.println("You should enter integers.");
        }
    }
}
