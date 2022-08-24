import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    public void greetingsTest(){
        System.out.println("Testing the hello greeting");
        String actual = new Greetings().greetingsMethod();
        String expected = "Hello";
        assertEquals(expected, actual);
    }
}
