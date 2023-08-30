import java.util.Calendar;

public class WhatDay {
    static void CompareDay() {
        int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        if (weekday == 6) {
            System.out.println("Yes, today is Friday!");
        } else {
            System.out.println("No, today is the " + weekday + "th day in the week.");

            switch (weekday) {
                case 1:
                    System.out.println("That means, today is the Sunday");
                    break;
                case 2:
                    System.out.println("That means, today is the Monday");
                    break;
                case 3:
                    System.out.println("That means, today is the Tuesday");
                    break;
                case 4:
                    System.out.println("That means, today is the Wednesday");
                    break;
                case 5:
                    System.out.println("That means, today is the Thursday");
                    break;
                case 7:
                    System.out.println("That means, today is the Saturday");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("I hope today is Friday, so I can eat candy.");
        CompareDay();
    }
}
