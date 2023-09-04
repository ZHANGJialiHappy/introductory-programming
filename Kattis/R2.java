import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int r1 = scanner.nextInt();
            int s = scanner.nextInt();
            if (r1 < 1000 && r1 > -1000 && s < 1000 && s > -1000) {
                int r2 = 2 * s - r1;
                System.out.println(r2);
            } else
                System.out.println("r1 and s should be between -1000 and 1000");

        } catch (Exception e) {
            System.out.println("There is something wrong when you new a scanner");
        }
    }
}