package for_package_name;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class CourseTest {
    private Course systemUnderTest;

    @BeforeAll
    void init() {
        systemUnderTest = new Course("IP", 120);
    }

    @Test
    void getName_invoke_returnsName() {
        assertEquals("IP", systemUnderTest.getName());
    }

    @Test
    void getEnrolments_invoke_returnsEnrolments() {
        assertEquals(120, systemUnderTest.getEnrolments());
    }

    @Test
    void toString_invoke_returnMessages() {
        assertEquals("The name of the course is IP and there are 120 students enrolled in the course",
                systemUnderTest.toString());
    }

    // @Test
    // void setName_name_resetName() {
    // systemUnderTest.setName("IP2");
    // assertEquals("IP2", systemUnderTest.getName());
    // }

}
