// import java.util.ArrayList;

public class TrueOrFalse {
    // Exercise 3.14
    static boolean bothSame(boolean a, boolean b) {
        if ((a && b) || (!a && !b)) {
            return true;
        } else {
            return false;
        }
    }

    // Exercise 3.13
    static boolean checkOut(boolean a) {
        if (a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Exercise 3.14
        boolean m = false;
        boolean n = false;
        System.out.println(bothSame(m, n));

        // Exercise 3.13
        // ArrayList<Boolean> booleanArray = new ArrayList<>();
        // boolean[]
        // for(int i = 0; )
    }
}
