import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RejseKort {
    private int balance;
    private boolean checkIn;
    private int timeStamp;
    private List<Integer> xLocation;
    private List<Integer> yLocation;

    public RejseKort() {
        balance = 100;
        checkIn = false;
        timeStamp = 0;
        xLocation = new ArrayList<>();
        yLocation = new ArrayList<>();
    }

    public void depositMoney(int dkk) {
        if (dkk < 0) {
            System.out.println("Error: Cannot deposit negative amount");
        } else {
            balance += dkk;
            System.out.println(String.format("%d DKK deposited. New balance: %d DKK",
                    dkk, balance));
        }
    }

    public boolean isCheckedIn(int timeStamp) {
        if (timeStamp < this.timeStamp) {
            throw new IllegalArgumentException("Error: timeStamp is wrong");
        }
        boolean isCheckIn = (timeStamp - this.timeStamp) <= 120 && checkIn ? true : false;
        return isCheckIn;
    }

    public void checkIn(int x, int y, int timeStamp) {
        if (balance < 100) {
            System.out.println(String.format("Not enough money in account to check in. Please deposit at least %d DKK",
                    100 - balance));
            return;
        }
        if (!checkIn) {
            System.out.println("Checked in");
            this.timeStamp = timeStamp;
            xLocation.add(x);
            yLocation.add(y);
            checkIn = true;
        } else if (isCheckedIn(timeStamp)) {
            System.out.println(
                    String.format("Continued journey (%d minutes since last check in)",
                            timeStamp - this.timeStamp));
            this.timeStamp = timeStamp;
            xLocation.add(x);
            yLocation.add(y);
        }

    }

    public void checkOut(int x, int y, int timeStamp) {
        if (!checkIn) {
            System.out.println("Error: Cannot check out; Not currently checked in");
            return;
        }
        xLocation.add(x);
        yLocation.add(y);
        int maxX = Collections.max(xLocation);
        int minX = Collections.min(xLocation);
        int maxY = Collections.max(yLocation);
        int minY = Collections.min(yLocation);
        int fakePrice = 12 + (maxX - minX + maxY - minY) * 3;
        int price = fakePrice > 50 ? 50 : fakePrice;
        balance = balance - price;
        checkIn = false;
        System.out.println(String.format(
                "Checked out! %d minutes since last check in. Price is %d DKK, remaining balance is %d DKK",
                timeStamp - this.timeStamp, price, balance));
    }

}
