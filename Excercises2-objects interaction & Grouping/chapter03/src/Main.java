public class Main {
    public static void main(String[] args) {
        /*
         * Write your code below. If you are unsure as to what some of the questions
         * mean, please ask, we are glad to help!
         */
        // ClockDisplay jiali = new ClockDisplay(25, 20);
        // // jiali.setTime(25, 30);
        // System.out.println(jiali.getTime());

        ClockDisplay jiali2 = new ClockDisplay(21, 58);
        System.out.println(jiali2.getTime());
        jiali2.timeTick();
        System.out.println(jiali2.getTime());
        jiali2.timeTick();
        System.out.println(jiali2.getTime());

    }
}

// 3.4, 3.13, 3.14 3.27, 3.31, 3.32, 3.33 3.38, 3.39, 3.40 3.41
