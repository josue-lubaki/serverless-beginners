package helloworld;

import static org.junit.Assert.assertEquals;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.Test;

public class AppTest {
    /**
     * Method under test: {@link App#hello(String, Context)}
     */
    @Test
    public void testHello() {
        assertEquals("Hello Input!", (new App()).hello("Input"));
        assertEquals("Hello !", (new App()).hello(null));
    }
}

