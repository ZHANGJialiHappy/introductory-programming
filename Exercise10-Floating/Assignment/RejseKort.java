public class RejseKort {
    private int balance;
    private boolean checkIn;
    private int timeStamp;

    public RejseKort() {
        balance = 100;
        checkIn = false;
        timeStamp = 0;
    }

    public void depositMoney(int dkk) {
        if (dkk < 0) {
            System.out.println("Cannot deposit negative amount");
        } else {
            balance += dkk;
            System.out.println(String.format("%d DKK deposited. New balance: %d DKK",
                    100, balance));
        }
    }

    private boolean isCheckedIn(int timeStamp) {
        if (timeStamp < this.timeStamp) {
            throw new IllegalArgumentException("Error: timeStamp is wrong");
        }
        checkIn = (timeStamp - this.timeStamp) < 120 && this.timeStamp != 0 ? true : false;
        return checkIn;
    }

    public void checkIn(int x, int y, int timeStamp) {
        if (!isCheckedIn(timeStamp)) {
            if (balance < 100) {
                checkIn = false;
                System.out.println(String.format(
                        "Not enough money in account to check in. Please deposit at least %d DKK",
                        100 - balance));
            } else {
                System.out.println("Checked in");
                this.timeStamp = timeStamp;
            }
        } else {
            System.out.println(
                    String.format("Continued journey (%d minutes since last check in)",
                            timeStamp - this.timeStamp));
        }

    }

    public void checkOut(int x, int y, int timeStamp) {

    }

    public static void main(String[] args) {
        RejseKort jiali = new RejseKort();
        jiali.checkIn(1, 2, 50);
        jiali.checkIn(1, 2, 100);
        jiali.depositMoney(20);

    }
}
