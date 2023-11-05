import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void myMethod(int count) {
        ++count;
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                n++;
            }
        }
        System.out.println(n);

    }
}
