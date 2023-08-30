public class BigNumber {
    static void stars() {
        System.out.println("*********************");
    }

    static void compareNumber(int number) {
        if (number >= 10) {
            System.out.println("you enter a big number.");
        } else
            System.out.println("What you enter is a small number.");
    }

    public static void main(String[] args) {
        stars();
        compareNumber(1);
        stars();
    }
}
