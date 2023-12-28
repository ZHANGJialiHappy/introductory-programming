import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static boolean check(int val) {

        return val > 5;

    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 11, 12));
        List<Integer> ha = nums.stream()
                .filter(x -> A.check(x) == true).toList();
        System.out.println(ha);
    }
}