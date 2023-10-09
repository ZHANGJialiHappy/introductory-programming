package Testing.Examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.TestInstance;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class ParameterizedExampleTest {
    private ParameterizedExample systemUnderTest;

    @BeforeAll
    void setUp() {
        systemUnderTest = new ParameterizedExample();
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 12, 14, 20, 8, 10, 44, 82, 12, 144 })
    void isOdd_evenNumbers_returnsFalse(int num) {
        assertEquals(false, systemUnderTest.isOdd(num));
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 12, 14, 20, 8, 10, 44, 82, 12, 144 })
    void isOdd_evenNumbers_returnsFalse2(int num) {
        assertEquals(false, systemUnderTest.isOdd(num));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Denmark", "Brazil" })
    void getCapital_countryAddedToTheMap_returnsNonNull(String country) {
        assertNotNull(systemUnderTest.getCapital(country));
    }

    @ParameterizedTest
    @MethodSource("numberGenerator")
    void findNumber_arrayWithPositiveValues(int num) {
        assertTrue(systemUnderTest.findNumber(num));
    }

    public ArrayList<Integer> numberGenerator() {
        var testList = new ArrayList<Integer>();
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            testList.add(random.nextInt(10));
        }
        return testList;
    }

    @ParameterizedTest
    @CsvSource({ "1,2,2", "10,3,30", "0,22,0", "6,5,30", "8,7,56" })
    void isOdd_randomNumbers_returnsMultiply(int a, int b, int mult) {
        assertEquals(mult, systemUnderTest.mult(a, b));
    }

}
