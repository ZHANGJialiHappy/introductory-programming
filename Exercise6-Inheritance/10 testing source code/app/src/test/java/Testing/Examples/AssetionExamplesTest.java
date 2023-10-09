package Testing.Examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class AssetionExamplesTest {

    private AssertionExamples systemUnderTest;

    @BeforeAll 
    void init(){
        systemUnderTest=new AssertionExamples();
    }

    @Test
    void isEven_evenNumber_returnsTrue(){
        assertEquals(true,systemUnderTest.isEven(100));
    }

    @Test
    void isEven_evenNumber_returnsTrue2(){
        assertTrue(systemUnderTest.isEven(22));
    }

    @Test
    void isEven_oddNumber_returnsFalse(){
        assertFalse(systemUnderTest.isEven(55));
    }


    @Test
    void nameConcat_nonNullValues_returnsNotNull(){
        assertNotNull(systemUnderTest.nameConcat("Alice", "Johnsson"));
        
    }

}




























