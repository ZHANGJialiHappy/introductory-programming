public class IsEven {
    static boolean even(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] arg) {
        int number = 4;
        boolean iseven = even(number);
        if (iseven) {
            System.out.println(number + " is even");
        } else
            System.out.println(number + " is odd");

    }
}

// import java.util.Scanner;

// public class IsEven {

// public static void main(String[] args) {

// try (Scanner reader = new Scanner(System.in)) {
// System.out.print("Enter a number: ");
// int num = reader.nextInt();

// if (num % 2 == 0)
// System.out.println(num + " is even");
// else
// System.out.println(num + " is odd");
// }
// }
// }
