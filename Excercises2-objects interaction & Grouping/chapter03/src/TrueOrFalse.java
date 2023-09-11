import java.util.ArrayList;

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
        ArrayList<Boolean> checkBooleans = new ArrayList<>();
        checkBooleans.add(!(4 < 5));
        checkBooleans.add(!false);
        checkBooleans.add((2 > 2) || ((4 == 4) && (1 < 0)));
        checkBooleans.add((2 > 2) || (4 == 4) && (1 < 0));
        checkBooleans.add((34 != 33) && !false);
        ArrayList<Boolean> booleansArrays = new ArrayList<>();

        for (boolean checkBoolean : checkBooleans) {
            boolean booleanElement = checkOut(checkBoolean);
            booleansArrays.add(booleanElement);
        }
        System.out.println(booleansArrays.toString());

        // for(int i = 0; )
    }
}
