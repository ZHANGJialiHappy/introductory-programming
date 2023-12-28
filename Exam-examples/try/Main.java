import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 3, 4, 5));
        int i = 0;
        int x = -1;
        for (var item : nums) {
            if (item == 4) {
                x = i;
            }
            i++;
        }
        System.out.println(x);
    }
}
