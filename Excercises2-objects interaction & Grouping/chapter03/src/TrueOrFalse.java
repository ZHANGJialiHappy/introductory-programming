// import java.util.ArrayList;

public class TrueOrFalse {
    static boolean bothSame(boolean a, boolean b) {
        if ((a && b) || (!a && !b)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkOut(boolean a) {
        if (a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean m = false;
        boolean n = false;
        System.out.println(bothSame(m, n));

        // ArrayList<Boolean> booleanArray = new ArrayList<>();
        // boolean[]
        // for(int i = 0; )
    }
}
