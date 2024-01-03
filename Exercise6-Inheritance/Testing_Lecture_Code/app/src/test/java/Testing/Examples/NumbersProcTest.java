package Testing.Examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class NumbersProcTest{

private NumbersProc classUnderTest;

@BeforeAll 
    void setUP(){
        classUnderTest = new NumbersProc(); 
    }

    @Test 
    void findMax_arrayWithPositiveValues_returnsMax() {
        int max=classUnderTest.findMax(new int[]{1,4,3,11,8,12});
        assertEquals(12,max);
    }

    @Test 
    void findMax_arrayWithNegativeValues_returnsMax() {
        int max=classUnderTest.findMax(new int[]{-1,-4,-3,-11,-8,-12});
        assertEquals(-1,max);
    }

    
    @Test 
    void findMax_arrayWithNegativeValues_returnsMax2() {
        assertEquals(-1,classUnderTest.findMax(new int[]{-3,-11,-4,-1,-12,-8}));
    }
}
