public class Main {
    public static void multiplesOfFive(int start, int end, int base) {
        int number = start;
        while (number <= end) {
            if (number % base == 0) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void sum(int a, int b) {
        int sum = 0, i = a;
        while (i <= b) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int number = 2;
        while (number <= n - 1) {
            if (n % number == 0) {
                return false;
            }
            number++;
        }
        return true;

    }

    public static void main(String[] args) {
        // write you code here
        // MusicOrganizer jiali = new MusicOrganizer();
        // jiali.addFile("haha");
        // jiali.addFile("haha2");
        // jiali.listAllFiles();
        // jiali.listMatching("haha3");

        // Exercise 4.30
        // multiplesOfFive(10, 95, 5);

        // Exercise 4.31
        // sum(1, 10);

        // Exercise 4.32
        System.out.println(isPrime(9));
    }
}