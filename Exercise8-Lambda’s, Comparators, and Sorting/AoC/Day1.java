import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Day1 {

    private static int calculateFuel(int weight) {
        return weight / 3 - 2;
    }

    private static int calculateFuel2(int weight) {
        int fuel = calculateFuel(weight);
        int result = 0;
        while (fuel >= 0) {
            result += fuel;
            fuel = calculateFuel(fuel);
        }
        return result;
    }

    private static int star1Imperative(List<String> weights) {
        int result = 0;
        for(String s : weights) {
            result += calculateFuel(Integer.parseInt(s));
        }
        return result;
    }

    private static int star2Imperative(List<String> weights) {
        int result = 0;
        for(String s : weights) {
            result += calculateFuel2(Integer.parseInt(s));
        }
        return result;
    }


    // To avoid code duplication the function calcFuel is accepted as an argument.
    private static int starFunctional(Stream<String> weights, 
                                      Function<Integer, Integer> calcFuel) {
        return 
            weights
            .map(Integer::parseInt)
            .map(calcFuel)
            .reduce(0, (runningSum, fuel) -> runningSum + fuel);
    }


    public static void main(String[] args) {
        // Hack since streams can only be used once. 
        // This code is run whenever the get() method is called.

        int salary = 500;
        float percentage = 1.2f;
        salary = Math.round(salary * percentage);

        Supplier<Stream<String>> in = 
            () -> {
                try {
                    return Files.lines(Path.of("Day1.txt"));
                }
                catch (IOException e) {
                    System.out.println("IOException");
                    e.printStackTrace();
                    return null;
                }
            };
            

        int star1ImperativeResult = star1Imperative(in.get().toList());
        System.out.println("Imperative result (star1): " + star1ImperativeResult);

        int star1FunctionalResult = starFunctional(in.get(), Day1::calculateFuel);
        System.out.println("Functional result (star1): " + star1FunctionalResult);

        int star2ImperativeResult = star2Imperative(in.get().toList());
        System.out.println("Imperative result (star2): " + star2ImperativeResult);

        int star2FunctionalResult = starFunctional(in.get(), Day1::calculateFuel2);
        System.out.println("Functional result (star2): " + star2FunctionalResult);
    }
}